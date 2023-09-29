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
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Stakeholder#getStakes <em>Stakes</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends UserIdentifiedElement {
  /**
   * Returns the value of the '<em><b>Stakes</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Stake}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Stake#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakes</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStakeholder_Stakes()
   * @see com.thalesgroup.mde.capella.stpa.model.Stake#getStakeholder
   * @model opposite="stakeholder" containment="true" resolveProxies="true"
   * @generated
   */
  EList<Stake> getStakes();

} // Stakeholder
