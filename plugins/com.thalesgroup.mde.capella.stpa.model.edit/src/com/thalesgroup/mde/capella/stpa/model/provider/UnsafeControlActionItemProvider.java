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
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper;
import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.StpaFactory;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;
import com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnsafeControlActionItemProvider extends ControlFlawAnalysisElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnsafeControlActionItemProvider(AdapterFactory adapterFactory) {
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

      addKindPropertyDescriptor(object);
      addContextPropertyDescriptor(object);
      addLossScenariosPropertyDescriptor(object);
      addViolatedConstraintsPropertyDescriptor(object);
      addHazardsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
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
            getResourceLocator(), getString("_UI_UnsafeControlAction_lossScenarios_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_UnsafeControlAction_lossScenarios_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_UnsafeControlAction_type"), //$NON-NLS-1$
            StpaPackage.Literals.UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Violated Constraints feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addViolatedConstraintsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_UnsafeControlAction_violatedConstraints_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_UnsafeControlAction_violatedConstraints_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_UnsafeControlAction_type"), //$NON-NLS-1$
            StpaPackage.Literals.UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS, true, false, true, null, null, null));
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
            getResourceLocator(), getString("_UI_UnsafeControlAction_hazards_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_UnsafeControlAction_hazards_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_UnsafeControlAction_type"), //$NON-NLS-1$
            StpaPackage.Literals.UNSAFE_CONTROL_ACTION__HAZARDS, true, false, true, null, null, null));
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
   * This adds a property descriptor for the Kind feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addKindPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_UnsafeControlAction_kind_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_UnsafeControlAction_kind_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_UnsafeControlAction_type"), //$NON-NLS-1$
            StpaPackage.Literals.UNSAFE_CONTROL_ACTION__KIND, true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Context feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addContextPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_UnsafeControlAction_context_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_UnsafeControlAction_context_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_UnsafeControlAction_type"), //$NON-NLS-1$
            StpaPackage.Literals.UNSAFE_CONTROL_ACTION__CONTEXT, true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * @see com.thalesgroup.mde.capella.stpa.model.provider.StpaAnalysisElementItemProvider#getChoiceOfReferenceValues(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference)
   * @generated NOT
   */
  @Override
  protected Collection<? extends EObject> getChoiceOfReferenceValues(EObject element, EReference reference) {
    Collection<? extends EObject> result;
    UnsafeControlAction casted = (UnsafeControlAction) element;
    if (reference == StpaPackage.Literals.MITIGABLE__COUNTERMEASURES && casted.getControlAction() != null) {
      result = STPAQueryHelper.getVisibleCountermeasures(casted);
    } else if (reference == StpaPackage.Literals.UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS
        && !casted.getHazards().isEmpty()) {
      List<SystemConstraint> scs = new UniqueEList<>();
      for (Hazard hazard : casted.getHazards()) {
        scs.addAll(hazard.getSystemConstraints());
      }
      result = scs;
    } else if (reference == StpaPackage.Literals.UNSAFE_CONTROL_ACTION__HAZARDS
        && !casted.getViolatedConstraints().isEmpty()) {
      List<Hazard> hazards = new UniqueEList<>();
      for (SystemConstraint cs : casted.getViolatedConstraints()) {
        hazards.addAll(cs.getHazards());
      }
      result = hazards;
    } else {
      result = super.getChoiceOfReferenceValues(element, reference);
    }
    return result;
  }

  /**
   * This returns UnsafeControlAction.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/UnsafeControlAction")); //$NON-NLS-1$
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
    return label == null || label.length() == 0 ? getString("_UI_UnsafeControlAction_type") : //$NON-NLS-1$
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

    switch (notification.getFeatureID(UnsafeControlAction.class)) {
    case StpaPackage.UNSAFE_CONTROL_ACTION__KIND:
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTEXT:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    case StpaPackage.UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET:
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
  }

}
