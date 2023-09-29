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
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.thalesgroup.mde.capella.stpa.model.Decomposable;
import com.thalesgroup.mde.capella.stpa.model.DecompositionCategory;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.DecomposableImpl#getDecompositionCategories <em>Decomposition Categories</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.DecomposableImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DecomposableImpl<T extends Decomposable<T>> extends UserIdentifiedElementImpl
    implements Decomposable<T> {
  /**
   * The cached value of the '{@link #getDecompositionCategories() <em>Decomposition Categories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecompositionCategories()
   * @generated
   * @ordered
   */
  protected EList<DecompositionCategory<T>> decompositionCategories;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected DecompositionCategory<T> category;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecomposableImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.DECOMPOSABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DecompositionCategory<T>> getDecompositionCategories() {
    if (decompositionCategories == null) {
      decompositionCategories = new EObjectContainmentEList.Resolving<DecompositionCategory<T>>(
          DecompositionCategory.class, this, StpaPackage.DECOMPOSABLE__DECOMPOSITION_CATEGORIES);
    }
    return decompositionCategories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public DecompositionCategory<T> getCategory() {
    if (category != null && category.eIsProxy()) {
      InternalEObject oldCategory = (InternalEObject) category;
      category = (DecompositionCategory<T>) eResolveProxy(oldCategory);
      if (category != oldCategory) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.DECOMPOSABLE__CATEGORY, oldCategory,
              category));
      }
    }
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecompositionCategory<T> basicGetCategory() {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCategory(DecompositionCategory<T> newCategory, NotificationChain msgs) {
    DecompositionCategory<T> oldCategory = category;
    category = newCategory;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StpaPackage.DECOMPOSABLE__CATEGORY,
          oldCategory, newCategory);
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
  public void setCategory(DecompositionCategory<T> newCategory) {
    if (newCategory != category) {
      NotificationChain msgs = null;
      if (category != null)
        msgs = ((InternalEObject) category).eInverseRemove(this, StpaPackage.DECOMPOSITION_CATEGORY__COVERAGE,
            DecompositionCategory.class, msgs);
      if (newCategory != null)
        msgs = ((InternalEObject) newCategory).eInverseAdd(this, StpaPackage.DECOMPOSITION_CATEGORY__COVERAGE,
            DecompositionCategory.class, msgs);
      msgs = basicSetCategory(newCategory, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(this, Notification.SET, StpaPackage.DECOMPOSABLE__CATEGORY, newCategory, newCategory));
  }

  /**
   * Return the composite whose decomposition this object belongs to, if any
   * @param type the expected type of the composite
   * @generated NOT
   */
  @SuppressWarnings("unchecked")
  protected T getComposite(Class<T> type) {
    T result = null;
    EObject container = eContainer();
    if (type.isInstance(container)) {
      result = (T) container;
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public boolean isRoot() {
    return getComposite() == null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public boolean isLeaf() {
    return getDecomposition().isEmpty();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract EList<T> getDecomposition();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public abstract T getComposite();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<T> getOrderedDecomposition() {
    EList<T> result = new UniqueEList<>(getDecomposition().size());
    result.addAll(getUncategorized());
    for (DecompositionCategory<T> category : getDecompositionCategories()) {
      result.addAll(category.getOrderedCoverage());
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  @SuppressWarnings("unchecked")
  public T getRoot() {
    T result = (T) this;
    // Assumes heterogeneous Decomposable hierarchies are separate
    while (result.eContainer() instanceof Decomposable<?>) {
      result = (T) result.eContainer();
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  @SuppressWarnings("unchecked")
  public EList<T> getSubtree() {
    EList<T> result = new BasicEList<>();
    LinkedList<T> remaining = new LinkedList<>();
    remaining.add((T) this);
    while (!remaining.isEmpty()) {
      T head = remaining.pop();
      result.add(head);
      remaining.addAll(0, head.getDecomposition());
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<T> getUncategorized() {
    EList<T> result = new BasicEList<>(getDecomposition());
    for (DecompositionCategory<T> category : getDecompositionCategories()) {
      result.removeAll(category.getCoverage());
    }
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
    case StpaPackage.DECOMPOSABLE__CATEGORY:
      if (category != null)
        msgs = ((InternalEObject) category).eInverseRemove(this, StpaPackage.DECOMPOSITION_CATEGORY__COVERAGE,
            DecompositionCategory.class, msgs);
      return basicSetCategory((DecompositionCategory<T>) otherEnd, msgs);
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
    case StpaPackage.DECOMPOSABLE__DECOMPOSITION_CATEGORIES:
      return ((InternalEList<?>) getDecompositionCategories()).basicRemove(otherEnd, msgs);
    case StpaPackage.DECOMPOSABLE__CATEGORY:
      return basicSetCategory(null, msgs);
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
    case StpaPackage.DECOMPOSABLE__DECOMPOSITION_CATEGORIES:
      return getDecompositionCategories();
    case StpaPackage.DECOMPOSABLE__CATEGORY:
      if (resolve)
        return getCategory();
      return basicGetCategory();
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
    case StpaPackage.DECOMPOSABLE__DECOMPOSITION_CATEGORIES:
      getDecompositionCategories().clear();
      getDecompositionCategories().addAll((Collection<? extends DecompositionCategory<T>>) newValue);
      return;
    case StpaPackage.DECOMPOSABLE__CATEGORY:
      setCategory((DecompositionCategory<T>) newValue);
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
    case StpaPackage.DECOMPOSABLE__DECOMPOSITION_CATEGORIES:
      getDecompositionCategories().clear();
      return;
    case StpaPackage.DECOMPOSABLE__CATEGORY:
      setCategory((DecompositionCategory<T>) null);
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
    case StpaPackage.DECOMPOSABLE__DECOMPOSITION_CATEGORIES:
      return decompositionCategories != null && !decompositionCategories.isEmpty();
    case StpaPackage.DECOMPOSABLE__CATEGORY:
      return category != null;
    }
    return super.eIsSet(featureID);
  }

} //DecomposableImpl
