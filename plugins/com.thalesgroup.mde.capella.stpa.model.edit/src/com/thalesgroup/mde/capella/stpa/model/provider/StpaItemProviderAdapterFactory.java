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

import com.thalesgroup.mde.capella.stpa.model.StpaFactory;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

import com.thalesgroup.mde.capella.stpa.model.util.StpaAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.polarsys.capella.core.data.sharedmodel.GenericPkg;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

import org.polarsys.capella.core.data.sharedmodel.util.SharedmodelSwitch;

import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

import org.polarsys.kitalpha.emde.model.util.EmdeSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StpaItemProviderAdapterFactory extends StpaAdapterFactory
    implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This helps manage the child creation extenders.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
      StpaEditPlugin.INSTANCE, StpaPackage.eNS_URI);

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StpaItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.DecompositionCategory} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecompositionCategoryItemProvider decompositionCategoryItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.DecompositionCategory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDecompositionCategoryAdapter() {
    if (decompositionCategoryItemProvider == null) {
      decompositionCategoryItemProvider = new DecompositionCategoryItemProvider(this);
    }

    return decompositionCategoryItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StpaAnalysisItemProvider stpaAnalysisItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createStpaAnalysisAdapter() {
    if (stpaAnalysisItemProvider == null) {
      stpaAnalysisItemProvider = new StpaAnalysisItemProvider(this);
    }

    return stpaAnalysisItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.TechnicalPackage} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TechnicalPackageItemProvider technicalPackageItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.TechnicalPackage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTechnicalPackageAdapter() {
    if (technicalPackageItemProvider == null) {
      technicalPackageItemProvider = new TechnicalPackageItemProvider(this);
    }

    return technicalPackageItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.LossPackage} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LossPackageItemProvider lossPackageItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.LossPackage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createLossPackageAdapter() {
    if (lossPackageItemProvider == null) {
      lossPackageItemProvider = new LossPackageItemProvider(this);
    }

    return lossPackageItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HazardConstraintPackageItemProvider hazardConstraintPackageItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createHazardConstraintPackageAdapter() {
    if (hazardConstraintPackageItemProvider == null) {
      hazardConstraintPackageItemProvider = new HazardConstraintPackageItemProvider(this);
    }

    return hazardConstraintPackageItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlStructurePackageItemProvider controlStructurePackageItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createControlStructurePackageAdapter() {
    if (controlStructurePackageItemProvider == null) {
      controlStructurePackageItemProvider = new ControlStructurePackageItemProvider(this);
    }

    return controlStructurePackageItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LossScenarioPackageItemProvider lossScenarioPackageItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createLossScenarioPackageAdapter() {
    if (lossScenarioPackageItemProvider == null) {
      lossScenarioPackageItemProvider = new LossScenarioPackageItemProvider(this);
    }

    return lossScenarioPackageItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.Stakeholder} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StakeholderItemProvider stakeholderItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.Stakeholder}.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createStakeholderAdapter() {
    if (stakeholderItemProvider == null) {
      stakeholderItemProvider = new StakeholderItemProvider(this);
    }

    return stakeholderItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.Stake} instances.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  protected StakeItemProvider stakeItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.Stake}.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createStakeAdapter() {
    if (stakeItemProvider == null) {
      stakeItemProvider = new StakeItemProvider(this);
    }

    return stakeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.Loss} instances.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
  protected LossItemProvider lossItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.Loss}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createLossAdapter() {
    if (lossItemProvider == null) {
      lossItemProvider = new LossItemProvider(this);
    }

    return lossItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.Hazard} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HazardItemProvider hazardItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.Hazard}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createHazardAdapter() {
    if (hazardItemProvider == null) {
      hazardItemProvider = new HazardItemProvider(this);
    }

    return hazardItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemConstraintItemProvider systemConstraintItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createSystemConstraintAdapter() {
    if (systemConstraintItemProvider == null) {
      systemConstraintItemProvider = new SystemConstraintItemProvider(this);
    }

    return systemConstraintItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.ControlEntity} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlEntityItemProvider controlEntityItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ControlEntity}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createControlEntityAdapter() {
    if (controlEntityItemProvider == null) {
      controlEntityItemProvider = new ControlEntityItemProvider(this);
    }

    return controlEntityItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.Responsibility} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResponsibilityItemProvider responsibilityItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.Responsibility}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createResponsibilityAdapter() {
    if (responsibilityItemProvider == null) {
      responsibilityItemProvider = new ResponsibilityItemProvider(this);
    }

    return responsibilityItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessModelVariableItemProvider processModelVariableItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createProcessModelVariableAdapter() {
    if (processModelVariableItemProvider == null) {
      processModelVariableItemProvider = new ProcessModelVariableItemProvider(this);
    }

    return processModelVariableItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.ProcessModelValue} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessModelValueItemProvider processModelValueItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ProcessModelValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createProcessModelValueAdapter() {
    if (processModelValueItemProvider == null) {
      processModelValueItemProvider = new ProcessModelValueItemProvider(this);
    }

    return processModelValueItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.ControlRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlRelationItemProvider controlRelationItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ControlRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createControlRelationAdapter() {
    if (controlRelationItemProvider == null) {
      controlRelationItemProvider = new ControlRelationItemProvider(this);
    }

    return controlRelationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.ControlAction} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlActionItemProvider controlActionItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ControlAction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createControlActionAdapter() {
    if (controlActionItemProvider == null) {
      controlActionItemProvider = new ControlActionItemProvider(this);
    }

    return controlActionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.FeedbackRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeedbackRelationItemProvider feedbackRelationItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.FeedbackRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createFeedbackRelationAdapter() {
    if (feedbackRelationItemProvider == null) {
      feedbackRelationItemProvider = new FeedbackRelationItemProvider(this);
    }

    return feedbackRelationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeedbackElementItemProvider feedbackElementItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createFeedbackElementAdapter() {
    if (feedbackElementItemProvider == null) {
      feedbackElementItemProvider = new FeedbackElementItemProvider(this);
    }

    return feedbackElementItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InformationExchangeRelationItemProvider informationExchangeRelationItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createInformationExchangeRelationAdapter() {
    if (informationExchangeRelationItemProvider == null) {
      informationExchangeRelationItemProvider = new InformationExchangeRelationItemProvider(this);
    }

    return informationExchangeRelationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PieceOfInformationItemProvider pieceOfInformationItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createPieceOfInformationAdapter() {
    if (pieceOfInformationItemProvider == null) {
      pieceOfInformationItemProvider = new PieceOfInformationItemProvider(this);
    }

    return pieceOfInformationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnsafeControlActionItemProvider unsafeControlActionItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createUnsafeControlActionAdapter() {
    if (unsafeControlActionItemProvider == null) {
      unsafeControlActionItemProvider = new UnsafeControlActionItemProvider(this);
    }

    return unsafeControlActionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.LossScenario} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LossScenarioItemProvider lossScenarioItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.LossScenario}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createLossScenarioAdapter() {
    if (lossScenarioItemProvider == null) {
      lossScenarioItemProvider = new LossScenarioItemProvider(this);
    }

    return lossScenarioItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnsafeControlActionCategoryItemProvider unsafeControlActionCategoryItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createUnsafeControlActionCategoryAdapter() {
    if (unsafeControlActionCategoryItemProvider == null) {
      unsafeControlActionCategoryItemProvider = new UnsafeControlActionCategoryItemProvider(this);
    }

    return unsafeControlActionCategoryItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlFlawSetItemProvider controlFlawSetItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createControlFlawSetAdapter() {
    if (controlFlawSetItemProvider == null) {
      controlFlawSetItemProvider = new ControlFlawSetItemProvider(this);
    }

    return controlFlawSetItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlFlawItemProvider controlFlawItemProvider;

  /**
   * This creates an adapter for a {@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createControlFlawAdapter() {
    if (controlFlawItemProvider == null) {
      controlFlawItemProvider = new ControlFlawItemProvider(this);
    }

    return controlFlawItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type) {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type) {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type) {
    if (isFactoryForType(type)) {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
        return adapter;
      }
    }

    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<IChildCreationExtender> getChildCreationExtenders() {
    return childCreationExtenderManager.getChildCreationExtenders();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
    return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceLocator getResourceLocator() {
    return childCreationExtenderManager;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void addListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void removeListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void fireNotifyChanged(Notification notification) {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null) {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void dispose() {
    if (decompositionCategoryItemProvider != null)
      decompositionCategoryItemProvider.dispose();
    if (stpaAnalysisItemProvider != null)
      stpaAnalysisItemProvider.dispose();
    if (technicalPackageItemProvider != null)
      technicalPackageItemProvider.dispose();
    if (lossPackageItemProvider != null)
      lossPackageItemProvider.dispose();
    if (hazardConstraintPackageItemProvider != null)
      hazardConstraintPackageItemProvider.dispose();
    if (controlStructurePackageItemProvider != null)
      controlStructurePackageItemProvider.dispose();
    if (lossScenarioPackageItemProvider != null)
      lossScenarioPackageItemProvider.dispose();
    if (stakeholderItemProvider != null)
      stakeholderItemProvider.dispose();
    if (stakeItemProvider != null)
      stakeItemProvider.dispose();
    if (lossItemProvider != null)
      lossItemProvider.dispose();
    if (hazardItemProvider != null)
      hazardItemProvider.dispose();
    if (systemConstraintItemProvider != null)
      systemConstraintItemProvider.dispose();
    if (controlEntityItemProvider != null)
      controlEntityItemProvider.dispose();
    if (responsibilityItemProvider != null)
      responsibilityItemProvider.dispose();
    if (processModelVariableItemProvider != null)
      processModelVariableItemProvider.dispose();
    if (processModelValueItemProvider != null)
      processModelValueItemProvider.dispose();
    if (controlRelationItemProvider != null)
      controlRelationItemProvider.dispose();
    if (controlActionItemProvider != null)
      controlActionItemProvider.dispose();
    if (feedbackRelationItemProvider != null)
      feedbackRelationItemProvider.dispose();
    if (feedbackElementItemProvider != null)
      feedbackElementItemProvider.dispose();
    if (informationExchangeRelationItemProvider != null)
      informationExchangeRelationItemProvider.dispose();
    if (pieceOfInformationItemProvider != null)
      pieceOfInformationItemProvider.dispose();
    if (unsafeControlActionItemProvider != null)
      unsafeControlActionItemProvider.dispose();
    if (lossScenarioItemProvider != null)
      lossScenarioItemProvider.dispose();
    if (unsafeControlActionCategoryItemProvider != null)
      unsafeControlActionCategoryItemProvider.dispose();
    if (controlFlawSetItemProvider != null)
      controlFlawSetItemProvider.dispose();
    if (controlFlawItemProvider != null)
      controlFlawItemProvider.dispose();
  }

  /**
   * A child creation extender for the {@link EmdePackage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static class EmdeChildCreationExtender implements IChildCreationExtender {
    /**
     * The switch for creating child descriptors specific to each extended class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static class CreationSwitch extends EmdeSwitch<Object> {
      /**
       * The child descriptors being populated.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected List<Object> newChildDescriptors;

      /**
       * The domain in which to create the children.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected EditingDomain editingDomain;

      /**
       * Creates the a switch for populating child descriptors in the given domain.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
        this.newChildDescriptors = newChildDescriptors;
        this.editingDomain = editingDomain;
      }

      /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      @Override
      public Object caseExtensibleElement(ExtensibleElement object) {
        newChildDescriptors.add(createChildParameter(EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
            StpaFactory.eINSTANCE.createStpaAnalysis()));

        return null;
      }

      /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected CommandParameter createChildParameter(Object feature, Object child) {
        return new CommandParameter(null, feature, child);
      }

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
      ArrayList<Object> result = new ArrayList<Object>();
      new CreationSwitch(result, editingDomain).doSwitch((EObject) object);
      return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator() {
      return StpaEditPlugin.INSTANCE;
    }
  }

  /**
   * A child creation extender for the {@link SharedmodelPackage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static class SharedmodelChildCreationExtender implements IChildCreationExtender {
    /**
     * The switch for creating child descriptors specific to each extended class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static class CreationSwitch extends SharedmodelSwitch<Object> {
      /**
       * The child descriptors being populated.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected List<Object> newChildDescriptors;

      /**
       * The domain in which to create the children.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected EditingDomain editingDomain;

      /**
       * Creates the a switch for populating child descriptors in the given domain.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
        this.newChildDescriptors = newChildDescriptors;
        this.editingDomain = editingDomain;
      }

      /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      @Override
      public Object caseGenericPkg(GenericPkg object) {
        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createDecompositionCategory()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createStpaAnalysis()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createTechnicalPackage()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createLossPackage()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createHazardConstraintPackage()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createControlStructurePackage()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createLossScenarioPackage()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createStakeholder()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createStake()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createLoss()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createHazard()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createSystemConstraint()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createControlEntity()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createResponsibility()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createProcessModelVariable()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createProcessModelValue()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createControlRelation()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createControlAction()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createFeedbackRelation()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createFeedbackElement()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createInformationExchangeRelation()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createPieceOfInformation()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createUnsafeControlAction()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createLossScenario()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createUnsafeControlActionCategory()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createControlFlawSet()));

        newChildDescriptors.add(createChildParameter(SharedmodelPackage.Literals.GENERIC_PKG__CAPELLA_ELEMENTS,
            StpaFactory.eINSTANCE.createControlFlaw()));

        return null;
      }

      /**
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      protected CommandParameter createChildParameter(Object feature, Object child) {
        return new CommandParameter(null, feature, child);
      }

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
      ArrayList<Object> result = new ArrayList<Object>();
      new CreationSwitch(result, editingDomain).doSwitch((EObject) object);
      return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator() {
      return StpaEditPlugin.INSTANCE;
    }
  }

}
