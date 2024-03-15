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
import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getProcessModelState <em>Process Model State</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getController <em>Controller</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getSystemConstraints <em>System Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getControlActions <em>Control Actions</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getInformation <em>Information</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getResponsibility()
 * @model
 * @generated
 */
public interface Responsibility extends UserIdentifiedElement, ExchangeBasedElement {
  /**
   * Returns the value of the '<em><b>Process Model State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Model State</em>' attribute.
   * @see #setProcessModelState(String)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getResponsibility_ProcessModelState()
   * @model
   * @generated
   */
  String getProcessModelState();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getProcessModelState <em>Process Model State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Model State</em>' attribute.
   * @see #getProcessModelState()
   * @generated
   */
  void setProcessModelState(String value);

  /**
   * Returns the value of the '<em><b>Controller</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controller</em>' container reference.
   * @see #setController(ControlEntity)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getResponsibility_Controller()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity#getResponsibilities
   * @model opposite="responsibilities" required="true" transient="false"
   * @generated
   */
  ControlEntity getController();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getController <em>Controller</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Controller</em>' container reference.
   * @see #getController()
   * @generated
   */
  void setController(ControlEntity value);

  /**
   * Returns the value of the '<em><b>System Constraints</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Constraints</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getResponsibility_SystemConstraints()
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getResponsibilities
   * @model opposite="responsibilities"
   * @generated
   */
  EList<SystemConstraint> getSystemConstraints();

  /**
   * Returns the value of the '<em><b>Control Actions</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getExercisedResponsibilities <em>Exercised Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Actions</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getResponsibility_ControlActions()
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getExercisedResponsibilities
   * @model opposite="exercisedResponsibilities"
   * @generated
   */
  EList<ExchangeElement> getControlActions();

  /**
   * Returns the value of the '<em><b>Feedback</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feedback</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getResponsibility_Feedback()
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getResponsibilities
   * @model opposite="responsibilities"
   * @generated
   */
  EList<FeedbackElement> getFeedback();

  /**
   * Returns the value of the '<em><b>Information</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Information</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getResponsibility_Information()
   * @see com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getResponsibilities
   * @model opposite="responsibilities"
   * @generated
   */
  EList<PieceOfInformation> getInformation();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getResponsibility_Variables()
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getResponsibilities
   * @model opposite="responsibilities"
   * @generated
   */
  EList<ProcessModelVariable> getVariables();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<ExchangeElement> getExchangeElements();

} // Responsibility
