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
import com.thalesgroup.mde.capella.stpa.model.ControlFlawTarget;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.Responsibility;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl#getConditionToEnforce <em>Condition To Enforce</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl#getSubSystemConstraints <em>Sub System Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl#getHazards <em>Hazards</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl#getLossScenarios <em>Loss Scenarios</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl#getAssumptions <em>Assumptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemConstraintImpl extends DecomposableImpl<SystemConstraint> implements SystemConstraint {
  /**
   * The default value of the '{@link #getConditionToEnforce() <em>Condition To Enforce</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getConditionToEnforce()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_TO_ENFORCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConditionToEnforce() <em>Condition To Enforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionToEnforce()
   * @generated
   * @ordered
   */
  protected String conditionToEnforce = CONDITION_TO_ENFORCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubSystemConstraints() <em>Sub System Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubSystemConstraints()
   * @generated
   * @ordered
   */
  protected EList<SystemConstraint> subSystemConstraints;

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
   * The cached value of the '{@link #getResponsibilities() <em>Responsibilities</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsibilities()
   * @generated
   * @ordered
   */
  protected EList<Responsibility> responsibilities;

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
   * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssumptions()
   * @generated
   * @ordered
   */
  protected EList<Constraint> assumptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemConstraintImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.SYSTEM_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SystemConstraint> getSubSystemConstraints() {
    if (subSystemConstraints == null) {
      subSystemConstraints = new EObjectContainmentEList.Resolving<SystemConstraint>(SystemConstraint.class, this,
          StpaPackage.SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS);
    }
    return subSystemConstraints;
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
          StpaPackage.SYSTEM_CONSTRAINT__HAZARDS, StpaPackage.HAZARD__SYSTEM_CONSTRAINTS);
    }
    return hazards;
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
          StpaPackage.SYSTEM_CONSTRAINT__RESPONSIBILITIES, StpaPackage.RESPONSIBILITY__SYSTEM_CONSTRAINTS);
    }
    return responsibilities;
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
          UnsafeControlAction.class, this, StpaPackage.SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS,
          StpaPackage.UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS);
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
          StpaPackage.SYSTEM_CONSTRAINT__LOSS_SCENARIOS, StpaPackage.LOSS_SCENARIO__VIOLATED_CONSTRAINTS);
    }
    return lossScenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Constraint> getAssumptions() {
    if (assumptions == null) {
      assumptions = new EObjectResolvingEList<Constraint>(Constraint.class, this,
          StpaPackage.SYSTEM_CONSTRAINT__ASSUMPTIONS);
    }
    return assumptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getConditionToEnforce() {
    return conditionToEnforce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConditionToEnforce(String newConditionToEnforce) {
    String oldConditionToEnforce = conditionToEnforce;
    conditionToEnforce = newConditionToEnforce;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.SYSTEM_CONSTRAINT__CONDITION_TO_ENFORCE,
          oldConditionToEnforce, conditionToEnforce));
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
    case StpaPackage.SYSTEM_CONSTRAINT__HAZARDS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getHazards()).basicAdd(otherEnd, msgs);
    case StpaPackage.SYSTEM_CONSTRAINT__RESPONSIBILITIES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getResponsibilities()).basicAdd(otherEnd, msgs);
    case StpaPackage.SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getUnsafeControlActions()).basicAdd(otherEnd, msgs);
    case StpaPackage.SYSTEM_CONSTRAINT__LOSS_SCENARIOS:
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
    case StpaPackage.SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS:
      return ((InternalEList<?>) getSubSystemConstraints()).basicRemove(otherEnd, msgs);
    case StpaPackage.SYSTEM_CONSTRAINT__HAZARDS:
      return ((InternalEList<?>) getHazards()).basicRemove(otherEnd, msgs);
    case StpaPackage.SYSTEM_CONSTRAINT__RESPONSIBILITIES:
      return ((InternalEList<?>) getResponsibilities()).basicRemove(otherEnd, msgs);
    case StpaPackage.SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS:
      return ((InternalEList<?>) getUnsafeControlActions()).basicRemove(otherEnd, msgs);
    case StpaPackage.SYSTEM_CONSTRAINT__LOSS_SCENARIOS:
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
    case StpaPackage.SYSTEM_CONSTRAINT__CONDITION_TO_ENFORCE:
      return getConditionToEnforce();
    case StpaPackage.SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS:
      return getSubSystemConstraints();
    case StpaPackage.SYSTEM_CONSTRAINT__HAZARDS:
      return getHazards();
    case StpaPackage.SYSTEM_CONSTRAINT__RESPONSIBILITIES:
      return getResponsibilities();
    case StpaPackage.SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS:
      return getUnsafeControlActions();
    case StpaPackage.SYSTEM_CONSTRAINT__LOSS_SCENARIOS:
      return getLossScenarios();
    case StpaPackage.SYSTEM_CONSTRAINT__ASSUMPTIONS:
      return getAssumptions();
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
    case StpaPackage.SYSTEM_CONSTRAINT__CONDITION_TO_ENFORCE:
      setConditionToEnforce((String) newValue);
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS:
      getSubSystemConstraints().clear();
      getSubSystemConstraints().addAll((Collection<? extends SystemConstraint>) newValue);
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__HAZARDS:
      getHazards().clear();
      getHazards().addAll((Collection<? extends Hazard>) newValue);
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__RESPONSIBILITIES:
      getResponsibilities().clear();
      getResponsibilities().addAll((Collection<? extends Responsibility>) newValue);
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS:
      getUnsafeControlActions().clear();
      getUnsafeControlActions().addAll((Collection<? extends UnsafeControlAction>) newValue);
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__LOSS_SCENARIOS:
      getLossScenarios().clear();
      getLossScenarios().addAll((Collection<? extends LossScenario>) newValue);
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__ASSUMPTIONS:
      getAssumptions().clear();
      getAssumptions().addAll((Collection<? extends Constraint>) newValue);
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
    case StpaPackage.SYSTEM_CONSTRAINT__CONDITION_TO_ENFORCE:
      setConditionToEnforce(CONDITION_TO_ENFORCE_EDEFAULT);
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS:
      getSubSystemConstraints().clear();
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__HAZARDS:
      getHazards().clear();
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__RESPONSIBILITIES:
      getResponsibilities().clear();
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS:
      getUnsafeControlActions().clear();
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__LOSS_SCENARIOS:
      getLossScenarios().clear();
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__ASSUMPTIONS:
      getAssumptions().clear();
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
    case StpaPackage.SYSTEM_CONSTRAINT__CONDITION_TO_ENFORCE:
      return CONDITION_TO_ENFORCE_EDEFAULT == null ? conditionToEnforce != null
          : !CONDITION_TO_ENFORCE_EDEFAULT.equals(conditionToEnforce);
    case StpaPackage.SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS:
      return subSystemConstraints != null && !subSystemConstraints.isEmpty();
    case StpaPackage.SYSTEM_CONSTRAINT__HAZARDS:
      return hazards != null && !hazards.isEmpty();
    case StpaPackage.SYSTEM_CONSTRAINT__RESPONSIBILITIES:
      return responsibilities != null && !responsibilities.isEmpty();
    case StpaPackage.SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS:
      return unsafeControlActions != null && !unsafeControlActions.isEmpty();
    case StpaPackage.SYSTEM_CONSTRAINT__LOSS_SCENARIOS:
      return lossScenarios != null && !lossScenarios.isEmpty();
    case StpaPackage.SYSTEM_CONSTRAINT__ASSUMPTIONS:
      return assumptions != null && !assumptions.isEmpty();
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
    result.append(" (conditionToEnforce: "); //$NON-NLS-1$
    result.append(conditionToEnforce);
    result.append(')');
    return result.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<SystemConstraint> getDecomposition() {
    return getSubSystemConstraints();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public SystemConstraint getComposite() {
    return getComposite(SystemConstraint.class);
  }

} //SystemConstraintImpl
