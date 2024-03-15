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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.StpaFactory;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExchangeElementItemProvider extends UserIdentifiedElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExchangeElementItemProvider(AdapterFactory adapterFactory) {
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

      addExercisedResponsibilitiesPropertyDescriptor(object);
      addLossScenariosPropertyDescriptor(object);
      addSupportingProcessModelPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Exercised Responsibilities feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addExercisedResponsibilitiesPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_ExchangeElement_exercisedResponsibilities_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_ExchangeElement_exercisedResponsibilities_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_ExchangeElement_type"), //$NON-NLS-1$
            StpaPackage.Literals.EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES, true, false, true, null, null, null));
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
            getResourceLocator(), getString("_UI_ExchangeElement_lossScenarios_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_ExchangeElement_lossScenarios_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_ExchangeElement_type"), //$NON-NLS-1$
            StpaPackage.Literals.EXCHANGE_ELEMENT__LOSS_SCENARIOS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Supporting Process Model feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSupportingProcessModelPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_ExchangeElement_supportingProcessModel_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_ExchangeElement_supportingProcessModel_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_ExchangeElement_type"), //$NON-NLS-1$
            StpaPackage.Literals.EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL, true, false, true, null, null, null));
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
      childrenFeatures.add(StpaPackage.Literals.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET);
      childrenFeatures.add(StpaPackage.Literals.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS);
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
   * @see com.thalesgroup.mde.capella.stpa.model.provider.StpaAnalysisElementItemProvider#getChoiceOfReferenceValues(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference)
   * @generated NOT
   */
  @Override
  protected Collection<? extends EObject> getChoiceOfReferenceValues(EObject element, EReference reference) {
    Collection<? extends EObject> result;
    ExchangeElement casted = (ExchangeElement) element;
    if (reference == StpaPackage.Literals.EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES) {
      result = casted.getController().getResponsibilities();
    } else if (reference == StpaPackage.Literals.EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL) {
      result = casted.getController().getProcessModel();
    } else {
      result = super.getChoiceOfReferenceValues(element, reference);
    }
    return result;
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
    String label = ((ExchangeElement) object).getName();
    return label == null || label.length() == 0 ? getString("_UI_ExchangeElement_type") : //$NON-NLS-1$
        getString("_UI_ExchangeElement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

    switch (notification.getFeatureID(ExchangeElement.class)) {
    case StpaPackage.EXCHANGE_ELEMENT__CONTROL_FLAW_SET:
    case StpaPackage.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS:
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

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET,
        StpaFactory.eINSTANCE.createControlFlawSet()));

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS,
        StpaFactory.eINSTANCE.createUnsafeControlAction()));
  }

}
