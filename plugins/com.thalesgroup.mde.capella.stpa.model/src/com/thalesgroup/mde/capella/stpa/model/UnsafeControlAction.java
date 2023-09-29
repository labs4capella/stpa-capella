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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsafe Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getKind <em>Kind</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getContext <em>Context</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getControlAction <em>Control Action</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getLossScenarios <em>Loss Scenarios</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getViolatedConstraints <em>Violated Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUnsafeControlAction()
 * @model
 * @generated
 */
public interface UnsafeControlAction extends ControlFlawAnalysisElement, ControlFlawContext {
  /**
   * Returns the value of the '<em><b>Control Action</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getUnsafeControlActions <em>Unsafe Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Action</em>' container reference.
   * @see #setControlAction(ExchangeElement)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUnsafeControlAction_ControlAction()
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getUnsafeControlActions
   * @model opposite="unsafeControlActions" required="true" transient="false"
   * @generated
   */
  ExchangeElement getControlAction();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getControlAction <em>Control Action</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Action</em>' container reference.
   * @see #getControlAction()
   * @generated
   */
  void setControlAction(ExchangeElement value);

  /**
   * Returns the value of the '<em><b>Loss Scenarios</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.LossScenario}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getUnsafeControlAction <em>Unsafe Control Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loss Scenarios</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUnsafeControlAction_LossScenarios()
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario#getUnsafeControlAction
   * @model opposite="unsafeControlAction"
   * @generated
   */
  EList<LossScenario> getLossScenarios();

  /**
   * Returns the value of the '<em><b>Violated Constraints</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getUnsafeControlActions <em>Unsafe Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Violated Constraints</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUnsafeControlAction_ViolatedConstraints()
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getUnsafeControlActions
   * @model opposite="unsafeControlActions"
   * @generated
   */
  EList<SystemConstraint> getViolatedConstraints();

  /**
   * Returns the value of the '<em><b>Hazards</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Hazard}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getUnsafeControlActions <em>Unsafe Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hazards</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUnsafeControlAction_Hazards()
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard#getUnsafeControlActions
   * @model opposite="unsafeControlActions"
   * @generated
   */
  EList<Hazard> getHazards();

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind
   * @see #setKind(UnsafeControlActionKind)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUnsafeControlAction_Kind()
   * @model required="true"
   * @generated
   */
  UnsafeControlActionKind getKind();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind
   * @see #getKind()
   * @generated
   */
  void setKind(UnsafeControlActionKind value);

  /**
   * Returns the value of the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' attribute.
   * @see #setContext(String)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUnsafeControlAction_Context()
   * @model
   * @generated
   */
  String getContext();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getContext <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' attribute.
   * @see #getContext()
   * @generated
   */
  void setContext(String value);

} // UnsafeControlAction
