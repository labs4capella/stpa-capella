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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.Loss;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardImpl#getUnsafeCondition <em>Unsafe Condition</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardImpl#getSubHazards <em>Sub Hazards</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardImpl#getLosses <em>Losses</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardImpl#getSystemConstraints <em>System Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardImpl#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardImpl#getLossScenarios <em>Loss Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardImpl extends DecomposableImpl<Hazard> implements Hazard {
  /**
   * The default value of the '{@link #getUnsafeCondition() <em>Unsafe Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsafeCondition()
   * @generated
   * @ordered
   */
  protected static final String UNSAFE_CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnsafeCondition() <em>Unsafe Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsafeCondition()
   * @generated
   * @ordered
   */
  protected String unsafeCondition = UNSAFE_CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubHazards() <em>Sub Hazards</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubHazards()
   * @generated
   * @ordered
   */
  protected EList<Hazard> subHazards;

  /**
   * The cached value of the '{@link #getLosses() <em>Losses</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLosses()
   * @generated
   * @ordered
   */
  protected EList<Loss> losses;

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
   * The cached value of the '{@link #getUnsafeControlActions() <em>Unsafe Control Actions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsafeControlActions()
   * @generated
   * @ordered
   */
  protected EList<UnsafeControlAction> unsafeControlActions;

  /**
   * The cached value of the '{@link #getLossScenarios() <em>Loss Scenarios</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLossScenarios()
   * @generated
   * @ordered
   */
  protected EList<LossScenario> lossScenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HazardImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.HAZARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Hazard> getSubHazards() {
    if (subHazards == null) {
      subHazards = new EObjectContainmentEList.Resolving<Hazard>(Hazard.class, this, StpaPackage.HAZARD__SUB_HAZARDS);
    }
    return subHazards;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Loss> getLosses() {
    if (losses == null) {
      losses = new EObjectWithInverseResolvingEList.ManyInverse<Loss>(Loss.class, this, StpaPackage.HAZARD__LOSSES,
          StpaPackage.LOSS__HAZARDS);
    }
    return losses;
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
          this, StpaPackage.HAZARD__SYSTEM_CONSTRAINTS, StpaPackage.SYSTEM_CONSTRAINT__HAZARDS);
    }
    return systemConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UnsafeControlAction> getUnsafeControlActions() {
    if (unsafeControlActions == null) {
      unsafeControlActions = new EObjectWithInverseResolvingEList.ManyInverse<UnsafeControlAction>(
          UnsafeControlAction.class, this, StpaPackage.HAZARD__UNSAFE_CONTROL_ACTIONS,
          StpaPackage.UNSAFE_CONTROL_ACTION__HAZARDS);
    }
    return unsafeControlActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LossScenario> getLossScenarios() {
    if (lossScenarios == null) {
      lossScenarios = new EObjectWithInverseResolvingEList.ManyInverse<LossScenario>(LossScenario.class, this,
          StpaPackage.HAZARD__LOSS_SCENARIOS, StpaPackage.LOSS_SCENARIO__HAZARDS);
    }
    return lossScenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUnsafeCondition() {
    return unsafeCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnsafeCondition(String newUnsafeCondition) {
    String oldUnsafeCondition = unsafeCondition;
    unsafeCondition = newUnsafeCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.HAZARD__UNSAFE_CONDITION, oldUnsafeCondition,
          unsafeCondition));
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
    case StpaPackage.HAZARD__LOSSES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getLosses()).basicAdd(otherEnd, msgs);
    case StpaPackage.HAZARD__SYSTEM_CONSTRAINTS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getSystemConstraints()).basicAdd(otherEnd, msgs);
    case StpaPackage.HAZARD__UNSAFE_CONTROL_ACTIONS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getUnsafeControlActions()).basicAdd(otherEnd, msgs);
    case StpaPackage.HAZARD__LOSS_SCENARIOS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getLossScenarios()).basicAdd(otherEnd, msgs);
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
    case StpaPackage.HAZARD__SUB_HAZARDS:
      return ((InternalEList<?>) getSubHazards()).basicRemove(otherEnd, msgs);
    case StpaPackage.HAZARD__LOSSES:
      return ((InternalEList<?>) getLosses()).basicRemove(otherEnd, msgs);
    case StpaPackage.HAZARD__SYSTEM_CONSTRAINTS:
      return ((InternalEList<?>) getSystemConstraints()).basicRemove(otherEnd, msgs);
    case StpaPackage.HAZARD__UNSAFE_CONTROL_ACTIONS:
      return ((InternalEList<?>) getUnsafeControlActions()).basicRemove(otherEnd, msgs);
    case StpaPackage.HAZARD__LOSS_SCENARIOS:
      return ((InternalEList<?>) getLossScenarios()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.HAZARD__UNSAFE_CONDITION:
      return getUnsafeCondition();
    case StpaPackage.HAZARD__SUB_HAZARDS:
      return getSubHazards();
    case StpaPackage.HAZARD__LOSSES:
      return getLosses();
    case StpaPackage.HAZARD__SYSTEM_CONSTRAINTS:
      return getSystemConstraints();
    case StpaPackage.HAZARD__UNSAFE_CONTROL_ACTIONS:
      return getUnsafeControlActions();
    case StpaPackage.HAZARD__LOSS_SCENARIOS:
      return getLossScenarios();
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
    case StpaPackage.HAZARD__UNSAFE_CONDITION:
      setUnsafeCondition((String) newValue);
      return;
    case StpaPackage.HAZARD__SUB_HAZARDS:
      getSubHazards().clear();
      getSubHazards().addAll((Collection<? extends Hazard>) newValue);
      return;
    case StpaPackage.HAZARD__LOSSES:
      getLosses().clear();
      getLosses().addAll((Collection<? extends Loss>) newValue);
      return;
    case StpaPackage.HAZARD__SYSTEM_CONSTRAINTS:
      getSystemConstraints().clear();
      getSystemConstraints().addAll((Collection<? extends SystemConstraint>) newValue);
      return;
    case StpaPackage.HAZARD__UNSAFE_CONTROL_ACTIONS:
      getUnsafeControlActions().clear();
      getUnsafeControlActions().addAll((Collection<? extends UnsafeControlAction>) newValue);
      return;
    case StpaPackage.HAZARD__LOSS_SCENARIOS:
      getLossScenarios().clear();
      getLossScenarios().addAll((Collection<? extends LossScenario>) newValue);
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
    case StpaPackage.HAZARD__UNSAFE_CONDITION:
      setUnsafeCondition(UNSAFE_CONDITION_EDEFAULT);
      return;
    case StpaPackage.HAZARD__SUB_HAZARDS:
      getSubHazards().clear();
      return;
    case StpaPackage.HAZARD__LOSSES:
      getLosses().clear();
      return;
    case StpaPackage.HAZARD__SYSTEM_CONSTRAINTS:
      getSystemConstraints().clear();
      return;
    case StpaPackage.HAZARD__UNSAFE_CONTROL_ACTIONS:
      getUnsafeControlActions().clear();
      return;
    case StpaPackage.HAZARD__LOSS_SCENARIOS:
      getLossScenarios().clear();
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
    case StpaPackage.HAZARD__UNSAFE_CONDITION:
      return UNSAFE_CONDITION_EDEFAULT == null ? unsafeCondition != null
          : !UNSAFE_CONDITION_EDEFAULT.equals(unsafeCondition);
    case StpaPackage.HAZARD__SUB_HAZARDS:
      return subHazards != null && !subHazards.isEmpty();
    case StpaPackage.HAZARD__LOSSES:
      return losses != null && !losses.isEmpty();
    case StpaPackage.HAZARD__SYSTEM_CONSTRAINTS:
      return systemConstraints != null && !systemConstraints.isEmpty();
    case StpaPackage.HAZARD__UNSAFE_CONTROL_ACTIONS:
      return unsafeControlActions != null && !unsafeControlActions.isEmpty();
    case StpaPackage.HAZARD__LOSS_SCENARIOS:
      return lossScenarios != null && !lossScenarios.isEmpty();
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
    result.append(" (unsafeCondition: "); //$NON-NLS-1$
    result.append(unsafeCondition);
    result.append(')');
    return result.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public Hazard getComposite() {
    return getComposite(Hazard.class);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<Hazard> getDecomposition() {
    return getSubHazards();
  }

} //HazardImpl
