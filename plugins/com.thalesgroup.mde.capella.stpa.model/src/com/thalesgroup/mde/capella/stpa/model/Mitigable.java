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
import org.polarsys.capella.core.data.capellacore.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mitigable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.Mitigable#getCountermeasures <em>Countermeasures</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getMitigable()
 * @model abstract="true"
 * @generated
 */
public interface Mitigable extends StpaAnalysisElement {
  /**
   * Returns the value of the '<em><b>Countermeasures</b></em>' reference list.
   * The list contents are of type {@link org.polarsys.capella.core.data.capellacore.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Countermeasures</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getMitigable_Countermeasures()
   * @model
   * @generated
   */
  EList<Constraint> getCountermeasures();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  ExchangeElement getControlAction();

} // Mitigable
