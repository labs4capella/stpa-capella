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
 * A representation of the model object '<em><b>Loss Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.LossPackage#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.LossPackage#getLosses <em>Losses</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLossPackage()
 * @model
 * @generated
 */
public interface LossPackage extends AnalysisPackage {
  /**
   * Returns the value of the '<em><b>Stakeholders</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Stakeholder}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholders</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLossPackage_Stakeholders()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<Stakeholder> getStakeholders();

  /**
   * Returns the value of the '<em><b>Losses</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Loss}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Losses</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLossPackage_Losses()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<Loss> getLosses();

} // LossPackage
