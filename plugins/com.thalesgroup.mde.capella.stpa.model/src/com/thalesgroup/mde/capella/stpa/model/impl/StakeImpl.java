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
import com.thalesgroup.mde.capella.stpa.model.Loss;
import com.thalesgroup.mde.capella.stpa.model.Stake;
import com.thalesgroup.mde.capella.stpa.model.Stakeholder;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stake</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.StakeImpl#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.StakeImpl#getLosses <em>Losses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeImpl extends UserIdentifiedElementImpl implements Stake {
  /**
   * The cached value of the '{@link #getLosses() <em>Losses</em>}' reference list.
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
  protected StakeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.STAKE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Stakeholder getStakeholder() {
    if (eContainerFeatureID() != StpaPackage.STAKE__STAKEHOLDER)
      return null;
    return (Stakeholder) eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder basicGetStakeholder() {
    if (eContainerFeatureID() != StpaPackage.STAKE__STAKEHOLDER)
      return null;
    return (Stakeholder) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStakeholder(Stakeholder newStakeholder, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newStakeholder, StpaPackage.STAKE__STAKEHOLDER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStakeholder(Stakeholder newStakeholder) {
    if (newStakeholder != eInternalContainer()
        || (eContainerFeatureID() != StpaPackage.STAKE__STAKEHOLDER && newStakeholder != null)) {
      if (EcoreUtil.isAncestor(this, newStakeholder))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newStakeholder != null)
        msgs = ((InternalEObject) newStakeholder).eInverseAdd(this, StpaPackage.STAKEHOLDER__STAKES, Stakeholder.class,
            msgs);
      msgs = basicSetStakeholder(newStakeholder, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.STAKE__STAKEHOLDER, newStakeholder,
          newStakeholder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Loss> getLosses() {
    if (losses == null) {
      losses = new EObjectWithInverseResolvingEList.ManyInverse<Loss>(Loss.class, this, StpaPackage.STAKE__LOSSES,
          StpaPackage.LOSS__STAKES);
    }
    return losses;
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
    case StpaPackage.STAKE__STAKEHOLDER:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetStakeholder((Stakeholder) otherEnd, msgs);
    case StpaPackage.STAKE__LOSSES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getLosses()).basicAdd(otherEnd, msgs);
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
    case StpaPackage.STAKE__STAKEHOLDER:
      return basicSetStakeholder(null, msgs);
    case StpaPackage.STAKE__LOSSES:
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
    case StpaPackage.STAKE__STAKEHOLDER:
      return eInternalContainer().eInverseRemove(this, StpaPackage.STAKEHOLDER__STAKES, Stakeholder.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case StpaPackage.STAKE__STAKEHOLDER:
      if (resolve)
        return getStakeholder();
      return basicGetStakeholder();
    case StpaPackage.STAKE__LOSSES:
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
    case StpaPackage.STAKE__STAKEHOLDER:
      setStakeholder((Stakeholder) newValue);
      return;
    case StpaPackage.STAKE__LOSSES:
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
    case StpaPackage.STAKE__STAKEHOLDER:
      setStakeholder((Stakeholder) null);
      return;
    case StpaPackage.STAKE__LOSSES:
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
    case StpaPackage.STAKE__STAKEHOLDER:
      return basicGetStakeholder() != null;
    case StpaPackage.STAKE__LOSSES:
      return losses != null && !losses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StakeImpl
