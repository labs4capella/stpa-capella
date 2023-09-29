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
 * A representation of the model object '<em><b>Decomposable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Decomposable#getDecompositionCategories <em>Decomposition Categories</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Decomposable#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getDecomposable()
 * @model abstract="true"
 * @generated
 */
public interface Decomposable<T extends Decomposable<T>> extends UserIdentifiedElement {
  /**
   * Returns the value of the '<em><b>Decomposition Categories</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.DecompositionCategory}<code>&lt;T&gt;</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposition Categories</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getDecomposable_DecompositionCategories()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<DecompositionCategory<T>> getDecompositionCategories();

  /**
   * Returns the value of the '<em><b>Category</b></em>' reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.DecompositionCategory#getCoverage <em>Coverage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference.
   * @see #setCategory(DecompositionCategory)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getDecomposable_Category()
   * @see com.thalesgroup.mde.capella.stpa.model.DecompositionCategory#getCoverage
   * @model opposite="coverage"
   * @generated
   */
  DecompositionCategory<T> getCategory();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.Decomposable#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
  void setCategory(DecompositionCategory<T> value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  boolean isRoot();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  boolean isLeaf();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<T> getDecomposition();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  T getComposite();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<T> getOrderedDecomposition();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  T getRoot();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<T> getSubtree();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<T> getUncategorized();

} // Decomposable
