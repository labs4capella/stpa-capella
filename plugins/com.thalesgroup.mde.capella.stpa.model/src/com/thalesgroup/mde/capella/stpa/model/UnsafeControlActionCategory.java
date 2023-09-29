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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsafe Control Action Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUnsafeControlActionCategory()
 * @model
 * @generated
 */
public interface UnsafeControlActionCategory extends StpaAnalysisElement {
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind
   * @see #setKind(UnsafeControlActionKind)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUnsafeControlActionCategory_Kind()
   * @model required="true"
   * @generated
   */
  UnsafeControlActionKind getKind();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind
   * @see #getKind()
   * @generated
   */
  void setKind(UnsafeControlActionKind value);

} // UnsafeControlActionCategory
