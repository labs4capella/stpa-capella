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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.capellacore.Constraint;

import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawAnalysisElement;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.Mitigable;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flaw Analysis Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawAnalysisElementImpl#getCountermeasures <em>Countermeasures</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlFlawAnalysisElementImpl extends UserIdentifiedElementImpl
    implements ControlFlawAnalysisElement {
  /**
   * The cached value of the '{@link #getCountermeasures() <em>Countermeasures</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountermeasures()
   * @generated
   * @ordered
   */
  protected EList<Constraint> countermeasures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlFlawAnalysisElementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.CONTROL_FLAW_ANALYSIS_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Constraint> getCountermeasures() {
    if (countermeasures == null) {
      countermeasures = new EObjectResolvingEList<Constraint>(Constraint.class, this,
          StpaPackage.CONTROL_FLAW_ANALYSIS_ELEMENT__COUNTERMEASURES);
    }
    return countermeasures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract EList<Hazard> getHazards();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract EList<SystemConstraint> getViolatedConstraints();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract EList<ControlFlaw> getCausalFactors();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract ExchangeElement getControlAction();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case StpaPackage.CONTROL_FLAW_ANALYSIS_ELEMENT__COUNTERMEASURES:
      return getCountermeasures();
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
    case StpaPackage.CONTROL_FLAW_ANALYSIS_ELEMENT__COUNTERMEASURES:
      getCountermeasures().clear();
      getCountermeasures().addAll((Collection<? extends Constraint>) newValue);
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
    case StpaPackage.CONTROL_FLAW_ANALYSIS_ELEMENT__COUNTERMEASURES:
      getCountermeasures().clear();
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
    case StpaPackage.CONTROL_FLAW_ANALYSIS_ELEMENT__COUNTERMEASURES:
      return countermeasures != null && !countermeasures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == Mitigable.class) {
      switch (derivedFeatureID) {
      case StpaPackage.CONTROL_FLAW_ANALYSIS_ELEMENT__COUNTERMEASURES:
        return StpaPackage.MITIGABLE__COUNTERMEASURES;
      default:
        return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == Mitigable.class) {
      switch (baseFeatureID) {
      case StpaPackage.MITIGABLE__COUNTERMEASURES:
        return StpaPackage.CONTROL_FLAW_ANALYSIS_ELEMENT__COUNTERMEASURES;
      default:
        return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ControlFlawAnalysisElementImpl
