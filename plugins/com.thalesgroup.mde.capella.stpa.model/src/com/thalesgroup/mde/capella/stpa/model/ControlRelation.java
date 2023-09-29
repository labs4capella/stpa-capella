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
 * A representation of the model object '<em><b>Control Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlRelation#getControlActions <em>Control Actions</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlRelation()
 * @model
 * @generated
 */
public interface ControlRelation extends Relation {
  /**
   * Returns the value of the '<em><b>Control Actions</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ControlAction}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlAction#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Actions</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlRelation_ControlActions()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlAction#getRelation
   * @model opposite="relation" containment="true" resolveProxies="true"
   * @generated
   */
  EList<ControlAction> getControlActions();

} // ControlRelation
