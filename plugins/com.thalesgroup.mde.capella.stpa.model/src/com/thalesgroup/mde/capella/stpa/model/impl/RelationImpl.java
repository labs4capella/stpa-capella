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

import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.Relation;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.RelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.RelationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationImpl extends ArchitectureMappableImpl<NamedElement> implements Relation {
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ControlEntity target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlEntity getSource() {
    if (eContainerFeatureID() != StpaPackage.RELATION__SOURCE)
      return null;
    return (ControlEntity) eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlEntity basicGetSource() {
    if (eContainerFeatureID() != StpaPackage.RELATION__SOURCE)
      return null;
    return (ControlEntity) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(ControlEntity newSource, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newSource, StpaPackage.RELATION__SOURCE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(ControlEntity newSource) {
    if (newSource != eInternalContainer()
        || (eContainerFeatureID() != StpaPackage.RELATION__SOURCE && newSource != null)) {
      if (EcoreUtil.isAncestor(this, newSource))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newSource != null)
        msgs = ((InternalEObject) newSource).eInverseAdd(this, StpaPackage.CONTROL_ENTITY__OUTGOING_RELATIONS,
            ControlEntity.class, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.RELATION__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlEntity getTarget() {
    if (target != null && target.eIsProxy()) {
      InternalEObject oldTarget = (InternalEObject) target;
      target = (ControlEntity) eResolveProxy(oldTarget);
      if (target != oldTarget) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.RELATION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlEntity basicGetTarget() {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(ControlEntity newTarget, NotificationChain msgs) {
    ControlEntity oldTarget = target;
    target = newTarget;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StpaPackage.RELATION__TARGET,
          oldTarget, newTarget);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(ControlEntity newTarget) {
    if (newTarget != target) {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject) target).eInverseRemove(this, StpaPackage.CONTROL_ENTITY__INCOMING_RELATIONS,
            ControlEntity.class, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject) newTarget).eInverseAdd(this, StpaPackage.CONTROL_ENTITY__INCOMING_RELATIONS,
            ControlEntity.class, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.RELATION__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract EList<ExchangeElement> getExchangeElements();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.RELATION__SOURCE:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetSource((ControlEntity) otherEnd, msgs);
    case StpaPackage.RELATION__TARGET:
      if (target != null)
        msgs = ((InternalEObject) target).eInverseRemove(this, StpaPackage.CONTROL_ENTITY__INCOMING_RELATIONS,
            ControlEntity.class, msgs);
      return basicSetTarget((ControlEntity) otherEnd, msgs);
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
    case StpaPackage.RELATION__SOURCE:
      return basicSetSource(null, msgs);
    case StpaPackage.RELATION__TARGET:
      return basicSetTarget(null, msgs);
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
    case StpaPackage.RELATION__SOURCE:
      return eInternalContainer().eInverseRemove(this, StpaPackage.CONTROL_ENTITY__OUTGOING_RELATIONS,
          ControlEntity.class, msgs);
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
    case StpaPackage.RELATION__SOURCE:
      if (resolve)
        return getSource();
      return basicGetSource();
    case StpaPackage.RELATION__TARGET:
      if (resolve)
        return getTarget();
      return basicGetTarget();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case StpaPackage.RELATION__SOURCE:
      setSource((ControlEntity) newValue);
      return;
    case StpaPackage.RELATION__TARGET:
      setTarget((ControlEntity) newValue);
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
    case StpaPackage.RELATION__SOURCE:
      setSource((ControlEntity) null);
      return;
    case StpaPackage.RELATION__TARGET:
      setTarget((ControlEntity) null);
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
    case StpaPackage.RELATION__SOURCE:
      return basicGetSource() != null;
    case StpaPackage.RELATION__TARGET:
      return target != null;
    }
    return super.eIsSet(featureID);
  }

} //RelationImpl
