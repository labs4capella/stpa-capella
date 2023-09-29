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

import com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation;
import com.thalesgroup.mde.capella.stpa.model.PieceOfInformation;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable;
import com.thalesgroup.mde.capella.stpa.model.Responsibility;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piece Of Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.PieceOfInformationImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.PieceOfInformationImpl#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.PieceOfInformationImpl#getProcessModel <em>Process Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PieceOfInformationImpl extends ResponsibilitySupportExchangeElementImpl implements PieceOfInformation {
  /**
   * The cached value of the '{@link #getResponsibilities() <em>Responsibilities</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsibilities()
   * @generated
   * @ordered
   */
  protected EList<Responsibility> responsibilities;

  /**
   * The cached value of the '{@link #getProcessModel() <em>Process Model</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessModel()
   * @generated
   * @ordered
   */
  protected EList<ProcessModelVariable> processModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PieceOfInformationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.PIECE_OF_INFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InformationExchangeRelation getRelation() {
    if (eContainerFeatureID() != StpaPackage.PIECE_OF_INFORMATION__RELATION)
      return null;
    return (InformationExchangeRelation) eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InformationExchangeRelation basicGetRelation() {
    if (eContainerFeatureID() != StpaPackage.PIECE_OF_INFORMATION__RELATION)
      return null;
    return (InformationExchangeRelation) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelation(InformationExchangeRelation newRelation, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newRelation, StpaPackage.PIECE_OF_INFORMATION__RELATION, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRelation(InformationExchangeRelation newRelation) {
    if (newRelation != eInternalContainer()
        || (eContainerFeatureID() != StpaPackage.PIECE_OF_INFORMATION__RELATION && newRelation != null)) {
      if (EcoreUtil.isAncestor(this, newRelation))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newRelation != null)
        msgs = ((InternalEObject) newRelation).eInverseAdd(this, StpaPackage.INFORMATION_EXCHANGE_RELATION__INFORMATION,
            InformationExchangeRelation.class, msgs);
      msgs = basicSetRelation(newRelation, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.PIECE_OF_INFORMATION__RELATION, newRelation,
          newRelation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Responsibility> getResponsibilities() {
    if (responsibilities == null) {
      responsibilities = new EObjectWithInverseResolvingEList.ManyInverse<Responsibility>(Responsibility.class, this,
          StpaPackage.PIECE_OF_INFORMATION__RESPONSIBILITIES, StpaPackage.RESPONSIBILITY__INFORMATION);
    }
    return responsibilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ProcessModelVariable> getProcessModel() {
    if (processModel == null) {
      processModel = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModelVariable>(ProcessModelVariable.class,
          this, StpaPackage.PIECE_OF_INFORMATION__PROCESS_MODEL, StpaPackage.PROCESS_MODEL_VARIABLE__INFORMATION);
    }
    return processModel;
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
    case StpaPackage.PIECE_OF_INFORMATION__RELATION:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetRelation((InformationExchangeRelation) otherEnd, msgs);
    case StpaPackage.PIECE_OF_INFORMATION__RESPONSIBILITIES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getResponsibilities()).basicAdd(otherEnd, msgs);
    case StpaPackage.PIECE_OF_INFORMATION__PROCESS_MODEL:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getProcessModel()).basicAdd(otherEnd, msgs);
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
    case StpaPackage.PIECE_OF_INFORMATION__RELATION:
      return basicSetRelation(null, msgs);
    case StpaPackage.PIECE_OF_INFORMATION__RESPONSIBILITIES:
      return ((InternalEList<?>) getResponsibilities()).basicRemove(otherEnd, msgs);
    case StpaPackage.PIECE_OF_INFORMATION__PROCESS_MODEL:
      return ((InternalEList<?>) getProcessModel()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.PIECE_OF_INFORMATION__RELATION:
      return eInternalContainer().eInverseRemove(this, StpaPackage.INFORMATION_EXCHANGE_RELATION__INFORMATION,
          InformationExchangeRelation.class, msgs);
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
    case StpaPackage.PIECE_OF_INFORMATION__RELATION:
      if (resolve)
        return getRelation();
      return basicGetRelation();
    case StpaPackage.PIECE_OF_INFORMATION__RESPONSIBILITIES:
      return getResponsibilities();
    case StpaPackage.PIECE_OF_INFORMATION__PROCESS_MODEL:
      return getProcessModel();
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
    case StpaPackage.PIECE_OF_INFORMATION__RELATION:
      setRelation((InformationExchangeRelation) newValue);
      return;
    case StpaPackage.PIECE_OF_INFORMATION__RESPONSIBILITIES:
      getResponsibilities().clear();
      getResponsibilities().addAll((Collection<? extends Responsibility>) newValue);
      return;
    case StpaPackage.PIECE_OF_INFORMATION__PROCESS_MODEL:
      getProcessModel().clear();
      getProcessModel().addAll((Collection<? extends ProcessModelVariable>) newValue);
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
    case StpaPackage.PIECE_OF_INFORMATION__RELATION:
      setRelation((InformationExchangeRelation) null);
      return;
    case StpaPackage.PIECE_OF_INFORMATION__RESPONSIBILITIES:
      getResponsibilities().clear();
      return;
    case StpaPackage.PIECE_OF_INFORMATION__PROCESS_MODEL:
      getProcessModel().clear();
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
    case StpaPackage.PIECE_OF_INFORMATION__RELATION:
      return basicGetRelation() != null;
    case StpaPackage.PIECE_OF_INFORMATION__RESPONSIBILITIES:
      return responsibilities != null && !responsibilities.isEmpty();
    case StpaPackage.PIECE_OF_INFORMATION__PROCESS_MODEL:
      return processModel != null && !processModel.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PieceOfInformationImpl
