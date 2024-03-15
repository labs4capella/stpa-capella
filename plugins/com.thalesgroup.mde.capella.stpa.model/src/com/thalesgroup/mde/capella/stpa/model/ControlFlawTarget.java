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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flaw Target</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlawTarget()
 * @model abstract="true"
 * @generated
 */
public interface ControlFlawTarget extends UserIdentifiedElement {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<UnsafeControlAction> getUnsafeControlActions();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<LossScenario> getLossScenarios();

} // ControlFlawTarget
