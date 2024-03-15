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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.Responsibility;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.Responsibility} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponsibilityItemProvider extends UserIdentifiedElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResponsibilityItemProvider(AdapterFactory adapterFactory) {
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

      addProcessModelStatePropertyDescriptor(object);
      addSystemConstraintsPropertyDescriptor(object);
      addControlActionsPropertyDescriptor(object);
      addFeedbackPropertyDescriptor(object);
      addInformationPropertyDescriptor(object);
      addVariablesPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Process Model State feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProcessModelStatePropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Responsibility_processModelState_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Responsibility_processModelState_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_Responsibility_type"), //$NON-NLS-1$
            StpaPackage.Literals.RESPONSIBILITY__PROCESS_MODEL_STATE, true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getResourceLocator(), getString("_UI_Responsibility_systemConstraints_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Responsibility_systemConstraints_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_Responsibility_type"), //$NON-NLS-1$
            StpaPackage.Literals.RESPONSIBILITY__SYSTEM_CONSTRAINTS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Control Actions feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addControlActionsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Responsibility_controlActions_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Responsibility_controlActions_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_Responsibility_type"), //$NON-NLS-1$
            StpaPackage.Literals.RESPONSIBILITY__CONTROL_ACTIONS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Feedback feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFeedbackPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Responsibility_feedback_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Responsibility_feedback_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_Responsibility_type"), //$NON-NLS-1$
            StpaPackage.Literals.RESPONSIBILITY__FEEDBACK, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Information feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addInformationPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Responsibility_information_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Responsibility_information_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_Responsibility_type"), //$NON-NLS-1$
            StpaPackage.Literals.RESPONSIBILITY__INFORMATION, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Variables feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addVariablesPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Responsibility_variables_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Responsibility_variables_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_Responsibility_type"), //$NON-NLS-1$
            StpaPackage.Literals.RESPONSIBILITY__VARIABLES, true, false, true, null, null, null));
  }

  /**
   * @see com.thalesgroup.mde.capella.stpa.model.provider.StpaAnalysisElementItemProvider#getChoiceOfReferenceValues(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference)
   * @generated NOT
   */
  @Override
  protected Collection<? extends EObject> getChoiceOfReferenceValues(EObject element, EReference reference) {
    Collection<? extends EObject> result;
    Responsibility casted = (Responsibility) element;
    ControlEntity controlEntity = casted.getController();
    if (reference == StpaPackage.Literals.RESPONSIBILITY__CONTROL_ACTIONS) {
      result = controlEntity.getOutgoingExchangeElements();
    } else if (reference == StpaPackage.Literals.RESPONSIBILITY__FEEDBACK) {
      result = controlEntity.getIncomingFeedback();
    } else if (reference == StpaPackage.Literals.RESPONSIBILITY__INFORMATION) {
      result = controlEntity.getIncomingInformation();
    } else if (reference == StpaPackage.Literals.RESPONSIBILITY__VARIABLES) {
      result = controlEntity.getProcessModel();
    } else {
      result = super.getChoiceOfReferenceValues(element, reference);
    }
    return result;
  }

  /**
   * This returns Responsibility.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Responsibility")); //$NON-NLS-1$
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
    return label == null || label.length() == 0 ? getString("_UI_Responsibility_type") : //$NON-NLS-1$
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

    switch (notification.getFeatureID(Responsibility.class)) {
    case StpaPackage.RESPONSIBILITY__PROCESS_MODEL_STATE:
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
