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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.NamedElement;
import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysis;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Identified Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.UserIdentifiedElementImpl#getUserID <em>User ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserIdentifiedElementImpl extends ArchitectureMappableImpl<NamedElement>
    implements UserIdentifiedElement {
  /**
   * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserID()
   * @generated
   * @ordered
   */
  protected static final String USER_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserID()
   * @generated
   * @ordered
   */
  protected String userID = USER_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserIdentifiedElementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.USER_IDENTIFIED_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUserID() {
    return userID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUserID(String newUserID) {
    String oldUserID = userID;
    userID = newUserID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.USER_IDENTIFIED_ELEMENT__USER_ID, oldUserID,
          userID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case StpaPackage.USER_IDENTIFIED_ELEMENT__USER_ID:
      return getUserID();
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
    case StpaPackage.USER_IDENTIFIED_ELEMENT__USER_ID:
      setUserID((String) newValue);
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
    case StpaPackage.USER_IDENTIFIED_ELEMENT__USER_ID:
      setUserID(USER_ID_EDEFAULT);
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
    case StpaPackage.USER_IDENTIFIED_ELEMENT__USER_ID:
      return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy())
      return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (userID: "); //$NON-NLS-1$
    result.append(userID);
    result.append(')');
    return result.toString();
  }

} //UserIdentifiedElementImpl
