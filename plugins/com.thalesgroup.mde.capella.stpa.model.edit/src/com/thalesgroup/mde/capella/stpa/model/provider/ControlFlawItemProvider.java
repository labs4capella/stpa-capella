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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawContext;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawKind;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlFlawItemProvider extends StpaAnalysisElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFlawItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * @see com.thalesgroup.mde.capella.stpa.model.provider.StpaAnalysisElementItemProvider#getChoiceOfReferenceValues(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference)
   * @generated NOT
   */
  @Override
  protected Collection<? extends EObject> getChoiceOfReferenceValues(EObject element, EReference reference) {
    Collection<? extends EObject> result;
    ControlFlaw casted = (ControlFlaw) element;
    if (reference == StpaPackage.Literals.MITIGABLE__COUNTERMEASURES && casted.getControlAction() != null) {
      result = STPAQueryHelper.getVisibleCountermeasures(casted);
    } else {
      result = super.getChoiceOfReferenceValues(element, reference);
    }
    return result;
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

      addArchitectureElementsPropertyDescriptor(object);
      addCountermeasuresPropertyDescriptor(object);
      addKindPropertyDescriptor(object);
      addVerdictPropertyDescriptor(object);
      addJustificationPropertyDescriptor(object);
      addLossScenariosPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Architecture Elements feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addArchitectureElementsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_ArchitectureMappable_architectureElements_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_ArchitectureMappable_architectureElements_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_ArchitectureMappable_type"), //$NON-NLS-1$
            StpaPackage.Literals.ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS, true, false, true, null, null, null));
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
            getResourceLocator(), getString("_UI_ControlFlaw_kind_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_ControlFlaw_kind_feature", "_UI_ControlFlaw_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            StpaPackage.Literals.CONTROL_FLAW__KIND, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
            null, null));
  }

  /**
   * This adds a property descriptor for the Verdict feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addVerdictPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_ControlFlaw_verdict_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_ControlFlaw_verdict_feature", "_UI_ControlFlaw_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            StpaPackage.Literals.CONTROL_FLAW__VERDICT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
            null, null));
  }

  /**
   * This adds a property descriptor for the Justification feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addJustificationPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_ControlFlaw_justification_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_ControlFlaw_justification_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_ControlFlaw_type"), //$NON-NLS-1$
            StpaPackage.Literals.CONTROL_FLAW__JUSTIFICATION, true, false, false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
            getResourceLocator(), getString("_UI_ControlFlaw_lossScenarios_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_ControlFlaw_lossScenarios_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_ControlFlaw_type"), //$NON-NLS-1$
            StpaPackage.Literals.CONTROL_FLAW__LOSS_SCENARIOS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Countermeasures feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCountermeasuresPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Mitigable_countermeasures_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_Mitigable_countermeasures_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_Mitigable_type"), //$NON-NLS-1$
            StpaPackage.Literals.MITIGABLE__COUNTERMEASURES, true, false, true, null, null, null));
  }

  /**
   * This returns ControlFlaw.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ControlFlaw")); //$NON-NLS-1$
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
    String label = ((ControlFlaw) object).getName();
    if (label == null || label.length() == 0) {
      label = getControlFlowKindLabel(((ControlFlaw) object).getKind());
      ControlFlawContext context = ((ControlFlaw) object).getContext();
      if (context != null) {
        String actionLabel = context.getUserID();
        if (actionLabel != null && actionLabel.length() > 0) {
          label = '[' + actionLabel + "] " + label;
        }
      }
    }
    return label == null || label.length() == 0 ? getString("_UI_ControlFlaw_type") : //$NON-NLS-1$
        label;
  }

  /**
   * Return a short label for the given control flaw kind
   * @param kind a non-null kind
   * @return a non-null string
   * @generated NOT
   */
  public String getControlFlowKindLabel(ControlFlawKind kind) {
    String result = null;
    switch (kind) {
    case CONTROL_INPUT:
      result = "Control Input: Inadequate";
      break;
    case CONTROL_ALGORITHM:
      result = "Control Algorithm: Inadequate";
      break;
    case PROCESS_MODEL:
      result = "Process Model: Inadequate";
      break;
    case CONTROLLER_TO_ACTUATOR:
      result = "Controller-Actuator: Ineffective";
      break;
    case ACTUATOR:
      result = "Actuator: Inadequate";
      break;
    case ACTUATOR_TO_PROCESS:
      result = "Actuator-Process: Delay";
      break;
    case PROCESS_FAILURE:
      result = "Process: Failures";
      break;
    case PROCESS_CHANGE:
      result = "Process: Changes";
      break;
    case PROCESS_CONFLICT:
      result = "Process: Conflicting Control";
      break;
    case PROCESS_INPUT:
      result = "Process: Inadequate Inputs";
      break;
    case PROCESS_DISTURBANCE:
      result = "Process: Disturbances";
      break;
    case PROCESS_OUTPUT:
      result = "Process: Hazardous Outputs";
      break;
    case PROCESS_TO_SENSOR_DELAY:
      result = "Process-Sensor: Delay";
      break;
    case PROCESS_TO_SENSOR_INACCURATE:
      result = "Process-Sensor: Inaccurate";
      break;
    case PROCESS_TO_SENSOR_INCORRECT:
      result = "Process-Sensor: Incorrect";
      break;
    case SENSOR:
      result = "Sensor: Inadequate";
      break;
    case SENSOR_TO_CONTROLLER_DELAY:
      result = "Sensor-Controller: Delay";
      break;
    case SENSOR_TO_CONTROLLER_INADEQUATE:
      result = "Sensor-Controller: Inadequate";
      break;
    }
    return result;
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

    switch (notification.getFeatureID(ControlFlaw.class)) {
    case StpaPackage.CONTROL_FLAW__KIND:
    case StpaPackage.CONTROL_FLAW__VERDICT:
    case StpaPackage.CONTROL_FLAW__JUSTIFICATION:
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
