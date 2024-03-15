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

import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loss Scenario Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioPackageImpl#getLossScenarios <em>Loss Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LossScenarioPackageImpl extends AnalysisPackageImpl implements LossScenarioPackage {
  /**
   * The cached value of the '{@link #getLossScenarios() <em>Loss Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLossScenarios()
   * @generated
   * @ordered
   */
  protected EList<LossScenario> lossScenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LossScenarioPackageImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.LOSS_SCENARIO_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LossScenario> getLossScenarios() {
    if (lossScenarios == null) {
      lossScenarios = new EObjectContainmentEList.Resolving<LossScenario>(LossScenario.class, this,
          StpaPackage.LOSS_SCENARIO_PACKAGE__LOSS_SCENARIOS);
    }
    return lossScenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.LOSS_SCENARIO_PACKAGE__LOSS_SCENARIOS:
      return ((InternalEList<?>) getLossScenarios()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.LOSS_SCENARIO_PACKAGE__LOSS_SCENARIOS:
      return getLossScenarios();
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
    case StpaPackage.LOSS_SCENARIO_PACKAGE__LOSS_SCENARIOS:
      getLossScenarios().clear();
      getLossScenarios().addAll((Collection<? extends LossScenario>) newValue);
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
    case StpaPackage.LOSS_SCENARIO_PACKAGE__LOSS_SCENARIOS:
      getLossScenarios().clear();
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
    case StpaPackage.LOSS_SCENARIO_PACKAGE__LOSS_SCENARIOS:
      return lossScenarios != null && !lossScenarios.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LossScenarioPackageImpl
