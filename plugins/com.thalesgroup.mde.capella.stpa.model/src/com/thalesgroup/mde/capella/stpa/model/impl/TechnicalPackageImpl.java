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

import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.TechnicalPackage;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technical Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.TechnicalPackageImpl#getUnsafeControlActionCategories <em>Unsafe Control Action Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnicalPackageImpl extends AnalysisPackageImpl implements TechnicalPackage {
  /**
   * The cached value of the '{@link #getUnsafeControlActionCategories() <em>Unsafe Control Action Categories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsafeControlActionCategories()
   * @generated
   * @ordered
   */
  protected EList<UnsafeControlActionCategory> unsafeControlActionCategories;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TechnicalPackageImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.TECHNICAL_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UnsafeControlActionCategory> getUnsafeControlActionCategories() {
    if (unsafeControlActionCategories == null) {
      unsafeControlActionCategories = new EObjectContainmentEList.Resolving<UnsafeControlActionCategory>(
          UnsafeControlActionCategory.class, this, StpaPackage.TECHNICAL_PACKAGE__UNSAFE_CONTROL_ACTION_CATEGORIES);
    }
    return unsafeControlActionCategories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.TECHNICAL_PACKAGE__UNSAFE_CONTROL_ACTION_CATEGORIES:
      return ((InternalEList<?>) getUnsafeControlActionCategories()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case StpaPackage.TECHNICAL_PACKAGE__UNSAFE_CONTROL_ACTION_CATEGORIES:
      return getUnsafeControlActionCategories();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case StpaPackage.TECHNICAL_PACKAGE__UNSAFE_CONTROL_ACTION_CATEGORIES:
      getUnsafeControlActionCategories().clear();
      getUnsafeControlActionCategories().addAll((Collection<? extends UnsafeControlActionCategory>) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case StpaPackage.TECHNICAL_PACKAGE__UNSAFE_CONTROL_ACTION_CATEGORIES:
      getUnsafeControlActionCategories().clear();
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case StpaPackage.TECHNICAL_PACKAGE__UNSAFE_CONTROL_ACTION_CATEGORIES:
      return unsafeControlActionCategories != null && !unsafeControlActionCategories.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TechnicalPackageImpl
