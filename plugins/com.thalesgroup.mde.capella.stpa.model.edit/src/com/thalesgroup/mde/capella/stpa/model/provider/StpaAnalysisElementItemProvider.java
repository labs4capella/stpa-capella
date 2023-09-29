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
package com.thalesgroup.mde.capella.stpa.model.provider;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.polarsys.capella.common.data.modellingcore.provider.ModelElementItemPropertyDescriptor;
import org.polarsys.capella.core.data.capellacore.provider.NamedElementItemProvider;
import org.polarsys.kitalpha.emde.model.EmdePackage;

import com.thalesgroup.mde.capella.stpa.helpers.DelegatingEGenericType;
import com.thalesgroup.mde.capella.stpa.model.Decomposable;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;
import com.thalesgroup.mde.capella.stpa.model.StpaFactory;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StpaAnalysisElementItemProvider extends NamedElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StpaAnalysisElementItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * @generated NOT
   */
  @Override
  protected ItemPropertyDescriptor createItemPropertyDescriptor(AdapterFactory adapterFactory,
      ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature,
      boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category,
      String[] filterFlags) {
    // Allows customizing the scope of possible values
    return new ModelElementItemPropertyDescriptor(adapterFactory, resourceLocator, displayName, description, feature,
        isSettable, multiLine, sortChoices, staticImage, category, filterFlags) {
      /**
       * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getComboBoxObjects(java.lang.Object)
       */
      protected Collection<?> getComboBoxObjects(Object object) {
        Collection<?> result;
        if (object instanceof EObject && parentReferences == null && feature instanceof EReference) {
          result = new LinkedList<>(getChoiceOfReferenceValues((EObject) object, (EReference) feature));
          if (!feature.isMany() && !result.contains(null)) {
            result.add(null);
          }
        } else {
          result = super.getComboBoxObjects(object);
        }
        return result;
      }
    };
  }

  /**
   * Return the set of possible values for the given reference on the given element.
   * No modification will be made to the returned collection.
   * @param element a non-null element
   * @param reference a non-null reference
   * @return a non-null, potentially empty collection
   * @generated NOT
   */
  protected Collection<? extends EObject> getChoiceOfReferenceValues(EObject element, EReference reference) {
    // Override for specific scopes
    Collection<? extends EObject> result;
    if (reference == StpaPackage.Literals.DECOMPOSITION_CATEGORY__COVERAGE) {
      result = ((Decomposable<?>) element.eContainer()).getUncategorized();
    } else {
      EGenericType type = element.eClass().getFeatureType(reference);
      if (reference == StpaPackage.Literals.ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS) {
        // For the architectureElements EReference, exclude STPA analysis elements
        type = new DelegatingEGenericType(type) {
          @Override
          public boolean isInstance(Object object) {
            return !(object instanceof StpaAnalysisElement) && super.isInstance(object);
          }
        };
      }
      result = ItemPropertyDescriptor.getReachableObjectsOfType(element, type);
    }
    return result;
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

    }
    return itemPropertyDescriptors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean hasChildren(Object object) {
    return hasChildren(object, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage() {
    return true;
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((StpaAnalysisElement) object).getName();
    return label == null || label.length() == 0 ? getString("_UI_StpaAnalysisElement_type") : //$NON-NLS-1$
        getString("_UI_StpaAnalysisElement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add(createChildParameter(EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
        StpaFactory.eINSTANCE.createStpaAnalysis()));
  }

}
