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

import com.thalesgroup.mde.capella.stpa.model.ControlAction;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawContext;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawSet;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flaw Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawSetImpl#getControlFlaws <em>Control Flaws</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawSetImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFlawSetImpl extends StpaAnalysisElementImpl implements ControlFlawSet {
  /**
   * The cached value of the '{@link #getControlFlaws() <em>Control Flaws</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlFlaws()
   * @generated
   * @ordered
   */
  protected EList<ControlFlaw> controlFlaws;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlFlawSetImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.CONTROL_FLAW_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ControlFlaw> getControlFlaws() {
    if (controlFlaws == null) {
      controlFlaws = new EObjectContainmentWithInverseEList.Resolving<ControlFlaw>(ControlFlaw.class, this,
          StpaPackage.CONTROL_FLAW_SET__CONTROL_FLAWS, StpaPackage.CONTROL_FLAW__OWNING_SET);
    }
    return controlFlaws;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlFlawContext getContext() {
    if (eContainerFeatureID() != StpaPackage.CONTROL_FLAW_SET__CONTEXT)
      return null;
    return (ControlFlawContext) eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFlawContext basicGetContext() {
    if (eContainerFeatureID() != StpaPackage.CONTROL_FLAW_SET__CONTEXT)
      return null;
    return (ControlFlawContext) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContext(ControlFlawContext newContext, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newContext, StpaPackage.CONTROL_FLAW_SET__CONTEXT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContext(ControlFlawContext newContext) {
    if (newContext != eInternalContainer()
        || (eContainerFeatureID() != StpaPackage.CONTROL_FLAW_SET__CONTEXT && newContext != null)) {
      if (EcoreUtil.isAncestor(this, newContext))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newContext != null)
        msgs = ((InternalEObject) newContext).eInverseAdd(this, StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET,
            ControlFlawContext.class, msgs);
      msgs = basicSetContext(newContext, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(this, Notification.SET, StpaPackage.CONTROL_FLAW_SET__CONTEXT, newContext, newContext));
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
    case StpaPackage.CONTROL_FLAW_SET__CONTROL_FLAWS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getControlFlaws()).basicAdd(otherEnd, msgs);
    case StpaPackage.CONTROL_FLAW_SET__CONTEXT:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetContext((ControlFlawContext) otherEnd, msgs);
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
    case StpaPackage.CONTROL_FLAW_SET__CONTROL_FLAWS:
      return ((InternalEList<?>) getControlFlaws()).basicRemove(otherEnd, msgs);
    case StpaPackage.CONTROL_FLAW_SET__CONTEXT:
      return basicSetContext(null, msgs);
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
    case StpaPackage.CONTROL_FLAW_SET__CONTEXT:
      return eInternalContainer().eInverseRemove(this, StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET,
          ControlFlawContext.class, msgs);
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
    case StpaPackage.CONTROL_FLAW_SET__CONTROL_FLAWS:
      return getControlFlaws();
    case StpaPackage.CONTROL_FLAW_SET__CONTEXT:
      if (resolve)
        return getContext();
      return basicGetContext();
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
    case StpaPackage.CONTROL_FLAW_SET__CONTROL_FLAWS:
      getControlFlaws().clear();
      getControlFlaws().addAll((Collection<? extends ControlFlaw>) newValue);
      return;
    case StpaPackage.CONTROL_FLAW_SET__CONTEXT:
      setContext((ControlFlawContext) newValue);
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
    case StpaPackage.CONTROL_FLAW_SET__CONTROL_FLAWS:
      getControlFlaws().clear();
      return;
    case StpaPackage.CONTROL_FLAW_SET__CONTEXT:
      setContext((ControlFlawContext) null);
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
    case StpaPackage.CONTROL_FLAW_SET__CONTROL_FLAWS:
      return controlFlaws != null && !controlFlaws.isEmpty();
    case StpaPackage.CONTROL_FLAW_SET__CONTEXT:
      return basicGetContext() != null;
    }
    return super.eIsSet(featureID);
  }

} //ControlFlawSetImpl
