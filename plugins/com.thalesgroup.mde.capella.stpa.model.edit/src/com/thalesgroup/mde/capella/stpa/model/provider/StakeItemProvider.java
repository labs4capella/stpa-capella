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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import com.thalesgroup.mde.capella.stpa.model.Stake;
import com.thalesgroup.mde.capella.stpa.model.Stakeholder;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.Stake} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StakeItemProvider extends UserIdentifiedElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StakeItemProvider(AdapterFactory adapterFactory) {
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

      addLossesPropertyDescriptor(object);
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
            getResourceLocator(), getString("_UI_Stake_losses_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Stake_losses_feature", "_UI_Stake_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            StpaPackage.Literals.STAKE__LOSSES, true, false, true, null, null, null));
  }

  /**
   * This returns Stake.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Stake")); //$NON-NLS-1$
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
    String label = getDefaultStakeText((Stake) object);
    return label == null || label.length() == 0 ? getString("_UI_Stake_type") : //$NON-NLS-1$
        label;
  }

  /**
   * Return a default label for the given stake
   * @param element a non-null stake
   * @return a non-null string
   * @generated NOT
   */
  public String getDefaultStakeText(Stake element) {
    String name = element.getName();
    String prefix = element.getUserID();
    boolean nameOK = name != null && name.length() > 0;
    boolean prefixOK = prefix != null && prefix.length() > 0;
    StringBuilder builder = new StringBuilder();
    if (prefixOK) {
      builder.append('(');
      Stakeholder stakeholder = element.getStakeholder();
      if (stakeholder != null) {
        String containerUID = stakeholder.getUserID();
        if (containerUID != null && containerUID.length() > 0) {
          builder.append(containerUID);
          builder.append('>');
        }
      }
      builder.append(prefix);
      builder.append(')');
    }
    if (prefixOK && nameOK) {
      builder.append(' ');
    }
    if (nameOK) {
      builder.append(name);
    }
    return builder.toString();
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
