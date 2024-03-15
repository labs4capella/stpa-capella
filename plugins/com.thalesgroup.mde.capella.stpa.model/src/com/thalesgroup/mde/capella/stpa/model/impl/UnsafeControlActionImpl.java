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
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawContext;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawSet;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unsafe Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl#getControlFlawSet <em>Control Flaw Set</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl#getControlAction <em>Control Action</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl#getLossScenarios <em>Loss Scenarios</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl#getViolatedConstraints <em>Violated Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnsafeControlActionImpl extends ControlFlawAnalysisElementImpl implements UnsafeControlAction {
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
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final UnsafeControlActionKind KIND_EDEFAULT = UnsafeControlActionKind.NOT_PROVIDING;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected UnsafeControlActionKind kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected static final String CONTEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected String context = CONTEXT_EDEFAULT;

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
  protected UnsafeControlActionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.UNSAFE_CONTROL_ACTION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET,
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
          StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET, oldControlFlawSet, newControlFlawSet);
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
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET,
          newControlFlawSet, newControlFlawSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExchangeElement getControlAction() {
    if (eContainerFeatureID() != StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION)
      return null;
    return (ExchangeElement) eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExchangeElement basicGetControlAction() {
    if (eContainerFeatureID() != StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION)
      return null;
    return (ExchangeElement) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControlAction(ExchangeElement newControlAction, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newControlAction, StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION,
        msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setControlAction(ExchangeElement newControlAction) {
    if (newControlAction != eInternalContainer()
        || (eContainerFeatureID() != StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION && newControlAction != null)) {
      if (EcoreUtil.isAncestor(this, newControlAction))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newControlAction != null)
        msgs = ((InternalEObject) newControlAction).eInverseAdd(this,
            StpaPackage.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS, ExchangeElement.class, msgs);
      msgs = basicSetControlAction(newControlAction, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION,
          newControlAction, newControlAction));
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
          StpaPackage.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS, StpaPackage.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION);
    }
    return lossScenarios;
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
          this, StpaPackage.UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS,
          StpaPackage.SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS);
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
          StpaPackage.UNSAFE_CONTROL_ACTION__HAZARDS, StpaPackage.HAZARD__UNSAFE_CONTROL_ACTIONS);
    }
    return hazards;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnsafeControlActionKind getKind() {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKind(UnsafeControlActionKind newKind) {
    UnsafeControlActionKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.UNSAFE_CONTROL_ACTION__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getContext() {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContext(String newContext) {
    String oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.UNSAFE_CONTROL_ACTION__CONTEXT, oldContext,
          context));
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
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET:
      if (controlFlawSet != null)
        msgs = ((InternalEObject) controlFlawSet).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET, null, msgs);
      return basicSetControlFlawSet((ControlFlawSet) otherEnd, msgs);
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetControlAction((ExchangeElement) otherEnd, msgs);
    case StpaPackage.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getLossScenarios()).basicAdd(otherEnd, msgs);
    case StpaPackage.UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getViolatedConstraints()).basicAdd(otherEnd, msgs);
    case StpaPackage.UNSAFE_CONTROL_ACTION__HAZARDS:
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
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET:
      return basicSetControlFlawSet(null, msgs);
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION:
      return basicSetControlAction(null, msgs);
    case StpaPackage.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS:
      return ((InternalEList<?>) getLossScenarios()).basicRemove(otherEnd, msgs);
    case StpaPackage.UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS:
      return ((InternalEList<?>) getViolatedConstraints()).basicRemove(otherEnd, msgs);
    case StpaPackage.UNSAFE_CONTROL_ACTION__HAZARDS:
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION:
      return eInternalContainer().eInverseRemove(this, StpaPackage.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS,
          ExchangeElement.class, msgs);
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
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET:
      if (resolve)
        return getControlFlawSet();
      return basicGetControlFlawSet();
    case StpaPackage.UNSAFE_CONTROL_ACTION__KIND:
      return getKind();
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTEXT:
      return getContext();
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION:
      if (resolve)
        return getControlAction();
      return basicGetControlAction();
    case StpaPackage.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS:
      return getLossScenarios();
    case StpaPackage.UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS:
      return getViolatedConstraints();
    case StpaPackage.UNSAFE_CONTROL_ACTION__HAZARDS:
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
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET:
      setControlFlawSet((ControlFlawSet) newValue);
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__KIND:
      setKind((UnsafeControlActionKind) newValue);
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTEXT:
      setContext((String) newValue);
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION:
      setControlAction((ExchangeElement) newValue);
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS:
      getLossScenarios().clear();
      getLossScenarios().addAll((Collection<? extends LossScenario>) newValue);
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS:
      getViolatedConstraints().clear();
      getViolatedConstraints().addAll((Collection<? extends SystemConstraint>) newValue);
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__HAZARDS:
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
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET:
      setControlFlawSet((ControlFlawSet) null);
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__KIND:
      setKind(KIND_EDEFAULT);
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTEXT:
      setContext(CONTEXT_EDEFAULT);
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION:
      setControlAction((ExchangeElement) null);
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS:
      getLossScenarios().clear();
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS:
      getViolatedConstraints().clear();
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__HAZARDS:
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
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET:
      return controlFlawSet != null;
    case StpaPackage.UNSAFE_CONTROL_ACTION__KIND:
      return kind != KIND_EDEFAULT;
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTEXT:
      return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_ACTION:
      return basicGetControlAction() != null;
    case StpaPackage.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS:
      return lossScenarios != null && !lossScenarios.isEmpty();
    case StpaPackage.UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS:
      return violatedConstraints != null && !violatedConstraints.isEmpty();
    case StpaPackage.UNSAFE_CONTROL_ACTION__HAZARDS:
      return hazards != null && !hazards.isEmpty();
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
      case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET:
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
        return StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET;
      default:
        return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (kind: "); //$NON-NLS-1$
    result.append(kind);
    result.append(", context: "); //$NON-NLS-1$
    result.append(context);
    result.append(')');
    return result.toString();
  }

  /**
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawAnalysisElementImpl#getCausalFactors()
   * @generated NOT
   */
  @Override
  public EList<ControlFlaw> getCausalFactors() {
    EList<ControlFlaw> result = new UniqueEList<>();
    ControlFlawSet set = getControlFlawSet();
    if (set != null) {
      for (ControlFlaw flaw : set.getControlFlaws()) {
        if (flaw.getVerdict() == ControlFlawVerdict.KO) {
          result.add(flaw);
        }
      }
    }
    return result;
  }

} //UnsafeControlActionImpl
