/*******************************************************************************
 * Copyright (c) 2020-2024 THALES.
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

import static com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper.getInverseAssumptions;
import static com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper.getInverseCountermeasures;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Constraint;

import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawTarget;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.Loss;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.PieceOfInformation;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelValue;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable;
import com.thalesgroup.mde.capella.stpa.model.Responsibility;
import com.thalesgroup.mde.capella.stpa.model.Stake;
import com.thalesgroup.mde.capella.stpa.model.Stakeholder;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;


/**
 * An EMF Switch for STPA that returns upstream dependency elements based on an optional context element. 
 */
public class STPAUpstreamSwitch extends AbstractSTPADependencySwitch {
  
  /**
   * Constructor
   * @param context the optional context element
   */
  public STPAUpstreamSwitch(EObject context) {
    super(context);
  }
  
  @Override
  public List<? extends EObject> caseStakeholder(Stakeholder object) {
    return Collections.emptyList();
  }
  
  @Override
  public List<? extends EObject> caseStake(Stake object) {
    return Collections.singletonList(object.getStakeholder());
  }
  
  @Override
  public List<? extends EObject> caseLoss(Loss object) {
    return object.getStakes();
  }
  
  @Override
  public List<? extends EObject> caseHazard(Hazard object) {
    List<EObject> result = new LinkedList<>();
    if (object.getComposite() != null) {
      result.add(object.getComposite());
    }
    result.addAll(object.getLosses());
    return result;
  }
  
  @Override
  public List<? extends EObject> caseSystemConstraint(SystemConstraint object) {
    List<EObject> result = new LinkedList<>();
    if (object.getComposite() != null) {
      result.add(object.getComposite());
    }
    result.addAll(object.getHazards());
    return result;
  }
  
  @Override
  public List<? extends EObject> caseResponsibility(Responsibility object) {
    List<EObject> result = new LinkedList<>();
    result.addAll(object.getSystemConstraints().stream().
        filter(sc ->isInScope(sc)).collect(Collectors.toList()));
    return result;
  }
  
  @Override
  public List<? extends EObject> caseControlEntity(ControlEntity object) {
    List<EObject> result = new UniqueEList<>();
    if (object.getComposite() != null) {
      result.add(object.getComposite());
    }
    for (Responsibility responsibility : object.getResponsibilities()) {
      if (isInScope(responsibility)) {
        result.add(responsibility);
      }
    }
    return result;
  }
  
  @Override
  public List<? extends EObject> caseProcessModelVariable(ProcessModelVariable object) {
    return Collections.singletonList(object.getController());
  }
  
  @Override
  public List<? extends EObject> caseProcessModelValue(ProcessModelValue object) {
    return Collections.singletonList(object.getVariable());
  }
  
  @Override
  public List<? extends EObject> caseExchangeElement(ExchangeElement object) {
    List<EObject> result = new UniqueEList<>();
    for (Responsibility responsibility : object.getExercisedResponsibilities()) {
      if (responsibility.getSystemConstraints().stream().anyMatch(sc -> isInScope(sc))) {
        result.add(responsibility.getController());
      }
    }
    if (result.isEmpty()) {
      if (object instanceof PieceOfInformation) {
        result.add(object.getRelation().getTarget());
      } else {
        result.add(object.getRelation().getSource());
      }
    }
    return result;
  }
  
  @Override
  public List<? extends EObject> caseUnsafeControlAction(UnsafeControlAction object) {
    return Collections.singletonList(object.getControlAction());
  }
  
  @Override
  public List<? extends EObject> caseControlFlaw(ControlFlaw object) {
    return Collections.singletonList(object.getContext());
  }
  
  @Override
  public List<? extends EObject> caseLossScenario(LossScenario object) {
    List<EObject> result = new LinkedList<>();
    List<ControlFlaw> flaws = object.getCausalFactors();
    result.addAll(flaws);
    boolean added = !flaws.isEmpty();
    UnsafeControlAction uca = object.getUnsafeControlAction();
    boolean addUCA = uca != null &&
        !flaws.stream().anyMatch(flaw -> flaw.getContext() == uca);
    if (addUCA) {
      result.add(uca);
      added = true;
    }
    if (!added) {
      ExchangeElement ca = object.getControlAction();
      if (ca != null) {
        result.add(ca);
      }
    }
    return result;
  }
  
  @Override
  public List<? extends EObject> caseConstraint(Constraint object) {
      List<EObject> result = new LinkedList<>();
      result.addAll(getInverseAssumptions(object));
      result.addAll(getInverseCountermeasures(object));
      return result;
  }
  
  /**
   * @see com.thalesgroup.mde.capella.stpa.helpers.AbstractSTPADependencySwitch#getOrderedScopingTypes()
   */
  @Override
  protected List<EClass> getOrderedScopingTypes() {
    return Arrays.asList(
        CapellacorePackage.Literals.CONSTRAINT,
        StpaPackage.Literals.LOSS_SCENARIO,
        StpaPackage.Literals.CONTROL_FLAW,
        StpaPackage.Literals.UNSAFE_CONTROL_ACTION,
        StpaPackage.Literals.EXCHANGE_ELEMENT);
  }
  
  /**
   * Return whether the given element is in the contextual scope
   * @param element a non-null element
   */
  public boolean isInScope(ControlFlawTarget element) {
    List<EObject> scopingLSs = getScopingElements(StpaPackage.Literals.LOSS_SCENARIO); 
    List<EObject> scopingUCAs = getScopingElements(StpaPackage.Literals.UNSAFE_CONTROL_ACTION);
    boolean result =
        scopingLSs.isEmpty() && scopingUCAs.isEmpty() ||
        !Collections.disjoint(scopingLSs, element.getLossScenarios()) ||
        !Collections.disjoint(scopingUCAs, element.getUnsafeControlActions());
    return result;
  }
  
  /**
   * Return whether the given element is in the contextual scope
   * @param element a non-null element
   */
  public boolean isInScope(Responsibility responsibility) {
    boolean result = responsibility.getSystemConstraints().stream().anyMatch(sc -> isInScope(sc));
    if (!result) {
      List<EObject> scopingEEs = getScopingElements(StpaPackage.Literals.EXCHANGE_ELEMENT);
      result = !Collections.disjoint(scopingEEs, responsibility.getControlActions());
    }
    return result;
  }
  
}
