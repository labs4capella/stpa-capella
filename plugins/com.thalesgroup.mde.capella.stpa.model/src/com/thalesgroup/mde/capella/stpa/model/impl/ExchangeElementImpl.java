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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable;
import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawContext;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawSet;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.FeedbackRelation;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable;
import com.thalesgroup.mde.capella.stpa.model.Relation;
import com.thalesgroup.mde.capella.stpa.model.Responsibility;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ExchangeElementImpl#getControlFlawSet <em>Control Flaw Set</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ExchangeElementImpl#getExercisedResponsibilities <em>Exercised Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ExchangeElementImpl#getLossScenarios <em>Loss Scenarios</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ExchangeElementImpl#getSupportingProcessModel <em>Supporting Process Model</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ExchangeElementImpl#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExchangeElementImpl extends UserIdentifiedElementImpl implements ExchangeElement {
  /**
   * The cached value of the '{@link #getControlFlawSet() <em>Control Flaw Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlFlawSet()
   * @generated
   * @ordered
   */
  protected ControlFlawSet controlFlawSet;

  /**
   * The cached value of the '{@link #getExercisedResponsibilities() <em>Exercised Responsibilities</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExercisedResponsibilities()
   * @generated
   * @ordered
   */
  protected EList<Responsibility> exercisedResponsibilities;

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
   * The cached value of the '{@link #getSupportingProcessModel() <em>Supporting Process Model</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupportingProcessModel()
   * @generated
   * @ordered
   */
  protected EList<ProcessModelVariable> supportingProcessModel;

  /**
   * The cached value of the '{@link #getUnsafeControlActions() <em>Unsafe Control Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnsafeControlActions()
   * @generated
   * @ordered
   */
  protected EList<UnsafeControlAction> unsafeControlActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExchangeElementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.EXCHANGE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UnsafeControlAction> getUnsafeControlActions() {
    if (unsafeControlActions == null) {
      unsafeControlActions = new EObjectContainmentWithInverseEList.Resolving<UnsafeControlAction>(
          UnsafeControlAction.class, this, StpaPackage.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS,
          StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION);
    }
    return unsafeControlActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlFlawSet getControlFlawSet() {
    if (controlFlawSet != null && controlFlawSet.eIsProxy()) {
      InternalEObject oldControlFlawSet = (InternalEObject) controlFlawSet;
      controlFlawSet = (ControlFlawSet) eResolveProxy(oldControlFlawSet);
      if (controlFlawSet != oldControlFlawSet) {
        InternalEObject newControlFlawSet = (InternalEObject) controlFlawSet;
        NotificationChain msgs = oldControlFlawSet.eInverseRemove(this, StpaPackage.CONTROL_FLAW_SET__CONTEXT,
            ControlFlawSet.class, null);
        if (newControlFlawSet.eInternalContainer() == null) {
          msgs = newControlFlawSet.eInverseAdd(this, StpaPackage.CONTROL_FLAW_SET__CONTEXT, ControlFlawSet.class, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET,
              oldControlFlawSet, controlFlawSet));
      }
    }
    return controlFlawSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFlawSet basicGetControlFlawSet() {
    return controlFlawSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControlFlawSet(ControlFlawSet newControlFlawSet, NotificationChain msgs) {
    ControlFlawSet oldControlFlawSet = controlFlawSet;
    controlFlawSet = newControlFlawSet;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET, oldControlFlawSet, newControlFlawSet);
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
   * @generated
   */
  @Override
  public void setControlFlawSet(ControlFlawSet newControlFlawSet) {
    if (newControlFlawSet != controlFlawSet) {
      NotificationChain msgs = null;
      if (controlFlawSet != null)
        msgs = ((InternalEObject) controlFlawSet).eInverseRemove(this, StpaPackage.CONTROL_FLAW_SET__CONTEXT,
            ControlFlawSet.class, msgs);
      if (newControlFlawSet != null)
        msgs = ((InternalEObject) newControlFlawSet).eInverseAdd(this, StpaPackage.CONTROL_FLAW_SET__CONTEXT,
            ControlFlawSet.class, msgs);
      msgs = basicSetControlFlawSet(newControlFlawSet, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET,
          newControlFlawSet, newControlFlawSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Responsibility> getExercisedResponsibilities() {
    if (exercisedResponsibilities == null) {
      exercisedResponsibilities = new EObjectWithInverseResolvingEList.ManyInverse<Responsibility>(Responsibility.class,
          this, StpaPackage.EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES, StpaPackage.RESPONSIBILITY__CONTROL_ACTIONS);
    }
    return exercisedResponsibilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LossScenario> getLossScenarios() {
    if (lossScenarios == null) {
      lossScenarios = new EObjectWithInverseResolvingEList<LossScenario>(LossScenario.class, this,
          StpaPackage.EXCHANGE_ELEMENT__LOSS_SCENARIOS, StpaPackage.LOSS_SCENARIO__CONTROL_ACTION);
    }
    return lossScenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ProcessModelVariable> getSupportingProcessModel() {
    if (supportingProcessModel == null) {
      supportingProcessModel = new EObjectWithInverseResolvingEList.ManyInverse<ProcessModelVariable>(
          ProcessModelVariable.class, this, StpaPackage.EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL,
          StpaPackage.PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS);
    }
    return supportingProcessModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract Relation getRelation();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<ControlFlaw> getControlFlaws() {
    EList<ControlFlaw> result;
    ControlFlawSet flawSet = getControlFlawSet();
    if (flawSet != null) {
      result = ECollections.unmodifiableEList(flawSet.getControlFlaws());
    } else {
      result = ECollections.emptyEList();
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public ControlEntity getController() {
    ControlEntity result = null;
    Relation relation = getRelation();
    if (relation != null) {
      if (relation instanceof FeedbackRelation) {
        result = relation.getTarget();
      } else {
        result = relation.getSource();
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public ControlEntity getProcess() {
    ControlEntity result = null;
    Relation relation = getRelation();
    if (relation != null) {
      if (relation instanceof FeedbackRelation) {
        result = relation.getSource();
      } else {
        result = relation.getTarget();
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public ExchangeElement getControlAction() {
    return this;
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
    case StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET:
      if (controlFlawSet != null)
        msgs = ((InternalEObject) controlFlawSet).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET, null, msgs);
      return basicSetControlFlawSet((ControlFlawSet) otherEnd, msgs);
    case StpaPackage.EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getExercisedResponsibilities()).basicAdd(otherEnd,
          msgs);
    case StpaPackage.EXCHANGE_ELEMENT__LOSS_SCENARIOS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getLossScenarios()).basicAdd(otherEnd, msgs);
    case StpaPackage.EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getSupportingProcessModel()).basicAdd(otherEnd, msgs);
    case StpaPackage.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getUnsafeControlActions()).basicAdd(otherEnd, msgs);
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
    case StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET:
      return basicSetControlFlawSet(null, msgs);
    case StpaPackage.EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES:
      return ((InternalEList<?>) getExercisedResponsibilities()).basicRemove(otherEnd, msgs);
    case StpaPackage.EXCHANGE_ELEMENT__LOSS_SCENARIOS:
      return ((InternalEList<?>) getLossScenarios()).basicRemove(otherEnd, msgs);
    case StpaPackage.EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL:
      return ((InternalEList<?>) getSupportingProcessModel()).basicRemove(otherEnd, msgs);
    case StpaPackage.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS:
      return ((InternalEList<?>) getUnsafeControlActions()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET:
      if (resolve)
        return getControlFlawSet();
      return basicGetControlFlawSet();
    case StpaPackage.EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES:
      return getExercisedResponsibilities();
    case StpaPackage.EXCHANGE_ELEMENT__LOSS_SCENARIOS:
      return getLossScenarios();
    case StpaPackage.EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL:
      return getSupportingProcessModel();
    case StpaPackage.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS:
      return getUnsafeControlActions();
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
    case StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET:
      setControlFlawSet((ControlFlawSet) newValue);
      return;
    case StpaPackage.EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES:
      getExercisedResponsibilities().clear();
      getExercisedResponsibilities().addAll((Collection<? extends Responsibility>) newValue);
      return;
    case StpaPackage.EXCHANGE_ELEMENT__LOSS_SCENARIOS:
      getLossScenarios().clear();
      getLossScenarios().addAll((Collection<? extends LossScenario>) newValue);
      return;
    case StpaPackage.EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL:
      getSupportingProcessModel().clear();
      getSupportingProcessModel().addAll((Collection<? extends ProcessModelVariable>) newValue);
      return;
    case StpaPackage.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS:
      getUnsafeControlActions().clear();
      getUnsafeControlActions().addAll((Collection<? extends UnsafeControlAction>) newValue);
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
    case StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET:
      setControlFlawSet((ControlFlawSet) null);
      return;
    case StpaPackage.EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES:
      getExercisedResponsibilities().clear();
      return;
    case StpaPackage.EXCHANGE_ELEMENT__LOSS_SCENARIOS:
      getLossScenarios().clear();
      return;
    case StpaPackage.EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL:
      getSupportingProcessModel().clear();
      return;
    case StpaPackage.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS:
      getUnsafeControlActions().clear();
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
    case StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET:
      return controlFlawSet != null;
    case StpaPackage.EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES:
      return exercisedResponsibilities != null && !exercisedResponsibilities.isEmpty();
    case StpaPackage.EXCHANGE_ELEMENT__LOSS_SCENARIOS:
      return lossScenarios != null && !lossScenarios.isEmpty();
    case StpaPackage.EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL:
      return supportingProcessModel != null && !supportingProcessModel.isEmpty();
    case StpaPackage.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS:
      return unsafeControlActions != null && !unsafeControlActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == ControlFlawContext.class) {
      switch (derivedFeatureID) {
      case StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET:
        return StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET;
      default:
        return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == ControlFlawContext.class) {
      switch (baseFeatureID) {
      case StpaPackage.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET:
        return StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET;
      default:
        return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ExchangeElementImpl
