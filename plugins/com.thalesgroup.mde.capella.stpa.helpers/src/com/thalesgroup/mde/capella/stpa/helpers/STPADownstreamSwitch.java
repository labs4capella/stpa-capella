/*******************************************************************************
 * Copyright (c) 2020-2023 THALES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    THALES - initial API and implementation
 *******************************************************************************/
package com.thalesgroup.mde.capella.stpa.helpers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.Constraint;

import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawAnalysisElement;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.Loss;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelValue;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable;
import com.thalesgroup.mde.capella.stpa.model.Responsibility;
import com.thalesgroup.mde.capella.stpa.model.ResponsibilitySupportExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.Stake;
import com.thalesgroup.mde.capella.stpa.model.Stakeholder;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;


/**
 * An EMF Switch for STPA that returns downstream dependency elements based on an optional context element. 
 */
public class STPADownstreamSwitch extends AbstractSTPADependencySwitch {
  
  /**
   * Constructor
   * @param context the optional context element
   */
  public STPADownstreamSwitch(EObject context) {
    super(context);
  }
  
  @Override
  public List<? extends EObject> caseStakeholder(Stakeholder object) {
    return object.getStakes();
  }
  
  @Override
  public List<? extends EObject> caseStake(Stake object) {
    return object.getLosses();
  }
  
  @Override
  public List<? extends EObject> caseLoss(Loss object) {
    return object.getHazards();
  }
  
  @Override
  public List<? extends EObject> caseHazard(Hazard object) {
    List<EObject> result = new LinkedList<>();
    result.addAll(object.getSubHazards());
    result.addAll(object.getSystemConstraints());
    return result;
  }
  
  @Override
  public List<? extends EObject> caseSystemConstraint(SystemConstraint object) {
    List<EObject> result = new LinkedList<>();
    result.addAll(object.getSubSystemConstraints());
    result.addAll(object.getAssumptions());
    result.addAll(object.getResponsibilities());
    return result;
  }
  
  @Override
  public List<? extends EObject> caseResponsibility(Responsibility object) {
    return Collections.singletonList(object.getController());
  }
  
  @Override
  public List<? extends EObject> caseControlEntity(ControlEntity object) {
    List<EObject> result = new UniqueEList<>();
    result.addAll(object.getSubEntities());
    Collection<EObject> responsibilities = getScopingElements(StpaPackage.Literals.RESPONSIBILITY);
    if (responsibilities.isEmpty()) {
      for (Collection<? extends ExchangeElement> exchangeElements :
        Arrays.asList(object.getIncomingControlActions(), object.getOutgoingControlActions(),
            object.getIncomingFeedback(), object.getOutgoingFeedback(), object.getIncomingInformation(),
            object.getOutgoingInformation())) {
        for (ExchangeElement exchangeElement : exchangeElements) {
          if (!exchangeElement.getExercisedResponsibilities().isEmpty() ||
              (exchangeElement instanceof ResponsibilitySupportExchangeElement &&
                  !((ResponsibilitySupportExchangeElement) exchangeElement).getResponsibilities().isEmpty())) {
            result.add(exchangeElement);
          }
        }
      }
    } else {
      for (EObject responsibility : responsibilities) {
        Responsibility casted = (Responsibility) responsibility;
        result.addAll(casted.getControlActions());
        result.addAll(casted.getVariables());
        result.addAll(casted.getFeedback());
        result.addAll(casted.getInformation());
      }
    }
    return result;
  }
  
  @Override
  public List<? extends EObject> caseProcessModelVariable(ProcessModelVariable object) {
    return object.getValues();
  }
  
  @Override
  public List<? extends EObject> caseProcessModelValue(ProcessModelValue object) {
    return Collections.emptyList();
  }
  
  @Override
  public List<? extends EObject> caseExchangeElement(ExchangeElement object) {
    List<EObject> result = new LinkedList<>();
    List<LossScenario> reachableLSs = new LinkedList<>();
    for (UnsafeControlAction uca : object.getUnsafeControlActions()) {
      if (isInScope(uca)) {
        result.add(uca);
        reachableLSs.addAll(uca.getLossScenarios());
      }
    }
    for (ControlFlaw flaw : object.getControlFlaws()) {
      if (flaw.getLossScenarios().stream().anyMatch(ls -> isInScope(ls))) {
        result.add(flaw);
        reachableLSs.addAll(flaw.getLossScenarios());
      }
    }
    for (LossScenario ls : object.getLossScenarios()) {
      if (isInScope(ls) && !reachableLSs.contains(ls)) {
        result.add(ls);
      }
    }
    return result;
  }
  
  @Override
  public List<? extends EObject> caseUnsafeControlAction(UnsafeControlAction object) {
    List<EObject> result = new UniqueEList<>();
    result.addAll(object.getCountermeasures());
    List<ControlFlaw> ucaFactors = object.getCausalFactors();
    result.addAll(ucaFactors);
    for (LossScenario ls : object.getLossScenarios()) {
      List<ControlFlaw> lsFactors = ls.getCausalFactors();
      lsFactors.retainAll(ucaFactors);
      if (lsFactors.isEmpty() && isInScope(ls)) {
        result.add(ls);
      }
    }
    return result;
  }
  
  @Override
  public List<? extends EObject> caseControlFlaw(ControlFlaw object) {
    return object.getLossScenarios().stream().filter(ls -> isInScope(ls)).collect(Collectors.toList());
  }
  
  @Override
  public List<? extends EObject> caseLossScenario(LossScenario object) {
    return object.getCountermeasures();
  }
  
  @Override
  public List<? extends EObject> caseConstraint(Constraint object) {
      return Collections.emptyList();
  }
  
  /**
   * @see com.thalesgroup.mde.capella.stpa.helpers.AbstractSTPADependencySwitch#getOrderedScopingTypes()
   */
  @Override
  protected List<EClass> getOrderedScopingTypes() {
    return Arrays.asList(
        StpaPackage.Literals.STAKEHOLDER,
        StpaPackage.Literals.STAKE,
        StpaPackage.Literals.HAZARD,
        StpaPackage.Literals.SYSTEM_CONSTRAINT,
        StpaPackage.Literals.RESPONSIBILITY);
  }
  
  /**
   * Return whether the given element is in the contextual scope
   * @param element a non-null element
   */
  public boolean isInScope(ControlFlawAnalysisElement element) {
    List<EObject> scopingHazards = getScopingElements(StpaPackage.Literals.HAZARD); 
    List<EObject> scopingSCs = getScopingElements(StpaPackage.Literals.SYSTEM_CONSTRAINT);
    boolean result =
        !Collections.disjoint(scopingHazards, element.getHazards()) ||
        !Collections.disjoint(scopingSCs, element.getViolatedConstraints()) ||
        (scopingHazards.isEmpty() || element.getHazards().isEmpty()) &&
            (scopingSCs.isEmpty() || element.getViolatedConstraints().isEmpty());
    return result;
  }
  
}
