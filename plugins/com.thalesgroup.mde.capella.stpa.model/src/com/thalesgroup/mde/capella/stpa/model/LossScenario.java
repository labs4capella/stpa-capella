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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loss Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getControlAction <em>Control Action</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getUnsafeControlAction <em>Unsafe Control Action</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getCausalFactors <em>Causal Factors</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getViolatedConstraints <em>Violated Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLossScenario()
 * @model
 * @generated
 */
public interface LossScenario extends ControlFlawAnalysisElement {
  /**
   * Returns the value of the '<em><b>Control Action</b></em>' reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Action</em>' reference.
   * @see #setControlAction(ExchangeElement)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLossScenario_ControlAction()
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getLossScenarios
   * @model opposite="lossScenarios" required="true"
   * @generated
   */
  ExchangeElement getControlAction();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getControlAction <em>Control Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Action</em>' reference.
   * @see #getControlAction()
   * @generated
   */
  void setControlAction(ExchangeElement value);

  /**
   * Returns the value of the '<em><b>Unsafe Control Action</b></em>' reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsafe Control Action</em>' reference.
   * @see #setUnsafeControlAction(UnsafeControlAction)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLossScenario_UnsafeControlAction()
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getLossScenarios
   * @model opposite="lossScenarios"
   * @generated
   */
  UnsafeControlAction getUnsafeControlAction();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getUnsafeControlAction <em>Unsafe Control Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsafe Control Action</em>' reference.
   * @see #getUnsafeControlAction()
   * @generated
   */
  void setUnsafeControlAction(UnsafeControlAction value);

  /**
   * Returns the value of the '<em><b>Causal Factors</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Causal Factors</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLossScenario_CausalFactors()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getLossScenarios
   * @model opposite="lossScenarios"
   * @generated
   */
  EList<ControlFlaw> getCausalFactors();

  /**
   * Returns the value of the '<em><b>Violated Constraints</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Violated Constraints</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLossScenario_ViolatedConstraints()
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getLossScenarios
   * @model opposite="lossScenarios"
   * @generated
   */
  EList<SystemConstraint> getViolatedConstraints();

  /**
   * Returns the value of the '<em><b>Hazards</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Hazard}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hazards</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLossScenario_Hazards()
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard#getLossScenarios
   * @model opposite="lossScenarios"
   * @generated
   */
  EList<Hazard> getHazards();

} // LossScenario
