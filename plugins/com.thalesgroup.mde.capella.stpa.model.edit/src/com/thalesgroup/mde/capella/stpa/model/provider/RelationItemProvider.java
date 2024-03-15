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
package com.thalesgroup.mde.capella.stpa.model.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.Relation;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.Relation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationItemProvider extends ArchitectureMappableItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationItemProvider(AdapterFactory adapterFactory) {
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

      addTargetPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Target feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTargetPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Relation_target_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Relation_target_feature", "_UI_Relation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            StpaPackage.Literals.RELATION__TARGET, true, false, true, null, null, null));
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
    StringBuilder builder = new StringBuilder();
    builder.append(getTypeText());
    String label = ((Relation) object).getName();
    if (label == null || label.length() == 0) {
      Relation relation = (Relation) object;
      boolean invert = invertDirection();
      builder.append(": ");
      ControlEntity source = invert ? relation.getTarget() : relation.getSource();
      builder.append(getControlEntityText(source));
      builder.append(" -> ");
      ControlEntity target = invert ? relation.getSource() : relation.getTarget();
      builder.append(getControlEntityText(target));
    } else {
      builder.append(' ');
      builder.append(label);
    }
    return builder.toString();
  }

  /**
   * Return a label that represents the given control entity
   * @return a non-null, potentially empty string
   * @generated NOT
   */
  protected String getControlEntityText(ControlEntity controlEntity) {
    StringBuilder builder = new StringBuilder();
    if (controlEntity != null) {
      String ceID = controlEntity.getUserID();
      if (ceID != null && ceID.length() > 0) {
        builder.append('(');
        builder.append(ceID);
        builder.append(')');
      }
      String ceName = controlEntity.getName();
      if (ceName != null && ceName.length() > 0) {
        if (builder.length() > 0) {
          builder.append(' ');
        }
        builder.append(ceName);
      }
    }
    return builder.toString();
  }

  /**
   * Return a label that represents the type of the relation
   * @return a non-null string
   * @generated NOT
   */
  protected String getTypeText() {
    return getString("_UI_Relation_type");
  }

  /**
   * Return whether the direction of the relation should be inverted in the label
   * @generated NOT
   */
  protected boolean invertDirection() {
    return false;
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
