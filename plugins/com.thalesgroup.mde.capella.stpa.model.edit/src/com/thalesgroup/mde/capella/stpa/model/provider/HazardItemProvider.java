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

import com.thalesgroup.mde.capella.stpa.model.Hazard;
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
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.Hazard} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HazardItemProvider extends DecomposableItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardItemProvider(AdapterFactory adapterFactory) {
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

      addUnsafeConditionPropertyDescriptor(object);
      addLossesPropertyDescriptor(object);
      addSystemConstraintsPropertyDescriptor(object);
      addUnsafeControlActionsPropertyDescriptor(object);
      addLossScenariosPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Losses feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLossesPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Hazard_losses_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Hazard_losses_feature", "_UI_Hazard_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            StpaPackage.Literals.HAZARD__LOSSES, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the System Constraints feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSystemConstraintsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Hazard_systemConstraints_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Hazard_systemConstraints_feature", "_UI_Hazard_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            StpaPackage.Literals.HAZARD__SYSTEM_CONSTRAINTS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Unsafe Control Actions feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUnsafeControlActionsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Hazard_unsafeControlActions_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Hazard_unsafeControlActions_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_Hazard_type"), //$NON-NLS-1$
            StpaPackage.Literals.HAZARD__UNSAFE_CONTROL_ACTIONS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Loss Scenarios feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLossScenariosPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Hazard_lossScenarios_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Hazard_lossScenarios_feature", "_UI_Hazard_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            StpaPackage.Literals.HAZARD__LOSS_SCENARIOS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Unsafe Condition feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUnsafeConditionPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Hazard_unsafeCondition_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Hazard_unsafeCondition_feature", "_UI_Hazard_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            StpaPackage.Literals.HAZARD__UNSAFE_CONDITION, true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
      childrenFeatures.add(StpaPackage.Literals.HAZARD__SUB_HAZARDS);
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
   * This returns Hazard.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Hazard")); //$NON-NLS-1$
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
    return label == null || label.length() == 0 ? getString("_UI_Hazard_type") : //$NON-NLS-1$
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

    switch (notification.getFeatureID(Hazard.class)) {
    case StpaPackage.HAZARD__UNSAFE_CONDITION:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    case StpaPackage.HAZARD__SUB_HAZARDS:
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

    newChildDescriptors
        .add(createChildParameter(StpaPackage.Literals.HAZARD__SUB_HAZARDS, StpaFactory.eINSTANCE.createHazard()));
  }

}
