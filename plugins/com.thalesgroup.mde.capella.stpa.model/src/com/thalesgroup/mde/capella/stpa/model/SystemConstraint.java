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
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getConditionToEnforce <em>Condition To Enforce</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getSubSystemConstraints <em>Sub System Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getHazards <em>Hazards</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getLossScenarios <em>Loss Scenarios</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getAssumptions <em>Assumptions</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getSystemConstraint()
 * @model
 * @generated
 */
public interface SystemConstraint extends Decomposable<SystemConstraint>, ControlFlawTarget {
  /**
   * Returns the value of the '<em><b>Sub System Constraints</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub System Constraints</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getSystemConstraint_SubSystemConstraints()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<SystemConstraint> getSubSystemConstraints();

  /**
   * Returns the value of the '<em><b>Hazards</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Hazard}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getSystemConstraints <em>System Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hazards</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getSystemConstraint_Hazards()
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard#getSystemConstraints
   * @model opposite="systemConstraints"
   * @generated
   */
  EList<Hazard> getHazards();

  /**
   * Returns the value of the '<em><b>Responsibilities</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Responsibility}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getSystemConstraints <em>System Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsibilities</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getSystemConstraint_Responsibilities()
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getSystemConstraints
   * @model opposite="systemConstraints"
   * @generated
   */
  EList<Responsibility> getResponsibilities();

  /**
   * Returns the value of the '<em><b>Unsafe Control Actions</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getViolatedConstraints <em>Violated Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsafe Control Actions</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getSystemConstraint_UnsafeControlActions()
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getViolatedConstraints
   * @model opposite="violatedConstraints"
   * @generated
   */
  EList<UnsafeControlAction> getUnsafeControlActions();

  /**
   * Returns the value of the '<em><b>Loss Scenarios</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.LossScenario}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getViolatedConstraints <em>Violated Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loss Scenarios</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getSystemConstraint_LossScenarios()
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario#getViolatedConstraints
   * @model opposite="violatedConstraints"
   * @generated
   */
  EList<LossScenario> getLossScenarios();

  /**
   * Returns the value of the '<em><b>Assumptions</b></em>' reference list.
   * The list contents are of type {@link org.polarsys.capella.core.data.capellacore.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assumptions</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getSystemConstraint_Assumptions()
   * @model
   * @generated
   */
  EList<Constraint> getAssumptions();

  /**
   * Returns the value of the '<em><b>Condition To Enforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition To Enforce</em>' attribute.
   * @see #setConditionToEnforce(String)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getSystemConstraint_ConditionToEnforce()
   * @model
   * @generated
   */
  String getConditionToEnforce();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getConditionToEnforce <em>Condition To Enforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition To Enforce</em>' attribute.
   * @see #getConditionToEnforce()
   * @generated
   */
  void setConditionToEnforce(String value);

} // SystemConstraint
