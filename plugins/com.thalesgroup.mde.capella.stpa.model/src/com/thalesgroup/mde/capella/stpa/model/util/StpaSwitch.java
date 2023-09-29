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
package com.thalesgroup.mde.capella.stpa.model.util;

import com.thalesgroup.mde.capella.stpa.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage
 * @generated
 */
public class StpaSwitch<T1> extends Switch<T1> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StpaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StpaSwitch() {
    if (modelPackage == null) {
      modelPackage = StpaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T1 doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
    case StpaPackage.STPA_ANALYSIS_ELEMENT: {
      StpaAnalysisElement stpaAnalysisElement = (StpaAnalysisElement) theEObject;
      T1 result = caseStpaAnalysisElement(stpaAnalysisElement);
      if (result == null)
        result = caseNamedElement(stpaAnalysisElement);
      if (result == null)
        result = caseAbstractNamedElement(stpaAnalysisElement);
      if (result == null)
        result = caseCapellaElement(stpaAnalysisElement);
      if (result == null)
        result = caseTraceableElement(stpaAnalysisElement);
      if (result == null)
        result = casePublishableElement(stpaAnalysisElement);
      if (result == null)
        result = caseModelElement(stpaAnalysisElement);
      if (result == null)
        result = caseExtensibleElement(stpaAnalysisElement);
      if (result == null)
        result = caseElement(stpaAnalysisElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.ARCHITECTURE_MAPPABLE: {
      ArchitectureMappable<?> architectureMappable = (ArchitectureMappable<?>) theEObject;
      T1 result = caseArchitectureMappable(architectureMappable);
      if (result == null)
        result = caseStpaAnalysisElement(architectureMappable);
      if (result == null)
        result = caseNamedElement(architectureMappable);
      if (result == null)
        result = caseAbstractNamedElement(architectureMappable);
      if (result == null)
        result = caseCapellaElement(architectureMappable);
      if (result == null)
        result = caseTraceableElement(architectureMappable);
      if (result == null)
        result = casePublishableElement(architectureMappable);
      if (result == null)
        result = caseModelElement(architectureMappable);
      if (result == null)
        result = caseExtensibleElement(architectureMappable);
      if (result == null)
        result = caseElement(architectureMappable);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.USER_IDENTIFIED_ELEMENT: {
      UserIdentifiedElement userIdentifiedElement = (UserIdentifiedElement) theEObject;
      T1 result = caseUserIdentifiedElement(userIdentifiedElement);
      if (result == null)
        result = caseArchitectureMappable(userIdentifiedElement);
      if (result == null)
        result = caseStpaAnalysisElement(userIdentifiedElement);
      if (result == null)
        result = caseNamedElement(userIdentifiedElement);
      if (result == null)
        result = caseAbstractNamedElement(userIdentifiedElement);
      if (result == null)
        result = caseCapellaElement(userIdentifiedElement);
      if (result == null)
        result = caseTraceableElement(userIdentifiedElement);
      if (result == null)
        result = casePublishableElement(userIdentifiedElement);
      if (result == null)
        result = caseModelElement(userIdentifiedElement);
      if (result == null)
        result = caseExtensibleElement(userIdentifiedElement);
      if (result == null)
        result = caseElement(userIdentifiedElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.DECOMPOSABLE: {
      Decomposable<?> decomposable = (Decomposable<?>) theEObject;
      T1 result = caseDecomposable(decomposable);
      if (result == null)
        result = caseUserIdentifiedElement(decomposable);
      if (result == null)
        result = caseArchitectureMappable(decomposable);
      if (result == null)
        result = caseStpaAnalysisElement(decomposable);
      if (result == null)
        result = caseNamedElement(decomposable);
      if (result == null)
        result = caseAbstractNamedElement(decomposable);
      if (result == null)
        result = caseCapellaElement(decomposable);
      if (result == null)
        result = caseTraceableElement(decomposable);
      if (result == null)
        result = casePublishableElement(decomposable);
      if (result == null)
        result = caseModelElement(decomposable);
      if (result == null)
        result = caseExtensibleElement(decomposable);
      if (result == null)
        result = caseElement(decomposable);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.DECOMPOSITION_CATEGORY: {
      DecompositionCategory<?> decompositionCategory = (DecompositionCategory<?>) theEObject;
      T1 result = caseDecompositionCategory(decompositionCategory);
      if (result == null)
        result = caseStpaAnalysisElement(decompositionCategory);
      if (result == null)
        result = caseNamedElement(decompositionCategory);
      if (result == null)
        result = caseAbstractNamedElement(decompositionCategory);
      if (result == null)
        result = caseCapellaElement(decompositionCategory);
      if (result == null)
        result = caseTraceableElement(decompositionCategory);
      if (result == null)
        result = casePublishableElement(decompositionCategory);
      if (result == null)
        result = caseModelElement(decompositionCategory);
      if (result == null)
        result = caseExtensibleElement(decompositionCategory);
      if (result == null)
        result = caseElement(decompositionCategory);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.STPA_ANALYSIS: {
      StpaAnalysis stpaAnalysis = (StpaAnalysis) theEObject;
      T1 result = caseStpaAnalysis(stpaAnalysis);
      if (result == null)
        result = caseStpaAnalysisElement(stpaAnalysis);
      if (result == null)
        result = caseElementExtension(stpaAnalysis);
      if (result == null)
        result = caseNamedElement(stpaAnalysis);
      if (result == null)
        result = caseAbstractNamedElement(stpaAnalysis);
      if (result == null)
        result = caseCapellaElement(stpaAnalysis);
      if (result == null)
        result = caseTraceableElement(stpaAnalysis);
      if (result == null)
        result = casePublishableElement(stpaAnalysis);
      if (result == null)
        result = caseModelElement(stpaAnalysis);
      if (result == null)
        result = caseExtensibleElement(stpaAnalysis);
      if (result == null)
        result = caseElement(stpaAnalysis);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.ANALYSIS_PACKAGE: {
      AnalysisPackage analysisPackage = (AnalysisPackage) theEObject;
      T1 result = caseAnalysisPackage(analysisPackage);
      if (result == null)
        result = caseStpaAnalysisElement(analysisPackage);
      if (result == null)
        result = caseNamedElement(analysisPackage);
      if (result == null)
        result = caseAbstractNamedElement(analysisPackage);
      if (result == null)
        result = caseCapellaElement(analysisPackage);
      if (result == null)
        result = caseTraceableElement(analysisPackage);
      if (result == null)
        result = casePublishableElement(analysisPackage);
      if (result == null)
        result = caseModelElement(analysisPackage);
      if (result == null)
        result = caseExtensibleElement(analysisPackage);
      if (result == null)
        result = caseElement(analysisPackage);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.TECHNICAL_PACKAGE: {
      TechnicalPackage technicalPackage = (TechnicalPackage) theEObject;
      T1 result = caseTechnicalPackage(technicalPackage);
      if (result == null)
        result = caseAnalysisPackage(technicalPackage);
      if (result == null)
        result = caseStpaAnalysisElement(technicalPackage);
      if (result == null)
        result = caseNamedElement(technicalPackage);
      if (result == null)
        result = caseAbstractNamedElement(technicalPackage);
      if (result == null)
        result = caseCapellaElement(technicalPackage);
      if (result == null)
        result = caseTraceableElement(technicalPackage);
      if (result == null)
        result = casePublishableElement(technicalPackage);
      if (result == null)
        result = caseModelElement(technicalPackage);
      if (result == null)
        result = caseExtensibleElement(technicalPackage);
      if (result == null)
        result = caseElement(technicalPackage);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.LOSS_PACKAGE: {
      LossPackage lossPackage = (LossPackage) theEObject;
      T1 result = caseLossPackage(lossPackage);
      if (result == null)
        result = caseAnalysisPackage(lossPackage);
      if (result == null)
        result = caseStpaAnalysisElement(lossPackage);
      if (result == null)
        result = caseNamedElement(lossPackage);
      if (result == null)
        result = caseAbstractNamedElement(lossPackage);
      if (result == null)
        result = caseCapellaElement(lossPackage);
      if (result == null)
        result = caseTraceableElement(lossPackage);
      if (result == null)
        result = casePublishableElement(lossPackage);
      if (result == null)
        result = caseModelElement(lossPackage);
      if (result == null)
        result = caseExtensibleElement(lossPackage);
      if (result == null)
        result = caseElement(lossPackage);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE: {
      HazardConstraintPackage hazardConstraintPackage = (HazardConstraintPackage) theEObject;
      T1 result = caseHazardConstraintPackage(hazardConstraintPackage);
      if (result == null)
        result = caseAnalysisPackage(hazardConstraintPackage);
      if (result == null)
        result = caseStpaAnalysisElement(hazardConstraintPackage);
      if (result == null)
        result = caseNamedElement(hazardConstraintPackage);
      if (result == null)
        result = caseAbstractNamedElement(hazardConstraintPackage);
      if (result == null)
        result = caseCapellaElement(hazardConstraintPackage);
      if (result == null)
        result = caseTraceableElement(hazardConstraintPackage);
      if (result == null)
        result = casePublishableElement(hazardConstraintPackage);
      if (result == null)
        result = caseModelElement(hazardConstraintPackage);
      if (result == null)
        result = caseExtensibleElement(hazardConstraintPackage);
      if (result == null)
        result = caseElement(hazardConstraintPackage);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.CONTROL_STRUCTURE_PACKAGE: {
      ControlStructurePackage controlStructurePackage = (ControlStructurePackage) theEObject;
      T1 result = caseControlStructurePackage(controlStructurePackage);
      if (result == null)
        result = caseAnalysisPackage(controlStructurePackage);
      if (result == null)
        result = caseStpaAnalysisElement(controlStructurePackage);
      if (result == null)
        result = caseNamedElement(controlStructurePackage);
      if (result == null)
        result = caseAbstractNamedElement(controlStructurePackage);
      if (result == null)
        result = caseCapellaElement(controlStructurePackage);
      if (result == null)
        result = caseTraceableElement(controlStructurePackage);
      if (result == null)
        result = casePublishableElement(controlStructurePackage);
      if (result == null)
        result = caseModelElement(controlStructurePackage);
      if (result == null)
        result = caseExtensibleElement(controlStructurePackage);
      if (result == null)
        result = caseElement(controlStructurePackage);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.LOSS_SCENARIO_PACKAGE: {
      LossScenarioPackage lossScenarioPackage = (LossScenarioPackage) theEObject;
      T1 result = caseLossScenarioPackage(lossScenarioPackage);
      if (result == null)
        result = caseAnalysisPackage(lossScenarioPackage);
      if (result == null)
        result = caseStpaAnalysisElement(lossScenarioPackage);
      if (result == null)
        result = caseNamedElement(lossScenarioPackage);
      if (result == null)
        result = caseAbstractNamedElement(lossScenarioPackage);
      if (result == null)
        result = caseCapellaElement(lossScenarioPackage);
      if (result == null)
        result = caseTraceableElement(lossScenarioPackage);
      if (result == null)
        result = casePublishableElement(lossScenarioPackage);
      if (result == null)
        result = caseModelElement(lossScenarioPackage);
      if (result == null)
        result = caseExtensibleElement(lossScenarioPackage);
      if (result == null)
        result = caseElement(lossScenarioPackage);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.STAKEHOLDER: {
      Stakeholder stakeholder = (Stakeholder) theEObject;
      T1 result = caseStakeholder(stakeholder);
      if (result == null)
        result = caseUserIdentifiedElement(stakeholder);
      if (result == null)
        result = caseArchitectureMappable(stakeholder);
      if (result == null)
        result = caseStpaAnalysisElement(stakeholder);
      if (result == null)
        result = caseNamedElement(stakeholder);
      if (result == null)
        result = caseAbstractNamedElement(stakeholder);
      if (result == null)
        result = caseCapellaElement(stakeholder);
      if (result == null)
        result = caseTraceableElement(stakeholder);
      if (result == null)
        result = casePublishableElement(stakeholder);
      if (result == null)
        result = caseModelElement(stakeholder);
      if (result == null)
        result = caseExtensibleElement(stakeholder);
      if (result == null)
        result = caseElement(stakeholder);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.STAKE: {
      Stake stake = (Stake) theEObject;
      T1 result = caseStake(stake);
      if (result == null)
        result = caseUserIdentifiedElement(stake);
      if (result == null)
        result = caseArchitectureMappable(stake);
      if (result == null)
        result = caseStpaAnalysisElement(stake);
      if (result == null)
        result = caseNamedElement(stake);
      if (result == null)
        result = caseAbstractNamedElement(stake);
      if (result == null)
        result = caseCapellaElement(stake);
      if (result == null)
        result = caseTraceableElement(stake);
      if (result == null)
        result = casePublishableElement(stake);
      if (result == null)
        result = caseModelElement(stake);
      if (result == null)
        result = caseExtensibleElement(stake);
      if (result == null)
        result = caseElement(stake);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.LOSS: {
      Loss loss = (Loss) theEObject;
      T1 result = caseLoss(loss);
      if (result == null)
        result = caseUserIdentifiedElement(loss);
      if (result == null)
        result = caseArchitectureMappable(loss);
      if (result == null)
        result = caseStpaAnalysisElement(loss);
      if (result == null)
        result = caseNamedElement(loss);
      if (result == null)
        result = caseAbstractNamedElement(loss);
      if (result == null)
        result = caseCapellaElement(loss);
      if (result == null)
        result = caseTraceableElement(loss);
      if (result == null)
        result = casePublishableElement(loss);
      if (result == null)
        result = caseModelElement(loss);
      if (result == null)
        result = caseExtensibleElement(loss);
      if (result == null)
        result = caseElement(loss);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.CONTROL_FLAW_TARGET: {
      ControlFlawTarget controlFlawTarget = (ControlFlawTarget) theEObject;
      T1 result = caseControlFlawTarget(controlFlawTarget);
      if (result == null)
        result = caseUserIdentifiedElement(controlFlawTarget);
      if (result == null)
        result = caseArchitectureMappable(controlFlawTarget);
      if (result == null)
        result = caseStpaAnalysisElement(controlFlawTarget);
      if (result == null)
        result = caseNamedElement(controlFlawTarget);
      if (result == null)
        result = caseAbstractNamedElement(controlFlawTarget);
      if (result == null)
        result = caseCapellaElement(controlFlawTarget);
      if (result == null)
        result = caseTraceableElement(controlFlawTarget);
      if (result == null)
        result = casePublishableElement(controlFlawTarget);
      if (result == null)
        result = caseModelElement(controlFlawTarget);
      if (result == null)
        result = caseExtensibleElement(controlFlawTarget);
      if (result == null)
        result = caseElement(controlFlawTarget);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.HAZARD: {
      Hazard hazard = (Hazard) theEObject;
      T1 result = caseHazard(hazard);
      if (result == null)
        result = caseDecomposable(hazard);
      if (result == null)
        result = caseControlFlawTarget(hazard);
      if (result == null)
        result = caseUserIdentifiedElement(hazard);
      if (result == null)
        result = caseArchitectureMappable(hazard);
      if (result == null)
        result = caseStpaAnalysisElement(hazard);
      if (result == null)
        result = caseNamedElement(hazard);
      if (result == null)
        result = caseAbstractNamedElement(hazard);
      if (result == null)
        result = caseCapellaElement(hazard);
      if (result == null)
        result = caseTraceableElement(hazard);
      if (result == null)
        result = casePublishableElement(hazard);
      if (result == null)
        result = caseModelElement(hazard);
      if (result == null)
        result = caseExtensibleElement(hazard);
      if (result == null)
        result = caseElement(hazard);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.SYSTEM_CONSTRAINT: {
      SystemConstraint systemConstraint = (SystemConstraint) theEObject;
      T1 result = caseSystemConstraint(systemConstraint);
      if (result == null)
        result = caseDecomposable(systemConstraint);
      if (result == null)
        result = caseControlFlawTarget(systemConstraint);
      if (result == null)
        result = caseUserIdentifiedElement(systemConstraint);
      if (result == null)
        result = caseArchitectureMappable(systemConstraint);
      if (result == null)
        result = caseStpaAnalysisElement(systemConstraint);
      if (result == null)
        result = caseNamedElement(systemConstraint);
      if (result == null)
        result = caseAbstractNamedElement(systemConstraint);
      if (result == null)
        result = caseCapellaElement(systemConstraint);
      if (result == null)
        result = caseTraceableElement(systemConstraint);
      if (result == null)
        result = casePublishableElement(systemConstraint);
      if (result == null)
        result = caseModelElement(systemConstraint);
      if (result == null)
        result = caseExtensibleElement(systemConstraint);
      if (result == null)
        result = caseElement(systemConstraint);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.CONTROL_ENTITY: {
      ControlEntity controlEntity = (ControlEntity) theEObject;
      T1 result = caseControlEntity(controlEntity);
      if (result == null)
        result = caseDecomposable(controlEntity);
      if (result == null)
        result = caseUserIdentifiedElement(controlEntity);
      if (result == null)
        result = caseArchitectureMappable(controlEntity);
      if (result == null)
        result = caseStpaAnalysisElement(controlEntity);
      if (result == null)
        result = caseNamedElement(controlEntity);
      if (result == null)
        result = caseAbstractNamedElement(controlEntity);
      if (result == null)
        result = caseCapellaElement(controlEntity);
      if (result == null)
        result = caseTraceableElement(controlEntity);
      if (result == null)
        result = casePublishableElement(controlEntity);
      if (result == null)
        result = caseModelElement(controlEntity);
      if (result == null)
        result = caseExtensibleElement(controlEntity);
      if (result == null)
        result = caseElement(controlEntity);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.EXCHANGE_BASED_ELEMENT: {
      ExchangeBasedElement exchangeBasedElement = (ExchangeBasedElement) theEObject;
      T1 result = caseExchangeBasedElement(exchangeBasedElement);
      if (result == null)
        result = caseStpaAnalysisElement(exchangeBasedElement);
      if (result == null)
        result = caseNamedElement(exchangeBasedElement);
      if (result == null)
        result = caseAbstractNamedElement(exchangeBasedElement);
      if (result == null)
        result = caseCapellaElement(exchangeBasedElement);
      if (result == null)
        result = caseTraceableElement(exchangeBasedElement);
      if (result == null)
        result = casePublishableElement(exchangeBasedElement);
      if (result == null)
        result = caseModelElement(exchangeBasedElement);
      if (result == null)
        result = caseExtensibleElement(exchangeBasedElement);
      if (result == null)
        result = caseElement(exchangeBasedElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.RESPONSIBILITY: {
      Responsibility responsibility = (Responsibility) theEObject;
      T1 result = caseResponsibility(responsibility);
      if (result == null)
        result = caseUserIdentifiedElement(responsibility);
      if (result == null)
        result = caseExchangeBasedElement(responsibility);
      if (result == null)
        result = caseArchitectureMappable(responsibility);
      if (result == null)
        result = caseStpaAnalysisElement(responsibility);
      if (result == null)
        result = caseNamedElement(responsibility);
      if (result == null)
        result = caseAbstractNamedElement(responsibility);
      if (result == null)
        result = caseCapellaElement(responsibility);
      if (result == null)
        result = caseTraceableElement(responsibility);
      if (result == null)
        result = casePublishableElement(responsibility);
      if (result == null)
        result = caseModelElement(responsibility);
      if (result == null)
        result = caseExtensibleElement(responsibility);
      if (result == null)
        result = caseElement(responsibility);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.PROCESS_MODEL_VARIABLE: {
      ProcessModelVariable processModelVariable = (ProcessModelVariable) theEObject;
      T1 result = caseProcessModelVariable(processModelVariable);
      if (result == null)
        result = caseUserIdentifiedElement(processModelVariable);
      if (result == null)
        result = caseExchangeBasedElement(processModelVariable);
      if (result == null)
        result = caseArchitectureMappable(processModelVariable);
      if (result == null)
        result = caseStpaAnalysisElement(processModelVariable);
      if (result == null)
        result = caseNamedElement(processModelVariable);
      if (result == null)
        result = caseAbstractNamedElement(processModelVariable);
      if (result == null)
        result = caseCapellaElement(processModelVariable);
      if (result == null)
        result = caseTraceableElement(processModelVariable);
      if (result == null)
        result = casePublishableElement(processModelVariable);
      if (result == null)
        result = caseModelElement(processModelVariable);
      if (result == null)
        result = caseExtensibleElement(processModelVariable);
      if (result == null)
        result = caseElement(processModelVariable);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.PROCESS_MODEL_VALUE: {
      ProcessModelValue processModelValue = (ProcessModelValue) theEObject;
      T1 result = caseProcessModelValue(processModelValue);
      if (result == null)
        result = caseArchitectureMappable(processModelValue);
      if (result == null)
        result = caseStpaAnalysisElement(processModelValue);
      if (result == null)
        result = caseNamedElement(processModelValue);
      if (result == null)
        result = caseAbstractNamedElement(processModelValue);
      if (result == null)
        result = caseCapellaElement(processModelValue);
      if (result == null)
        result = caseTraceableElement(processModelValue);
      if (result == null)
        result = casePublishableElement(processModelValue);
      if (result == null)
        result = caseModelElement(processModelValue);
      if (result == null)
        result = caseExtensibleElement(processModelValue);
      if (result == null)
        result = caseElement(processModelValue);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.RELATION: {
      Relation relation = (Relation) theEObject;
      T1 result = caseRelation(relation);
      if (result == null)
        result = caseArchitectureMappable(relation);
      if (result == null)
        result = caseStpaAnalysisElement(relation);
      if (result == null)
        result = caseNamedElement(relation);
      if (result == null)
        result = caseAbstractNamedElement(relation);
      if (result == null)
        result = caseCapellaElement(relation);
      if (result == null)
        result = caseTraceableElement(relation);
      if (result == null)
        result = casePublishableElement(relation);
      if (result == null)
        result = caseModelElement(relation);
      if (result == null)
        result = caseExtensibleElement(relation);
      if (result == null)
        result = caseElement(relation);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.CONTROL_FLAW_CONTEXT: {
      ControlFlawContext controlFlawContext = (ControlFlawContext) theEObject;
      T1 result = caseControlFlawContext(controlFlawContext);
      if (result == null)
        result = caseUserIdentifiedElement(controlFlawContext);
      if (result == null)
        result = caseArchitectureMappable(controlFlawContext);
      if (result == null)
        result = caseStpaAnalysisElement(controlFlawContext);
      if (result == null)
        result = caseNamedElement(controlFlawContext);
      if (result == null)
        result = caseAbstractNamedElement(controlFlawContext);
      if (result == null)
        result = caseCapellaElement(controlFlawContext);
      if (result == null)
        result = caseTraceableElement(controlFlawContext);
      if (result == null)
        result = casePublishableElement(controlFlawContext);
      if (result == null)
        result = caseModelElement(controlFlawContext);
      if (result == null)
        result = caseExtensibleElement(controlFlawContext);
      if (result == null)
        result = caseElement(controlFlawContext);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.EXCHANGE_ELEMENT: {
      ExchangeElement exchangeElement = (ExchangeElement) theEObject;
      T1 result = caseExchangeElement(exchangeElement);
      if (result == null)
        result = caseControlFlawContext(exchangeElement);
      if (result == null)
        result = caseUserIdentifiedElement(exchangeElement);
      if (result == null)
        result = caseArchitectureMappable(exchangeElement);
      if (result == null)
        result = caseStpaAnalysisElement(exchangeElement);
      if (result == null)
        result = caseNamedElement(exchangeElement);
      if (result == null)
        result = caseAbstractNamedElement(exchangeElement);
      if (result == null)
        result = caseCapellaElement(exchangeElement);
      if (result == null)
        result = caseTraceableElement(exchangeElement);
      if (result == null)
        result = casePublishableElement(exchangeElement);
      if (result == null)
        result = caseModelElement(exchangeElement);
      if (result == null)
        result = caseExtensibleElement(exchangeElement);
      if (result == null)
        result = caseElement(exchangeElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.CONTROL_RELATION: {
      ControlRelation controlRelation = (ControlRelation) theEObject;
      T1 result = caseControlRelation(controlRelation);
      if (result == null)
        result = caseRelation(controlRelation);
      if (result == null)
        result = caseArchitectureMappable(controlRelation);
      if (result == null)
        result = caseStpaAnalysisElement(controlRelation);
      if (result == null)
        result = caseNamedElement(controlRelation);
      if (result == null)
        result = caseAbstractNamedElement(controlRelation);
      if (result == null)
        result = caseCapellaElement(controlRelation);
      if (result == null)
        result = caseTraceableElement(controlRelation);
      if (result == null)
        result = casePublishableElement(controlRelation);
      if (result == null)
        result = caseModelElement(controlRelation);
      if (result == null)
        result = caseExtensibleElement(controlRelation);
      if (result == null)
        result = caseElement(controlRelation);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.CONTROL_ACTION: {
      ControlAction controlAction = (ControlAction) theEObject;
      T1 result = caseControlAction(controlAction);
      if (result == null)
        result = caseExchangeElement(controlAction);
      if (result == null)
        result = caseControlFlawContext(controlAction);
      if (result == null)
        result = caseUserIdentifiedElement(controlAction);
      if (result == null)
        result = caseArchitectureMappable(controlAction);
      if (result == null)
        result = caseStpaAnalysisElement(controlAction);
      if (result == null)
        result = caseNamedElement(controlAction);
      if (result == null)
        result = caseAbstractNamedElement(controlAction);
      if (result == null)
        result = caseCapellaElement(controlAction);
      if (result == null)
        result = caseTraceableElement(controlAction);
      if (result == null)
        result = casePublishableElement(controlAction);
      if (result == null)
        result = caseModelElement(controlAction);
      if (result == null)
        result = caseExtensibleElement(controlAction);
      if (result == null)
        result = caseElement(controlAction);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT: {
      ResponsibilitySupportExchangeElement responsibilitySupportExchangeElement = (ResponsibilitySupportExchangeElement) theEObject;
      T1 result = caseResponsibilitySupportExchangeElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseExchangeElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseControlFlawContext(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseUserIdentifiedElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseArchitectureMappable(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseStpaAnalysisElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseNamedElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseAbstractNamedElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseCapellaElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseTraceableElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = casePublishableElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseModelElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseExtensibleElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = caseElement(responsibilitySupportExchangeElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.FEEDBACK_RELATION: {
      FeedbackRelation feedbackRelation = (FeedbackRelation) theEObject;
      T1 result = caseFeedbackRelation(feedbackRelation);
      if (result == null)
        result = caseRelation(feedbackRelation);
      if (result == null)
        result = caseArchitectureMappable(feedbackRelation);
      if (result == null)
        result = caseStpaAnalysisElement(feedbackRelation);
      if (result == null)
        result = caseNamedElement(feedbackRelation);
      if (result == null)
        result = caseAbstractNamedElement(feedbackRelation);
      if (result == null)
        result = caseCapellaElement(feedbackRelation);
      if (result == null)
        result = caseTraceableElement(feedbackRelation);
      if (result == null)
        result = casePublishableElement(feedbackRelation);
      if (result == null)
        result = caseModelElement(feedbackRelation);
      if (result == null)
        result = caseExtensibleElement(feedbackRelation);
      if (result == null)
        result = caseElement(feedbackRelation);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.FEEDBACK_ELEMENT: {
      FeedbackElement feedbackElement = (FeedbackElement) theEObject;
      T1 result = caseFeedbackElement(feedbackElement);
      if (result == null)
        result = caseResponsibilitySupportExchangeElement(feedbackElement);
      if (result == null)
        result = caseExchangeElement(feedbackElement);
      if (result == null)
        result = caseControlFlawContext(feedbackElement);
      if (result == null)
        result = caseUserIdentifiedElement(feedbackElement);
      if (result == null)
        result = caseArchitectureMappable(feedbackElement);
      if (result == null)
        result = caseStpaAnalysisElement(feedbackElement);
      if (result == null)
        result = caseNamedElement(feedbackElement);
      if (result == null)
        result = caseAbstractNamedElement(feedbackElement);
      if (result == null)
        result = caseCapellaElement(feedbackElement);
      if (result == null)
        result = caseTraceableElement(feedbackElement);
      if (result == null)
        result = casePublishableElement(feedbackElement);
      if (result == null)
        result = caseModelElement(feedbackElement);
      if (result == null)
        result = caseExtensibleElement(feedbackElement);
      if (result == null)
        result = caseElement(feedbackElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.INFORMATION_EXCHANGE_RELATION: {
      InformationExchangeRelation informationExchangeRelation = (InformationExchangeRelation) theEObject;
      T1 result = caseInformationExchangeRelation(informationExchangeRelation);
      if (result == null)
        result = caseRelation(informationExchangeRelation);
      if (result == null)
        result = caseArchitectureMappable(informationExchangeRelation);
      if (result == null)
        result = caseStpaAnalysisElement(informationExchangeRelation);
      if (result == null)
        result = caseNamedElement(informationExchangeRelation);
      if (result == null)
        result = caseAbstractNamedElement(informationExchangeRelation);
      if (result == null)
        result = caseCapellaElement(informationExchangeRelation);
      if (result == null)
        result = caseTraceableElement(informationExchangeRelation);
      if (result == null)
        result = casePublishableElement(informationExchangeRelation);
      if (result == null)
        result = caseModelElement(informationExchangeRelation);
      if (result == null)
        result = caseExtensibleElement(informationExchangeRelation);
      if (result == null)
        result = caseElement(informationExchangeRelation);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.PIECE_OF_INFORMATION: {
      PieceOfInformation pieceOfInformation = (PieceOfInformation) theEObject;
      T1 result = casePieceOfInformation(pieceOfInformation);
      if (result == null)
        result = caseResponsibilitySupportExchangeElement(pieceOfInformation);
      if (result == null)
        result = caseExchangeElement(pieceOfInformation);
      if (result == null)
        result = caseControlFlawContext(pieceOfInformation);
      if (result == null)
        result = caseUserIdentifiedElement(pieceOfInformation);
      if (result == null)
        result = caseArchitectureMappable(pieceOfInformation);
      if (result == null)
        result = caseStpaAnalysisElement(pieceOfInformation);
      if (result == null)
        result = caseNamedElement(pieceOfInformation);
      if (result == null)
        result = caseAbstractNamedElement(pieceOfInformation);
      if (result == null)
        result = caseCapellaElement(pieceOfInformation);
      if (result == null)
        result = caseTraceableElement(pieceOfInformation);
      if (result == null)
        result = casePublishableElement(pieceOfInformation);
      if (result == null)
        result = caseModelElement(pieceOfInformation);
      if (result == null)
        result = caseExtensibleElement(pieceOfInformation);
      if (result == null)
        result = caseElement(pieceOfInformation);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.MITIGABLE: {
      Mitigable mitigable = (Mitigable) theEObject;
      T1 result = caseMitigable(mitigable);
      if (result == null)
        result = caseStpaAnalysisElement(mitigable);
      if (result == null)
        result = caseNamedElement(mitigable);
      if (result == null)
        result = caseAbstractNamedElement(mitigable);
      if (result == null)
        result = caseCapellaElement(mitigable);
      if (result == null)
        result = caseTraceableElement(mitigable);
      if (result == null)
        result = casePublishableElement(mitigable);
      if (result == null)
        result = caseModelElement(mitigable);
      if (result == null)
        result = caseExtensibleElement(mitigable);
      if (result == null)
        result = caseElement(mitigable);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.CONTROL_FLAW_ANALYSIS_ELEMENT: {
      ControlFlawAnalysisElement controlFlawAnalysisElement = (ControlFlawAnalysisElement) theEObject;
      T1 result = caseControlFlawAnalysisElement(controlFlawAnalysisElement);
      if (result == null)
        result = caseUserIdentifiedElement(controlFlawAnalysisElement);
      if (result == null)
        result = caseMitigable(controlFlawAnalysisElement);
      if (result == null)
        result = caseArchitectureMappable(controlFlawAnalysisElement);
      if (result == null)
        result = caseStpaAnalysisElement(controlFlawAnalysisElement);
      if (result == null)
        result = caseNamedElement(controlFlawAnalysisElement);
      if (result == null)
        result = caseAbstractNamedElement(controlFlawAnalysisElement);
      if (result == null)
        result = caseCapellaElement(controlFlawAnalysisElement);
      if (result == null)
        result = caseTraceableElement(controlFlawAnalysisElement);
      if (result == null)
        result = casePublishableElement(controlFlawAnalysisElement);
      if (result == null)
        result = caseModelElement(controlFlawAnalysisElement);
      if (result == null)
        result = caseExtensibleElement(controlFlawAnalysisElement);
      if (result == null)
        result = caseElement(controlFlawAnalysisElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.UNSAFE_CONTROL_ACTION: {
      UnsafeControlAction unsafeControlAction = (UnsafeControlAction) theEObject;
      T1 result = caseUnsafeControlAction(unsafeControlAction);
      if (result == null)
        result = caseControlFlawAnalysisElement(unsafeControlAction);
      if (result == null)
        result = caseControlFlawContext(unsafeControlAction);
      if (result == null)
        result = caseUserIdentifiedElement(unsafeControlAction);
      if (result == null)
        result = caseMitigable(unsafeControlAction);
      if (result == null)
        result = caseArchitectureMappable(unsafeControlAction);
      if (result == null)
        result = caseStpaAnalysisElement(unsafeControlAction);
      if (result == null)
        result = caseNamedElement(unsafeControlAction);
      if (result == null)
        result = caseAbstractNamedElement(unsafeControlAction);
      if (result == null)
        result = caseCapellaElement(unsafeControlAction);
      if (result == null)
        result = caseTraceableElement(unsafeControlAction);
      if (result == null)
        result = casePublishableElement(unsafeControlAction);
      if (result == null)
        result = caseModelElement(unsafeControlAction);
      if (result == null)
        result = caseExtensibleElement(unsafeControlAction);
      if (result == null)
        result = caseElement(unsafeControlAction);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.LOSS_SCENARIO: {
      LossScenario lossScenario = (LossScenario) theEObject;
      T1 result = caseLossScenario(lossScenario);
      if (result == null)
        result = caseControlFlawAnalysisElement(lossScenario);
      if (result == null)
        result = caseUserIdentifiedElement(lossScenario);
      if (result == null)
        result = caseMitigable(lossScenario);
      if (result == null)
        result = caseArchitectureMappable(lossScenario);
      if (result == null)
        result = caseStpaAnalysisElement(lossScenario);
      if (result == null)
        result = caseNamedElement(lossScenario);
      if (result == null)
        result = caseAbstractNamedElement(lossScenario);
      if (result == null)
        result = caseCapellaElement(lossScenario);
      if (result == null)
        result = caseTraceableElement(lossScenario);
      if (result == null)
        result = casePublishableElement(lossScenario);
      if (result == null)
        result = caseModelElement(lossScenario);
      if (result == null)
        result = caseExtensibleElement(lossScenario);
      if (result == null)
        result = caseElement(lossScenario);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.UNSAFE_CONTROL_ACTION_CATEGORY: {
      UnsafeControlActionCategory unsafeControlActionCategory = (UnsafeControlActionCategory) theEObject;
      T1 result = caseUnsafeControlActionCategory(unsafeControlActionCategory);
      if (result == null)
        result = caseStpaAnalysisElement(unsafeControlActionCategory);
      if (result == null)
        result = caseNamedElement(unsafeControlActionCategory);
      if (result == null)
        result = caseAbstractNamedElement(unsafeControlActionCategory);
      if (result == null)
        result = caseCapellaElement(unsafeControlActionCategory);
      if (result == null)
        result = caseTraceableElement(unsafeControlActionCategory);
      if (result == null)
        result = casePublishableElement(unsafeControlActionCategory);
      if (result == null)
        result = caseModelElement(unsafeControlActionCategory);
      if (result == null)
        result = caseExtensibleElement(unsafeControlActionCategory);
      if (result == null)
        result = caseElement(unsafeControlActionCategory);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.CONTROL_FLAW_SET: {
      ControlFlawSet controlFlawSet = (ControlFlawSet) theEObject;
      T1 result = caseControlFlawSet(controlFlawSet);
      if (result == null)
        result = caseStpaAnalysisElement(controlFlawSet);
      if (result == null)
        result = caseNamedElement(controlFlawSet);
      if (result == null)
        result = caseAbstractNamedElement(controlFlawSet);
      if (result == null)
        result = caseCapellaElement(controlFlawSet);
      if (result == null)
        result = caseTraceableElement(controlFlawSet);
      if (result == null)
        result = casePublishableElement(controlFlawSet);
      if (result == null)
        result = caseModelElement(controlFlawSet);
      if (result == null)
        result = caseExtensibleElement(controlFlawSet);
      if (result == null)
        result = caseElement(controlFlawSet);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case StpaPackage.CONTROL_FLAW: {
      ControlFlaw controlFlaw = (ControlFlaw) theEObject;
      T1 result = caseControlFlaw(controlFlaw);
      if (result == null)
        result = caseArchitectureMappable(controlFlaw);
      if (result == null)
        result = caseMitigable(controlFlaw);
      if (result == null)
        result = caseStpaAnalysisElement(controlFlaw);
      if (result == null)
        result = caseNamedElement(controlFlaw);
      if (result == null)
        result = caseAbstractNamedElement(controlFlaw);
      if (result == null)
        result = caseCapellaElement(controlFlaw);
      if (result == null)
        result = caseTraceableElement(controlFlaw);
      if (result == null)
        result = casePublishableElement(controlFlaw);
      if (result == null)
        result = caseModelElement(controlFlaw);
      if (result == null)
        result = caseExtensibleElement(controlFlaw);
      if (result == null)
        result = caseElement(controlFlaw);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Analysis Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Analysis Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseStpaAnalysisElement(StpaAnalysisElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Identified Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Identified Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseUserIdentifiedElement(UserIdentifiedElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decomposable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decomposable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T extends Decomposable<T>> T1 caseDecomposable(Decomposable<T> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decomposition Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decomposition Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T extends Decomposable<T>> T1 caseDecompositionCategory(DecompositionCategory<T> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Architecture Mappable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Architecture Mappable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T extends NamedElement> T1 caseArchitectureMappable(ArchitectureMappable<T> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Analysis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Analysis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseStpaAnalysis(StpaAnalysis object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Analysis Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Analysis Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseAnalysisPackage(AnalysisPackage object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Technical Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technical Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseTechnicalPackage(TechnicalPackage object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loss Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loss Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseLossPackage(LossPackage object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hazard Constraint Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hazard Constraint Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseHazardConstraintPackage(HazardConstraintPackage object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Structure Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Structure Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseControlStructurePackage(ControlStructurePackage object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loss Scenario Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loss Scenario Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseLossScenarioPackage(LossScenarioPackage object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseStakeholder(Stakeholder object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stake</em>'.
   * <!-- begin-user-doc -->
  	 * This implementation returns null;
  	 * returning a non-null result will terminate the switch.
  	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stake</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseStake(Stake object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loss</em>'.
   * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loss</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseLoss(Loss object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Flaw Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Flaw Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseControlFlawTarget(ControlFlawTarget object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hazard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hazard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseHazard(Hazard object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseSystemConstraint(SystemConstraint object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseControlEntity(ControlEntity object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exchange Based Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exchange Based Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseExchangeBasedElement(ExchangeBasedElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Responsibility</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Responsibility</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseResponsibility(Responsibility object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Model Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Model Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseProcessModelVariable(ProcessModelVariable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Model Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Model Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseProcessModelValue(ProcessModelValue object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseRelation(Relation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Flaw Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Flaw Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseControlFlawContext(ControlFlawContext object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exchange Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exchange Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseExchangeElement(ExchangeElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseControlRelation(ControlRelation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseControlAction(ControlAction object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Responsibility Support Exchange Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Responsibility Support Exchange Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseResponsibilitySupportExchangeElement(ResponsibilitySupportExchangeElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feedback Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feedback Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseFeedbackRelation(FeedbackRelation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feedback Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feedback Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseFeedbackElement(FeedbackElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Information Exchange Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Information Exchange Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseInformationExchangeRelation(InformationExchangeRelation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Piece Of Information</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Piece Of Information</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 casePieceOfInformation(PieceOfInformation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Flaw Analysis Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Flaw Analysis Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseControlFlawAnalysisElement(ControlFlawAnalysisElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mitigable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mitigable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseMitigable(Mitigable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unsafe Control Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unsafe Control Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseUnsafeControlAction(UnsafeControlAction object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loss Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loss Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseLossScenario(LossScenario object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unsafe Control Action Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unsafe Control Action Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseUnsafeControlActionCategory(UnsafeControlActionCategory object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Flaw</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Flaw</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseControlFlaw(ControlFlaw object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Flaw Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Flaw Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseControlFlawSet(ControlFlawSet object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseElement(Element object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseExtensibleElement(ExtensibleElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseModelElement(ModelElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseAbstractNamedElement(AbstractNamedElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseTraceableElement(TraceableElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 casePublishableElement(PublishableElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Capella Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capella Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseCapellaElement(CapellaElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseNamedElement(NamedElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Extension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Extension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseElementExtension(ElementExtension object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T1 defaultCase(EObject object) {
    return null;
  }

} //StpaSwitch
