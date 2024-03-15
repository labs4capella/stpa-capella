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
package com.thalesgroup.mde.capella.stpa.model;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getExercisedResponsibilities <em>Exercised Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getLossScenarios <em>Loss Scenarios</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getSupportingProcessModel <em>Supporting Process Model</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getExchangeElement()
 * @model abstract="true"
 * @generated
 */
public interface ExchangeElement extends UserIdentifiedElement, ControlFlawContext {
  /**
   * Returns the value of the '<em><b>Unsafe Control Actions</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getControlAction <em>Control Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsafe Control Actions</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getExchangeElement_UnsafeControlActions()
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getControlAction
   * @model opposite="controlAction" containment="true" resolveProxies="true"
   * @generated
   */
  EList<UnsafeControlAction> getUnsafeControlActions();

  /**
   * Returns the value of the '<em><b>Exercised Responsibilities</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Responsibility}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getControlActions <em>Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exercised Responsibilities</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getExchangeElement_ExercisedResponsibilities()
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getControlActions
   * @model opposite="controlActions"
   * @generated
   */
  EList<Responsibility> getExercisedResponsibilities();

  /**
   * Returns the value of the '<em><b>Loss Scenarios</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.LossScenario}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getControlAction <em>Control Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loss Scenarios</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getExchangeElement_LossScenarios()
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario#getControlAction
   * @model opposite="controlAction"
   * @generated
   */
  EList<LossScenario> getLossScenarios();

  /**
   * Returns the value of the '<em><b>Supporting Process Model</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getControlActions <em>Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supporting Process Model</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getExchangeElement_SupportingProcessModel()
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getControlActions
   * @model opposite="controlActions"
   * @generated
   */
  EList<ProcessModelVariable> getSupportingProcessModel();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  Relation getRelation();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<ControlFlaw> getControlFlaws();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  ControlEntity getController();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  ControlEntity getProcess();

} // ExchangeElement
