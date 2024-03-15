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

import com.thalesgroup.mde.capella.stpa.model.ProcessModelValue;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Model Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelValueImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessModelValueImpl extends ArchitectureMappableImpl<NamedElement> implements ProcessModelValue {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessModelValueImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.PROCESS_MODEL_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessModelVariable getVariable() {
    if (eContainerFeatureID() != StpaPackage.PROCESS_MODEL_VALUE__VARIABLE)
      return null;
    return (ProcessModelVariable) eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessModelVariable basicGetVariable() {
    if (eContainerFeatureID() != StpaPackage.PROCESS_MODEL_VALUE__VARIABLE)
      return null;
    return (ProcessModelVariable) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(ProcessModelVariable newVariable, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newVariable, StpaPackage.PROCESS_MODEL_VALUE__VARIABLE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable(ProcessModelVariable newVariable) {
    if (newVariable != eInternalContainer()
        || (eContainerFeatureID() != StpaPackage.PROCESS_MODEL_VALUE__VARIABLE && newVariable != null)) {
      if (EcoreUtil.isAncestor(this, newVariable))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newVariable != null)
        msgs = ((InternalEObject) newVariable).eInverseAdd(this, StpaPackage.PROCESS_MODEL_VARIABLE__VALUES,
            ProcessModelVariable.class, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.PROCESS_MODEL_VALUE__VARIABLE, newVariable,
          newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.PROCESS_MODEL_VALUE__VARIABLE:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetVariable((ProcessModelVariable) otherEnd, msgs);
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
    case StpaPackage.PROCESS_MODEL_VALUE__VARIABLE:
      return basicSetVariable(null, msgs);
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
    case StpaPackage.PROCESS_MODEL_VALUE__VARIABLE:
      return eInternalContainer().eInverseRemove(this, StpaPackage.PROCESS_MODEL_VARIABLE__VALUES,
          ProcessModelVariable.class, msgs);
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
    case StpaPackage.PROCESS_MODEL_VALUE__VARIABLE:
      if (resolve)
        return getVariable();
      return basicGetVariable();
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
    case StpaPackage.PROCESS_MODEL_VALUE__VARIABLE:
      setVariable((ProcessModelVariable) newValue);
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
    case StpaPackage.PROCESS_MODEL_VALUE__VARIABLE:
      setVariable((ProcessModelVariable) null);
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
    case StpaPackage.PROCESS_MODEL_VALUE__VARIABLE:
      return basicGetVariable() != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcessModelValueImpl
