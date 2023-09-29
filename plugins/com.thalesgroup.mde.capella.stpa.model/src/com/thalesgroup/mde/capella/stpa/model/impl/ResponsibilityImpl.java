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
import com.thalesgroup.mde.capella.stpa.model.ControlAction;
import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.ExchangeBasedElement;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.FeedbackElement;
import com.thalesgroup.mde.capella.stpa.model.PieceOfInformation;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable;
import com.thalesgroup.mde.capella.stpa.model.Responsibility;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
 * An implementation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl#getProcessModelState <em>Process Model State</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl#getController <em>Controller</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl#getSystemConstraints <em>System Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl#getControlActions <em>Control Actions</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsibilityImpl extends UserIdentifiedElementImpl implements Responsibility {
  /**
   * The default value of the '{@link #getProcessModelState() <em>Process Model State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessModelState()
   * @generated
   * @ordered
   */
  protected static final String PROCESS_MODEL_STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessModelState() <em>Process Model State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessModelState()
   * @generated
   * @ordered
   */
  protected String processModelState = PROCESS_MODEL_STATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSystemConstraints() <em>System Constraints</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemConstraints()
   * @generated
   * @ordered
   */
  protected EList<SystemConstraint> systemConstraints;

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
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<ProcessModelVariable> variables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResponsibilityImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.RESPONSIBILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProcessModelState() {
    return processModelState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcessModelState(String newProcessModelState) {
    String oldProcessModelState = processModelState;
    processModelState = newProcessModelState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.RESPONSIBILITY__PROCESS_MODEL_STATE,
          oldProcessModelState, processModelState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlEntity getController() {
    if (eContainerFeatureID() != StpaPackage.RESPONSIBILITY__CONTROLLER)
      return null;
    return (ControlEntity) eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlEntity basicGetController() {
    if (eContainerFeatureID() != StpaPackage.RESPONSIBILITY__CONTROLLER)
      return null;
    return (ControlEntity) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetController(ControlEntity newController, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newController, StpaPackage.RESPONSIBILITY__CONTROLLER, msgs);
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
        || (eContainerFeatureID() != StpaPackage.RESPONSIBILITY__CONTROLLER && newController != null)) {
      if (EcoreUtil.isAncestor(this, newController))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newController != null)
        msgs = ((InternalEObject) newController).eInverseAdd(this, StpaPackage.CONTROL_ENTITY__RESPONSIBILITIES,
            ControlEntity.class, msgs);
      msgs = basicSetController(newController, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.RESPONSIBILITY__CONTROLLER, newController,
          newController));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SystemConstraint> getSystemConstraints() {
    if (systemConstraints == null) {
      systemConstraints = new EObjectWithInverseResolvingEList.ManyInverse<SystemConstraint>(SystemConstraint.class,
          this, StpaPackage.RESPONSIBILITY__SYSTEM_CONSTRAINTS, StpaPackage.SYSTEM_CONSTRAINT__RESPONSIBILITIES);
    }
    return systemConstraints;
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
          StpaPackage.RESPONSIBILITY__CONTROL_ACTIONS, StpaPackage.EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES);
    }
    return controlActions;
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
          StpaPackage.RESPONSIBILITY__FEEDBACK, StpaPackage.FEEDBACK_ELEMENT__RESPONSIBILITIES);
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
          StpaPackage.RESPONSIBILITY__INFORMATION, StpaPackage.PIECE_OF_INFORMATION__RESPONSIBILITIES);
    }
    return information;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ProcessModelVariable> getVariables() {
    if (variables == null) {
      variables = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModelVariable>(ProcessModelVariable.class,
          this, StpaPackage.RESPONSIBILITY__VARIABLES, StpaPackage.PROCESS_MODEL_VARIABLE__RESPONSIBILITIES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<ExchangeElement> getExchangeElements() {
    EList<ExchangeElement> result = new BasicEList<>();
    result.addAll(getControlActions());
    result.addAll(getFeedback());
    result.addAll(getInformation());
    return result;
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
    case StpaPackage.RESPONSIBILITY__CONTROLLER:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetController((ControlEntity) otherEnd, msgs);
    case StpaPackage.RESPONSIBILITY__SYSTEM_CONSTRAINTS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getSystemConstraints()).basicAdd(otherEnd, msgs);
    case StpaPackage.RESPONSIBILITY__CONTROL_ACTIONS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getControlActions()).basicAdd(otherEnd, msgs);
    case StpaPackage.RESPONSIBILITY__FEEDBACK:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getFeedback()).basicAdd(otherEnd, msgs);
    case StpaPackage.RESPONSIBILITY__INFORMATION:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getInformation()).basicAdd(otherEnd, msgs);
    case StpaPackage.RESPONSIBILITY__VARIABLES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables()).basicAdd(otherEnd, msgs);
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
    case StpaPackage.RESPONSIBILITY__CONTROLLER:
      return basicSetController(null, msgs);
    case StpaPackage.RESPONSIBILITY__SYSTEM_CONSTRAINTS:
      return ((InternalEList<?>) getSystemConstraints()).basicRemove(otherEnd, msgs);
    case StpaPackage.RESPONSIBILITY__CONTROL_ACTIONS:
      return ((InternalEList<?>) getControlActions()).basicRemove(otherEnd, msgs);
    case StpaPackage.RESPONSIBILITY__FEEDBACK:
      return ((InternalEList<?>) getFeedback()).basicRemove(otherEnd, msgs);
    case StpaPackage.RESPONSIBILITY__INFORMATION:
      return ((InternalEList<?>) getInformation()).basicRemove(otherEnd, msgs);
    case StpaPackage.RESPONSIBILITY__VARIABLES:
      return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.RESPONSIBILITY__CONTROLLER:
      return eInternalContainer().eInverseRemove(this, StpaPackage.CONTROL_ENTITY__RESPONSIBILITIES,
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
    case StpaPackage.RESPONSIBILITY__PROCESS_MODEL_STATE:
      return getProcessModelState();
    case StpaPackage.RESPONSIBILITY__CONTROLLER:
      if (resolve)
        return getController();
      return basicGetController();
    case StpaPackage.RESPONSIBILITY__SYSTEM_CONSTRAINTS:
      return getSystemConstraints();
    case StpaPackage.RESPONSIBILITY__CONTROL_ACTIONS:
      return getControlActions();
    case StpaPackage.RESPONSIBILITY__FEEDBACK:
      return getFeedback();
    case StpaPackage.RESPONSIBILITY__INFORMATION:
      return getInformation();
    case StpaPackage.RESPONSIBILITY__VARIABLES:
      return getVariables();
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
    case StpaPackage.RESPONSIBILITY__PROCESS_MODEL_STATE:
      setProcessModelState((String) newValue);
      return;
    case StpaPackage.RESPONSIBILITY__CONTROLLER:
      setController((ControlEntity) newValue);
      return;
    case StpaPackage.RESPONSIBILITY__SYSTEM_CONSTRAINTS:
      getSystemConstraints().clear();
      getSystemConstraints().addAll((Collection<? extends SystemConstraint>) newValue);
      return;
    case StpaPackage.RESPONSIBILITY__CONTROL_ACTIONS:
      getControlActions().clear();
      getControlActions().addAll((Collection<? extends ExchangeElement>) newValue);
      return;
    case StpaPackage.RESPONSIBILITY__FEEDBACK:
      getFeedback().clear();
      getFeedback().addAll((Collection<? extends FeedbackElement>) newValue);
      return;
    case StpaPackage.RESPONSIBILITY__INFORMATION:
      getInformation().clear();
      getInformation().addAll((Collection<? extends PieceOfInformation>) newValue);
      return;
    case StpaPackage.RESPONSIBILITY__VARIABLES:
      getVariables().clear();
      getVariables().addAll((Collection<? extends ProcessModelVariable>) newValue);
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
    case StpaPackage.RESPONSIBILITY__PROCESS_MODEL_STATE:
      setProcessModelState(PROCESS_MODEL_STATE_EDEFAULT);
      return;
    case StpaPackage.RESPONSIBILITY__CONTROLLER:
      setController((ControlEntity) null);
      return;
    case StpaPackage.RESPONSIBILITY__SYSTEM_CONSTRAINTS:
      getSystemConstraints().clear();
      return;
    case StpaPackage.RESPONSIBILITY__CONTROL_ACTIONS:
      getControlActions().clear();
      return;
    case StpaPackage.RESPONSIBILITY__FEEDBACK:
      getFeedback().clear();
      return;
    case StpaPackage.RESPONSIBILITY__INFORMATION:
      getInformation().clear();
      return;
    case StpaPackage.RESPONSIBILITY__VARIABLES:
      getVariables().clear();
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
    case StpaPackage.RESPONSIBILITY__PROCESS_MODEL_STATE:
      return PROCESS_MODEL_STATE_EDEFAULT == null ? processModelState != null
          : !PROCESS_MODEL_STATE_EDEFAULT.equals(processModelState);
    case StpaPackage.RESPONSIBILITY__CONTROLLER:
      return basicGetController() != null;
    case StpaPackage.RESPONSIBILITY__SYSTEM_CONSTRAINTS:
      return systemConstraints != null && !systemConstraints.isEmpty();
    case StpaPackage.RESPONSIBILITY__CONTROL_ACTIONS:
      return controlActions != null && !controlActions.isEmpty();
    case StpaPackage.RESPONSIBILITY__FEEDBACK:
      return feedback != null && !feedback.isEmpty();
    case StpaPackage.RESPONSIBILITY__INFORMATION:
      return information != null && !information.isEmpty();
    case StpaPackage.RESPONSIBILITY__VARIABLES:
      return variables != null && !variables.isEmpty();
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
    result.append(" (processModelState: "); //$NON-NLS-1$
    result.append(processModelState);
    result.append(')');
    return result.toString();
  }

} //ResponsibilityImpl
