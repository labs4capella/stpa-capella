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

import com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable;
import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.ExchangeBasedElement;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.FeedbackElement;
import com.thalesgroup.mde.capella.stpa.model.PieceOfInformation;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelValue;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Model Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelVariableImpl#getController <em>Controller</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelVariableImpl#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelVariableImpl#getValues <em>Values</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelVariableImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelVariableImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelVariableImpl#getControlActions <em>Control Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessModelVariableImpl extends UserIdentifiedElementImpl implements ProcessModelVariable {
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
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<ProcessModelValue> values;

  /**
   * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeedback()
   * @generated
   * @ordered
   */
  protected EList<FeedbackElement> feedback;

  /**
   * The cached value of the '{@link #getInformation() <em>Information</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInformation()
   * @generated
   * @ordered
   */
  protected EList<PieceOfInformation> information;

  /**
   * The cached value of the '{@link #getControlActions() <em>Control Actions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlActions()
   * @generated
   * @ordered
   */
  protected EList<ExchangeElement> controlActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessModelVariableImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.PROCESS_MODEL_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlEntity getController() {
    if (eContainerFeatureID() != StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER)
      return null;
    return (ControlEntity) eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlEntity basicGetController() {
    if (eContainerFeatureID() != StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER)
      return null;
    return (ControlEntity) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetController(ControlEntity newController, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newController, StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setController(ControlEntity newController) {
    if (newController != eInternalContainer()
        || (eContainerFeatureID() != StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER && newController != null)) {
      if (EcoreUtil.isAncestor(this, newController))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newController != null)
        msgs = ((InternalEObject) newController).eInverseAdd(this, StpaPackage.CONTROL_ENTITY__PROCESS_MODEL,
            ControlEntity.class, msgs);
      msgs = basicSetController(newController, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER,
          newController, newController));
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
          StpaPackage.PROCESS_MODEL_VARIABLE__RESPONSIBILITIES, StpaPackage.RESPONSIBILITY__VARIABLES);
    }
    return responsibilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ProcessModelValue> getValues() {
    if (values == null) {
      values = new EObjectContainmentWithInverseEList.Resolving<ProcessModelValue>(ProcessModelValue.class, this,
          StpaPackage.PROCESS_MODEL_VARIABLE__VALUES, StpaPackage.PROCESS_MODEL_VALUE__VARIABLE);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FeedbackElement> getFeedback() {
    if (feedback == null) {
      feedback = new EObjectWithInverseResolvingEList.ManyInverse<FeedbackElement>(FeedbackElement.class, this,
          StpaPackage.PROCESS_MODEL_VARIABLE__FEEDBACK, StpaPackage.FEEDBACK_ELEMENT__PROCESS_MODEL);
    }
    return feedback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PieceOfInformation> getInformation() {
    if (information == null) {
      information = new EObjectWithInverseResolvingEList.ManyInverse<PieceOfInformation>(PieceOfInformation.class, this,
          StpaPackage.PROCESS_MODEL_VARIABLE__INFORMATION, StpaPackage.PIECE_OF_INFORMATION__PROCESS_MODEL);
    }
    return information;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ExchangeElement> getControlActions() {
    if (controlActions == null) {
      controlActions = new EObjectWithInverseResolvingEList.ManyInverse<ExchangeElement>(ExchangeElement.class, this,
          StpaPackage.PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS, StpaPackage.EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL);
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
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetController((ControlEntity) otherEnd, msgs);
    case StpaPackage.PROCESS_MODEL_VARIABLE__RESPONSIBILITIES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getResponsibilities()).basicAdd(otherEnd, msgs);
    case StpaPackage.PROCESS_MODEL_VARIABLE__VALUES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getValues()).basicAdd(otherEnd, msgs);
    case StpaPackage.PROCESS_MODEL_VARIABLE__FEEDBACK:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getFeedback()).basicAdd(otherEnd, msgs);
    case StpaPackage.PROCESS_MODEL_VARIABLE__INFORMATION:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getInformation()).basicAdd(otherEnd, msgs);
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS:
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
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER:
      return basicSetController(null, msgs);
    case StpaPackage.PROCESS_MODEL_VARIABLE__RESPONSIBILITIES:
      return ((InternalEList<?>) getResponsibilities()).basicRemove(otherEnd, msgs);
    case StpaPackage.PROCESS_MODEL_VARIABLE__VALUES:
      return ((InternalEList<?>) getValues()).basicRemove(otherEnd, msgs);
    case StpaPackage.PROCESS_MODEL_VARIABLE__FEEDBACK:
      return ((InternalEList<?>) getFeedback()).basicRemove(otherEnd, msgs);
    case StpaPackage.PROCESS_MODEL_VARIABLE__INFORMATION:
      return ((InternalEList<?>) getInformation()).basicRemove(otherEnd, msgs);
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS:
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER:
      return eInternalContainer().eInverseRemove(this, StpaPackage.CONTROL_ENTITY__PROCESS_MODEL, ControlEntity.class,
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
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER:
      if (resolve)
        return getController();
      return basicGetController();
    case StpaPackage.PROCESS_MODEL_VARIABLE__RESPONSIBILITIES:
      return getResponsibilities();
    case StpaPackage.PROCESS_MODEL_VARIABLE__VALUES:
      return getValues();
    case StpaPackage.PROCESS_MODEL_VARIABLE__FEEDBACK:
      return getFeedback();
    case StpaPackage.PROCESS_MODEL_VARIABLE__INFORMATION:
      return getInformation();
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS:
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
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER:
      setController((ControlEntity) newValue);
      return;
    case StpaPackage.PROCESS_MODEL_VARIABLE__RESPONSIBILITIES:
      getResponsibilities().clear();
      getResponsibilities().addAll((Collection<? extends Responsibility>) newValue);
      return;
    case StpaPackage.PROCESS_MODEL_VARIABLE__VALUES:
      getValues().clear();
      getValues().addAll((Collection<? extends ProcessModelValue>) newValue);
      return;
    case StpaPackage.PROCESS_MODEL_VARIABLE__FEEDBACK:
      getFeedback().clear();
      getFeedback().addAll((Collection<? extends FeedbackElement>) newValue);
      return;
    case StpaPackage.PROCESS_MODEL_VARIABLE__INFORMATION:
      getInformation().clear();
      getInformation().addAll((Collection<? extends PieceOfInformation>) newValue);
      return;
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS:
      getControlActions().clear();
      getControlActions().addAll((Collection<? extends ExchangeElement>) newValue);
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
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER:
      setController((ControlEntity) null);
      return;
    case StpaPackage.PROCESS_MODEL_VARIABLE__RESPONSIBILITIES:
      getResponsibilities().clear();
      return;
    case StpaPackage.PROCESS_MODEL_VARIABLE__VALUES:
      getValues().clear();
      return;
    case StpaPackage.PROCESS_MODEL_VARIABLE__FEEDBACK:
      getFeedback().clear();
      return;
    case StpaPackage.PROCESS_MODEL_VARIABLE__INFORMATION:
      getInformation().clear();
      return;
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS:
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
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER:
      return basicGetController() != null;
    case StpaPackage.PROCESS_MODEL_VARIABLE__RESPONSIBILITIES:
      return responsibilities != null && !responsibilities.isEmpty();
    case StpaPackage.PROCESS_MODEL_VARIABLE__VALUES:
      return values != null && !values.isEmpty();
    case StpaPackage.PROCESS_MODEL_VARIABLE__FEEDBACK:
      return feedback != null && !feedback.isEmpty();
    case StpaPackage.PROCESS_MODEL_VARIABLE__INFORMATION:
      return information != null && !information.isEmpty();
    case StpaPackage.PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS:
      return controlActions != null && !controlActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProcessModelVariableImpl
