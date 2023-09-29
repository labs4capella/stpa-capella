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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Constraint Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage#getRootHazards <em>Root Hazards</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage#getRootSystemConstraints <em>Root System Constraints</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getHazardConstraintPackage()
 * @model
 * @generated
 */
public interface HazardConstraintPackage extends AnalysisPackage {
  /**
   * Returns the value of the '<em><b>Root Hazards</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.Hazard}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Hazards</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getHazardConstraintPackage_RootHazards()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<Hazard> getRootHazards();

  /**
   * Returns the value of the '<em><b>Root System Constraints</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root System Constraints</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getHazardConstraintPackage_RootSystemConstraints()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<SystemConstraint> getRootSystemConstraints();

} // HazardConstraintPackage
