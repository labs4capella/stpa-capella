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
package com.thalesgroup.mde.capella.stpa.helpers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.resource.Resource;


/**
 * A wrapper for EGenericType that allows customizing behavior. 
 */
public class DelegatingEGenericType implements EGenericType {
  
  /** The non-null wrapped EGenericType */
  protected final EGenericType _wrapped;
  
  /**
   * Constructor
   * @param toWrap the non-null EGenericType to wrap and delegate to
   */
  public DelegatingEGenericType(EGenericType toWrap) {
    _wrapped = toWrap;
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eClass()
   */
  @Override
  public EClass eClass() {
    return _wrapped.eClass();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eResource()
   */
  @Override
  public Resource eResource() {
    return _wrapped.eResource();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eContainer()
   */
  @Override
  public EObject eContainer() {
    return _wrapped.eContainer();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eContainingFeature()
   */
  @Override
  public EStructuralFeature eContainingFeature() {
    return _wrapped.eContainingFeature();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eContainmentFeature()
   */
  @Override
  public EReference eContainmentFeature() {
    return _wrapped.eContainmentFeature();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eContents()
   */
  @Override
  public EList<EObject> eContents() {
    return _wrapped.eContents();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eAllContents()
   */
  @Override
  public TreeIterator<EObject> eAllContents() {
    return _wrapped.eAllContents();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eIsProxy()
   */
  @Override
  public boolean eIsProxy() {
    return _wrapped.eIsProxy();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eCrossReferences()
   */
  @Override
  public EList<EObject> eCrossReferences() {
    return _wrapped.eCrossReferences();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eGet(org.eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  public Object eGet(EStructuralFeature feature) {
    return _wrapped.eGet(feature);
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eGet(org.eclipse.emf.ecore.EStructuralFeature, boolean)
   */
  @Override
  public Object eGet(EStructuralFeature feature, boolean resolve) {
    return _wrapped.eGet(feature, resolve);
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eSet(org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
   */
  @Override
  public void eSet(EStructuralFeature feature, Object newValue) {
    _wrapped.eSet(feature, newValue);
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eIsSet(org.eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  public boolean eIsSet(EStructuralFeature feature) {
    return _wrapped.eIsSet(feature);
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eUnset(org.eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  public void eUnset(EStructuralFeature feature) {
    _wrapped.eUnset(feature);
  }
  
  /**
   * @see org.eclipse.emf.ecore.EObject#eInvoke(org.eclipse.emf.ecore.EOperation, org.eclipse.emf.common.util.EList)
   */
  @Override
  public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
    return eInvoke(operation, arguments);
  }
  
  /**
   * @see org.eclipse.emf.common.notify.Notifier#eAdapters()
   */
  @Override
  public EList<Adapter> eAdapters() {
    return _wrapped.eAdapters();
  }
  
  /**
   * @see org.eclipse.emf.common.notify.Notifier#eDeliver()
   */
  @Override
  public boolean eDeliver() {
    return _wrapped.eDeliver();
  }
  
  /**
   * @see org.eclipse.emf.common.notify.Notifier#eSetDeliver(boolean)
   */
  @Override
  public void eSetDeliver(boolean deliver) {
    _wrapped.eSetDeliver(deliver);
  }
  
  /**
   * @see org.eclipse.emf.common.notify.Notifier#eNotify(org.eclipse.emf.common.notify.Notification)
   */
  @Override
  public void eNotify(Notification notification) {
    _wrapped.eNotify(notification);
  }
  
  /**
   * @see org.eclipse.emf.ecore.EGenericType#getEUpperBound()
   */
  @Override
  public EGenericType getEUpperBound() {
    return _wrapped.getEUpperBound();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EGenericType#setEUpperBound(org.eclipse.emf.ecore.EGenericType)
   */
  @Override
  public void setEUpperBound(EGenericType value) {
    _wrapped.setEUpperBound(value);
  }
  
  /**
   * @see org.eclipse.emf.ecore.EGenericType#getETypeArguments()
   */
  @Override
  public EList<EGenericType> getETypeArguments() {
    return _wrapped.getETypeArguments();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EGenericType#getERawType()
   */
  @Override
  public EClassifier getERawType() {
    return _wrapped.getERawType();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EGenericType#getELowerBound()
   */
  @Override
  public EGenericType getELowerBound() {
    return _wrapped.getELowerBound();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EGenericType#setELowerBound(org.eclipse.emf.ecore.EGenericType)
   */
  @Override
  public void setELowerBound(EGenericType value) {
    _wrapped.setELowerBound(value);
  }
  
  /**
   * @see org.eclipse.emf.ecore.EGenericType#getETypeParameter()
   */
  @Override
  public ETypeParameter getETypeParameter() {
    return _wrapped.getETypeParameter();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EGenericType#setETypeParameter(org.eclipse.emf.ecore.ETypeParameter)
   */
  @Override
  public void setETypeParameter(ETypeParameter value) {
    _wrapped.setETypeParameter(value);
  }
  
  /**
   * @see org.eclipse.emf.ecore.EGenericType#getEClassifier()
   */
  @Override
  public EClassifier getEClassifier() {
    return _wrapped.getEClassifier();
  }
  
  /**
   * @see org.eclipse.emf.ecore.EGenericType#setEClassifier(org.eclipse.emf.ecore.EClassifier)
   */
  @Override
  public void setEClassifier(EClassifier value) {
    _wrapped.setEClassifier(value);
  }
  @Override
  public boolean isInstance(Object object) {
    return _wrapped.isInstance(object);
  }
  
}