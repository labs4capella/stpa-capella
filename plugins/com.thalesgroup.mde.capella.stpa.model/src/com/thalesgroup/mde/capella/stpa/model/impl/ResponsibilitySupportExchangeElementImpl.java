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

import com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable;
import com.thalesgroup.mde.capella.stpa.model.Responsibility;
import com.thalesgroup.mde.capella.stpa.model.ResponsibilitySupportExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsibility Support Exchange Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ResponsibilitySupportExchangeElementImpl extends ExchangeElementImpl
    implements ResponsibilitySupportExchangeElement {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResponsibilitySupportExchangeElementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract EList<ProcessModelVariable> getProcessModel();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract EList<Responsibility> getResponsibilities();

} //ResponsibilitySupportExchangeElementImpl
