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

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Mappable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable#getArchitectureElements <em>Architecture Elements</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getArchitectureMappable()
 * @model abstract="true"
 * @generated
 */
public interface ArchitectureMappable<T extends NamedElement> extends StpaAnalysisElement {
  /**
   * Returns the value of the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Architecture Elements</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getArchitectureMappable_ArchitectureElements()
   * @model
   * @generated
   */
  EList<T> getArchitectureElements();

} // ArchitectureMappable
