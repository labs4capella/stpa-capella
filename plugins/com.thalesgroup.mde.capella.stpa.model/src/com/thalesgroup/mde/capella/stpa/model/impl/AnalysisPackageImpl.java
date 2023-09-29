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
package com.thalesgroup.mde.capella.stpa.model.impl;

import com.thalesgroup.mde.capella.stpa.model.AnalysisPackage;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AnalysisPackageImpl extends StpaAnalysisElementImpl implements AnalysisPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnalysisPackageImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.ANALYSIS_PACKAGE;
  }

} //AnalysisPackageImpl
