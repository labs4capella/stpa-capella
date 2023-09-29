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
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import com.thalesgroup.mde.capella.stpa.model.PieceOfInformation;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PieceOfInformationItemProvider extends ResponsibilitySupportExchangeElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PieceOfInformationItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
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

      addResponsibilitiesPropertyDescriptor(object);
      addProcessModelPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Responsibilities feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addResponsibilitiesPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_PieceOfInformation_responsibilities_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_PieceOfInformation_responsibilities_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_PieceOfInformation_type"), //$NON-NLS-1$
            StpaPackage.Literals.PIECE_OF_INFORMATION__RESPONSIBILITIES, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Process Model feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProcessModelPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_PieceOfInformation_processModel_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_PieceOfInformation_processModel_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_PieceOfInformation_type"), //$NON-NLS-1$
            StpaPackage.Literals.PIECE_OF_INFORMATION__PROCESS_MODEL, true, false, true, null, null, null));
  }

  /**
   * @see com.thalesgroup.mde.capella.stpa.model.provider.StpaAnalysisElementItemProvider#getChoiceOfReferenceValues(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference)
   * @generated NOT
   */
  @Override
  protected Collection<? extends EObject> getChoiceOfReferenceValues(EObject element, EReference reference) {
    Collection<? extends EObject> result;
    PieceOfInformation casted = (PieceOfInformation) element;
    if (reference == StpaPackage.Literals.PIECE_OF_INFORMATION__RESPONSIBILITIES) {
      result = casted.getRelation().getTarget().getResponsibilities();
    } else {
      result = super.getChoiceOfReferenceValues(element, reference);
    }
    return result;
  }

  /**
   * This returns PieceOfInformation.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/PieceOfInformation")); //$NON-NLS-1$
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
   * @generated NOT
   */
  @Override
  public String getText(Object object) {
    String label = getDefaultText((UserIdentifiedElement) object);
    return label == null || label.length() == 0 ? getString("_UI_PieceOfInformation_type") : //$NON-NLS-1$
        label;
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
  }

}
