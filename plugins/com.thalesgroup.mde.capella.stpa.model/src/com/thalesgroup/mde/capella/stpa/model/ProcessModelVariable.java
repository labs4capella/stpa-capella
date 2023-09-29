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
import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Model Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getController <em>Controller</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getValues <em>Values</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getInformation <em>Information</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getControlActions <em>Control Actions</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getProcessModelVariable()
 * @model
 * @generated
 */
public interface ProcessModelVariable extends UserIdentifiedElement, ExchangeBasedElement {
  /**
   * Returns the value of the '<em><b>Controller</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controller</em>' container reference.
   * @see #setController(ControlEntity)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getProcessModelVariable_Controller()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity#getProcessModel
   * @model opposite="processModel" required="true" transient="false"
   * @generated
   */
  ControlEntity getController();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getController <em>Controller</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Controller</em>' container reference.
   * @see #getController()
   * @generated
   */
  void setController(ControlEntity value);

  /**
   * Returns the value of the '<em><b>Responsibilities</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Responsibility}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsibilities</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getProcessModelVariable_Responsibilities()
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getVariables
   * @model opposite="variables"
   * @generated
   */
  EList<Responsibility> getResponsibilities();

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ProcessModelValue}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelValue#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getProcessModelVariable_Values()
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelValue#getVariable
   * @model opposite="variable" containment="true" resolveProxies="true"
   * @generated
   */
  EList<ProcessModelValue> getValues();

  /**
   * Returns the value of the '<em><b>Feedback</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feedback</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getProcessModelVariable_Feedback()
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getProcessModel
   * @model opposite="processModel"
   * @generated
   */
  EList<FeedbackElement> getFeedback();

  /**
   * Returns the value of the '<em><b>Information</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Information</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getProcessModelVariable_Information()
   * @see com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getProcessModel
   * @model opposite="processModel"
   * @generated
   */
  EList<PieceOfInformation> getInformation();

  /**
   * Returns the value of the '<em><b>Control Actions</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getSupportingProcessModel <em>Supporting Process Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Actions</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getProcessModelVariable_ControlActions()
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getSupportingProcessModel
   * @model opposite="supportingProcessModel"
   * @generated
   */
  EList<ExchangeElement> getControlActions();

} // ProcessModelVariable
