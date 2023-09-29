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
import org.polarsys.capella.core.data.capellacore.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flaw Analysis Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlawAnalysisElement()
 * @model abstract="true"
 * @generated
 */
public interface ControlFlawAnalysisElement extends UserIdentifiedElement, Mitigable {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  EList<Hazard> getHazards();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  EList<SystemConstraint> getViolatedConstraints();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<ControlFlaw> getCausalFactors();

} // ControlFlawAnalysisElement
