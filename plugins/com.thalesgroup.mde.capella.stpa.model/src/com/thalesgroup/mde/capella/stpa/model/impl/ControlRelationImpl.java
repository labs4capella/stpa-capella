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

import com.thalesgroup.mde.capella.stpa.model.ControlAction;
import com.thalesgroup.mde.capella.stpa.model.ControlRelation;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlRelationImpl#getControlActions <em>Control Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlRelationImpl extends RelationImpl implements ControlRelation {
  /**
   * The cached value of the '{@link #getControlActions() <em>Control Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlActions()
   * @generated
   * @ordered
   */
  protected EList<ControlAction> controlActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlRelationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.CONTROL_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ControlAction> getControlActions() {
    if (controlActions == null) {
      controlActions = new EObjectContainmentWithInverseEList.Resolving<ControlAction>(ControlAction.class, this,
          StpaPackage.CONTROL_RELATION__CONTROL_ACTIONS, StpaPackage.CONTROL_ACTION__RELATION);
    }
    return controlActions;
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
    case StpaPackage.CONTROL_RELATION__CONTROL_ACTIONS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getControlActions()).basicAdd(otherEnd, msgs);
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
    case StpaPackage.CONTROL_RELATION__CONTROL_ACTIONS:
      return ((InternalEList<?>) getControlActions()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.CONTROL_RELATION__CONTROL_ACTIONS:
      return getControlActions();
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
    case StpaPackage.CONTROL_RELATION__CONTROL_ACTIONS:
      getControlActions().clear();
      getControlActions().addAll((Collection<? extends ControlAction>) newValue);
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
    case StpaPackage.CONTROL_RELATION__CONTROL_ACTIONS:
      getControlActions().clear();
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
    case StpaPackage.CONTROL_RELATION__CONTROL_ACTIONS:
      return controlActions != null && !controlActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * @generated NOT
   */
  @Override
  public EList<ExchangeElement> getExchangeElements() {
    return new BasicEList<>(getControlActions());
  }

} //ControlRelationImpl
