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
 * A representation of the model object '<em><b>Technical Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.TechnicalPackage#getUnsafeControlActionCategories <em>Unsafe Control Action Categories</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getTechnicalPackage()
 * @model
 * @generated
 */
public interface TechnicalPackage extends AnalysisPackage {
  /**
   * Returns the value of the '<em><b>Unsafe Control Action Categories</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsafe Control Action Categories</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getTechnicalPackage_UnsafeControlActionCategories()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<UnsafeControlActionCategory> getUnsafeControlActionCategories();

} // TechnicalPackage
