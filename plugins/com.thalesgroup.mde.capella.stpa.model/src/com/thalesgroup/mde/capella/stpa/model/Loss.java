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
import org.polarsys.capella.core.data.oa.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loss</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Loss#getHazards <em>Hazards</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Loss#getStakes <em>Stakes</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLoss()
 * @model
 * @generated
 */
public interface Loss extends UserIdentifiedElement {
  /**
   * Returns the value of the '<em><b>Hazards</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Hazard}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getLosses <em>Losses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hazards</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLoss_Hazards()
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard#getLosses
   * @model opposite="losses"
   * @generated
   */
  EList<Hazard> getHazards();

  /**
   * Returns the value of the '<em><b>Stakes</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Stake}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.Stake#getLosses <em>Losses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakes</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getLoss_Stakes()
   * @see com.thalesgroup.mde.capella.stpa.model.Stake#getLosses
   * @model opposite="losses"
   * @generated
   */
  EList<Stake> getStakes();

} // Loss
