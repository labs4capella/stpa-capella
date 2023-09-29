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
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.capella.core.data.capellacore.Constraint;

import org.polarsys.capella.core.data.capellacore.NamedElement;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawContext;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawKind;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawSet;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.Mitigable;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flaw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl#getArchitectureElements <em>Architecture Elements</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl#getCountermeasures <em>Countermeasures</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl#getOwningSet <em>Owning Set</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl#getLossScenarios <em>Loss Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFlawImpl extends StpaAnalysisElementImpl implements ControlFlaw {
  /**
   * The cached value of the '{@link #getArchitectureElements() <em>Architecture Elements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchitectureElements()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> architectureElements;

  /**
   * The cached value of the '{@link #getCountermeasures() <em>Countermeasures</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountermeasures()
   * @generated
   * @ordered
   */
  protected EList<Constraint> countermeasures;

  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final ControlFlawKind KIND_EDEFAULT = ControlFlawKind.CONTROL_INPUT;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected ControlFlawKind kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getVerdict() <em>Verdict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerdict()
   * @generated
   * @ordered
   */
  protected static final ControlFlawVerdict VERDICT_EDEFAULT = ControlFlawVerdict.UNDEFINED;

  /**
   * The cached value of the '{@link #getVerdict() <em>Verdict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerdict()
   * @generated
   * @ordered
   */
  protected ControlFlawVerdict verdict = VERDICT_EDEFAULT;

  /**
   * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJustification()
   * @generated
   * @ordered
   */
  protected static final String JUSTIFICATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJustification() <em>Justification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJustification()
   * @generated
   * @ordered
   */
  protected String justification = JUSTIFICATION_EDEFAULT;

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
  protected ControlFlawImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.CONTROL_FLAW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedElement> getArchitectureElements() {
    if (architectureElements == null) {
      architectureElements = new EObjectResolvingEList<NamedElement>(NamedElement.class, this,
          StpaPackage.CONTROL_FLAW__ARCHITECTURE_ELEMENTS);
    }
    return architectureElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlFlawKind getKind() {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKind(ControlFlawKind newKind) {
    ControlFlawKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.CONTROL_FLAW__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlFlawVerdict getVerdict() {
    return verdict;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVerdict(ControlFlawVerdict newVerdict) {
    ControlFlawVerdict oldVerdict = verdict;
    verdict = newVerdict == null ? VERDICT_EDEFAULT : newVerdict;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.CONTROL_FLAW__VERDICT, oldVerdict, verdict));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlFlawSet getOwningSet() {
    if (eContainerFeatureID() != StpaPackage.CONTROL_FLAW__OWNING_SET)
      return null;
    return (ControlFlawSet) eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFlawSet basicGetOwningSet() {
    if (eContainerFeatureID() != StpaPackage.CONTROL_FLAW__OWNING_SET)
      return null;
    return (ControlFlawSet) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningSet(ControlFlawSet newOwningSet, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newOwningSet, StpaPackage.CONTROL_FLAW__OWNING_SET, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOwningSet(ControlFlawSet newOwningSet) {
    if (newOwningSet != eInternalContainer()
        || (eContainerFeatureID() != StpaPackage.CONTROL_FLAW__OWNING_SET && newOwningSet != null)) {
      if (EcoreUtil.isAncestor(this, newOwningSet))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwningSet != null)
        msgs = ((InternalEObject) newOwningSet).eInverseAdd(this, StpaPackage.CONTROL_FLAW_SET__CONTROL_FLAWS,
            ControlFlawSet.class, msgs);
      msgs = basicSetOwningSet(newOwningSet, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.CONTROL_FLAW__OWNING_SET, newOwningSet,
          newOwningSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getJustification() {
    return justification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJustification(String newJustification) {
    String oldJustification = justification;
    justification = newJustification;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.CONTROL_FLAW__JUSTIFICATION, oldJustification,
          justification));
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
          StpaPackage.CONTROL_FLAW__LOSS_SCENARIOS, StpaPackage.LOSS_SCENARIO__CAUSAL_FACTORS);
    }
    return lossScenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public ControlFlawContext getContext() {
    ControlFlawContext result = null;
    ControlFlawSet set = getOwningSet();
    if (set != null) {
      result = set.getContext();
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
    return getContext().getControlAction();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Constraint> getCountermeasures() {
    if (countermeasures == null) {
      countermeasures = new EObjectResolvingEList<Constraint>(Constraint.class, this,
          StpaPackage.CONTROL_FLAW__COUNTERMEASURES);
    }
    return countermeasures;
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
    case StpaPackage.CONTROL_FLAW__OWNING_SET:
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      return basicSetOwningSet((ControlFlawSet) otherEnd, msgs);
    case StpaPackage.CONTROL_FLAW__LOSS_SCENARIOS:
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
    case StpaPackage.CONTROL_FLAW__OWNING_SET:
      return basicSetOwningSet(null, msgs);
    case StpaPackage.CONTROL_FLAW__LOSS_SCENARIOS:
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
    case StpaPackage.CONTROL_FLAW__OWNING_SET:
      return eInternalContainer().eInverseRemove(this, StpaPackage.CONTROL_FLAW_SET__CONTROL_FLAWS,
          ControlFlawSet.class, msgs);
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
    case StpaPackage.CONTROL_FLAW__ARCHITECTURE_ELEMENTS:
      return getArchitectureElements();
    case StpaPackage.CONTROL_FLAW__COUNTERMEASURES:
      return getCountermeasures();
    case StpaPackage.CONTROL_FLAW__KIND:
      return getKind();
    case StpaPackage.CONTROL_FLAW__VERDICT:
      return getVerdict();
    case StpaPackage.CONTROL_FLAW__OWNING_SET:
      if (resolve)
        return getOwningSet();
      return basicGetOwningSet();
    case StpaPackage.CONTROL_FLAW__JUSTIFICATION:
      return getJustification();
    case StpaPackage.CONTROL_FLAW__LOSS_SCENARIOS:
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
    case StpaPackage.CONTROL_FLAW__ARCHITECTURE_ELEMENTS:
      getArchitectureElements().clear();
      getArchitectureElements().addAll((Collection<? extends NamedElement>) newValue);
      return;
    case StpaPackage.CONTROL_FLAW__COUNTERMEASURES:
      getCountermeasures().clear();
      getCountermeasures().addAll((Collection<? extends Constraint>) newValue);
      return;
    case StpaPackage.CONTROL_FLAW__KIND:
      setKind((ControlFlawKind) newValue);
      return;
    case StpaPackage.CONTROL_FLAW__VERDICT:
      setVerdict((ControlFlawVerdict) newValue);
      return;
    case StpaPackage.CONTROL_FLAW__OWNING_SET:
      setOwningSet((ControlFlawSet) newValue);
      return;
    case StpaPackage.CONTROL_FLAW__JUSTIFICATION:
      setJustification((String) newValue);
      return;
    case StpaPackage.CONTROL_FLAW__LOSS_SCENARIOS:
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
    case StpaPackage.CONTROL_FLAW__ARCHITECTURE_ELEMENTS:
      getArchitectureElements().clear();
      return;
    case StpaPackage.CONTROL_FLAW__COUNTERMEASURES:
      getCountermeasures().clear();
      return;
    case StpaPackage.CONTROL_FLAW__KIND:
      setKind(KIND_EDEFAULT);
      return;
    case StpaPackage.CONTROL_FLAW__VERDICT:
      setVerdict(VERDICT_EDEFAULT);
      return;
    case StpaPackage.CONTROL_FLAW__OWNING_SET:
      setOwningSet((ControlFlawSet) null);
      return;
    case StpaPackage.CONTROL_FLAW__JUSTIFICATION:
      setJustification(JUSTIFICATION_EDEFAULT);
      return;
    case StpaPackage.CONTROL_FLAW__LOSS_SCENARIOS:
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
    case StpaPackage.CONTROL_FLAW__ARCHITECTURE_ELEMENTS:
      return architectureElements != null && !architectureElements.isEmpty();
    case StpaPackage.CONTROL_FLAW__COUNTERMEASURES:
      return countermeasures != null && !countermeasures.isEmpty();
    case StpaPackage.CONTROL_FLAW__KIND:
      return kind != KIND_EDEFAULT;
    case StpaPackage.CONTROL_FLAW__VERDICT:
      return verdict != VERDICT_EDEFAULT;
    case StpaPackage.CONTROL_FLAW__OWNING_SET:
      return basicGetOwningSet() != null;
    case StpaPackage.CONTROL_FLAW__JUSTIFICATION:
      return JUSTIFICATION_EDEFAULT == null ? justification != null : !JUSTIFICATION_EDEFAULT.equals(justification);
    case StpaPackage.CONTROL_FLAW__LOSS_SCENARIOS:
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
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == ArchitectureMappable.class) {
      switch (derivedFeatureID) {
      case StpaPackage.CONTROL_FLAW__ARCHITECTURE_ELEMENTS:
        return StpaPackage.ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS;
      default:
        return -1;
      }
    }
    if (baseClass == Mitigable.class) {
      switch (derivedFeatureID) {
      case StpaPackage.CONTROL_FLAW__COUNTERMEASURES:
        return StpaPackage.MITIGABLE__COUNTERMEASURES;
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
    if (baseClass == ArchitectureMappable.class) {
      switch (baseFeatureID) {
      case StpaPackage.ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS:
        return StpaPackage.CONTROL_FLAW__ARCHITECTURE_ELEMENTS;
      default:
        return -1;
      }
    }
    if (baseClass == Mitigable.class) {
      switch (baseFeatureID) {
      case StpaPackage.MITIGABLE__COUNTERMEASURES:
        return StpaPackage.CONTROL_FLAW__COUNTERMEASURES;
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
    result.append(", verdict: "); //$NON-NLS-1$
    result.append(verdict);
    result.append(", justification: "); //$NON-NLS-1$
    result.append(justification);
    result.append(')');
    return result.toString();
  }

} //ControlFlawImpl
