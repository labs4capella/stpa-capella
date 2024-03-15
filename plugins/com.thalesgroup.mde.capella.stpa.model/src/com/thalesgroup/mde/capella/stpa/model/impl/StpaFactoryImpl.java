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
package com.thalesgroup.mde.capella.stpa.model.impl;

import com.thalesgroup.mde.capella.stpa.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StpaFactoryImpl extends EFactoryImpl implements StpaFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StpaFactory init() {
    try {
      StpaFactory theStpaFactory = (StpaFactory) EPackage.Registry.INSTANCE.getEFactory(StpaPackage.eNS_URI);
      if (theStpaFactory != null) {
        return theStpaFactory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StpaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StpaFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case StpaPackage.DECOMPOSITION_CATEGORY:
      return createDecompositionCategory();
    case StpaPackage.STPA_ANALYSIS:
      return createStpaAnalysis();
    case StpaPackage.TECHNICAL_PACKAGE:
      return createTechnicalPackage();
    case StpaPackage.LOSS_PACKAGE:
      return createLossPackage();
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE:
      return createHazardConstraintPackage();
    case StpaPackage.CONTROL_STRUCTURE_PACKAGE:
      return createControlStructurePackage();
    case StpaPackage.LOSS_SCENARIO_PACKAGE:
      return createLossScenarioPackage();
    case StpaPackage.STAKEHOLDER:
      return createStakeholder();
    case StpaPackage.STAKE:
      return createStake();
    case StpaPackage.LOSS:
      return createLoss();
    case StpaPackage.HAZARD:
      return createHazard();
    case StpaPackage.SYSTEM_CONSTRAINT:
      return createSystemConstraint();
    case StpaPackage.CONTROL_ENTITY:
      return createControlEntity();
    case StpaPackage.RESPONSIBILITY:
      return createResponsibility();
    case StpaPackage.PROCESS_MODEL_VARIABLE:
      return createProcessModelVariable();
    case StpaPackage.PROCESS_MODEL_VALUE:
      return createProcessModelValue();
    case StpaPackage.CONTROL_RELATION:
      return createControlRelation();
    case StpaPackage.CONTROL_ACTION:
      return createControlAction();
    case StpaPackage.FEEDBACK_RELATION:
      return createFeedbackRelation();
    case StpaPackage.FEEDBACK_ELEMENT:
      return createFeedbackElement();
    case StpaPackage.INFORMATION_EXCHANGE_RELATION:
      return createInformationExchangeRelation();
    case StpaPackage.PIECE_OF_INFORMATION:
      return createPieceOfInformation();
    case StpaPackage.UNSAFE_CONTROL_ACTION:
      return createUnsafeControlAction();
    case StpaPackage.LOSS_SCENARIO:
      return createLossScenario();
    case StpaPackage.UNSAFE_CONTROL_ACTION_CATEGORY:
      return createUnsafeControlActionCategory();
    case StpaPackage.CONTROL_FLAW_SET:
      return createControlFlawSet();
    case StpaPackage.CONTROL_FLAW:
      return createControlFlaw();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
    case StpaPackage.UNSAFE_CONTROL_ACTION_KIND:
      return createUnsafeControlActionKindFromString(eDataType, initialValue);
    case StpaPackage.CONTROL_FLAW_KIND:
      return createControlFlawKindFromString(eDataType, initialValue);
    case StpaPackage.CONTROL_FLAW_VERDICT:
      return createControlFlawVerdictFromString(eDataType, initialValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
    case StpaPackage.UNSAFE_CONTROL_ACTION_KIND:
      return convertUnsafeControlActionKindToString(eDataType, instanceValue);
    case StpaPackage.CONTROL_FLAW_KIND:
      return convertControlFlawKindToString(eDataType, instanceValue);
    case StpaPackage.CONTROL_FLAW_VERDICT:
      return convertControlFlawVerdictToString(eDataType, instanceValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public <T extends Decomposable<T>> DecompositionCategory<T> createDecompositionCategory() {
    DecompositionCategoryImpl<T> decompositionCategory = new DecompositionCategoryImpl<T>();
    return decompositionCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StpaAnalysis createStpaAnalysis() {
    StpaAnalysisImpl stpaAnalysis = new StpaAnalysisImpl();
    return stpaAnalysis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TechnicalPackage createTechnicalPackage() {
    TechnicalPackageImpl technicalPackage = new TechnicalPackageImpl();
    return technicalPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LossPackage createLossPackage() {
    LossPackageImpl lossPackage = new LossPackageImpl();
    return lossPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HazardConstraintPackage createHazardConstraintPackage() {
    HazardConstraintPackageImpl hazardConstraintPackage = new HazardConstraintPackageImpl();
    return hazardConstraintPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlStructurePackage createControlStructurePackage() {
    ControlStructurePackageImpl controlStructurePackage = new ControlStructurePackageImpl();
    return controlStructurePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LossScenarioPackage createLossScenarioPackage() {
    LossScenarioPackageImpl lossScenarioPackage = new LossScenarioPackageImpl();
    return lossScenarioPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Stakeholder createStakeholder() {
    StakeholderImpl stakeholder = new StakeholderImpl();
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Stake createStake() {
    StakeImpl stake = new StakeImpl();
    return stake;
  }

  /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Loss createLoss() {
    LossImpl loss = new LossImpl();
    return loss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Hazard createHazard() {
    HazardImpl hazard = new HazardImpl();
    return hazard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SystemConstraint createSystemConstraint() {
    SystemConstraintImpl systemConstraint = new SystemConstraintImpl();
    return systemConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlEntity createControlEntity() {
    ControlEntityImpl controlEntity = new ControlEntityImpl();
    return controlEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Responsibility createResponsibility() {
    ResponsibilityImpl responsibility = new ResponsibilityImpl();
    return responsibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessModelVariable createProcessModelVariable() {
    ProcessModelVariableImpl processModelVariable = new ProcessModelVariableImpl();
    return processModelVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessModelValue createProcessModelValue() {
    ProcessModelValueImpl processModelValue = new ProcessModelValueImpl();
    return processModelValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlRelation createControlRelation() {
    ControlRelationImpl controlRelation = new ControlRelationImpl();
    return controlRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlAction createControlAction() {
    ControlActionImpl controlAction = new ControlActionImpl();
    return controlAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeedbackRelation createFeedbackRelation() {
    FeedbackRelationImpl feedbackRelation = new FeedbackRelationImpl();
    return feedbackRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeedbackElement createFeedbackElement() {
    FeedbackElementImpl feedbackElement = new FeedbackElementImpl();
    return feedbackElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InformationExchangeRelation createInformationExchangeRelation() {
    InformationExchangeRelationImpl informationExchangeRelation = new InformationExchangeRelationImpl();
    return informationExchangeRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PieceOfInformation createPieceOfInformation() {
    PieceOfInformationImpl pieceOfInformation = new PieceOfInformationImpl();
    return pieceOfInformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnsafeControlAction createUnsafeControlAction() {
    UnsafeControlActionImpl unsafeControlAction = new UnsafeControlActionImpl();
    return unsafeControlAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LossScenario createLossScenario() {
    LossScenarioImpl lossScenario = new LossScenarioImpl();
    return lossScenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnsafeControlActionCategory createUnsafeControlActionCategory() {
    UnsafeControlActionCategoryImpl unsafeControlActionCategory = new UnsafeControlActionCategoryImpl();
    return unsafeControlActionCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlFlawSet createControlFlawSet() {
    ControlFlawSetImpl controlFlawSet = new ControlFlawSetImpl();
    return controlFlawSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlFlaw createControlFlaw() {
    ControlFlawImpl controlFlaw = new ControlFlawImpl();
    return controlFlaw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnsafeControlActionKind createUnsafeControlActionKindFromString(EDataType eDataType, String initialValue) {
    UnsafeControlActionKind result = UnsafeControlActionKind.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException(
          "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnsafeControlActionKindToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFlawKind createControlFlawKindFromString(EDataType eDataType, String initialValue) {
    ControlFlawKind result = ControlFlawKind.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException(
          "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertControlFlawKindToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFlawVerdict createControlFlawVerdictFromString(EDataType eDataType, String initialValue) {
    ControlFlawVerdict result = ControlFlawVerdict.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException(
          "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertControlFlawVerdictToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StpaPackage getStpaPackage() {
    return (StpaPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StpaPackage getPackage() {
    return StpaPackage.eINSTANCE;
  }

} //StpaFactoryImpl
