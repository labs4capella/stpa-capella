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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flaw Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawContext#getControlFlawSet <em>Control Flaw Set</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlawContext()
 * @model abstract="true"
 * @generated
 */
public interface ControlFlawContext extends UserIdentifiedElement {
  /**
   * Returns the value of the '<em><b>Control Flaw Set</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Flaw Set</em>' containment reference.
   * @see #setControlFlawSet(ControlFlawSet)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlawContext_ControlFlawSet()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getContext
   * @model opposite="context" containment="true" resolveProxies="true"
   * @generated
   */
  ControlFlawSet getControlFlawSet();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawContext#getControlFlawSet <em>Control Flaw Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Flaw Set</em>' containment reference.
   * @see #getControlFlawSet()
   * @generated
   */
  void setControlFlawSet(ControlFlawSet value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  ExchangeElement getControlAction();

} // ControlFlawContext
