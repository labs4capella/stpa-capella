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
 * A representation of the model object '<em><b>Control Flaw Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getControlFlaws <em>Control Flaws</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlawSet()
 * @model
 * @generated
 */
public interface ControlFlawSet extends StpaAnalysisElement {
  /**
   * Returns the value of the '<em><b>Control Flaws</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getOwningSet <em>Owning Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Flaws</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlawSet_ControlFlaws()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getOwningSet
   * @model opposite="owningSet" containment="true" resolveProxies="true"
   * @generated
   */
  EList<ControlFlaw> getControlFlaws();

  /**
   * Returns the value of the '<em><b>Context</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawContext#getControlFlawSet <em>Control Flaw Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' container reference.
   * @see #setContext(ControlFlawContext)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlawSet_Context()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawContext#getControlFlawSet
   * @model opposite="controlFlawSet" required="true" transient="false"
   * @generated
   */
  ControlFlawContext getContext();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getContext <em>Context</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' container reference.
   * @see #getContext()
   * @generated
   */
  void setContext(ControlFlawContext value);

} // ControlFlawSet
