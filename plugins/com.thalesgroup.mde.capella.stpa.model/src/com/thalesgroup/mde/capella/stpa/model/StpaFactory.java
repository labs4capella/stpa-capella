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
package com.thalesgroup.mde.capella.stpa.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage
 * @generated
 */
public interface StpaFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StpaFactory eINSTANCE = com.thalesgroup.mde.capella.stpa.model.impl.StpaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Decomposition Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decomposition Category</em>'.
   * @generated
   */
  <T extends Decomposable<T>> DecompositionCategory<T> createDecompositionCategory();

  /**
   * Returns a new object of class '<em>Analysis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Analysis</em>'.
   * @generated
   */
  StpaAnalysis createStpaAnalysis();

  /**
   * Returns a new object of class '<em>Technical Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Technical Package</em>'.
   * @generated
   */
  TechnicalPackage createTechnicalPackage();

  /**
   * Returns a new object of class '<em>Loss Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loss Package</em>'.
   * @generated
   */
  LossPackage createLossPackage();

  /**
   * Returns a new object of class '<em>Hazard Constraint Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hazard Constraint Package</em>'.
   * @generated
   */
  HazardConstraintPackage createHazardConstraintPackage();

  /**
   * Returns a new object of class '<em>Control Structure Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Structure Package</em>'.
   * @generated
   */
  ControlStructurePackage createControlStructurePackage();

  /**
   * Returns a new object of class '<em>Loss Scenario Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loss Scenario Package</em>'.
   * @generated
   */
  LossScenarioPackage createLossScenarioPackage();

  /**
   * Returns a new object of class '<em>Stakeholder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stakeholder</em>'.
   * @generated
   */
  Stakeholder createStakeholder();

  /**
   * Returns a new object of class '<em>Stake</em>'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Stake</em>'.
   * @generated
   */
  Stake createStake();

  /**
   * Returns a new object of class '<em>Loss</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Loss</em>'.
   * @generated
   */
  Loss createLoss();

  /**
   * Returns a new object of class '<em>Hazard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hazard</em>'.
   * @generated
   */
  Hazard createHazard();

  /**
   * Returns a new object of class '<em>System Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Constraint</em>'.
   * @generated
   */
  SystemConstraint createSystemConstraint();

  /**
   * Returns a new object of class '<em>Control Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Entity</em>'.
   * @generated
   */
  ControlEntity createControlEntity();

  /**
   * Returns a new object of class '<em>Responsibility</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Responsibility</em>'.
   * @generated
   */
  Responsibility createResponsibility();

  /**
   * Returns a new object of class '<em>Process Model Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Model Variable</em>'.
   * @generated
   */
  ProcessModelVariable createProcessModelVariable();

  /**
   * Returns a new object of class '<em>Process Model Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Model Value</em>'.
   * @generated
   */
  ProcessModelValue createProcessModelValue();

  /**
   * Returns a new object of class '<em>Control Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Relation</em>'.
   * @generated
   */
  ControlRelation createControlRelation();

  /**
   * Returns a new object of class '<em>Control Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Action</em>'.
   * @generated
   */
  ControlAction createControlAction();

  /**
   * Returns a new object of class '<em>Feedback Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feedback Relation</em>'.
   * @generated
   */
  FeedbackRelation createFeedbackRelation();

  /**
   * Returns a new object of class '<em>Feedback Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feedback Element</em>'.
   * @generated
   */
  FeedbackElement createFeedbackElement();

  /**
   * Returns a new object of class '<em>Information Exchange Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Information Exchange Relation</em>'.
   * @generated
   */
  InformationExchangeRelation createInformationExchangeRelation();

  /**
   * Returns a new object of class '<em>Piece Of Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Piece Of Information</em>'.
   * @generated
   */
  PieceOfInformation createPieceOfInformation();

  /**
   * Returns a new object of class '<em>Unsafe Control Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unsafe Control Action</em>'.
   * @generated
   */
  UnsafeControlAction createUnsafeControlAction();

  /**
   * Returns a new object of class '<em>Loss Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loss Scenario</em>'.
   * @generated
   */
  LossScenario createLossScenario();

  /**
   * Returns a new object of class '<em>Unsafe Control Action Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unsafe Control Action Category</em>'.
   * @generated
   */
  UnsafeControlActionCategory createUnsafeControlActionCategory();

  /**
   * Returns a new object of class '<em>Control Flaw Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Flaw Set</em>'.
   * @generated
   */
  ControlFlawSet createControlFlawSet();

  /**
   * Returns a new object of class '<em>Control Flaw</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Flaw</em>'.
   * @generated
   */
  ControlFlaw createControlFlaw();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StpaPackage getStpaPackage();

} //StpaFactory
