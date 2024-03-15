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
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Relation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends ArchitectureMappable<NamedElement> {
  /**
   * Returns the value of the '<em><b>Source</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getOutgoingRelations <em>Outgoing Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' container reference.
   * @see #setSource(ControlEntity)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getRelation_Source()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity#getOutgoingRelations
   * @model opposite="outgoingRelations" required="true" transient="false"
   * @generated
   */
  ControlEntity getSource();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.Relation#getSource <em>Source</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' container reference.
   * @see #getSource()
   * @generated
   */
  void setSource(ControlEntity value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getIncomingRelations <em>Incoming Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ControlEntity)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getRelation_Target()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity#getIncomingRelations
   * @model opposite="incomingRelations" required="true"
   * @generated
   */
  ControlEntity getTarget();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.Relation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ControlEntity value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<ExchangeElement> getExchangeElements();

} // Relation
