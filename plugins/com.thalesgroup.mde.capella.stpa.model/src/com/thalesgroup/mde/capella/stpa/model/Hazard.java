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
 * A representation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getUnsafeCondition <em>Unsafe Condition</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getSubHazards <em>Sub Hazards</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getLosses <em>Losses</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getSystemConstraints <em>System Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getLossScenarios <em>Loss Scenarios</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getHazard()
 * @model
 * @generated
 */
public interface Hazard extends Decomposable<Hazard>, ControlFlawTarget {
  /**
   * Returns the value of the '<em><b>Sub Hazards</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Hazard}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Hazards</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getHazard_SubHazards()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<Hazard> getSubHazards();

  /**
   * Returns the value of the '<em><b>Losses</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Loss}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Loss#getHazards <em>Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Losses</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getHazard_Losses()
   * @see com.thalesgroup.mde.capella.stpa.model.Loss#getHazards
   * @model opposite="hazards"
   * @generated
   */
  EList<Loss> getLosses();

  /**
   * Returns the value of the '<em><b>System Constraints</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getHazards <em>Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Constraints</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getHazard_SystemConstraints()
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getHazards
   * @model opposite="hazards"
   * @generated
   */
  EList<SystemConstraint> getSystemConstraints();

  /**
   * Returns the value of the '<em><b>Unsafe Control Actions</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getHazards <em>Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsafe Control Actions</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getHazard_UnsafeControlActions()
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getHazards
   * @model opposite="hazards"
   * @generated
   */
  EList<UnsafeControlAction> getUnsafeControlActions();

  /**
   * Returns the value of the '<em><b>Loss Scenarios</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.LossScenario}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getHazards <em>Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loss Scenarios</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getHazard_LossScenarios()
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario#getHazards
   * @model opposite="hazards"
   * @generated
   */
  EList<LossScenario> getLossScenarios();

  /**
   * Returns the value of the '<em><b>Unsafe Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsafe Condition</em>' attribute.
   * @see #setUnsafeCondition(String)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getHazard_UnsafeCondition()
   * @model
   * @generated
   */
  String getUnsafeCondition();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getUnsafeCondition <em>Unsafe Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsafe Condition</em>' attribute.
   * @see #getUnsafeCondition()
   * @generated
   */
  void setUnsafeCondition(String value);

} // Hazard
