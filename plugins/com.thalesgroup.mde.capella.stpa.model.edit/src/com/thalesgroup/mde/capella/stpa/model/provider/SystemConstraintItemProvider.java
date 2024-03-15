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

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.capella.core.data.capellacore.Constraint;

import com.thalesgroup.mde.capella.stpa.model.StpaFactory;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemConstraintItemProvider extends DecomposableItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemConstraintItemProvider(AdapterFactory adapterFactory) {
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

      addConditionToEnforcePropertyDescriptor(object);
      addHazardsPropertyDescriptor(object);
      addResponsibilitiesPropertyDescriptor(object);
      addUnsafeControlActionsPropertyDescriptor(object);
      addLossScenariosPropertyDescriptor(object);
      addAssumptionsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Hazards feature.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
  protected void addHazardsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_SystemConstraint_hazards_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_SystemConstraint_hazards_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_SystemConstraint_type"), //$NON-NLS-1$
            StpaPackage.Literals.SYSTEM_CONSTRAINT__HAZARDS, true, false, true, null, null, null));
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
            getResourceLocator(), getString("_UI_SystemConstraint_responsibilities_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_SystemConstraint_responsibilities_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_SystemConstraint_type"), //$NON-NLS-1$
            StpaPackage.Literals.SYSTEM_CONSTRAINT__RESPONSIBILITIES, true, false, true, null, null, null));
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
            getResourceLocator(), getString("_UI_SystemConstraint_unsafeControlActions_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_SystemConstraint_unsafeControlActions_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_SystemConstraint_type"), //$NON-NLS-1$
            StpaPackage.Literals.SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS, true, false, true, null, null, null));
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
            getResourceLocator(), getString("_UI_SystemConstraint_lossScenarios_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_SystemConstraint_lossScenarios_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_SystemConstraint_type"), //$NON-NLS-1$
            StpaPackage.Literals.SYSTEM_CONSTRAINT__LOSS_SCENARIOS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Assumptions feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAssumptionsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_SystemConstraint_assumptions_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_SystemConstraint_assumptions_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_SystemConstraint_type"), //$NON-NLS-1$
            StpaPackage.Literals.SYSTEM_CONSTRAINT__ASSUMPTIONS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Condition To Enforce feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addConditionToEnforcePropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_SystemConstraint_conditionToEnforce_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_SystemConstraint_conditionToEnforce_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_SystemConstraint_type"), //$NON-NLS-1$
            StpaPackage.Literals.SYSTEM_CONSTRAINT__CONDITION_TO_ENFORCE, true, false, false,
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
      childrenFeatures.add(StpaPackage.Literals.SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS);
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
    SystemConstraint casted = (SystemConstraint) element;
    if (reference == StpaPackage.Literals.SYSTEM_CONSTRAINT__ASSUMPTIONS) {
      // Look everywhere in the control structure package
      Collection<EObject> collected = new LinkedList<>();
      Iterator<EObject> it1 = casted.getAnalysis().getControlStructurePackage().eAllContents();
      Iterator<EObject> it2 = casted.getAnalysis().getHazardConstraintPackage().eAllContents();
      for (Iterator<EObject> it : Arrays.asList(it1, it2)) {
        while (it.hasNext()) {
          EObject current = it.next();
          if (current instanceof Constraint) {
            collected.add(current);
          }
        }
      }
      result = collected;
    } else {
      result = super.getChoiceOfReferenceValues(element, reference);
    }
    return result;
  }

  /**
   * This returns SystemConstraint.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/SystemConstraint")); //$NON-NLS-1$
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
    return label == null || label.length() == 0 ? getString("_UI_SystemConstraint_type") : //$NON-NLS-1$
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

    switch (notification.getFeatureID(SystemConstraint.class)) {
    case StpaPackage.SYSTEM_CONSTRAINT__CONDITION_TO_ENFORCE:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    case StpaPackage.SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS:
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

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS,
        StpaFactory.eINSTANCE.createSystemConstraint()));
  }

}
