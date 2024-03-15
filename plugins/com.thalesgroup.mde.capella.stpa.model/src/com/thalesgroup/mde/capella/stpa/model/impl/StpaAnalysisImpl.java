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

import com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage;
import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage;
import com.thalesgroup.mde.capella.stpa.model.LossPackage;
import com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysis;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.TechnicalPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl#getTechnicalPackage <em>Technical Package</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl#getLossPackage <em>Loss Package</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl#getHazardConstraintPackage <em>Hazard Constraint Package</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl#getControlStructurePackage <em>Control Structure Package</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl#getLossScenarioPackage <em>Loss Scenario Package</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl#getSystem <em>System</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl#getSubAnalyses <em>Sub Analyses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StpaAnalysisImpl extends StpaAnalysisElementImpl implements StpaAnalysis {
  /**
   * The cached value of the '{@link #getTechnicalPackage() <em>Technical Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTechnicalPackage()
   * @generated
   * @ordered
   */
  protected TechnicalPackage technicalPackage;

  /**
   * The cached value of the '{@link #getLossPackage() <em>Loss Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLossPackage()
   * @generated
   * @ordered
   */
  protected LossPackage lossPackage;

  /**
   * The cached value of the '{@link #getHazardConstraintPackage() <em>Hazard Constraint Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHazardConstraintPackage()
   * @generated
   * @ordered
   */
  protected HazardConstraintPackage hazardConstraintPackage;

  /**
   * The cached value of the '{@link #getControlStructurePackage() <em>Control Structure Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlStructurePackage()
   * @generated
   * @ordered
   */
  protected ControlStructurePackage controlStructurePackage;

  /**
   * The cached value of the '{@link #getLossScenarioPackage() <em>Loss Scenario Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLossScenarioPackage()
   * @generated
   * @ordered
   */
  protected LossScenarioPackage lossScenarioPackage;

  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected ControlEntity system;

  /**
   * The cached value of the '{@link #getSubAnalyses() <em>Sub Analyses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubAnalyses()
   * @generated
   * @ordered
   */
  protected EList<StpaAnalysis> subAnalyses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StpaAnalysisImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.STPA_ANALYSIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TechnicalPackage getTechnicalPackage() {
    if (technicalPackage != null && technicalPackage.eIsProxy()) {
      InternalEObject oldTechnicalPackage = (InternalEObject) technicalPackage;
      technicalPackage = (TechnicalPackage) eResolveProxy(oldTechnicalPackage);
      if (technicalPackage != oldTechnicalPackage) {
        InternalEObject newTechnicalPackage = (InternalEObject) technicalPackage;
        NotificationChain msgs = oldTechnicalPackage.eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE, null, null);
        if (newTechnicalPackage.eInternalContainer() == null) {
          msgs = newTechnicalPackage.eInverseAdd(this,
              EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE, null, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE,
              oldTechnicalPackage, technicalPackage));
      }
    }
    return technicalPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnicalPackage basicGetTechnicalPackage() {
    return technicalPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTechnicalPackage(TechnicalPackage newTechnicalPackage, NotificationChain msgs) {
    TechnicalPackage oldTechnicalPackage = technicalPackage;
    technicalPackage = newTechnicalPackage;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE, oldTechnicalPackage, newTechnicalPackage);
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
  public void setTechnicalPackage(TechnicalPackage newTechnicalPackage) {
    if (newTechnicalPackage != technicalPackage) {
      NotificationChain msgs = null;
      if (technicalPackage != null)
        msgs = ((InternalEObject) technicalPackage).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE, null, msgs);
      if (newTechnicalPackage != null)
        msgs = ((InternalEObject) newTechnicalPackage).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE, null, msgs);
      msgs = basicSetTechnicalPackage(newTechnicalPackage, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE,
          newTechnicalPackage, newTechnicalPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlEntity getSystem() {
    if (system != null && system.eIsProxy()) {
      InternalEObject oldSystem = (InternalEObject) system;
      system = (ControlEntity) eResolveProxy(oldSystem);
      if (system != oldSystem) {
        if (eNotificationRequired())
          eNotify(
              new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.STPA_ANALYSIS__SYSTEM, oldSystem, system));
      }
    }
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlEntity basicGetSystem() {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSystem(ControlEntity newSystem) {
    ControlEntity oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.STPA_ANALYSIS__SYSTEM, oldSystem, system));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StpaAnalysis> getSubAnalyses() {
    if (subAnalyses == null) {
      subAnalyses = new EObjectContainmentEList.Resolving<StpaAnalysis>(StpaAnalysis.class, this,
          StpaPackage.STPA_ANALYSIS__SUB_ANALYSES);
    }
    return subAnalyses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LossPackage getLossPackage() {
    if (lossPackage != null && lossPackage.eIsProxy()) {
      InternalEObject oldLossPackage = (InternalEObject) lossPackage;
      lossPackage = (LossPackage) eResolveProxy(oldLossPackage);
      if (lossPackage != oldLossPackage) {
        InternalEObject newLossPackage = (InternalEObject) lossPackage;
        NotificationChain msgs = oldLossPackage.eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE, null, null);
        if (newLossPackage.eInternalContainer() == null) {
          msgs = newLossPackage.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE,
              null, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE,
              oldLossPackage, lossPackage));
      }
    }
    return lossPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LossPackage basicGetLossPackage() {
    return lossPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLossPackage(LossPackage newLossPackage, NotificationChain msgs) {
    LossPackage oldLossPackage = lossPackage;
    lossPackage = newLossPackage;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE, oldLossPackage, newLossPackage);
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
  public void setLossPackage(LossPackage newLossPackage) {
    if (newLossPackage != lossPackage) {
      NotificationChain msgs = null;
      if (lossPackage != null)
        msgs = ((InternalEObject) lossPackage).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE, null, msgs);
      if (newLossPackage != null)
        msgs = ((InternalEObject) newLossPackage).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE, null, msgs);
      msgs = basicSetLossPackage(newLossPackage, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE, newLossPackage,
          newLossPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HazardConstraintPackage getHazardConstraintPackage() {
    if (hazardConstraintPackage != null && hazardConstraintPackage.eIsProxy()) {
      InternalEObject oldHazardConstraintPackage = (InternalEObject) hazardConstraintPackage;
      hazardConstraintPackage = (HazardConstraintPackage) eResolveProxy(oldHazardConstraintPackage);
      if (hazardConstraintPackage != oldHazardConstraintPackage) {
        InternalEObject newHazardConstraintPackage = (InternalEObject) hazardConstraintPackage;
        NotificationChain msgs = oldHazardConstraintPackage.eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE, null, null);
        if (newHazardConstraintPackage.eInternalContainer() == null) {
          msgs = newHazardConstraintPackage.eInverseAdd(this,
              EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE, null, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(
              new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE,
                  oldHazardConstraintPackage, hazardConstraintPackage));
      }
    }
    return hazardConstraintPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardConstraintPackage basicGetHazardConstraintPackage() {
    return hazardConstraintPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHazardConstraintPackage(HazardConstraintPackage newHazardConstraintPackage,
      NotificationChain msgs) {
    HazardConstraintPackage oldHazardConstraintPackage = hazardConstraintPackage;
    hazardConstraintPackage = newHazardConstraintPackage;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE, oldHazardConstraintPackage, newHazardConstraintPackage);
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
  public void setHazardConstraintPackage(HazardConstraintPackage newHazardConstraintPackage) {
    if (newHazardConstraintPackage != hazardConstraintPackage) {
      NotificationChain msgs = null;
      if (hazardConstraintPackage != null)
        msgs = ((InternalEObject) hazardConstraintPackage).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE, null, msgs);
      if (newHazardConstraintPackage != null)
        msgs = ((InternalEObject) newHazardConstraintPackage).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE, null, msgs);
      msgs = basicSetHazardConstraintPackage(newHazardConstraintPackage, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE,
          newHazardConstraintPackage, newHazardConstraintPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControlStructurePackage getControlStructurePackage() {
    if (controlStructurePackage != null && controlStructurePackage.eIsProxy()) {
      InternalEObject oldControlStructurePackage = (InternalEObject) controlStructurePackage;
      controlStructurePackage = (ControlStructurePackage) eResolveProxy(oldControlStructurePackage);
      if (controlStructurePackage != oldControlStructurePackage) {
        InternalEObject newControlStructurePackage = (InternalEObject) controlStructurePackage;
        NotificationChain msgs = oldControlStructurePackage.eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE, null, null);
        if (newControlStructurePackage.eInternalContainer() == null) {
          msgs = newControlStructurePackage.eInverseAdd(this,
              EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE, null, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(
              new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE,
                  oldControlStructurePackage, controlStructurePackage));
      }
    }
    return controlStructurePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlStructurePackage basicGetControlStructurePackage() {
    return controlStructurePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControlStructurePackage(ControlStructurePackage newControlStructurePackage,
      NotificationChain msgs) {
    ControlStructurePackage oldControlStructurePackage = controlStructurePackage;
    controlStructurePackage = newControlStructurePackage;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE, oldControlStructurePackage, newControlStructurePackage);
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
  public void setControlStructurePackage(ControlStructurePackage newControlStructurePackage) {
    if (newControlStructurePackage != controlStructurePackage) {
      NotificationChain msgs = null;
      if (controlStructurePackage != null)
        msgs = ((InternalEObject) controlStructurePackage).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE, null, msgs);
      if (newControlStructurePackage != null)
        msgs = ((InternalEObject) newControlStructurePackage).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE, null, msgs);
      msgs = basicSetControlStructurePackage(newControlStructurePackage, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE,
          newControlStructurePackage, newControlStructurePackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LossScenarioPackage getLossScenarioPackage() {
    if (lossScenarioPackage != null && lossScenarioPackage.eIsProxy()) {
      InternalEObject oldLossScenarioPackage = (InternalEObject) lossScenarioPackage;
      lossScenarioPackage = (LossScenarioPackage) eResolveProxy(oldLossScenarioPackage);
      if (lossScenarioPackage != oldLossScenarioPackage) {
        InternalEObject newLossScenarioPackage = (InternalEObject) lossScenarioPackage;
        NotificationChain msgs = oldLossScenarioPackage.eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE, null, null);
        if (newLossScenarioPackage.eInternalContainer() == null) {
          msgs = newLossScenarioPackage.eInverseAdd(this,
              EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE, null, msgs);
        }
        if (msgs != null)
          msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE,
              oldLossScenarioPackage, lossScenarioPackage));
      }
    }
    return lossScenarioPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LossScenarioPackage basicGetLossScenarioPackage() {
    return lossScenarioPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLossScenarioPackage(LossScenarioPackage newLossScenarioPackage,
      NotificationChain msgs) {
    LossScenarioPackage oldLossScenarioPackage = lossScenarioPackage;
    lossScenarioPackage = newLossScenarioPackage;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE, oldLossScenarioPackage, newLossScenarioPackage);
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
  public void setLossScenarioPackage(LossScenarioPackage newLossScenarioPackage) {
    if (newLossScenarioPackage != lossScenarioPackage) {
      NotificationChain msgs = null;
      if (lossScenarioPackage != null)
        msgs = ((InternalEObject) lossScenarioPackage).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE, null, msgs);
      if (newLossScenarioPackage != null)
        msgs = ((InternalEObject) newLossScenarioPackage).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE, null, msgs);
      msgs = basicSetLossScenarioPackage(newLossScenarioPackage, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE,
          newLossScenarioPackage, newLossScenarioPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE:
      return basicSetTechnicalPackage(null, msgs);
    case StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE:
      return basicSetLossPackage(null, msgs);
    case StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE:
      return basicSetHazardConstraintPackage(null, msgs);
    case StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE:
      return basicSetControlStructurePackage(null, msgs);
    case StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE:
      return basicSetLossScenarioPackage(null, msgs);
    case StpaPackage.STPA_ANALYSIS__SUB_ANALYSES:
      return ((InternalEList<?>) getSubAnalyses()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE:
      if (resolve)
        return getTechnicalPackage();
      return basicGetTechnicalPackage();
    case StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE:
      if (resolve)
        return getLossPackage();
      return basicGetLossPackage();
    case StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE:
      if (resolve)
        return getHazardConstraintPackage();
      return basicGetHazardConstraintPackage();
    case StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE:
      if (resolve)
        return getControlStructurePackage();
      return basicGetControlStructurePackage();
    case StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE:
      if (resolve)
        return getLossScenarioPackage();
      return basicGetLossScenarioPackage();
    case StpaPackage.STPA_ANALYSIS__SYSTEM:
      if (resolve)
        return getSystem();
      return basicGetSystem();
    case StpaPackage.STPA_ANALYSIS__SUB_ANALYSES:
      return getSubAnalyses();
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
    case StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE:
      setTechnicalPackage((TechnicalPackage) newValue);
      return;
    case StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE:
      setLossPackage((LossPackage) newValue);
      return;
    case StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE:
      setHazardConstraintPackage((HazardConstraintPackage) newValue);
      return;
    case StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE:
      setControlStructurePackage((ControlStructurePackage) newValue);
      return;
    case StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE:
      setLossScenarioPackage((LossScenarioPackage) newValue);
      return;
    case StpaPackage.STPA_ANALYSIS__SYSTEM:
      setSystem((ControlEntity) newValue);
      return;
    case StpaPackage.STPA_ANALYSIS__SUB_ANALYSES:
      getSubAnalyses().clear();
      getSubAnalyses().addAll((Collection<? extends StpaAnalysis>) newValue);
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
    case StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE:
      setTechnicalPackage((TechnicalPackage) null);
      return;
    case StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE:
      setLossPackage((LossPackage) null);
      return;
    case StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE:
      setHazardConstraintPackage((HazardConstraintPackage) null);
      return;
    case StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE:
      setControlStructurePackage((ControlStructurePackage) null);
      return;
    case StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE:
      setLossScenarioPackage((LossScenarioPackage) null);
      return;
    case StpaPackage.STPA_ANALYSIS__SYSTEM:
      setSystem((ControlEntity) null);
      return;
    case StpaPackage.STPA_ANALYSIS__SUB_ANALYSES:
      getSubAnalyses().clear();
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
    case StpaPackage.STPA_ANALYSIS__TECHNICAL_PACKAGE:
      return technicalPackage != null;
    case StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE:
      return lossPackage != null;
    case StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE:
      return hazardConstraintPackage != null;
    case StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE:
      return controlStructurePackage != null;
    case StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE:
      return lossScenarioPackage != null;
    case StpaPackage.STPA_ANALYSIS__SYSTEM:
      return system != null;
    case StpaPackage.STPA_ANALYSIS__SUB_ANALYSES:
      return subAnalyses != null && !subAnalyses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StpaAnalysisImpl
