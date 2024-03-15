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
 * A representation of the model object '<em><b>Feedback Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getRelation <em>Relation</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getProcessModel <em>Process Model</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getFeedbackElement()
 * @model
 * @generated
 */
public interface FeedbackElement extends ResponsibilitySupportExchangeElement {
  /**
   * Returns the value of the '<em><b>Relation</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackRelation#getFeedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' container reference.
   * @see #setRelation(FeedbackRelation)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getFeedbackElement_Relation()
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackRelation#getFeedback
   * @model opposite="feedback" required="true" transient="false"
   * @generated
   */
  FeedbackRelation getRelation();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getRelation <em>Relation</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' container reference.
   * @see #getRelation()
   * @generated
   */
  void setRelation(FeedbackRelation value);

  /**
   * Returns the value of the '<em><b>Responsibilities</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Responsibility}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getFeedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsibilities</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getFeedbackElement_Responsibilities()
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getFeedback
   * @model opposite="feedback"
   * @generated
   */
  EList<Responsibility> getResponsibilities();

  /**
   * Returns the value of the '<em><b>Process Model</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getFeedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Model</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getFeedbackElement_ProcessModel()
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getFeedback
   * @model opposite="feedback"
   * @generated
   */
  EList<ProcessModelVariable> getProcessModel();

} // FeedbackElement
