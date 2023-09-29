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
 * A representation of the model object '<em><b>Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlAction#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlAction()
 * @model
 * @generated
 */
public interface ControlAction extends ExchangeElement {
  /**
   * Returns the value of the '<em><b>Relation</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlRelation#getControlActions <em>Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' container reference.
   * @see #setRelation(ControlRelation)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlAction_Relation()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlRelation#getControlActions
   * @model opposite="controlActions" required="true" transient="false"
   * @generated
   */
  ControlRelation getRelation();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.ControlAction#getRelation <em>Relation</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' container reference.
   * @see #getRelation()
   * @generated
   */
  void setRelation(ControlRelation value);

} // ControlAction
