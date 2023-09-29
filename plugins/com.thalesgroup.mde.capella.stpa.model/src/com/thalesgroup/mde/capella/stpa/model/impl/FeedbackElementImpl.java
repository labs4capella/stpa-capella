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

import com.thalesgroup.mde.capella.stpa.model.FeedbackElement;
import com.thalesgroup.mde.capella.stpa.model.FeedbackRelation;
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
 * An implementation of the model object '<em><b>Feedback Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.FeedbackElementImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.FeedbackElementImpl#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.FeedbackElementImpl#getProcessModel <em>Process Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackElementImpl extends ResponsibilitySupportExchangeElementImpl implements FeedbackElement {
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
  protected FeedbackElementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.FEEDBACK_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeedbackRelation getRelation() {
    if (eContainerFeatureID() != StpaPackage.FEEDBACK_ELEMENT__RELATION)
      return null;
    return (FeedbackRelation) eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeedbackRelation basicGetRelation() {
    if (eContainerFeatureID() != StpaPackage.FEEDBACK_ELEMENT__RELATION)
      return null;
    return (FeedbackRelation) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelation(FeedbackRelation newRelation, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newRelation, StpaPackage.FEEDBACK_ELEMENT__RELATION, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRelation(FeedbackRelation newRelation) {
    if (newRelation != eInternalContainer()
        || (eContainerFeatureID() != StpaPackage.FEEDBACK_ELEMENT__RELATION && newRelation != null)) {
      if (EcoreUtil.isAncestor(this, newRelation))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newRelation != null)
        msgs = ((InternalEObject) newRelation).eInverseAdd(this, StpaPackage.FEEDBACK_RELATION__FEEDBACK,
            FeedbackRelation.class, msgs);
      msgs = basicSetRelation(newRelation, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.FEEDBACK_ELEMENT__RELATION, newRelation,
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
          StpaPackage.FEEDBACK_ELEMENT__RESPONSIBILITIES, StpaPackage.RESPONSIBILITY__FEEDBACK);
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
          this, StpaPackage.FEEDBACK_ELEMENT__PROCESS_MODEL, StpaPackage.PROCESS_MODEL_VARIABLE__FEEDBACK);
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
    case StpaPackage.FEEDBACK_ELEMENT__RELATION:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetRelation((FeedbackRelation) otherEnd, msgs);
    case StpaPackage.FEEDBACK_ELEMENT__RESPONSIBILITIES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getResponsibilities()).basicAdd(otherEnd, msgs);
    case StpaPackage.FEEDBACK_ELEMENT__PROCESS_MODEL:
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
    case StpaPackage.FEEDBACK_ELEMENT__RELATION:
      return basicSetRelation(null, msgs);
    case StpaPackage.FEEDBACK_ELEMENT__RESPONSIBILITIES:
      return ((InternalEList<?>) getResponsibilities()).basicRemove(otherEnd, msgs);
    case StpaPackage.FEEDBACK_ELEMENT__PROCESS_MODEL:
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
    case StpaPackage.FEEDBACK_ELEMENT__RELATION:
      return eInternalContainer().eInverseRemove(this, StpaPackage.FEEDBACK_RELATION__FEEDBACK, FeedbackRelation.class,
          msgs);
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
    case StpaPackage.FEEDBACK_ELEMENT__RELATION:
      if (resolve)
        return getRelation();
      return basicGetRelation();
    case StpaPackage.FEEDBACK_ELEMENT__RESPONSIBILITIES:
      return getResponsibilities();
    case StpaPackage.FEEDBACK_ELEMENT__PROCESS_MODEL:
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
    case StpaPackage.FEEDBACK_ELEMENT__RELATION:
      setRelation((FeedbackRelation) newValue);
      return;
    case StpaPackage.FEEDBACK_ELEMENT__RESPONSIBILITIES:
      getResponsibilities().clear();
      getResponsibilities().addAll((Collection<? extends Responsibility>) newValue);
      return;
    case StpaPackage.FEEDBACK_ELEMENT__PROCESS_MODEL:
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
    case StpaPackage.FEEDBACK_ELEMENT__RELATION:
      setRelation((FeedbackRelation) null);
      return;
    case StpaPackage.FEEDBACK_ELEMENT__RESPONSIBILITIES:
      getResponsibilities().clear();
      return;
    case StpaPackage.FEEDBACK_ELEMENT__PROCESS_MODEL:
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
    case StpaPackage.FEEDBACK_ELEMENT__RELATION:
      return basicGetRelation() != null;
    case StpaPackage.FEEDBACK_ELEMENT__RESPONSIBILITIES:
      return responsibilities != null && !responsibilities.isEmpty();
    case StpaPackage.FEEDBACK_ELEMENT__PROCESS_MODEL:
      return processModel != null && !processModel.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeedbackElementImpl
