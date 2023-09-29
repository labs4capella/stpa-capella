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

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStpaAnalysisElement()
 * @model abstract="true"
 * @generated
 */
public interface StpaAnalysisElement extends NamedElement {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  StpaAnalysis getAnalysis();

} // StpaAnalysisElement
