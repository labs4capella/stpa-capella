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

import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard Constraint Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardConstraintPackageImpl#getRootHazards <em>Root Hazards</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardConstraintPackageImpl#getRootSystemConstraints <em>Root System Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardConstraintPackageImpl extends AnalysisPackageImpl implements HazardConstraintPackage {
  /**
   * The cached value of the '{@link #getRootHazards() <em>Root Hazards</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootHazards()
   * @generated
   * @ordered
   */
  protected EList<Hazard> rootHazards;

  /**
   * The cached value of the '{@link #getRootSystemConstraints() <em>Root System Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootSystemConstraints()
   * @generated
   * @ordered
   */
  protected EList<SystemConstraint> rootSystemConstraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HazardConstraintPackageImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.HAZARD_CONSTRAINT_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Hazard> getRootHazards() {
    if (rootHazards == null) {
      rootHazards = new EObjectContainmentEList.Resolving<Hazard>(Hazard.class, this,
          StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_HAZARDS);
    }
    return rootHazards;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SystemConstraint> getRootSystemConstraints() {
    if (rootSystemConstraints == null) {
      rootSystemConstraints = new EObjectContainmentEList.Resolving<SystemConstraint>(SystemConstraint.class, this,
          StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_SYSTEM_CONSTRAINTS);
    }
    return rootSystemConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_HAZARDS:
      return ((InternalEList<?>) getRootHazards()).basicRemove(otherEnd, msgs);
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_SYSTEM_CONSTRAINTS:
      return ((InternalEList<?>) getRootSystemConstraints()).basicRemove(otherEnd, msgs);
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
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_HAZARDS:
      return getRootHazards();
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_SYSTEM_CONSTRAINTS:
      return getRootSystemConstraints();
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
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_HAZARDS:
      getRootHazards().clear();
      getRootHazards().addAll((Collection<? extends Hazard>) newValue);
      return;
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_SYSTEM_CONSTRAINTS:
      getRootSystemConstraints().clear();
      getRootSystemConstraints().addAll((Collection<? extends SystemConstraint>) newValue);
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
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_HAZARDS:
      getRootHazards().clear();
      return;
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_SYSTEM_CONSTRAINTS:
      getRootSystemConstraints().clear();
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
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_HAZARDS:
      return rootHazards != null && !rootHazards.isEmpty();
    case StpaPackage.HAZARD_CONSTRAINT_PACKAGE__ROOT_SYSTEM_CONSTRAINTS:
      return rootSystemConstraints != null && !rootSystemConstraints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HazardConstraintPackageImpl
