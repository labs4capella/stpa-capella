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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper;
import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;
import com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.LossScenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LossScenarioItemProvider extends ControlFlawAnalysisElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LossScenarioItemProvider(AdapterFactory adapterFactory) {
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

      addControlActionPropertyDescriptor(object);
      addUnsafeControlActionPropertyDescriptor(object);
      addCausalFactorsPropertyDescriptor(object);
      addViolatedConstraintsPropertyDescriptor(object);
      addHazardsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Control Action feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addControlActionPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_LossScenario_controlAction_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_LossScenario_controlAction_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_LossScenario_type"), //$NON-NLS-1$
            StpaPackage.Literals.LOSS_SCENARIO__CONTROL_ACTION, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Unsafe Control Action feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUnsafeControlActionPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_LossScenario_unsafeControlAction_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_LossScenario_unsafeControlAction_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_LossScenario_type"), //$NON-NLS-1$
            StpaPackage.Literals.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Causal Factors feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCausalFactorsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_LossScenario_causalFactors_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_LossScenario_causalFactors_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_LossScenario_type"), //$NON-NLS-1$
            StpaPackage.Literals.LOSS_SCENARIO__CAUSAL_FACTORS, true, false, true, null, null, null));
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
            getResourceLocator(), getString("_UI_LossScenario_violatedConstraints_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_LossScenario_violatedConstraints_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_LossScenario_type"), //$NON-NLS-1$
            StpaPackage.Literals.LOSS_SCENARIO__VIOLATED_CONSTRAINTS, true, false, true, null, null, null));
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
            getResourceLocator(), getString("_UI_LossScenario_hazards_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_LossScenario_hazards_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_LossScenario_type"), //$NON-NLS-1$
            StpaPackage.Literals.LOSS_SCENARIO__HAZARDS, true, false, true, null, null, null));
  }

  /**
   * @see com.thalesgroup.mde.capella.stpa.model.provider.StpaAnalysisElementItemProvider#getChoiceOfReferenceValues(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference)
   * @generated NOT
   */
  @Override
  protected Collection<? extends EObject> getChoiceOfReferenceValues(EObject element, EReference reference) {
    Collection<? extends EObject> result;
    LossScenario casted = (LossScenario) element;
    if (reference == StpaPackage.Literals.LOSS_SCENARIO__UNSAFE_CONTROL_ACTION && casted.getControlAction() != null) {
      result = casted.getControlAction().getUnsafeControlActions();
    } else if (reference == StpaPackage.Literals.MITIGABLE__COUNTERMEASURES && casted.getControlAction() != null) {
      result = STPAQueryHelper.getVisibleCountermeasures(casted);
    } else if (reference == StpaPackage.Literals.LOSS_SCENARIO__CAUSAL_FACTORS && casted.getControlAction() != null) {
      result = STPAQueryHelper.getVisibleCausalFactors(casted);
    } else if (reference == StpaPackage.Literals.LOSS_SCENARIO__VIOLATED_CONSTRAINTS) {
      UnsafeControlAction uca = casted.getUnsafeControlAction();
      if (uca != null) {
        result = uca.getViolatedConstraints();
      } else if (!casted.getHazards().isEmpty()) {
        List<SystemConstraint> hazardSCs = new UniqueEList<>();
        for (Hazard hazard : casted.getHazards()) {
          hazardSCs.addAll(hazard.getSystemConstraints());
        }
        result = hazardSCs;
      } else {
        result = super.getChoiceOfReferenceValues(element, reference);
      }
    } else if (reference == StpaPackage.Literals.LOSS_SCENARIO__HAZARDS && !casted.getViolatedConstraints().isEmpty()) {
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
   * This returns LossScenario.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/LossScenario")); //$NON-NLS-1$
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
    return label == null || label.length() == 0 ? getString("_UI_LossScenario_type") : //$NON-NLS-1$
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
