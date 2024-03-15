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
 * A representation of the model object '<em><b>Feedback Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.FeedbackRelation#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getFeedbackRelation()
 * @model
 * @generated
 */
public interface FeedbackRelation extends Relation {
  /**
   * Returns the value of the '<em><b>Feedback</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feedback</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getFeedbackRelation_Feedback()
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getRelation
   * @model opposite="relation" containment="true" resolveProxies="true"
   * @generated
   */
  EList<FeedbackElement> getFeedback();

} // FeedbackRelation
