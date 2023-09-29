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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.kitalpha.emde.model.EmdePackage;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysis;
import com.thalesgroup.mde.capella.stpa.model.StpaFactory;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StpaAnalysisItemProvider extends StpaAnalysisElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StpaAnalysisItemProvider(AdapterFactory adapterFactory) {
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

      addTechnicalPackagePropertyDescriptor(object);
      addSystemPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Technical Package feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTechnicalPackagePropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_StpaAnalysis_technicalPackage_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_StpaAnalysis_technicalPackage_feature", //$NON-NLS-1$//$NON-NLS-2$
                "_UI_StpaAnalysis_type"), //$NON-NLS-1$
            StpaPackage.Literals.STPA_ANALYSIS__TECHNICAL_PACKAGE, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the System feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSystemPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_StpaAnalysis_system_feature"), //$NON-NLS-1$
            getString("_UI_PropertyDescriptor_description", "_UI_StpaAnalysis_system_feature", "_UI_StpaAnalysis_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            StpaPackage.Literals.STPA_ANALYSIS__SYSTEM, true, false, true, null, null, null));
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
      childrenFeatures.add(StpaPackage.Literals.STPA_ANALYSIS__LOSS_PACKAGE);
      childrenFeatures.add(StpaPackage.Literals.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE);
      childrenFeatures.add(StpaPackage.Literals.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE);
      childrenFeatures.add(StpaPackage.Literals.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE);
      childrenFeatures.add(StpaPackage.Literals.STPA_ANALYSIS__SUB_ANALYSES);
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
   * This returns StpaAnalysis.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/StpaAnalysis")); //$NON-NLS-1$
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
    String label = ((StpaAnalysis) object).getName();
    return label == null || label.length() == 0 ? getString("_UI_StpaAnalysis_type") : //$NON-NLS-1$
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

    switch (notification.getFeatureID(StpaAnalysis.class)) {
    case StpaPackage.STPA_ANALYSIS__LOSS_PACKAGE:
    case StpaPackage.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE:
    case StpaPackage.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE:
    case StpaPackage.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE:
    case StpaPackage.STPA_ANALYSIS__SUB_ANALYSES:
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

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.STPA_ANALYSIS__LOSS_PACKAGE,
        StpaFactory.eINSTANCE.createLossPackage()));

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE,
        StpaFactory.eINSTANCE.createHazardConstraintPackage()));

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE,
        StpaFactory.eINSTANCE.createControlStructurePackage()));

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE,
        StpaFactory.eINSTANCE.createLossScenarioPackage()));

    newChildDescriptors.add(createChildParameter(StpaPackage.Literals.STPA_ANALYSIS__SUB_ANALYSES,
        StpaFactory.eINSTANCE.createStpaAnalysis()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify = childFeature == EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS
        || childFeature == StpaPackage.Literals.STPA_ANALYSIS__SUB_ANALYSES;

    if (qualify) {
      return getString("_UI_CreateChild_text2", //$NON-NLS-1$
          new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}
