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

import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.StpaFactory;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ControlEntity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlEntityItemProvider extends DecomposableItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlEntityItemProvider(AdapterFactory adapterFactory) {
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

      addProcessPropertyDescriptor(object);
      addIncomingRelationsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Process feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProcessPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_ControlEntity_process_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_ControlEntity_process_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_ControlEntity_type"), //$NON-NLS-1$
            StpaPackage.Literals.CONTROL_ENTITY__PROCESS, true, false, false,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Incoming Relations feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIncomingRelationsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_ControlEntity_incomingRelations_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_ControlEntity_incomingRelations_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_ControlEntity_type"), //$NON-NLS-1$
            StpaPackage.Literals.CONTROL_ENTITY__INCOMING_RELATIONS, true, false, true, null, null, null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(StpaPackage.Literals.CONTROL_ENTITY__SUB_ENTITIES);
      childrenFeatures.add(StpaPackage.Literals.CONTROL_ENTITY__RESPONSIBILITIES);
      childrenFeatures.add(StpaPackage.Literals.CONTROL_ENTITY__OUTGOING_RELATIONS);
      childrenFeatures.add(StpaPackage.Literals.CONTROL_ENTITY__PROCESS_MODEL);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns ControlEntity.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ControlEntity")); //$NON-NLS-1$
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
    return label == null || label.length() == 0 ? getString("_UI_Entity_type") : //$NON-NLS-1$
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

    switch (notification.getFeatureID(ControlEntity.class)) {
    case StpaPackage.CONTROL_ENTITY__PROCESS:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    case StpaPackage.CONTROL_ENTITY__SUB_ENTITIES:
    case StpaPackage.CONTROL_ENTITY__RESPONSIBILITIES:
    case StpaPackage.CONTROL_ENTITY__OUTGOING_RELATIONS:
    case StpaPackage.CONTROL_ENTITY__PROCESS_MODEL:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
      return;
    }
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

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.CONTROL_ENTITY__SUB_ENTITIES,
        StpaFactory.eINSTANCE.createControlEntity()));

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.CONTROL_ENTITY__RESPONSIBILITIES,
        StpaFactory.eINSTANCE.createResponsibility()));

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.CONTROL_ENTITY__OUTGOING_RELATIONS,
        StpaFactory.eINSTANCE.createControlRelation()));

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.CONTROL_ENTITY__OUTGOING_RELATIONS,
        StpaFactory.eINSTANCE.createFeedbackRelation()));

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.CONTROL_ENTITY__OUTGOING_RELATIONS,
        StpaFactory.eINSTANCE.createInformationExchangeRelation()));

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.CONTROL_ENTITY__PROCESS_MODEL,
        StpaFactory.eINSTANCE.createProcessModelVariable()));
  }

}
