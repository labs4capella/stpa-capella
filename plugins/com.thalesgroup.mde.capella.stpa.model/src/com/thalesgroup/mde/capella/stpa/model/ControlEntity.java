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
import org.polarsys.capella.core.data.cs.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ControlEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#isProcess <em>Process</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getSubEntities <em>Sub Entities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getOutgoingRelations <em>Outgoing Relations</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getIncomingRelations <em>Incoming Relations</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getProcessModel <em>Process Model</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlEntity()
 * @model
 * @generated
 */
public interface ControlEntity extends Decomposable<ControlEntity> {
  /**
   * Returns the value of the '<em><b>Process</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' attribute.
   * @see #setProcess(boolean)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlEntity_Process()
   * @model required="true"
   * @generated
   */
  boolean isProcess();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#isProcess <em>Process</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' attribute.
   * @see #isProcess()
   * @generated
   */
  void setProcess(boolean value);

  /**
   * Returns the value of the '<em><b>Sub Entities</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ControlEntity}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Entities</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlEntity_SubEntities()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<ControlEntity> getSubEntities();

  /**
   * Returns the value of the '<em><b>Responsibilities</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Responsibility}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getController <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsibilities</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlEntity_Responsibilities()
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getController
   * @model opposite="controller" containment="true" resolveProxies="true"
   * @generated
   */
  EList<Responsibility> getResponsibilities();

  /**
   * Returns the value of the '<em><b>Outgoing Relations</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Relation}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Relation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Relations</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlEntity_OutgoingRelations()
   * @see com.thalesgroup.mde.capella.stpa.model.Relation#getSource
   * @model opposite="source" containment="true" resolveProxies="true"
   * @generated
   */
  EList<Relation> getOutgoingRelations();

  /**
   * Returns the value of the '<em><b>Incoming Relations</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Relation}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Relation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming Relations</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlEntity_IncomingRelations()
   * @see com.thalesgroup.mde.capella.stpa.model.Relation#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Relation> getIncomingRelations();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  boolean isController();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  boolean isControlled();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  boolean isSystem();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<ControlAction> getIncomingControlActions();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<ExchangeElement> getIncomingExchangeElements();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<FeedbackElement> getIncomingFeedback();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<PieceOfInformation> getIncomingInformation();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<ControlAction> getOutgoingControlActions();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<ExchangeElement> getOutgoingExchangeElements();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<FeedbackElement> getOutgoingFeedback();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<PieceOfInformation> getOutgoingInformation();

  /**
   * Returns the value of the '<em><b>Process Model</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getController <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Model</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlEntity_ProcessModel()
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getController
   * @model opposite="controller" containment="true" resolveProxies="true"
   * @generated
   */
  EList<ProcessModelVariable> getProcessModel();

} // ControlEntity
