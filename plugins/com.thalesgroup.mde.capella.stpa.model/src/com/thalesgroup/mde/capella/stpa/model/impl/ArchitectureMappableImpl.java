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

import com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Mappable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ArchitectureMappableImpl#getArchitectureElements <em>Architecture Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArchitectureMappableImpl<T extends NamedElement> extends StpaAnalysisElementImpl
    implements ArchitectureMappable<T> {
  /**
   * The cached value of the '{@link #getArchitectureElements() <em>Architecture Elements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchitectureElements()
   * @generated
   * @ordered
   */
  protected EList<T> architectureElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchitectureMappableImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.ARCHITECTURE_MAPPABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<T> getArchitectureElements() {
    if (architectureElements == null) {
      architectureElements = new EObjectResolvingEList<T>(NamedElement.class, this,
          StpaPackage.ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS);
    }
    return architectureElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case StpaPackage.ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS:
      return getArchitectureElements();
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
    case StpaPackage.ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS:
      getArchitectureElements().clear();
      getArchitectureElements().addAll((Collection<? extends T>) newValue);
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
    case StpaPackage.ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS:
      getArchitectureElements().clear();
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
    case StpaPackage.ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS:
      return architectureElements != null && !architectureElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArchitectureMappableImpl
