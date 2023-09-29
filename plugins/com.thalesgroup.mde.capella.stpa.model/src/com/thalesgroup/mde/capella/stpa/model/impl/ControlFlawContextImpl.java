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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.thalesgroup.mde.capella.stpa.model.ControlFlawContext;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawSet;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flaw Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawContextImpl#getControlFlawSet <em>Control Flaw Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlFlawContextImpl extends UserIdentifiedElementImpl implements ControlFlawContext {
  /**
   * The cached value of the '{@link #getControlFlawSet() <em>Control Flaw Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlFlawSet()
   * @generated
   * @ordered
   */
  protected ControlFlawSet controlFlawSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlFlawContextImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.CONTROL_FLAW_CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlFlawSet getControlFlawSet() {
    if (controlFlawSet != null && controlFlawSet.eIsProxy()) {
      InternalEObject oldControlFlawSet = (InternalEObject) controlFlawSet;
      controlFlawSet = (ControlFlawSet) eResolveProxy(oldControlFlawSet);
      if (controlFlawSet != oldControlFlawSet) {
        InternalEObject newControlFlawSet = (InternalEObject) controlFlawSet;
        NotificationChain msgs = oldControlFlawSet.eInverseRemove(this, StpaPackage.CONTROL_FLAW_SET__CONTEXT,
            ControlFlawSet.class, null);
        if (newControlFlawSet.eInternalContainer() == null) {
          msgs = newControlFlawSet.eInverseAdd(this, StpaPackage.CONTROL_FLAW_SET__CONTEXT, ControlFlawSet.class, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET,
              oldControlFlawSet, controlFlawSet));
      }
    }
    return controlFlawSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFlawSet basicGetControlFlawSet() {
    return controlFlawSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControlFlawSet(ControlFlawSet newControlFlawSet, NotificationChain msgs) {
    ControlFlawSet oldControlFlawSet = controlFlawSet;
    controlFlawSet = newControlFlawSet;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET, oldControlFlawSet, newControlFlawSet);
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
  public void setControlFlawSet(ControlFlawSet newControlFlawSet) {
    if (newControlFlawSet != controlFlawSet) {
      NotificationChain msgs = null;
      if (controlFlawSet != null)
        msgs = ((InternalEObject) controlFlawSet).eInverseRemove(this, StpaPackage.CONTROL_FLAW_SET__CONTEXT,
            ControlFlawSet.class, msgs);
      if (newControlFlawSet != null)
        msgs = ((InternalEObject) newControlFlawSet).eInverseAdd(this, StpaPackage.CONTROL_FLAW_SET__CONTEXT,
            ControlFlawSet.class, msgs);
      msgs = basicSetControlFlawSet(newControlFlawSet, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET,
          newControlFlawSet, newControlFlawSet));
  }

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
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET:
      if (controlFlawSet != null)
        msgs = ((InternalEObject) controlFlawSet).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET, null, msgs);
      return basicSetControlFlawSet((ControlFlawSet) otherEnd, msgs);
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
    case StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET:
      return basicSetControlFlawSet(null, msgs);
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
    case StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET:
      if (resolve)
        return getControlFlawSet();
      return basicGetControlFlawSet();
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
    case StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET:
      setControlFlawSet((ControlFlawSet) newValue);
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
    case StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET:
      setControlFlawSet((ControlFlawSet) null);
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
    case StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET:
      return controlFlawSet != null;
    }
    return super.eIsSet(featureID);
  }

} //ControlFlawContextImpl
