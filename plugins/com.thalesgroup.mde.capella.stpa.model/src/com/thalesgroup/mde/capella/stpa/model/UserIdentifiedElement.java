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

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Identified Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement#getUserID <em>User ID</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUserIdentifiedElement()
 * @model abstract="true"
 * @generated
 */
public interface UserIdentifiedElement extends ArchitectureMappable<NamedElement> {
  /**
   * Returns the value of the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>User ID</em>' attribute.
   * @see #setUserID(String)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUserIdentifiedElement_UserID()
   * @model required="true"
   * @generated
   */
  String getUserID();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement#getUserID <em>User ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User ID</em>' attribute.
   * @see #getUserID()
   * @generated
   */
  void setUserID(String value);

} // UserIdentifiedElement
