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
 * A representation of the model object '<em><b>Decomposition Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.DecompositionCategory#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getDecompositionCategory()
 * @model
 * @generated
 */
public interface DecompositionCategory<T extends Decomposable<T>> extends StpaAnalysisElement {
  /**
   * Returns the value of the '<em><b>Coverage</b></em>' reference list.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Decomposable#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coverage</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getDecompositionCategory_Coverage()
   * @see com.thalesgroup.mde.capella.stpa.model.Decomposable#getCategory
   * @model opposite="category"
   * @generated
   */
  EList<T> getCoverage();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<T> getOrderedCoverage();

} // DecompositionCategory
