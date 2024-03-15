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

import com.thalesgroup.mde.capella.stpa.model.Loss;
import com.thalesgroup.mde.capella.stpa.model.LossPackage;
import com.thalesgroup.mde.capella.stpa.model.Stakeholder;
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
 * An implementation of the model object '<em><b>Loss Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.LossPackageImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.LossPackageImpl#getLosses <em>Losses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LossPackageImpl extends AnalysisPackageImpl implements LossPackage {
  /**
   * The cached value of the '{@link #getStakeholders() <em>Stakeholders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholders()
   * @generated
   * @ordered
   */
  protected EList<Stakeholder> stakeholders;
  /**
   * The cached value of the '{@link #getLosses() <em>Losses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLosses()
   * @generated
   * @ordered
   */
  protected EList<Loss> losses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LossPackageImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.LOSS_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Stakeholder> getStakeholders() {
    if (stakeholders == null) {
      stakeholders = new EObjectContainmentEList.Resolving<Stakeholder>(Stakeholder.class, this,
          StpaPackage.LOSS_PACKAGE__STAKEHOLDERS);
    }
    return stakeholders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Loss> getLosses() {
    if (losses == null) {
      losses = new EObjectContainmentEList.Resolving<Loss>(Loss.class, this, StpaPackage.LOSS_PACKAGE__LOSSES);
    }
    return losses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.LOSS_PACKAGE__STAKEHOLDERS:
      return ((InternalEList<?>) getStakeholders()).basicRemove(otherEnd, msgs);
    case StpaPackage.LOSS_PACKAGE__LOSSES:
      return ((InternalEList<?>) getLosses()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.LOSS_PACKAGE__STAKEHOLDERS:
      return getStakeholders();
    case StpaPackage.LOSS_PACKAGE__LOSSES:
      return getLosses();
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
    case StpaPackage.LOSS_PACKAGE__STAKEHOLDERS:
      getStakeholders().clear();
      getStakeholders().addAll((Collection<? extends Stakeholder>) newValue);
      return;
    case StpaPackage.LOSS_PACKAGE__LOSSES:
      getLosses().clear();
      getLosses().addAll((Collection<? extends Loss>) newValue);
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
    case StpaPackage.LOSS_PACKAGE__STAKEHOLDERS:
      getStakeholders().clear();
      return;
    case StpaPackage.LOSS_PACKAGE__LOSSES:
      getLosses().clear();
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
    case StpaPackage.LOSS_PACKAGE__STAKEHOLDERS:
      return stakeholders != null && !stakeholders.isEmpty();
    case StpaPackage.LOSS_PACKAGE__LOSSES:
      return losses != null && !losses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LossPackageImpl
