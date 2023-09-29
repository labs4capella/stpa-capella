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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserIdentifiedElementItemProvider extends ArchitectureMappableItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserIdentifiedElementItemProvider(AdapterFactory adapterFactory) {
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

      addUserIDPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the User ID feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUserIDPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_UserIdentifiedElement_userID_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_UserIdentifiedElement_userID_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_UserIdentifiedElement_type"), //$NON-NLS-1$
            StpaPackage.Literals.USER_IDENTIFIED_ELEMENT__USER_ID, true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
    String label = ((UserIdentifiedElement) object).getName();
    return label == null || label.length() == 0 ? getString("_UI_UserIdentifiedElement_type") : //$NON-NLS-1$
        getString("_UI_UserIdentifiedElement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
  }

  /**
   * Return a default label for the given element
   * @param element a non-null element
   * @return a non-null string
   * @generated NOT
   */
  public String getDefaultText(UserIdentifiedElement element) {
    String name = element.getName();
    String prefix = element.getUserID();
    boolean nameOK = name != null && name.length() > 0;
    boolean prefixOK = prefix != null && prefix.length() > 0;
    StringBuilder builder = new StringBuilder();
    if (prefixOK) {
      builder.append('(');
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

    switch (notification.getFeatureID(UserIdentifiedElement.class)) {
    case StpaPackage.USER_IDENTIFIED_ELEMENT__USER_ID:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
  }

}
