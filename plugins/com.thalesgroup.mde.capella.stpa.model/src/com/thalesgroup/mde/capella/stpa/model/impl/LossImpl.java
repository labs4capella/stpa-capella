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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.Loss;
import com.thalesgroup.mde.capella.stpa.model.Stake;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loss</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.LossImpl#getHazards <em>Hazards</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.LossImpl#getStakes <em>Stakes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LossImpl extends UserIdentifiedElementImpl implements Loss {
  /**
   * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHazards()
   * @generated
   * @ordered
   */
  protected EList<Hazard> hazards;

  /**
   * The cached value of the '{@link #getStakes() <em>Stakes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakes()
   * @generated
   * @ordered
   */
  protected EList<Stake> stakes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LossImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.LOSS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Hazard> getHazards() {
    if (hazards == null) {
      hazards = new EObjectWithInverseResolvingEList.ManyInverse<Hazard>(Hazard.class, this, StpaPackage.LOSS__HAZARDS,
          StpaPackage.HAZARD__LOSSES);
    }
    return hazards;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Stake> getStakes() {
    if (stakes == null) {
      stakes = new EObjectWithInverseResolvingEList.ManyInverse<Stake>(Stake.class, this, StpaPackage.LOSS__STAKES,
          StpaPackage.STAKE__LOSSES);
    }
    return stakes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.LOSS__HAZARDS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getHazards()).basicAdd(otherEnd, msgs);
    case StpaPackage.LOSS__STAKES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getStakes()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.LOSS__HAZARDS:
      return ((InternalEList<?>) getHazards()).basicRemove(otherEnd, msgs);
    case StpaPackage.LOSS__STAKES:
      return ((InternalEList<?>) getStakes()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.LOSS__HAZARDS:
      return getHazards();
    case StpaPackage.LOSS__STAKES:
      return getStakes();
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
    case StpaPackage.LOSS__HAZARDS:
      getHazards().clear();
      getHazards().addAll((Collection<? extends Hazard>) newValue);
      return;
    case StpaPackage.LOSS__STAKES:
      getStakes().clear();
      getStakes().addAll((Collection<? extends Stake>) newValue);
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
    case StpaPackage.LOSS__HAZARDS:
      getHazards().clear();
      return;
    case StpaPackage.LOSS__STAKES:
      getStakes().clear();
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
    case StpaPackage.LOSS__HAZARDS:
      return hazards != null && !hazards.isEmpty();
    case StpaPackage.LOSS__STAKES:
      return stakes != null && !stakes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LossImpl
