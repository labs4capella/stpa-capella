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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.InfluenceRelation#isBidirectional <em>Bidirectional</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getInfluenceRelation()
 * @model
 * @generated
 */
public interface InfluenceRelation extends Relation {
  /**
   * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bidirectional</em>' attribute.
   * @see #setBidirectional(boolean)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getInfluenceRelation_Bidirectional()
   * @model required="true"
   * @generated
   */
  boolean isBidirectional();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.InfluenceRelation#isBidirectional <em>Bidirectional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bidirectional</em>' attribute.
   * @see #isBidirectional()
   * @generated
   */
  void setBidirectional(boolean value);

} // InfluenceRelation
