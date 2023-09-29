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
 * A representation of the model object '<em><b>Stake</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Stake#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Stake#getLosses <em>Losses</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStake()
 * @model
 * @generated
 */
public interface Stake extends UserIdentifiedElement {
  /**
   * Returns the value of the '<em><b>Stakeholder</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Stakeholder#getStakes <em>Stakes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholder</em>' container reference.
   * @see #setStakeholder(Stakeholder)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStake_Stakeholder()
   * @see com.thalesgroup.mde.capella.stpa.model.Stakeholder#getStakes
   * @model opposite="stakes" required="true" transient="false"
   * @generated
   */
  Stakeholder getStakeholder();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.Stake#getStakeholder <em>Stakeholder</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stakeholder</em>' container reference.
   * @see #getStakeholder()
   * @generated
   */
  void setStakeholder(Stakeholder value);

  /**
   * Returns the value of the '<em><b>Losses</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Loss}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Loss#getStakes <em>Stakes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Losses</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStake_Losses()
   * @see com.thalesgroup.mde.capella.stpa.model.Loss#getStakes
   * @model opposite="stakes"
   * @generated
   */
  EList<Loss> getLosses();

} // Stake
