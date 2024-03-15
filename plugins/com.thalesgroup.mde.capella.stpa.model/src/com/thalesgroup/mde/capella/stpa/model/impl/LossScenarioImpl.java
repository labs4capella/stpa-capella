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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loss Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioImpl#getControlAction <em>Control Action</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioImpl#getUnsafeControlAction <em>Unsafe Control Action</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioImpl#getCausalFactors <em>Causal Factors</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioImpl#getViolatedConstraints <em>Violated Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioImpl#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LossScenarioImpl extends ControlFlawAnalysisElementImpl implements LossScenario {
  /**
   * The cached value of the '{@link #getControlAction() <em>Control Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlAction()
   * @generated
   * @ordered
   */
  protected ExchangeElement controlAction;
  /**
   * The cached value of the '{@link #getUnsafeControlAction() <em>Unsafe Control Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsafeControlAction()
   * @generated
   * @ordered
   */
  protected UnsafeControlAction unsafeControlAction;
  /**
   * The cached value of the '{@link #getCausalFactors() <em>Causal Factors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCausalFactors()
   * @generated
   * @ordered
   */
  protected EList<ControlFlaw> causalFactors;
  /**
   * The cached value of the '{@link #getViolatedConstraints() <em>Violated Constraints</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViolatedConstraints()
   * @generated
   * @ordered
   */
  protected EList<SystemConstraint> violatedConstraints;
  /**
   * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHazards()
   * @generated
   * @ordered
   */
  protected EList<Hazard> hazards;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LossScenarioImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.LOSS_SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExchangeElement getControlAction() {
    if (controlAction != null && controlAction.eIsProxy()) {
      InternalEObject oldControlAction = (InternalEObject) controlAction;
      controlAction = (ExchangeElement) eResolveProxy(oldControlAction);
      if (controlAction != oldControlAction) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.LOSS_SCENARIO__CONTROL_ACTION,
              oldControlAction, controlAction));
      }
    }
    return controlAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExchangeElement basicGetControlAction() {
    return controlAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControlAction(ExchangeElement newControlAction, NotificationChain msgs) {
    ExchangeElement oldControlAction = controlAction;
    controlAction = newControlAction;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          StpaPackage.LOSS_SCENARIO__CONTROL_ACTION, oldControlAction, newControlAction);
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
   * @generated NOT
   */
  @Override
  public void setControlAction(ExchangeElement newControlAction) {
    if (newControlAction != controlAction) {
      NotificationChain msgs = null;
      if (controlAction != null)
        msgs = ((InternalEObject) controlAction).eInverseRemove(this, StpaPackage.EXCHANGE_ELEMENT__LOSS_SCENARIOS,
            ExchangeElement.class, msgs);
      if (newControlAction != null)
        msgs = ((InternalEObject) newControlAction).eInverseAdd(this, StpaPackage.EXCHANGE_ELEMENT__LOSS_SCENARIOS,
            ExchangeElement.class, msgs);
      msgs = basicSetControlAction(newControlAction, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.LOSS_SCENARIO__CONTROL_ACTION, newControlAction,
          newControlAction));
    }
    // Addition here
    if (getUnsafeControlAction() != null && getUnsafeControlAction().getControlAction() != newControlAction) {
      setUnsafeControlAction(null);
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnsafeControlAction getUnsafeControlAction() {
    if (unsafeControlAction != null && unsafeControlAction.eIsProxy()) {
      InternalEObject oldUnsafeControlAction = (InternalEObject) unsafeControlAction;
      unsafeControlAction = (UnsafeControlAction) eResolveProxy(oldUnsafeControlAction);
      if (unsafeControlAction != oldUnsafeControlAction) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION,
              oldUnsafeControlAction, unsafeControlAction));
      }
    }
    return unsafeControlAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnsafeControlAction basicGetUnsafeControlAction() {
    return unsafeControlAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnsafeControlAction(UnsafeControlAction newUnsafeControlAction,
      NotificationChain msgs) {
    UnsafeControlAction oldUnsafeControlAction = unsafeControlAction;
    unsafeControlAction = newUnsafeControlAction;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          StpaPackage.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION, oldUnsafeControlAction, newUnsafeControlAction);
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
   * @generated NOT
   */
  @Override
  public void setUnsafeControlAction(UnsafeControlAction newUnsafeControlAction) {
    if (newUnsafeControlAction != unsafeControlAction) {
      NotificationChain msgs = null;
      if (unsafeControlAction != null)
        msgs = ((InternalEObject) unsafeControlAction).eInverseRemove(this,
            StpaPackage.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS, UnsafeControlAction.class, msgs);
      if (newUnsafeControlAction != null)
        msgs = ((InternalEObject) newUnsafeControlAction).eInverseAdd(this,
            StpaPackage.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS, UnsafeControlAction.class, msgs);
      msgs = basicSetUnsafeControlAction(newUnsafeControlAction, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION,
          newUnsafeControlAction, newUnsafeControlAction));
    }
    // Addition here
    if (newUnsafeControlAction != null && getControlAction() != newUnsafeControlAction.getControlAction()) {
      setControlAction(newUnsafeControlAction.getControlAction());
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ControlFlaw> getCausalFactors() {
    if (causalFactors == null) {
      causalFactors = new EObjectWithInverseResolvingEList.ManyInverse<ControlFlaw>(ControlFlaw.class, this,
          StpaPackage.LOSS_SCENARIO__CAUSAL_FACTORS, StpaPackage.CONTROL_FLAW__LOSS_SCENARIOS);
    }
    return causalFactors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SystemConstraint> getViolatedConstraints() {
    if (violatedConstraints == null) {
      violatedConstraints = new EObjectWithInverseResolvingEList.ManyInverse<SystemConstraint>(SystemConstraint.class,
          this, StpaPackage.LOSS_SCENARIO__VIOLATED_CONSTRAINTS, StpaPackage.SYSTEM_CONSTRAINT__LOSS_SCENARIOS);
    }
    return violatedConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Hazard> getHazards() {
    if (hazards == null) {
      hazards = new EObjectWithInverseResolvingEList.ManyInverse<Hazard>(Hazard.class, this,
          StpaPackage.LOSS_SCENARIO__HAZARDS, StpaPackage.HAZARD__LOSS_SCENARIOS);
    }
    return hazards;
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
    case StpaPackage.LOSS_SCENARIO__CONTROL_ACTION:
      if (controlAction != null)
        msgs = ((InternalEObject) controlAction).eInverseRemove(this, StpaPackage.EXCHANGE_ELEMENT__LOSS_SCENARIOS,
            ExchangeElement.class, msgs);
      return basicSetControlAction((ExchangeElement) otherEnd, msgs);
    case StpaPackage.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION:
      if (unsafeControlAction != null)
        msgs = ((InternalEObject) unsafeControlAction).eInverseRemove(this,
            StpaPackage.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS, UnsafeControlAction.class, msgs);
      return basicSetUnsafeControlAction((UnsafeControlAction) otherEnd, msgs);
    case StpaPackage.LOSS_SCENARIO__CAUSAL_FACTORS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getCausalFactors()).basicAdd(otherEnd, msgs);
    case StpaPackage.LOSS_SCENARIO__VIOLATED_CONSTRAINTS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getViolatedConstraints()).basicAdd(otherEnd, msgs);
    case StpaPackage.LOSS_SCENARIO__HAZARDS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getHazards()).basicAdd(otherEnd, msgs);
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
    case StpaPackage.LOSS_SCENARIO__CONTROL_ACTION:
      return basicSetControlAction(null, msgs);
    case StpaPackage.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION:
      return basicSetUnsafeControlAction(null, msgs);
    case StpaPackage.LOSS_SCENARIO__CAUSAL_FACTORS:
      return ((InternalEList<?>) getCausalFactors()).basicRemove(otherEnd, msgs);
    case StpaPackage.LOSS_SCENARIO__VIOLATED_CONSTRAINTS:
      return ((InternalEList<?>) getViolatedConstraints()).basicRemove(otherEnd, msgs);
    case StpaPackage.LOSS_SCENARIO__HAZARDS:
      return ((InternalEList<?>) getHazards()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.LOSS_SCENARIO__CONTROL_ACTION:
      if (resolve)
        return getControlAction();
      return basicGetControlAction();
    case StpaPackage.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION:
      if (resolve)
        return getUnsafeControlAction();
      return basicGetUnsafeControlAction();
    case StpaPackage.LOSS_SCENARIO__CAUSAL_FACTORS:
      return getCausalFactors();
    case StpaPackage.LOSS_SCENARIO__VIOLATED_CONSTRAINTS:
      return getViolatedConstraints();
    case StpaPackage.LOSS_SCENARIO__HAZARDS:
      return getHazards();
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
    case StpaPackage.LOSS_SCENARIO__CONTROL_ACTION:
      setControlAction((ExchangeElement) newValue);
      return;
    case StpaPackage.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION:
      setUnsafeControlAction((UnsafeControlAction) newValue);
      return;
    case StpaPackage.LOSS_SCENARIO__CAUSAL_FACTORS:
      getCausalFactors().clear();
      getCausalFactors().addAll((Collection<? extends ControlFlaw>) newValue);
      return;
    case StpaPackage.LOSS_SCENARIO__VIOLATED_CONSTRAINTS:
      getViolatedConstraints().clear();
      getViolatedConstraints().addAll((Collection<? extends SystemConstraint>) newValue);
      return;
    case StpaPackage.LOSS_SCENARIO__HAZARDS:
      getHazards().clear();
      getHazards().addAll((Collection<? extends Hazard>) newValue);
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
    case StpaPackage.LOSS_SCENARIO__CONTROL_ACTION:
      setControlAction((ExchangeElement) null);
      return;
    case StpaPackage.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION:
      setUnsafeControlAction((UnsafeControlAction) null);
      return;
    case StpaPackage.LOSS_SCENARIO__CAUSAL_FACTORS:
      getCausalFactors().clear();
      return;
    case StpaPackage.LOSS_SCENARIO__VIOLATED_CONSTRAINTS:
      getViolatedConstraints().clear();
      return;
    case StpaPackage.LOSS_SCENARIO__HAZARDS:
      getHazards().clear();
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
    case StpaPackage.LOSS_SCENARIO__CONTROL_ACTION:
      return controlAction != null;
    case StpaPackage.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION:
      return unsafeControlAction != null;
    case StpaPackage.LOSS_SCENARIO__CAUSAL_FACTORS:
      return causalFactors != null && !causalFactors.isEmpty();
    case StpaPackage.LOSS_SCENARIO__VIOLATED_CONSTRAINTS:
      return violatedConstraints != null && !violatedConstraints.isEmpty();
    case StpaPackage.LOSS_SCENARIO__HAZARDS:
      return hazards != null && !hazards.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LossScenarioImpl
