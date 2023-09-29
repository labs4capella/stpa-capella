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
 * A representation of the model object '<em><b>Information Exchange Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getInformationExchangeRelation()
 * @model
 * @generated
 */
public interface InformationExchangeRelation extends Relation {
  /**
   * Returns the value of the '<em><b>Information</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Information</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getInformationExchangeRelation_Information()
   * @see com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getRelation
   * @model opposite="relation" containment="true" resolveProxies="true"
   * @generated
   */
  EList<PieceOfInformation> getInformation();

} // InformationExchangeRelation
