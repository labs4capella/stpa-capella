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
 * A representation of the model object '<em><b>Piece Of Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getRelation <em>Relation</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getProcessModel <em>Process Model</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getPieceOfInformation()
 * @model
 * @generated
 */
public interface PieceOfInformation extends ResponsibilitySupportExchangeElement {
  /**
   * Returns the value of the '<em><b>Relation</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation#getInformation <em>Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' container reference.
   * @see #setRelation(InformationExchangeRelation)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getPieceOfInformation_Relation()
   * @see com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation#getInformation
   * @model opposite="information" required="true" transient="false"
   * @generated
   */
  InformationExchangeRelation getRelation();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getRelation <em>Relation</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' container reference.
   * @see #getRelation()
   * @generated
   */
  void setRelation(InformationExchangeRelation value);

  /**
   * Returns the value of the '<em><b>Responsibilities</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Responsibility}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getInformation <em>Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsibilities</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getPieceOfInformation_Responsibilities()
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getInformation
   * @model opposite="information"
   * @generated
   */
  EList<Responsibility> getResponsibilities();

  /**
   * Returns the value of the '<em><b>Process Model</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getInformation <em>Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Model</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getPieceOfInformation_ProcessModel()
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getInformation
   * @model opposite="information"
   * @generated
   */
  EList<ProcessModelVariable> getProcessModel();

} // PieceOfInformation
