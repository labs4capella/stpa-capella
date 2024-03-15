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
package com.thalesgroup.mde.capella.stpa.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.lib.IdGenerator;
import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import com.thalesgroup.mde.capella.stpa.model.StpaAnalysis;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StpaAnalysisElementImpl extends NamedElementImpl implements StpaAnalysisElement {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  protected StpaAnalysisElementImpl() {
    super();
    setId(IdGenerator.createId());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.STPA_ANALYSIS_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public StpaAnalysis getAnalysis() {
    EObject current = this;
    while (current != null) {
      if (current instanceof StpaAnalysis) {
        return (StpaAnalysis) current;
      }
      current = current.eContainer();
    }
    return null;
  }

} //StpaAnalysisElementImpl
