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
package com.thalesgroup.mde.capella.stpa.model.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.polarsys.capella.common.data.activity.ActivityPackage;
import org.polarsys.capella.common.data.behavior.BehaviorPackage;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;
import org.polarsys.kitalpha.emde.model.EmdePackage;

import com.thalesgroup.mde.capella.stpa.model.AnalysisPackage;
import com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable;
import com.thalesgroup.mde.capella.stpa.model.ControlAction;
import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawAnalysisElement;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawContext;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawKind;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawSet;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawTarget;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict;
import com.thalesgroup.mde.capella.stpa.model.ControlRelation;
import com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage;
import com.thalesgroup.mde.capella.stpa.model.Decomposable;
import com.thalesgroup.mde.capella.stpa.model.DecompositionCategory;
import com.thalesgroup.mde.capella.stpa.model.ExchangeBasedElement;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.FeedbackElement;
import com.thalesgroup.mde.capella.stpa.model.FeedbackRelation;
import com.thalesgroup.mde.capella.stpa.model.Hazard;
import com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage;
import com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation;
import com.thalesgroup.mde.capella.stpa.model.Loss;
import com.thalesgroup.mde.capella.stpa.model.LossPackage;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage;
import com.thalesgroup.mde.capella.stpa.model.Mitigable;
import com.thalesgroup.mde.capella.stpa.model.PieceOfInformation;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelValue;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable;
import com.thalesgroup.mde.capella.stpa.model.Relation;
import com.thalesgroup.mde.capella.stpa.model.Responsibility;
import com.thalesgroup.mde.capella.stpa.model.ResponsibilitySupportExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.Stake;
import com.thalesgroup.mde.capella.stpa.model.Stakeholder;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysis;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;
import com.thalesgroup.mde.capella.stpa.model.StpaFactory;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.TechnicalPackage;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind;
import com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StpaPackageImpl extends EPackageImpl implements StpaPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stpaAnalysisElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userIdentifiedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decomposableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decompositionCategoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass architectureMappableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stpaAnalysisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass analysisPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass technicalPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lossPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hazardConstraintPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlStructurePackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lossScenarioPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stakeholderEClass = null;

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  private EClass stakeEClass = null;

  /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
  private EClass lossEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlFlawTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hazardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exchangeBasedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass responsibilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processModelVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processModelValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlFlawContextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exchangeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass responsibilitySupportExchangeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass feedbackRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass feedbackElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass informationExchangeRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pieceOfInformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlFlawAnalysisElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mitigableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsafeControlActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lossScenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsafeControlActionCategoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlFlawEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlFlawSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unsafeControlActionKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum controlFlawKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum controlFlawVerdictEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StpaPackageImpl() {
    super(eNS_URI, StpaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Return the Capella RequirementPackage class if it exists, null otherwise 
   * @generated NOT
   * @return a potentially null class
   */
  public static Class<?> getRequirementPackage() {
    Class<?> result;
    try {
      result = Class.forName(
          "org.polarsys.capella.core.data.requirement.RequirementPackage",
          false, StpaPackage.class.getClassLoader());
    } catch (Exception e) {
      result = null;
    }
    return result;
  }

  /**
   * Return whether the current Capella environment is below v7.0 
   * @generated NOT
   */
  public static boolean isBelowCapella7() {
    return getRequirementPackage() != null;
  }
  
  /**
   * Initialize the Capella RequirementPackage if the current Capella environment is below v7.0 
   * @generated NOT
   */
  public static void initializeRequirementPackage() {
    // Perform RequirementPackage.eINSTANCE.eClass() if present
    Class<?> rp = getRequirementPackage();
    if (rp != null) {
      try {
        Field f = rp.getField("eINSTANCE");
        Object eInstance = f.get(null);
        Method eClassMeth = rp.getMethod("eClass", new Class<?>[] {});
        eClassMeth.invoke(eInstance, new Object[] {});
      } catch (Exception e) {
        // Proceed
      }
    }
  }

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link StpaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated NOT
   */
  public static StpaPackage init() {
    if (isInited)
      return (StpaPackage) EPackage.Registry.INSTANCE.getEPackage(StpaPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredStpaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    StpaPackageImpl theStpaPackage = registeredStpaPackage instanceof StpaPackageImpl
        ? (StpaPackageImpl) registeredStpaPackage
        : new StpaPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    EmdePackage.eINSTANCE.eClass();
    CapellamodellerPackage.eINSTANCE.eClass();
    CapellacorePackage.eINSTANCE.eClass();
    OaPackage.eINSTANCE.eClass();
    CtxPackage.eINSTANCE.eClass();
    LaPackage.eINSTANCE.eClass();
    PaPackage.eINSTANCE.eClass();
    EpbsPackage.eINSTANCE.eClass();
    SharedmodelPackage.eINSTANCE.eClass();
    initializeRequirementPackage();
    CapellacommonPackage.eINSTANCE.eClass();
    InformationPackage.eINSTANCE.eClass();
    CsPackage.eINSTANCE.eClass();
    FaPackage.eINSTANCE.eClass();
    InteractionPackage.eINSTANCE.eClass();
    ModellingcorePackage.eINSTANCE.eClass();
    ActivityPackage.eINSTANCE.eClass();
    BehaviorPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theStpaPackage.createPackageContents();

    // Initialize created meta-data
    theStpaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStpaPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StpaPackage.eNS_URI, theStpaPackage);
    return theStpaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStpaAnalysisElement() {
    return stpaAnalysisElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUserIdentifiedElement() {
    return userIdentifiedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUserIdentifiedElement_UserID() {
    return (EAttribute) userIdentifiedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDecomposable() {
    return decomposableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDecomposable_DecompositionCategories() {
    return (EReference) decomposableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDecomposable_Category() {
    return (EReference) decomposableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDecompositionCategory() {
    return decompositionCategoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDecompositionCategory_Coverage() {
    return (EReference) decompositionCategoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getArchitectureMappable() {
    return architectureMappableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getArchitectureMappable_ArchitectureElements() {
    return (EReference) architectureMappableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStpaAnalysis() {
    return stpaAnalysisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStpaAnalysis_TechnicalPackage() {
    return (EReference) stpaAnalysisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStpaAnalysis_System() {
    return (EReference) stpaAnalysisEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStpaAnalysis_SubAnalyses() {
    return (EReference) stpaAnalysisEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStpaAnalysis_LossPackage() {
    return (EReference) stpaAnalysisEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStpaAnalysis_HazardConstraintPackage() {
    return (EReference) stpaAnalysisEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStpaAnalysis_ControlStructurePackage() {
    return (EReference) stpaAnalysisEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStpaAnalysis_LossScenarioPackage() {
    return (EReference) stpaAnalysisEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAnalysisPackage() {
    return analysisPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTechnicalPackage() {
    return technicalPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTechnicalPackage_UnsafeControlActionCategories() {
    return (EReference) technicalPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLossPackage() {
    return lossPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLossPackage_Stakeholders() {
    return (EReference) lossPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLossPackage_Losses() {
    return (EReference) lossPackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHazardConstraintPackage() {
    return hazardConstraintPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHazardConstraintPackage_RootHazards() {
    return (EReference) hazardConstraintPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHazardConstraintPackage_RootSystemConstraints() {
    return (EReference) hazardConstraintPackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlStructurePackage() {
    return controlStructurePackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlStructurePackage_RootEntities() {
    return (EReference) controlStructurePackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLossScenarioPackage() {
    return lossScenarioPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLossScenarioPackage_LossScenarios() {
    return (EReference) lossScenarioPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStakeholder() {
    return stakeholderEClass;
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStakeholder_Stakes() {
    return (EReference) stakeholderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStake() {
    return stakeEClass;
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStake_Stakeholder() {
    return (EReference) stakeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStake_Losses() {
    return (EReference) stakeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLoss() {
    return lossEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLoss_Hazards() {
    return (EReference) lossEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLoss_Stakes() {
    return (EReference) lossEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlFlawTarget() {
    return controlFlawTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHazard() {
    return hazardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHazard_SubHazards() {
    return (EReference) hazardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHazard_Losses() {
    return (EReference) hazardEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHazard_SystemConstraints() {
    return (EReference) hazardEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHazard_UnsafeControlActions() {
    return (EReference) hazardEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHazard_LossScenarios() {
    return (EReference) hazardEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHazard_UnsafeCondition() {
    return (EAttribute) hazardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSystemConstraint() {
    return systemConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSystemConstraint_SubSystemConstraints() {
    return (EReference) systemConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSystemConstraint_Hazards() {
    return (EReference) systemConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSystemConstraint_Responsibilities() {
    return (EReference) systemConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSystemConstraint_UnsafeControlActions() {
    return (EReference) systemConstraintEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSystemConstraint_LossScenarios() {
    return (EReference) systemConstraintEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSystemConstraint_Assumptions() {
    return (EReference) systemConstraintEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSystemConstraint_ConditionToEnforce() {
    return (EAttribute) systemConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlEntity() {
    return controlEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getControlEntity_Process() {
    return (EAttribute) controlEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlEntity_SubEntities() {
    return (EReference) controlEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlEntity_Responsibilities() {
    return (EReference) controlEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlEntity_OutgoingRelations() {
    return (EReference) controlEntityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlEntity_IncomingRelations() {
    return (EReference) controlEntityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlEntity_ProcessModel() {
    return (EReference) controlEntityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExchangeBasedElement() {
    return exchangeBasedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getResponsibility() {
    return responsibilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getResponsibility_ProcessModelState() {
    return (EAttribute) responsibilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getResponsibility_Controller() {
    return (EReference) responsibilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getResponsibility_SystemConstraints() {
    return (EReference) responsibilityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getResponsibility_ControlActions() {
    return (EReference) responsibilityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getResponsibility_Feedback() {
    return (EReference) responsibilityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getResponsibility_Information() {
    return (EReference) responsibilityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getResponsibility_Variables() {
    return (EReference) responsibilityEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProcessModelVariable() {
    return processModelVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProcessModelVariable_Controller() {
    return (EReference) processModelVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProcessModelVariable_Responsibilities() {
    return (EReference) processModelVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProcessModelVariable_Values() {
    return (EReference) processModelVariableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProcessModelVariable_Feedback() {
    return (EReference) processModelVariableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProcessModelVariable_Information() {
    return (EReference) processModelVariableEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProcessModelVariable_ControlActions() {
    return (EReference) processModelVariableEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProcessModelValue() {
    return processModelValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProcessModelValue_Variable() {
    return (EReference) processModelValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRelation() {
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRelation_Source() {
    return (EReference) relationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRelation_Target() {
    return (EReference) relationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlFlawContext() {
    return controlFlawContextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlFlawContext_ControlFlawSet() {
    return (EReference) controlFlawContextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExchangeElement() {
    return exchangeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExchangeElement_UnsafeControlActions() {
    return (EReference) exchangeElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExchangeElement_ExercisedResponsibilities() {
    return (EReference) exchangeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExchangeElement_LossScenarios() {
    return (EReference) exchangeElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExchangeElement_SupportingProcessModel() {
    return (EReference) exchangeElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlRelation() {
    return controlRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlRelation_ControlActions() {
    return (EReference) controlRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlAction() {
    return controlActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlAction_Relation() {
    return (EReference) controlActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getResponsibilitySupportExchangeElement() {
    return responsibilitySupportExchangeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFeedbackRelation() {
    return feedbackRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeedbackRelation_Feedback() {
    return (EReference) feedbackRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFeedbackElement() {
    return feedbackElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeedbackElement_Relation() {
    return (EReference) feedbackElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeedbackElement_Responsibilities() {
    return (EReference) feedbackElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeedbackElement_ProcessModel() {
    return (EReference) feedbackElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInformationExchangeRelation() {
    return informationExchangeRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInformationExchangeRelation_Information() {
    return (EReference) informationExchangeRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPieceOfInformation() {
    return pieceOfInformationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPieceOfInformation_Relation() {
    return (EReference) pieceOfInformationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPieceOfInformation_Responsibilities() {
    return (EReference) pieceOfInformationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPieceOfInformation_ProcessModel() {
    return (EReference) pieceOfInformationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlFlawAnalysisElement() {
    return controlFlawAnalysisElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMitigable() {
    return mitigableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMitigable_Countermeasures() {
    return (EReference) mitigableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnsafeControlAction() {
    return unsafeControlActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnsafeControlAction_ControlAction() {
    return (EReference) unsafeControlActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnsafeControlAction_LossScenarios() {
    return (EReference) unsafeControlActionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnsafeControlAction_ViolatedConstraints() {
    return (EReference) unsafeControlActionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnsafeControlAction_Hazards() {
    return (EReference) unsafeControlActionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnsafeControlAction_Kind() {
    return (EAttribute) unsafeControlActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnsafeControlAction_Context() {
    return (EAttribute) unsafeControlActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLossScenario() {
    return lossScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLossScenario_ControlAction() {
    return (EReference) lossScenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLossScenario_UnsafeControlAction() {
    return (EReference) lossScenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLossScenario_CausalFactors() {
    return (EReference) lossScenarioEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLossScenario_ViolatedConstraints() {
    return (EReference) lossScenarioEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLossScenario_Hazards() {
    return (EReference) lossScenarioEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnsafeControlActionCategory() {
    return unsafeControlActionCategoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnsafeControlActionCategory_Kind() {
    return (EAttribute) unsafeControlActionCategoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlFlaw() {
    return controlFlawEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getControlFlaw_Kind() {
    return (EAttribute) controlFlawEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getControlFlaw_Verdict() {
    return (EAttribute) controlFlawEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlFlaw_OwningSet() {
    return (EReference) controlFlawEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getControlFlaw_Justification() {
    return (EAttribute) controlFlawEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlFlaw_LossScenarios() {
    return (EReference) controlFlawEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getControlFlawSet() {
    return controlFlawSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlFlawSet_ControlFlaws() {
    return (EReference) controlFlawSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getControlFlawSet_Context() {
    return (EReference) controlFlawSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getUnsafeControlActionKind() {
    return unsafeControlActionKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getControlFlawKind() {
    return controlFlawKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getControlFlawVerdict() {
    return controlFlawVerdictEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StpaFactory getStpaFactory() {
    return (StpaFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    stpaAnalysisElementEClass = createEClass(STPA_ANALYSIS_ELEMENT);

    architectureMappableEClass = createEClass(ARCHITECTURE_MAPPABLE);
    createEReference(architectureMappableEClass, ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS);

    userIdentifiedElementEClass = createEClass(USER_IDENTIFIED_ELEMENT);
    createEAttribute(userIdentifiedElementEClass, USER_IDENTIFIED_ELEMENT__USER_ID);

    decomposableEClass = createEClass(DECOMPOSABLE);
    createEReference(decomposableEClass, DECOMPOSABLE__DECOMPOSITION_CATEGORIES);
    createEReference(decomposableEClass, DECOMPOSABLE__CATEGORY);

    decompositionCategoryEClass = createEClass(DECOMPOSITION_CATEGORY);
    createEReference(decompositionCategoryEClass, DECOMPOSITION_CATEGORY__COVERAGE);

    stpaAnalysisEClass = createEClass(STPA_ANALYSIS);
    createEReference(stpaAnalysisEClass, STPA_ANALYSIS__TECHNICAL_PACKAGE);
    createEReference(stpaAnalysisEClass, STPA_ANALYSIS__LOSS_PACKAGE);
    createEReference(stpaAnalysisEClass, STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE);
    createEReference(stpaAnalysisEClass, STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE);
    createEReference(stpaAnalysisEClass, STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE);
    createEReference(stpaAnalysisEClass, STPA_ANALYSIS__SYSTEM);
    createEReference(stpaAnalysisEClass, STPA_ANALYSIS__SUB_ANALYSES);

    analysisPackageEClass = createEClass(ANALYSIS_PACKAGE);

    technicalPackageEClass = createEClass(TECHNICAL_PACKAGE);
    createEReference(technicalPackageEClass, TECHNICAL_PACKAGE__UNSAFE_CONTROL_ACTION_CATEGORIES);

    lossPackageEClass = createEClass(LOSS_PACKAGE);
    createEReference(lossPackageEClass, LOSS_PACKAGE__STAKEHOLDERS);
    createEReference(lossPackageEClass, LOSS_PACKAGE__LOSSES);

    hazardConstraintPackageEClass = createEClass(HAZARD_CONSTRAINT_PACKAGE);
    createEReference(hazardConstraintPackageEClass, HAZARD_CONSTRAINT_PACKAGE__ROOT_HAZARDS);
    createEReference(hazardConstraintPackageEClass, HAZARD_CONSTRAINT_PACKAGE__ROOT_SYSTEM_CONSTRAINTS);

    controlStructurePackageEClass = createEClass(CONTROL_STRUCTURE_PACKAGE);
    createEReference(controlStructurePackageEClass, CONTROL_STRUCTURE_PACKAGE__ROOT_ENTITIES);

    lossScenarioPackageEClass = createEClass(LOSS_SCENARIO_PACKAGE);
    createEReference(lossScenarioPackageEClass, LOSS_SCENARIO_PACKAGE__LOSS_SCENARIOS);

    stakeholderEClass = createEClass(STAKEHOLDER);
    createEReference(stakeholderEClass, STAKEHOLDER__STAKES);

    stakeEClass = createEClass(STAKE);
    createEReference(stakeEClass, STAKE__STAKEHOLDER);
    createEReference(stakeEClass, STAKE__LOSSES);

    lossEClass = createEClass(LOSS);
    createEReference(lossEClass, LOSS__HAZARDS);
    createEReference(lossEClass, LOSS__STAKES);

    controlFlawTargetEClass = createEClass(CONTROL_FLAW_TARGET);

    hazardEClass = createEClass(HAZARD);
    createEAttribute(hazardEClass, HAZARD__UNSAFE_CONDITION);
    createEReference(hazardEClass, HAZARD__SUB_HAZARDS);
    createEReference(hazardEClass, HAZARD__LOSSES);
    createEReference(hazardEClass, HAZARD__SYSTEM_CONSTRAINTS);
    createEReference(hazardEClass, HAZARD__UNSAFE_CONTROL_ACTIONS);
    createEReference(hazardEClass, HAZARD__LOSS_SCENARIOS);

    systemConstraintEClass = createEClass(SYSTEM_CONSTRAINT);
    createEAttribute(systemConstraintEClass, SYSTEM_CONSTRAINT__CONDITION_TO_ENFORCE);
    createEReference(systemConstraintEClass, SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS);
    createEReference(systemConstraintEClass, SYSTEM_CONSTRAINT__HAZARDS);
    createEReference(systemConstraintEClass, SYSTEM_CONSTRAINT__RESPONSIBILITIES);
    createEReference(systemConstraintEClass, SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS);
    createEReference(systemConstraintEClass, SYSTEM_CONSTRAINT__LOSS_SCENARIOS);
    createEReference(systemConstraintEClass, SYSTEM_CONSTRAINT__ASSUMPTIONS);

    controlEntityEClass = createEClass(CONTROL_ENTITY);
    createEAttribute(controlEntityEClass, CONTROL_ENTITY__PROCESS);
    createEReference(controlEntityEClass, CONTROL_ENTITY__SUB_ENTITIES);
    createEReference(controlEntityEClass, CONTROL_ENTITY__RESPONSIBILITIES);
    createEReference(controlEntityEClass, CONTROL_ENTITY__OUTGOING_RELATIONS);
    createEReference(controlEntityEClass, CONTROL_ENTITY__INCOMING_RELATIONS);
    createEReference(controlEntityEClass, CONTROL_ENTITY__PROCESS_MODEL);

    exchangeBasedElementEClass = createEClass(EXCHANGE_BASED_ELEMENT);

    responsibilityEClass = createEClass(RESPONSIBILITY);
    createEAttribute(responsibilityEClass, RESPONSIBILITY__PROCESS_MODEL_STATE);
    createEReference(responsibilityEClass, RESPONSIBILITY__CONTROLLER);
    createEReference(responsibilityEClass, RESPONSIBILITY__SYSTEM_CONSTRAINTS);
    createEReference(responsibilityEClass, RESPONSIBILITY__CONTROL_ACTIONS);
    createEReference(responsibilityEClass, RESPONSIBILITY__FEEDBACK);
    createEReference(responsibilityEClass, RESPONSIBILITY__INFORMATION);
    createEReference(responsibilityEClass, RESPONSIBILITY__VARIABLES);

    processModelVariableEClass = createEClass(PROCESS_MODEL_VARIABLE);
    createEReference(processModelVariableEClass, PROCESS_MODEL_VARIABLE__CONTROLLER);
    createEReference(processModelVariableEClass, PROCESS_MODEL_VARIABLE__RESPONSIBILITIES);
    createEReference(processModelVariableEClass, PROCESS_MODEL_VARIABLE__VALUES);
    createEReference(processModelVariableEClass, PROCESS_MODEL_VARIABLE__FEEDBACK);
    createEReference(processModelVariableEClass, PROCESS_MODEL_VARIABLE__INFORMATION);
    createEReference(processModelVariableEClass, PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS);

    processModelValueEClass = createEClass(PROCESS_MODEL_VALUE);
    createEReference(processModelValueEClass, PROCESS_MODEL_VALUE__VARIABLE);

    relationEClass = createEClass(RELATION);
    createEReference(relationEClass, RELATION__SOURCE);
    createEReference(relationEClass, RELATION__TARGET);

    controlFlawContextEClass = createEClass(CONTROL_FLAW_CONTEXT);
    createEReference(controlFlawContextEClass, CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET);

    exchangeElementEClass = createEClass(EXCHANGE_ELEMENT);
    createEReference(exchangeElementEClass, EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES);
    createEReference(exchangeElementEClass, EXCHANGE_ELEMENT__LOSS_SCENARIOS);
    createEReference(exchangeElementEClass, EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL);
    createEReference(exchangeElementEClass, EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS);

    controlRelationEClass = createEClass(CONTROL_RELATION);
    createEReference(controlRelationEClass, CONTROL_RELATION__CONTROL_ACTIONS);

    controlActionEClass = createEClass(CONTROL_ACTION);
    createEReference(controlActionEClass, CONTROL_ACTION__RELATION);

    responsibilitySupportExchangeElementEClass = createEClass(RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT);

    feedbackRelationEClass = createEClass(FEEDBACK_RELATION);
    createEReference(feedbackRelationEClass, FEEDBACK_RELATION__FEEDBACK);

    feedbackElementEClass = createEClass(FEEDBACK_ELEMENT);
    createEReference(feedbackElementEClass, FEEDBACK_ELEMENT__RELATION);
    createEReference(feedbackElementEClass, FEEDBACK_ELEMENT__RESPONSIBILITIES);
    createEReference(feedbackElementEClass, FEEDBACK_ELEMENT__PROCESS_MODEL);

    informationExchangeRelationEClass = createEClass(INFORMATION_EXCHANGE_RELATION);
    createEReference(informationExchangeRelationEClass, INFORMATION_EXCHANGE_RELATION__INFORMATION);

    pieceOfInformationEClass = createEClass(PIECE_OF_INFORMATION);
    createEReference(pieceOfInformationEClass, PIECE_OF_INFORMATION__RELATION);
    createEReference(pieceOfInformationEClass, PIECE_OF_INFORMATION__RESPONSIBILITIES);
    createEReference(pieceOfInformationEClass, PIECE_OF_INFORMATION__PROCESS_MODEL);

    mitigableEClass = createEClass(MITIGABLE);
    createEReference(mitigableEClass, MITIGABLE__COUNTERMEASURES);

    controlFlawAnalysisElementEClass = createEClass(CONTROL_FLAW_ANALYSIS_ELEMENT);

    unsafeControlActionEClass = createEClass(UNSAFE_CONTROL_ACTION);
    createEAttribute(unsafeControlActionEClass, UNSAFE_CONTROL_ACTION__KIND);
    createEAttribute(unsafeControlActionEClass, UNSAFE_CONTROL_ACTION__CONTEXT);
    createEReference(unsafeControlActionEClass, UNSAFE_CONTROL_ACTION__CONTROL_ACTION);
    createEReference(unsafeControlActionEClass, UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS);
    createEReference(unsafeControlActionEClass, UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS);
    createEReference(unsafeControlActionEClass, UNSAFE_CONTROL_ACTION__HAZARDS);

    lossScenarioEClass = createEClass(LOSS_SCENARIO);
    createEReference(lossScenarioEClass, LOSS_SCENARIO__CONTROL_ACTION);
    createEReference(lossScenarioEClass, LOSS_SCENARIO__UNSAFE_CONTROL_ACTION);
    createEReference(lossScenarioEClass, LOSS_SCENARIO__CAUSAL_FACTORS);
    createEReference(lossScenarioEClass, LOSS_SCENARIO__VIOLATED_CONSTRAINTS);
    createEReference(lossScenarioEClass, LOSS_SCENARIO__HAZARDS);

    unsafeControlActionCategoryEClass = createEClass(UNSAFE_CONTROL_ACTION_CATEGORY);
    createEAttribute(unsafeControlActionCategoryEClass, UNSAFE_CONTROL_ACTION_CATEGORY__KIND);

    controlFlawSetEClass = createEClass(CONTROL_FLAW_SET);
    createEReference(controlFlawSetEClass, CONTROL_FLAW_SET__CONTROL_FLAWS);
    createEReference(controlFlawSetEClass, CONTROL_FLAW_SET__CONTEXT);

    controlFlawEClass = createEClass(CONTROL_FLAW);
    createEAttribute(controlFlawEClass, CONTROL_FLAW__KIND);
    createEAttribute(controlFlawEClass, CONTROL_FLAW__VERDICT);
    createEReference(controlFlawEClass, CONTROL_FLAW__OWNING_SET);
    createEAttribute(controlFlawEClass, CONTROL_FLAW__JUSTIFICATION);
    createEReference(controlFlawEClass, CONTROL_FLAW__LOSS_SCENARIOS);

    // Create enums
    unsafeControlActionKindEEnum = createEEnum(UNSAFE_CONTROL_ACTION_KIND);
    controlFlawKindEEnum = createEEnum(CONTROL_FLAW_KIND);
    controlFlawVerdictEEnum = createEEnum(CONTROL_FLAW_VERDICT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    CapellacorePackage theCapellacorePackage = (CapellacorePackage) EPackage.Registry.INSTANCE
        .getEPackage(CapellacorePackage.eNS_URI);
    EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);

    // Create type parameters
    ETypeParameter architectureMappableEClass_T = addETypeParameter(architectureMappableEClass, "T"); //$NON-NLS-1$
    ETypeParameter decomposableEClass_T = addETypeParameter(decomposableEClass, "T"); //$NON-NLS-1$
    ETypeParameter decompositionCategoryEClass_T = addETypeParameter(decompositionCategoryEClass, "T"); //$NON-NLS-1$

    // Set bounds for type parameters
    EGenericType g1 = createEGenericType(theCapellacorePackage.getNamedElement());
    architectureMappableEClass_T.getEBounds().add(g1);
    g1 = createEGenericType(this.getDecomposable());
    EGenericType g2 = createEGenericType(decomposableEClass_T);
    g1.getETypeArguments().add(g2);
    decomposableEClass_T.getEBounds().add(g1);
    g1 = createEGenericType(this.getDecomposable());
    g2 = createEGenericType(decompositionCategoryEClass_T);
    g1.getETypeArguments().add(g2);
    decompositionCategoryEClass_T.getEBounds().add(g1);

    // Add supertypes to classes
    stpaAnalysisElementEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
    architectureMappableEClass.getESuperTypes().add(this.getStpaAnalysisElement());
    g1 = createEGenericType(this.getArchitectureMappable());
    g2 = createEGenericType(theCapellacorePackage.getNamedElement());
    g1.getETypeArguments().add(g2);
    userIdentifiedElementEClass.getEGenericSuperTypes().add(g1);
    decomposableEClass.getESuperTypes().add(this.getUserIdentifiedElement());
    decompositionCategoryEClass.getESuperTypes().add(this.getStpaAnalysisElement());
    stpaAnalysisEClass.getESuperTypes().add(this.getStpaAnalysisElement());
    stpaAnalysisEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
    analysisPackageEClass.getESuperTypes().add(this.getStpaAnalysisElement());
    technicalPackageEClass.getESuperTypes().add(this.getAnalysisPackage());
    lossPackageEClass.getESuperTypes().add(this.getAnalysisPackage());
    hazardConstraintPackageEClass.getESuperTypes().add(this.getAnalysisPackage());
    controlStructurePackageEClass.getESuperTypes().add(this.getAnalysisPackage());
    lossScenarioPackageEClass.getESuperTypes().add(this.getAnalysisPackage());
    stakeholderEClass.getESuperTypes().add(this.getUserIdentifiedElement());
    stakeEClass.getESuperTypes().add(this.getUserIdentifiedElement());
    lossEClass.getESuperTypes().add(this.getUserIdentifiedElement());
    controlFlawTargetEClass.getESuperTypes().add(this.getUserIdentifiedElement());
    g1 = createEGenericType(this.getDecomposable());
    g2 = createEGenericType(this.getHazard());
    g1.getETypeArguments().add(g2);
    hazardEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getControlFlawTarget());
    hazardEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getDecomposable());
    g2 = createEGenericType(this.getSystemConstraint());
    g1.getETypeArguments().add(g2);
    systemConstraintEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getControlFlawTarget());
    systemConstraintEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getDecomposable());
    g2 = createEGenericType(this.getControlEntity());
    g1.getETypeArguments().add(g2);
    controlEntityEClass.getEGenericSuperTypes().add(g1);
    exchangeBasedElementEClass.getESuperTypes().add(this.getStpaAnalysisElement());
    responsibilityEClass.getESuperTypes().add(this.getUserIdentifiedElement());
    responsibilityEClass.getESuperTypes().add(this.getExchangeBasedElement());
    processModelVariableEClass.getESuperTypes().add(this.getUserIdentifiedElement());
    processModelVariableEClass.getESuperTypes().add(this.getExchangeBasedElement());
    g1 = createEGenericType(this.getArchitectureMappable());
    g2 = createEGenericType(theCapellacorePackage.getNamedElement());
    g1.getETypeArguments().add(g2);
    processModelValueEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getArchitectureMappable());
    g2 = createEGenericType(theCapellacorePackage.getNamedElement());
    g1.getETypeArguments().add(g2);
    relationEClass.getEGenericSuperTypes().add(g1);
    controlFlawContextEClass.getESuperTypes().add(this.getUserIdentifiedElement());
    exchangeElementEClass.getESuperTypes().add(this.getUserIdentifiedElement());
    exchangeElementEClass.getESuperTypes().add(this.getControlFlawContext());
    controlRelationEClass.getESuperTypes().add(this.getRelation());
    controlActionEClass.getESuperTypes().add(this.getExchangeElement());
    responsibilitySupportExchangeElementEClass.getESuperTypes().add(this.getExchangeElement());
    feedbackRelationEClass.getESuperTypes().add(this.getRelation());
    feedbackElementEClass.getESuperTypes().add(this.getResponsibilitySupportExchangeElement());
    informationExchangeRelationEClass.getESuperTypes().add(this.getRelation());
    pieceOfInformationEClass.getESuperTypes().add(this.getResponsibilitySupportExchangeElement());
    mitigableEClass.getESuperTypes().add(this.getStpaAnalysisElement());
    controlFlawAnalysisElementEClass.getESuperTypes().add(this.getUserIdentifiedElement());
    controlFlawAnalysisElementEClass.getESuperTypes().add(this.getMitigable());
    unsafeControlActionEClass.getESuperTypes().add(this.getControlFlawAnalysisElement());
    unsafeControlActionEClass.getESuperTypes().add(this.getControlFlawContext());
    lossScenarioEClass.getESuperTypes().add(this.getControlFlawAnalysisElement());
    unsafeControlActionCategoryEClass.getESuperTypes().add(this.getStpaAnalysisElement());
    controlFlawSetEClass.getESuperTypes().add(this.getStpaAnalysisElement());
    g1 = createEGenericType(this.getStpaAnalysisElement());
    controlFlawEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getArchitectureMappable());
    g2 = createEGenericType(theCapellacorePackage.getNamedElement());
    g1.getETypeArguments().add(g2);
    controlFlawEClass.getEGenericSuperTypes().add(g1);
    g1 = createEGenericType(this.getMitigable());
    controlFlawEClass.getEGenericSuperTypes().add(g1);

    // Initialize classes and features; add operations and parameters
    initEClass(stpaAnalysisElementEClass, StpaAnalysisElement.class, "StpaAnalysisElement", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);

    addEOperation(stpaAnalysisElementEClass, this.getStpaAnalysis(), "getAnalysis", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(architectureMappableEClass, ArchitectureMappable.class, "ArchitectureMappable", IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(architectureMappableEClass_T);
    initEReference(getArchitectureMappable_ArchitectureElements(), g1, null, "architectureElements", null, 0, -1, //$NON-NLS-1$
        ArchitectureMappable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userIdentifiedElementEClass, UserIdentifiedElement.class, "UserIdentifiedElement", IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUserIdentifiedElement_UserID(), ecorePackage.getEString(), "userID", null, 1, 1, //$NON-NLS-1$
        UserIdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(decomposableEClass, Decomposable.class, "Decomposable", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(this.getDecompositionCategory());
    g2 = createEGenericType(decomposableEClass_T);
    g1.getETypeArguments().add(g2);
    initEReference(getDecomposable_DecompositionCategories(), g1, null, "decompositionCategories", null, 0, -1, //$NON-NLS-1$
        Decomposable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(this.getDecompositionCategory());
    g2 = createEGenericType(decomposableEClass_T);
    g1.getETypeArguments().add(g2);
    initEReference(getDecomposable_Category(), g1, this.getDecompositionCategory_Coverage(), "category", null, 0, 1, //$NON-NLS-1$
        Decomposable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(decomposableEClass, ecorePackage.getEBoolean(), "isRoot", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(decomposableEClass, ecorePackage.getEBoolean(), "isLeaf", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    EOperation op = addEOperation(decomposableEClass, null, "getDecomposition", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    g1 = createEGenericType(decomposableEClass_T);
    initEOperation(op, g1);

    op = addEOperation(decomposableEClass, null, "getComposite", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    g1 = createEGenericType(decomposableEClass_T);
    initEOperation(op, g1);

    op = addEOperation(decomposableEClass, null, "getOrderedDecomposition", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    g1 = createEGenericType(decomposableEClass_T);
    initEOperation(op, g1);

    op = addEOperation(decomposableEClass, null, "getRoot", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    g1 = createEGenericType(decomposableEClass_T);
    initEOperation(op, g1);

    op = addEOperation(decomposableEClass, null, "getSubtree", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    g1 = createEGenericType(decomposableEClass_T);
    initEOperation(op, g1);

    op = addEOperation(decomposableEClass, null, "getUncategorized", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    g1 = createEGenericType(decomposableEClass_T);
    initEOperation(op, g1);

    initEClass(decompositionCategoryEClass, DecompositionCategory.class, "DecompositionCategory", !IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(decompositionCategoryEClass_T);
    initEReference(getDecompositionCategory_Coverage(), g1, this.getDecomposable_Category(), "coverage", null, 0, -1, //$NON-NLS-1$
        DecompositionCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = addEOperation(decompositionCategoryEClass, null, "getOrderedCoverage", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
    g1 = createEGenericType(decompositionCategoryEClass_T);
    initEOperation(op, g1);

    initEClass(stpaAnalysisEClass, StpaAnalysis.class, "StpaAnalysis", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStpaAnalysis_TechnicalPackage(), this.getTechnicalPackage(), null, "technicalPackage", null, 0, 1, //$NON-NLS-1$
        StpaAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStpaAnalysis_LossPackage(), this.getLossPackage(), null, "lossPackage", null, 0, 1, //$NON-NLS-1$
        StpaAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStpaAnalysis_HazardConstraintPackage(), this.getHazardConstraintPackage(), null,
        "hazardConstraintPackage", null, 0, 1, StpaAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
        IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStpaAnalysis_ControlStructurePackage(), this.getControlStructurePackage(), null,
        "controlStructurePackage", null, 0, 1, StpaAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
        IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStpaAnalysis_LossScenarioPackage(), this.getLossScenarioPackage(), null, "lossScenarioPackage", //$NON-NLS-1$
        null, 0, 1, StpaAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStpaAnalysis_System(), this.getControlEntity(), null, "system", null, 0, 1, StpaAnalysis.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getStpaAnalysis_SubAnalyses(), this.getStpaAnalysis(), null, "subAnalyses", null, 0, -1, //$NON-NLS-1$
        StpaAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(analysisPackageEClass, AnalysisPackage.class, "AnalysisPackage", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(technicalPackageEClass, TechnicalPackage.class, "TechnicalPackage", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTechnicalPackage_UnsafeControlActionCategories(), this.getUnsafeControlActionCategory(), null,
        "unsafeControlActionCategories", null, 0, -1, TechnicalPackage.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
        IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lossPackageEClass, LossPackage.class, "LossPackage", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLossPackage_Stakeholders(), this.getStakeholder(), null, "stakeholders", null, 0, -1, //$NON-NLS-1$
        LossPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLossPackage_Losses(), this.getLoss(), null, "losses", null, 0, -1, LossPackage.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(hazardConstraintPackageEClass, HazardConstraintPackage.class, "HazardConstraintPackage", !IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHazardConstraintPackage_RootHazards(), this.getHazard(), null, "rootHazards", null, 0, -1, //$NON-NLS-1$
        HazardConstraintPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHazardConstraintPackage_RootSystemConstraints(), this.getSystemConstraint(), null,
        "rootSystemConstraints", null, 0, -1, HazardConstraintPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
        IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlStructurePackageEClass, ControlStructurePackage.class, "ControlStructurePackage", !IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getControlStructurePackage_RootEntities(), this.getControlEntity(), null, "rootEntities", null, 0, //$NON-NLS-1$
        -1, ControlStructurePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lossScenarioPackageEClass, LossScenarioPackage.class, "LossScenarioPackage", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLossScenarioPackage_LossScenarios(), this.getLossScenario(), null, "lossScenarios", null, 0, -1, //$NON-NLS-1$
        LossScenarioPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStakeholder_Stakes(), this.getStake(), this.getStake_Stakeholder(), "stakes", null, 0, -1, //$NON-NLS-1$
        Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stakeEClass, Stake.class, "Stake", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getStake_Stakeholder(), this.getStakeholder(), this.getStakeholder_Stakes(), "stakeholder", null, 1, //$NON-NLS-1$
        1, Stake.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStake_Losses(), this.getLoss(), this.getLoss_Stakes(), "losses", null, 0, -1, Stake.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(lossEClass, Loss.class, "Loss", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getLoss_Hazards(), this.getHazard(), this.getHazard_Losses(), "hazards", null, 0, -1, Loss.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getLoss_Stakes(), this.getStake(), this.getStake_Losses(), "stakes", null, 0, -1, Loss.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(controlFlawTargetEClass, ControlFlawTarget.class, "ControlFlawTarget", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);

    addEOperation(controlFlawTargetEClass, this.getUnsafeControlAction(), "getUnsafeControlActions", 0, -1, IS_UNIQUE, //$NON-NLS-1$
        IS_ORDERED);

    addEOperation(controlFlawTargetEClass, this.getLossScenario(), "getLossScenarios", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(hazardEClass, Hazard.class, "Hazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEAttribute(getHazard_UnsafeCondition(), ecorePackage.getEString(), "unsafeCondition", null, 0, 1, Hazard.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHazard_SubHazards(), this.getHazard(), null, "subHazards", null, 0, -1, Hazard.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getHazard_Losses(), this.getLoss(), this.getLoss_Hazards(), "losses", null, 0, -1, Hazard.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getHazard_SystemConstraints(), this.getSystemConstraint(), this.getSystemConstraint_Hazards(),
        "systemConstraints", null, 0, -1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHazard_UnsafeControlActions(), this.getUnsafeControlAction(),
        this.getUnsafeControlAction_Hazards(), "unsafeControlActions", null, 0, -1, Hazard.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getHazard_LossScenarios(), this.getLossScenario(), this.getLossScenario_Hazards(), "lossScenarios", //$NON-NLS-1$
        null, 0, -1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemConstraintEClass, SystemConstraint.class, "SystemConstraint", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystemConstraint_ConditionToEnforce(), ecorePackage.getEString(), "conditionToEnforce", null, 0, //$NON-NLS-1$
        1, SystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemConstraint_SubSystemConstraints(), this.getSystemConstraint(), null, "subSystemConstraints", //$NON-NLS-1$
        null, 0, -1, SystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemConstraint_Hazards(), this.getHazard(), this.getHazard_SystemConstraints(), "hazards", null, //$NON-NLS-1$
        0, -1, SystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemConstraint_Responsibilities(), this.getResponsibility(),
        this.getResponsibility_SystemConstraints(), "responsibilities", null, 0, -1, SystemConstraint.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemConstraint_UnsafeControlActions(), this.getUnsafeControlAction(),
        this.getUnsafeControlAction_ViolatedConstraints(), "unsafeControlActions", null, 0, -1, SystemConstraint.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemConstraint_LossScenarios(), this.getLossScenario(),
        this.getLossScenario_ViolatedConstraints(), "lossScenarios", null, 0, -1, SystemConstraint.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getSystemConstraint_Assumptions(), theCapellacorePackage.getConstraint(), null, "assumptions", null, //$NON-NLS-1$
        0, -1, SystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlEntityEClass, ControlEntity.class, "ControlEntity", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getControlEntity_Process(), ecorePackage.getEBoolean(), "process", null, 1, 1, ControlEntity.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControlEntity_SubEntities(), this.getControlEntity(), null, "subEntities", null, 0, -1, //$NON-NLS-1$
        ControlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControlEntity_Responsibilities(), this.getResponsibility(), this.getResponsibility_Controller(),
        "responsibilities", null, 0, -1, ControlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControlEntity_OutgoingRelations(), this.getRelation(), this.getRelation_Source(),
        "outgoingRelations", null, 0, -1, ControlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControlEntity_IncomingRelations(), this.getRelation(), this.getRelation_Target(),
        "incomingRelations", null, 0, -1, ControlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControlEntity_ProcessModel(), this.getProcessModelVariable(),
        this.getProcessModelVariable_Controller(), "processModel", null, 0, -1, ControlEntity.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    addEOperation(controlEntityEClass, ecorePackage.getEBoolean(), "isController", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(controlEntityEClass, ecorePackage.getEBoolean(), "isControlled", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(controlEntityEClass, ecorePackage.getEBoolean(), "isSystem", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(controlEntityEClass, this.getControlAction(), "getIncomingControlActions", 0, -1, IS_UNIQUE, //$NON-NLS-1$
        IS_ORDERED);

    addEOperation(controlEntityEClass, this.getExchangeElement(), "getIncomingExchangeElements", 0, -1, IS_UNIQUE, //$NON-NLS-1$
        IS_ORDERED);

    addEOperation(controlEntityEClass, this.getFeedbackElement(), "getIncomingFeedback", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(controlEntityEClass, this.getPieceOfInformation(), "getIncomingInformation", 0, -1, IS_UNIQUE, //$NON-NLS-1$
        IS_ORDERED);

    addEOperation(controlEntityEClass, this.getControlAction(), "getOutgoingControlActions", 0, -1, IS_UNIQUE, //$NON-NLS-1$
        IS_ORDERED);

    addEOperation(controlEntityEClass, this.getExchangeElement(), "getOutgoingExchangeElements", 0, -1, IS_UNIQUE, //$NON-NLS-1$
        IS_ORDERED);

    addEOperation(controlEntityEClass, this.getFeedbackElement(), "getOutgoingFeedback", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(controlEntityEClass, this.getPieceOfInformation(), "getOutgoingInformation", 0, -1, IS_UNIQUE, //$NON-NLS-1$
        IS_ORDERED);

    initEClass(exchangeBasedElementEClass, ExchangeBasedElement.class, "ExchangeBasedElement", IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(exchangeBasedElementEClass, this.getFeedbackElement(), "getFeedback", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(exchangeBasedElementEClass, this.getPieceOfInformation(), "getInformation", 0, -1, IS_UNIQUE, //$NON-NLS-1$
        IS_ORDERED);

    addEOperation(exchangeBasedElementEClass, this.getExchangeElement(), "getControlActions", 0, -1, IS_UNIQUE, //$NON-NLS-1$
        IS_ORDERED);

    initEClass(responsibilityEClass, Responsibility.class, "Responsibility", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResponsibility_ProcessModelState(), ecorePackage.getEString(), "processModelState", null, 0, 1, //$NON-NLS-1$
        Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getResponsibility_Controller(), this.getControlEntity(), this.getControlEntity_Responsibilities(),
        "controller", null, 1, 1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResponsibility_SystemConstraints(), this.getSystemConstraint(),
        this.getSystemConstraint_Responsibilities(), "systemConstraints", null, 0, -1, Responsibility.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getResponsibility_ControlActions(), this.getExchangeElement(),
        this.getExchangeElement_ExercisedResponsibilities(), "controlActions", null, 0, -1, Responsibility.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getResponsibility_Feedback(), this.getFeedbackElement(), this.getFeedbackElement_Responsibilities(),
        "feedback", null, 0, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResponsibility_Information(), this.getPieceOfInformation(),
        this.getPieceOfInformation_Responsibilities(), "information", null, 0, -1, Responsibility.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getResponsibility_Variables(), this.getProcessModelVariable(),
        this.getProcessModelVariable_Responsibilities(), "variables", null, 0, -1, Responsibility.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    addEOperation(responsibilityEClass, this.getExchangeElement(), "getExchangeElements", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(processModelVariableEClass, ProcessModelVariable.class, "ProcessModelVariable", !IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcessModelVariable_Controller(), this.getControlEntity(), this.getControlEntity_ProcessModel(),
        "controller", null, 1, 1, ProcessModelVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessModelVariable_Responsibilities(), this.getResponsibility(),
        this.getResponsibility_Variables(), "responsibilities", null, 0, -1, ProcessModelVariable.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getProcessModelVariable_Values(), this.getProcessModelValue(), this.getProcessModelValue_Variable(),
        "values", null, 0, -1, ProcessModelVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessModelVariable_Feedback(), this.getFeedbackElement(),
        this.getFeedbackElement_ProcessModel(), "feedback", null, 0, -1, ProcessModelVariable.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getProcessModelVariable_Information(), this.getPieceOfInformation(),
        this.getPieceOfInformation_ProcessModel(), "information", null, 0, -1, ProcessModelVariable.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessModelVariable_ControlActions(), this.getExchangeElement(),
        this.getExchangeElement_SupportingProcessModel(), "controlActions", null, 0, -1, ProcessModelVariable.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(processModelValueEClass, ProcessModelValue.class, "ProcessModelValue", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcessModelValue_Variable(), this.getProcessModelVariable(),
        this.getProcessModelVariable_Values(), "variable", null, 1, 1, ProcessModelValue.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getRelation_Source(), this.getControlEntity(), this.getControlEntity_OutgoingRelations(), "source", //$NON-NLS-1$
        null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Target(), this.getControlEntity(), this.getControlEntity_IncomingRelations(), "target", //$NON-NLS-1$
        null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(relationEClass, this.getExchangeElement(), "getExchangeElements", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(controlFlawContextEClass, ControlFlawContext.class, "ControlFlawContext", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getControlFlawContext_ControlFlawSet(), this.getControlFlawSet(), this.getControlFlawSet_Context(),
        "controlFlawSet", null, 0, 1, ControlFlawContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
        IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(controlFlawContextEClass, this.getExchangeElement(), "getControlAction", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(exchangeElementEClass, ExchangeElement.class, "ExchangeElement", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExchangeElement_ExercisedResponsibilities(), this.getResponsibility(),
        this.getResponsibility_ControlActions(), "exercisedResponsibilities", null, 0, -1, ExchangeElement.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getExchangeElement_LossScenarios(), this.getLossScenario(), this.getLossScenario_ControlAction(),
        "lossScenarios", null, 0, -1, ExchangeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExchangeElement_SupportingProcessModel(), this.getProcessModelVariable(),
        this.getProcessModelVariable_ControlActions(), "supportingProcessModel", null, 0, -1, ExchangeElement.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getExchangeElement_UnsafeControlActions(), this.getUnsafeControlAction(),
        this.getUnsafeControlAction_ControlAction(), "unsafeControlActions", null, 0, -1, ExchangeElement.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    addEOperation(exchangeElementEClass, this.getRelation(), "getRelation", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(exchangeElementEClass, this.getControlFlaw(), "getControlFlaws", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(exchangeElementEClass, this.getControlEntity(), "getController", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(exchangeElementEClass, this.getControlEntity(), "getProcess", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(controlRelationEClass, ControlRelation.class, "ControlRelation", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getControlRelation_ControlActions(), this.getControlAction(), this.getControlAction_Relation(),
        "controlActions", null, 0, -1, ControlRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlActionEClass, ControlAction.class, "ControlAction", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getControlAction_Relation(), this.getControlRelation(), this.getControlRelation_ControlActions(),
        "relation", null, 1, 1, ControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(responsibilitySupportExchangeElementEClass, ResponsibilitySupportExchangeElement.class,
        "ResponsibilitySupportExchangeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

    addEOperation(responsibilitySupportExchangeElementEClass, this.getProcessModelVariable(), "getProcessModel", 0, -1, //$NON-NLS-1$
        IS_UNIQUE, IS_ORDERED);

    addEOperation(responsibilitySupportExchangeElementEClass, this.getResponsibility(), "getResponsibilities", 0, -1, //$NON-NLS-1$
        IS_UNIQUE, IS_ORDERED);

    initEClass(feedbackRelationEClass, FeedbackRelation.class, "FeedbackRelation", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeedbackRelation_Feedback(), this.getFeedbackElement(), this.getFeedbackElement_Relation(),
        "feedback", null, 0, -1, FeedbackRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(feedbackElementEClass, FeedbackElement.class, "FeedbackElement", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeedbackElement_Relation(), this.getFeedbackRelation(), this.getFeedbackRelation_Feedback(),
        "relation", null, 1, 1, FeedbackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeedbackElement_Responsibilities(), this.getResponsibility(), this.getResponsibility_Feedback(),
        "responsibilities", null, 0, -1, FeedbackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeedbackElement_ProcessModel(), this.getProcessModelVariable(),
        this.getProcessModelVariable_Feedback(), "processModel", null, 0, -1, FeedbackElement.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(informationExchangeRelationEClass, InformationExchangeRelation.class, "InformationExchangeRelation", //$NON-NLS-1$
        !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInformationExchangeRelation_Information(), this.getPieceOfInformation(),
        this.getPieceOfInformation_Relation(), "information", null, 0, -1, InformationExchangeRelation.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(pieceOfInformationEClass, PieceOfInformation.class, "PieceOfInformation", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPieceOfInformation_Relation(), this.getInformationExchangeRelation(),
        this.getInformationExchangeRelation_Information(), "relation", null, 1, 1, PieceOfInformation.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getPieceOfInformation_Responsibilities(), this.getResponsibility(),
        this.getResponsibility_Information(), "responsibilities", null, 0, -1, PieceOfInformation.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getPieceOfInformation_ProcessModel(), this.getProcessModelVariable(),
        this.getProcessModelVariable_Information(), "processModel", null, 0, -1, PieceOfInformation.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(mitigableEClass, Mitigable.class, "Mitigable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEReference(getMitigable_Countermeasures(), theCapellacorePackage.getConstraint(), null, "countermeasures", null, //$NON-NLS-1$
        0, -1, Mitigable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(mitigableEClass, this.getExchangeElement(), "getControlAction", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    initEClass(controlFlawAnalysisElementEClass, ControlFlawAnalysisElement.class, "ControlFlawAnalysisElement", //$NON-NLS-1$
        IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(controlFlawAnalysisElementEClass, this.getSystemConstraint(), "getViolatedConstraints", 1, -1, //$NON-NLS-1$
        IS_UNIQUE, IS_ORDERED);

    addEOperation(controlFlawAnalysisElementEClass, this.getHazard(), "getHazards", 1, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(controlFlawAnalysisElementEClass, this.getControlFlaw(), "getCausalFactors", 0, -1, IS_UNIQUE, //$NON-NLS-1$
        IS_ORDERED);

    initEClass(unsafeControlActionEClass, UnsafeControlAction.class, "UnsafeControlAction", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnsafeControlAction_Kind(), this.getUnsafeControlActionKind(), "kind", null, 1, 1, //$NON-NLS-1$
        UnsafeControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnsafeControlAction_Context(), ecorePackage.getEString(), "context", null, 0, 1, //$NON-NLS-1$
        UnsafeControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getUnsafeControlAction_ControlAction(), this.getExchangeElement(),
        this.getExchangeElement_UnsafeControlActions(), "controlAction", null, 1, 1, UnsafeControlAction.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getUnsafeControlAction_LossScenarios(), this.getLossScenario(),
        this.getLossScenario_UnsafeControlAction(), "lossScenarios", null, 0, -1, UnsafeControlAction.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getUnsafeControlAction_ViolatedConstraints(), this.getSystemConstraint(),
        this.getSystemConstraint_UnsafeControlActions(), "violatedConstraints", null, 0, -1, UnsafeControlAction.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getUnsafeControlAction_Hazards(), this.getHazard(), this.getHazard_UnsafeControlActions(), "hazards", //$NON-NLS-1$
        null, 0, -1, UnsafeControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lossScenarioEClass, LossScenario.class, "LossScenario", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLossScenario_ControlAction(), this.getExchangeElement(), this.getExchangeElement_LossScenarios(),
        "controlAction", null, 1, 1, LossScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLossScenario_UnsafeControlAction(), this.getUnsafeControlAction(),
        this.getUnsafeControlAction_LossScenarios(), "unsafeControlAction", null, 0, 1, LossScenario.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getLossScenario_CausalFactors(), this.getControlFlaw(), this.getControlFlaw_LossScenarios(),
        "causalFactors", null, 0, -1, LossScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLossScenario_ViolatedConstraints(), this.getSystemConstraint(),
        this.getSystemConstraint_LossScenarios(), "violatedConstraints", null, 0, -1, LossScenario.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getLossScenario_Hazards(), this.getHazard(), this.getHazard_LossScenarios(), "hazards", null, 0, -1, //$NON-NLS-1$
        LossScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unsafeControlActionCategoryEClass, UnsafeControlActionCategory.class, "UnsafeControlActionCategory", //$NON-NLS-1$
        !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnsafeControlActionCategory_Kind(), this.getUnsafeControlActionKind(), "kind", null, 1, 1, //$NON-NLS-1$
        UnsafeControlActionCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlFlawSetEClass, ControlFlawSet.class, "ControlFlawSet", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getControlFlawSet_ControlFlaws(), this.getControlFlaw(), this.getControlFlaw_OwningSet(),
        "controlFlaws", null, 0, -1, ControlFlawSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControlFlawSet_Context(), this.getControlFlawContext(),
        this.getControlFlawContext_ControlFlawSet(), "context", null, 1, 1, ControlFlawSet.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(controlFlawEClass, ControlFlaw.class, "ControlFlaw", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getControlFlaw_Kind(), this.getControlFlawKind(), "kind", null, 1, 1, ControlFlaw.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getControlFlaw_Verdict(), this.getControlFlawVerdict(), "verdict", null, 1, 1, ControlFlaw.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControlFlaw_OwningSet(), this.getControlFlawSet(), this.getControlFlawSet_ControlFlaws(),
        "owningSet", null, 1, 1, ControlFlaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getControlFlaw_Justification(), ecorePackage.getEString(), "justification", null, 0, 1, //$NON-NLS-1$
        ControlFlaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getControlFlaw_LossScenarios(), this.getLossScenario(), this.getLossScenario_CausalFactors(),
        "lossScenarios", null, 0, -1, ControlFlaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, //$NON-NLS-1$
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(controlFlawEClass, this.getControlFlawContext(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    addEOperation(controlFlawEClass, this.getExchangeElement(), "getControlAction", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

    // Initialize enums and add enum literals
    initEEnum(unsafeControlActionKindEEnum, UnsafeControlActionKind.class, "UnsafeControlActionKind"); //$NON-NLS-1$
    addEEnumLiteral(unsafeControlActionKindEEnum, UnsafeControlActionKind.NOT_PROVIDING);
    addEEnumLiteral(unsafeControlActionKindEEnum, UnsafeControlActionKind.PROVIDING);
    addEEnumLiteral(unsafeControlActionKindEEnum, UnsafeControlActionKind.WRONG_TIMING);
    addEEnumLiteral(unsafeControlActionKindEEnum, UnsafeControlActionKind.WRONG_DURATION);

    initEEnum(controlFlawKindEEnum, ControlFlawKind.class, "ControlFlawKind"); //$NON-NLS-1$
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.CONTROL_INPUT);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.CONTROL_ALGORITHM);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.PROCESS_MODEL);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.CONTROLLER_TO_ACTUATOR);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.ACTUATOR);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.ACTUATOR_TO_PROCESS);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.PROCESS_FAILURE);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.PROCESS_CHANGE);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.PROCESS_CONFLICT);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.PROCESS_INPUT);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.PROCESS_DISTURBANCE);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.PROCESS_OUTPUT);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.PROCESS_TO_SENSOR_DELAY);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.PROCESS_TO_SENSOR_INACCURATE);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.PROCESS_TO_SENSOR_INCORRECT);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.SENSOR);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.SENSOR_TO_CONTROLLER_DELAY);
    addEEnumLiteral(controlFlawKindEEnum, ControlFlawKind.SENSOR_TO_CONTROLLER_INADEQUATE);

    initEEnum(controlFlawVerdictEEnum, ControlFlawVerdict.class, "ControlFlawVerdict"); //$NON-NLS-1$
    addEEnumLiteral(controlFlawVerdictEEnum, ControlFlawVerdict.UNDEFINED);
    addEEnumLiteral(controlFlawVerdictEEnum, ControlFlawVerdict.OK);
    addEEnumLiteral(controlFlawVerdictEEnum, ControlFlawVerdict.KO);
    addEEnumLiteral(controlFlawVerdictEEnum, ControlFlawVerdict.NA);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
    createConstraintAnnotations();
    // http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
    createConstraintMappingAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createConstraintAnnotations() {
    String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$
    addAnnotation(stpaAnalysisEClass, source,
        new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/modeller/1.4.0#//ModelRoot" //$NON-NLS-1$ //$NON-NLS-2$
        });
  }

  /**
   * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createConstraintMappingAnnotations() {
    String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping"; //$NON-NLS-1$
    addAnnotation(stpaAnalysisEClass, source, new String[] { "Mapping", //$NON-NLS-1$
        " platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaModeller.ecore#//ModelRoot" //$NON-NLS-1$
    });
  }

} //StpaPackageImpl
