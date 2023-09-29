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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import com.thalesgroup.mde.capella.stpa.model.ExchangeBasedElement;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.FeedbackElement;
import com.thalesgroup.mde.capella.stpa.model.PieceOfInformation;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Based Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExchangeBasedElementImpl extends StpaAnalysisElementImpl implements ExchangeBasedElement {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExchangeBasedElementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.EXCHANGE_BASED_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract EList<FeedbackElement> getFeedback();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract EList<PieceOfInformation> getInformation();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract EList<ExchangeElement> getControlActions();

} //ExchangeBasedElementImpl
