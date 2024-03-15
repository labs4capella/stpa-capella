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
package com.thalesgroup.mde.capella.stpa.model.util;

import com.thalesgroup.mde.capella.stpa.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage
 * @generated
 */
public class StpaAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StpaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StpaAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = StpaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject) object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StpaSwitch<Adapter> modelSwitch = new StpaSwitch<Adapter>() {
    @Override
    public Adapter caseStpaAnalysisElement(StpaAnalysisElement object) {
      return createStpaAnalysisElementAdapter();
    }

    @Override
    public <T extends NamedElement> Adapter caseArchitectureMappable(ArchitectureMappable<T> object) {
      return createArchitectureMappableAdapter();
    }

    @Override
    public Adapter caseUserIdentifiedElement(UserIdentifiedElement object) {
      return createUserIdentifiedElementAdapter();
    }

    @Override
    public <T extends Decomposable<T>> Adapter caseDecomposable(Decomposable<T> object) {
      return createDecomposableAdapter();
    }

    @Override
    public <T extends Decomposable<T>> Adapter caseDecompositionCategory(DecompositionCategory<T> object) {
      return createDecompositionCategoryAdapter();
    }

    @Override
    public Adapter caseStpaAnalysis(StpaAnalysis object) {
      return createStpaAnalysisAdapter();
    }

    @Override
    public Adapter caseAnalysisPackage(AnalysisPackage object) {
      return createAnalysisPackageAdapter();
    }

    @Override
    public Adapter caseTechnicalPackage(TechnicalPackage object) {
      return createTechnicalPackageAdapter();
    }

    @Override
    public Adapter caseLossPackage(LossPackage object) {
      return createLossPackageAdapter();
    }

    @Override
    public Adapter caseHazardConstraintPackage(HazardConstraintPackage object) {
      return createHazardConstraintPackageAdapter();
    }

    @Override
    public Adapter caseControlStructurePackage(ControlStructurePackage object) {
      return createControlStructurePackageAdapter();
    }

    @Override
    public Adapter caseLossScenarioPackage(LossScenarioPackage object) {
      return createLossScenarioPackageAdapter();
    }

    @Override
    public Adapter caseStakeholder(Stakeholder object) {
      return createStakeholderAdapter();
    }

    @Override
    public Adapter caseStake(Stake object) {
      return createStakeAdapter();
    }

    @Override
    public Adapter caseLoss(Loss object) {
      return createLossAdapter();
    }

    @Override
    public Adapter caseControlFlawTarget(ControlFlawTarget object) {
      return createControlFlawTargetAdapter();
    }

    @Override
    public Adapter caseHazard(Hazard object) {
      return createHazardAdapter();
    }

    @Override
    public Adapter caseSystemConstraint(SystemConstraint object) {
      return createSystemConstraintAdapter();
    }

    @Override
    public Adapter caseControlEntity(ControlEntity object) {
      return createControlEntityAdapter();
    }

    @Override
    public Adapter caseExchangeBasedElement(ExchangeBasedElement object) {
      return createExchangeBasedElementAdapter();
    }

    @Override
    public Adapter caseResponsibility(Responsibility object) {
      return createResponsibilityAdapter();
    }

    @Override
    public Adapter caseProcessModelVariable(ProcessModelVariable object) {
      return createProcessModelVariableAdapter();
    }

    @Override
    public Adapter caseProcessModelValue(ProcessModelValue object) {
      return createProcessModelValueAdapter();
    }

    @Override
    public Adapter caseRelation(Relation object) {
      return createRelationAdapter();
    }

    @Override
    public Adapter caseControlFlawContext(ControlFlawContext object) {
      return createControlFlawContextAdapter();
    }

    @Override
    public Adapter caseExchangeElement(ExchangeElement object) {
      return createExchangeElementAdapter();
    }

    @Override
    public Adapter caseControlRelation(ControlRelation object) {
      return createControlRelationAdapter();
    }

    @Override
    public Adapter caseControlAction(ControlAction object) {
      return createControlActionAdapter();
    }

    @Override
    public Adapter caseResponsibilitySupportExchangeElement(ResponsibilitySupportExchangeElement object) {
      return createResponsibilitySupportExchangeElementAdapter();
    }

    @Override
    public Adapter caseFeedbackRelation(FeedbackRelation object) {
      return createFeedbackRelationAdapter();
    }

    @Override
    public Adapter caseFeedbackElement(FeedbackElement object) {
      return createFeedbackElementAdapter();
    }

    @Override
    public Adapter caseInformationExchangeRelation(InformationExchangeRelation object) {
      return createInformationExchangeRelationAdapter();
    }

    @Override
    public Adapter casePieceOfInformation(PieceOfInformation object) {
      return createPieceOfInformationAdapter();
    }

    @Override
    public Adapter caseMitigable(Mitigable object) {
      return createMitigableAdapter();
    }

    @Override
    public Adapter caseControlFlawAnalysisElement(ControlFlawAnalysisElement object) {
      return createControlFlawAnalysisElementAdapter();
    }

    @Override
    public Adapter caseUnsafeControlAction(UnsafeControlAction object) {
      return createUnsafeControlActionAdapter();
    }

    @Override
    public Adapter caseLossScenario(LossScenario object) {
      return createLossScenarioAdapter();
    }

    @Override
    public Adapter caseUnsafeControlActionCategory(UnsafeControlActionCategory object) {
      return createUnsafeControlActionCategoryAdapter();
    }

    @Override
    public Adapter caseControlFlawSet(ControlFlawSet object) {
      return createControlFlawSetAdapter();
    }

    @Override
    public Adapter caseControlFlaw(ControlFlaw object) {
      return createControlFlawAdapter();
    }

    @Override
    public Adapter caseElement(Element object) {
      return createElementAdapter();
    }

    @Override
    public Adapter caseExtensibleElement(ExtensibleElement object) {
      return createExtensibleElementAdapter();
    }

    @Override
    public Adapter caseModelElement(ModelElement object) {
      return createModelElementAdapter();
    }

    @Override
    public Adapter caseAbstractNamedElement(AbstractNamedElement object) {
      return createAbstractNamedElementAdapter();
    }

    @Override
    public Adapter caseTraceableElement(TraceableElement object) {
      return createTraceableElementAdapter();
    }

    @Override
    public Adapter casePublishableElement(PublishableElement object) {
      return createPublishableElementAdapter();
    }

    @Override
    public Adapter caseCapellaElement(CapellaElement object) {
      return createCapellaElementAdapter();
    }

    @Override
    public Adapter caseNamedElement(NamedElement object) {
      return createNamedElementAdapter();
    }

    @Override
    public Adapter caseElementExtension(ElementExtension object) {
      return createElementExtensionAdapter();
    }

    @Override
    public Adapter defaultCase(EObject object) {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject) target);
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement <em>Analysis Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement
   * @generated
   */
  public Adapter createStpaAnalysisElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement <em>User Identified Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement
   * @generated
   */
  public Adapter createUserIdentifiedElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.Decomposable <em>Decomposable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.Decomposable
   * @generated
   */
  public Adapter createDecomposableAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.DecompositionCategory <em>Decomposition Category</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.DecompositionCategory
   * @generated
   */
  public Adapter createDecompositionCategoryAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable <em>Architecture Mappable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable
   * @generated
   */
  public Adapter createArchitectureMappableAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis <em>Analysis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysis
   * @generated
   */
  public Adapter createStpaAnalysisAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.AnalysisPackage <em>Analysis Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.AnalysisPackage
   * @generated
   */
  public Adapter createAnalysisPackageAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.TechnicalPackage <em>Technical Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.TechnicalPackage
   * @generated
   */
  public Adapter createTechnicalPackageAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.LossPackage <em>Loss Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.LossPackage
   * @generated
   */
  public Adapter createLossPackageAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage <em>Hazard Constraint Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage
   * @generated
   */
  public Adapter createHazardConstraintPackageAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage <em>Control Structure Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage
   * @generated
   */
  public Adapter createControlStructurePackageAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage <em>Loss Scenario Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage
   * @generated
   */
  public Adapter createLossScenarioPackageAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.Stakeholder
   * @generated
   */
  public Adapter createStakeholderAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.Stake <em>Stake</em>}'.
   * <!-- begin-user-doc -->
  	 * This default implementation returns null so that we can easily ignore cases;
  	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
  	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.Stake
   * @generated
   */
  public Adapter createStakeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.Loss <em>Loss</em>}'.
   * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.Loss
   * @generated
   */
  public Adapter createLossAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawTarget <em>Control Flaw Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawTarget
   * @generated
   */
  public Adapter createControlFlawTargetAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.Hazard <em>Hazard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard
   * @generated
   */
  public Adapter createHazardAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint <em>System Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint
   * @generated
   */
  public Adapter createSystemConstraintAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity <em>Control Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity
   * @generated
   */
  public Adapter createControlEntityAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeBasedElement <em>Exchange Based Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeBasedElement
   * @generated
   */
  public Adapter createExchangeBasedElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility <em>Responsibility</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility
   * @generated
   */
  public Adapter createResponsibilityAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable <em>Process Model Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable
   * @generated
   */
  public Adapter createProcessModelVariableAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelValue <em>Process Model Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelValue
   * @generated
   */
  public Adapter createProcessModelValueAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.Relation
   * @generated
   */
  public Adapter createRelationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawContext <em>Control Flaw Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawContext
   * @generated
   */
  public Adapter createControlFlawContextAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement <em>Exchange Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeElement
   * @generated
   */
  public Adapter createExchangeElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ControlRelation <em>Control Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlRelation
   * @generated
   */
  public Adapter createControlRelationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ControlAction <em>Control Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlAction
   * @generated
   */
  public Adapter createControlActionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ResponsibilitySupportExchangeElement <em>Responsibility Support Exchange Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ResponsibilitySupportExchangeElement
   * @generated
   */
  public Adapter createResponsibilitySupportExchangeElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackRelation <em>Feedback Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackRelation
   * @generated
   */
  public Adapter createFeedbackRelationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement <em>Feedback Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackElement
   * @generated
   */
  public Adapter createFeedbackElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation <em>Information Exchange Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation
   * @generated
   */
  public Adapter createInformationExchangeRelationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation <em>Piece Of Information</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.PieceOfInformation
   * @generated
   */
  public Adapter createPieceOfInformationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawAnalysisElement <em>Control Flaw Analysis Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawAnalysisElement
   * @generated
   */
  public Adapter createControlFlawAnalysisElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.Mitigable <em>Mitigable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.Mitigable
   * @generated
   */
  public Adapter createMitigableAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction <em>Unsafe Control Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction
   * @generated
   */
  public Adapter createUnsafeControlActionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario <em>Loss Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario
   * @generated
   */
  public Adapter createLossScenarioAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory <em>Unsafe Control Action Category</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory
   * @generated
   */
  public Adapter createUnsafeControlActionCategoryAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw <em>Control Flaw</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlaw
   * @generated
   */
  public Adapter createControlFlawAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet <em>Control Flaw Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawSet
   * @generated
   */
  public Adapter createControlFlawSetAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.kitalpha.emde.model.Element
   * @generated
   */
  public Adapter createElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.ExtensibleElement <em>Extensible Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.kitalpha.emde.model.ExtensibleElement
   * @generated
   */
  public Adapter createExtensibleElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.common.data.modellingcore.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.AbstractNamedElement <em>Abstract Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.common.data.modellingcore.AbstractNamedElement
   * @generated
   */
  public Adapter createAbstractNamedElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.TraceableElement <em>Traceable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.common.data.modellingcore.TraceableElement
   * @generated
   */
  public Adapter createTraceableElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.PublishableElement <em>Publishable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.common.data.modellingcore.PublishableElement
   * @generated
   */
  public Adapter createPublishableElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.capellacore.CapellaElement <em>Capella Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.core.data.capellacore.CapellaElement
   * @generated
   */
  public Adapter createCapellaElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.capellacore.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.core.data.capellacore.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.ElementExtension <em>Element Extension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.kitalpha.emde.model.ElementExtension
   * @generated
   */
  public Adapter createElementExtensionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //StpaAdapterFactory
