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
package com.thalesgroup.mde.capella.stpa.design;

import static com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper.getAllMulti;
import static com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper.getInverseArchitectureElements;
import static com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper.getInverseCountermeasures;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.ACTUATOR;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.ACTUATOR_TO_PROCESS;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.CONTROLLER_TO_ACTUATOR;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.CONTROL_ALGORITHM;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.CONTROL_INPUT;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.PROCESS_CHANGE;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.PROCESS_CONFLICT;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.PROCESS_DISTURBANCE;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.PROCESS_FAILURE;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.PROCESS_INPUT;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.PROCESS_MODEL;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.PROCESS_OUTPUT;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.PROCESS_TO_SENSOR_DELAY;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.PROCESS_TO_SENSOR_INACCURATE;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.PROCESS_TO_SENSOR_INCORRECT;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.SENSOR;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.SENSOR_TO_CONTROLLER_DELAY;
import static com.thalesgroup.mde.capella.stpa.model.ControlFlawKind.SENSOR_TO_CONTROLLER_INADEQUATE;
import static com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind.NOT_PROVIDING;
import static com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind.PROVIDING;
import static com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind.WRONG_TIMING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.common.ef.ExecutionManager;
import org.polarsys.capella.common.helpers.TransactionHelper;
import org.polarsys.capella.core.data.capellacore.CapellacoreFactory;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.model.preferences.IDeletePreferences;
import org.polarsys.capella.core.platform.sirius.ui.actions.CapellaDeleteAction;
import org.polarsys.capella.core.platform.sirius.ui.commands.CapellaDeleteCommand;
import org.polarsys.capella.core.sirius.analysis.CapellaServices;
import org.polarsys.capella.core.sirius.analysis.CsServices;

import com.thalesgroup.mde.capella.stpa.helpers.AbstractSTPADependencySwitch;
import com.thalesgroup.mde.capella.stpa.helpers.STPADownstreamSwitch;
import com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper;
import com.thalesgroup.mde.capella.stpa.helpers.STPAUpstreamSwitch;
import com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable;
import com.thalesgroup.mde.capella.stpa.model.ControlAction;
import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawContext;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawKind;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawSet;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict;
import com.thalesgroup.mde.capella.stpa.model.ControlRelation;
import com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage;
import com.thalesgroup.mde.capella.stpa.model.Decomposable;
import com.thalesgroup.mde.capella.stpa.model.DecompositionCategory;
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
import com.thalesgroup.mde.capella.stpa.model.Stake;
import com.thalesgroup.mde.capella.stpa.model.Stakeholder;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysis;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;
import com.thalesgroup.mde.capella.stpa.model.StpaFactory;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;
import com.thalesgroup.mde.capella.stpa.model.SystemConstraint;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind;
import com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement;
import com.thalesgroup.mde.capella.stpa.model.provider.StpaEditPlugin;


/**
 * The service class for complex behavior in the odesign specification.
 */
public class Services {
  
  /** The max length of shortened names */
  protected static final int SHORT_NAME_LENGTH = 20;
  
  /**
   * Constants representing the analysis status of a control flaw.
   * Values are used in odesign file.
   */
  public final int CONTROL_FLAW_TBD = 0;
  public final int CONTROL_FLAW_OK = 1;
  public final int CONTROL_FLAW_KO = 2;
  public final int CONTROL_FLAW_KO_HANDLED = 3;
  public final int CONTROL_FLAW_NA = 4;
  
  /**
   * The attributes which must not be visible in the Properties view
   */
  protected static final List<EAttribute> NON_PROPERTY_ATTRIBUTES = Arrays.asList(
      ModellingcorePackage.Literals.MODEL_ELEMENT__ID,
      ModellingcorePackage.Literals.MODEL_ELEMENT__SID,
      ModellingcorePackage.Literals.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC,
      ModellingcorePackage.Literals.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM,
      CapellacorePackage.Literals.CAPELLA_ELEMENT__DESCRIPTION,
      CapellacorePackage.Literals.CAPELLA_ELEMENT__REVIEW,
      CapellacorePackage.Literals.CAPELLA_ELEMENT__SUMMARY,
      StpaPackage.Literals.CONTROL_FLAW__KIND);
  
  /**
   * The references which must not be visible in the Properties view
   */
  protected static final List<EReference> NON_PROPERTY_REFERENCES = Arrays.asList(
      CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES,
      CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS,
      CapellacorePackage.Literals.CAPELLA_ELEMENT__FEATURES,
      CapellacorePackage.Literals.CAPELLA_ELEMENT__STATUS,
      StpaPackage.Literals.DECOMPOSABLE__CATEGORY,
      StpaPackage.Literals.CONTROL_ENTITY__INCOMING_RELATIONS,
      StpaPackage.Literals.RELATION__TARGET);
  
  
  /**
   * Add the given elements and their associated constraints and mapped architecture
   * elements to the given collection
   * @param result a non-null collection
   * @param elements a non-null collection
   */
  protected void addAllWithConstraints(Collection<EObject> result,
      Collection<? extends EObject> elements) {
    for (EObject element : elements) {
      addWithConstraints(result, element);
    }
  }
  
  /**
   * Add the Capella elements mapped to the given element to the given collection
   * @param result a non-null collection
   * @param element a non-null element
   */
  protected void addArchitectureElements(Collection<EObject> result, EObject element) {
    if (element instanceof ArchitectureMappable<?>) {
      ArchitectureMappable<?> mappable = (ArchitectureMappable<?>) element;
      result.addAll(mappable.getArchitectureElements());
    }
  }
  
  /**
   * Add the given element and its associated constraints and mapped Capella elements
   * to the given collection
   * @param result a non-null collection
   * @param element a non-null element
   */
  protected void addWithConstraints(Collection<EObject> result, EObject element) {
    result.add(element);
    if (element instanceof ModelElement) {
      result.addAll(((ModelElement) element).getConstraints());
    }
    result.add(element);
    addArchitectureElements(result, element);
  }
  
  /**
   * Return all main elements involved in the given analysis
   * @param analysis a non-null STPA analysis
   * @return a non-null, potentially empty collection
   */
  public List<EObject> allAnalysisElements(StpaAnalysis analysis) {
    List<EObject> result = new LinkedList<>();
    // Losses
    LossPackage pack = analysis.getLossPackage();
    if (pack != null) {
      for (Stakeholder sh : pack.getStakeholders()) {
        result.add(sh);
        result.addAll(sh.getStakes());
      }
      result.addAll(pack.getLosses());
    }
    // Hazards, System Constraints
    result.addAll(allHazards(analysis));
    result.addAll(allSystemConstraints(analysis));
    // Controllers
    List<ControlEntity> allEntities = allEntities(analysis);
    for (ControlEntity entity : allEntities) {
      if (!entity.isController())
        continue;
      result.add(entity);
      // Design constraints
      result.addAll(entity.getConstraints());
      // Responsibilities
      result.addAll(entity.getResponsibilities());
      // Process Model
      result.addAll(entity.getProcessModel());
      for (Relation relation : entity.getOutgoingRelations()) {
        if (relation instanceof ControlRelation) {
          // Control Actions
          List<ControlAction> controlActions = ((ControlRelation)relation).getControlActions();
          result.addAll(controlActions);
          for (ControlAction ca : controlActions) {
            // UCAs
            result.addAll(ca.getUnsafeControlActions());
          }
        } else {
          // Feedback Elements and Pieces of Information
          result.addAll(relation.getExchangeElements());
        }
      }
    }
    // Loss Scenarios
    LossScenarioPackage lsPack = analysis.getLossScenarioPackage();
    if (lsPack != null) {
      List<LossScenario> scenarios = lsPack.getLossScenarios();
      for (LossScenario scenario : scenarios) {
        result.add(scenario);
        // Design constraints (again, if not associated to a controller)
        result.addAll(
            scenario.getCountermeasures().stream().filter(
                c -> c.getConstrainedElements().stream().anyMatch(ce -> ce instanceof ControlEntity)).
            collect(Collectors.toList()));
      }
    }
    return result;
  }
  
  /**
   * Return all elements involved in dependencies of the given element
   * @param element a non-null STPA analysis element
   * @return a non-null, potentially empty collection
   */
  public Collection<EObject> allContextualDependencyElements(EObject element) {
    Collection<EObject> result = new LinkedHashSet<>();
    addArchitectureElements(result, element);
    AbstractSTPADependencySwitch downSwitch = new STPADownstreamSwitch(element);
    AbstractSTPADependencySwitch upSwitch = new STPAUpstreamSwitch(element);
    allContextualDependencyElements(element, result, downSwitch);
    allContextualDependencyElements(element, result, upSwitch);
    return result;
  }
  
  /**
   * Add all elements involved in dependencies of the given analysis elements
   * in the given collection based on the given element as driving context
   * @param context a non-null element
   * @param elements a non-null, potentially empty collection of elements
   * @param result a non-null, modifiable list
   * @param downstream whether to consider dependencies going downstream or upstream
   */
  protected void allContextualDependencyElements(Collection<? extends EObject> elements,
      Collection<EObject> result, AbstractSTPADependencySwitch dependencySwitch) {
    for (EObject element : elements) {
      allContextualDependencyElements(element, result, dependencySwitch);
    }
  }
  
  /**
   * Add all elements involved in dependencies of the given element
   * in the given collection
   * @param element a potentially null STPA analysis element
   * @param result a non-null, modifiable list
   */
  protected void allContextualDependencyElements(EObject element,
		  Collection<EObject> result, AbstractSTPADependencySwitch dependencySwitch) {
    if (element == null || (result.contains(element) && element != dependencySwitch.getContext())) {
      return;
    }
    result.add(element);
    List<? extends EObject> allNext = dependencySwitch.doSwitch(element);
    if (allNext != null) {
      allContextualDependencyElements(allNext, result, dependencySwitch);
    }
  }
  
  /**
   * Return all elements involved in dependencies of the given analysis
   * @param analysis a non-null STPA analysis
   * @return a non-null, potentially empty collection
   */
  public Collection<EObject> allDependencyElements(StpaAnalysis analysis) {
    Set<EObject> result = new LinkedHashSet<>();
    // Losses
    LossPackage pack = analysis.getLossPackage();
    if (pack != null) {
    	List<Stakeholder> stakeholders = pack.getStakeholders();
    	addAllWithConstraints(result, stakeholders);
    	for (Stakeholder stakeholder : stakeholders) {
    		addAllWithConstraints(result, stakeholder.getStakes());
    	}
    	addAllWithConstraints(result, pack.getLosses());
    }
    // Hazards, System Constraints
    addAllWithConstraints(result, allHazards(analysis));
    addAllWithConstraints(result, allSystemConstraints(analysis));
    // Control Entities
    List<ControlEntity> allEntities = allEntities(analysis);
    addAllWithConstraints(result, allEntities);
    // Within Control Entities
    for (ControlEntity entity : allEntities) {
      // Responsibilities
      addAllWithConstraints(result, entity.getResponsibilities());
      // Relations
      for (Responsibility responsibility : entity.getResponsibilities()) {
        // Control Actions
        List<ExchangeElement> exchangeElements = new LinkedList<>();
        exchangeElements.addAll(responsibility.getControlActions());
        exchangeElements.addAll(responsibility.getFeedback());
        exchangeElements.addAll(responsibility.getInformation());
        addAllWithConstraints(result, exchangeElements);
        for (ExchangeElement ca : responsibility.getControlActions()) {
          // Control Flaws
          List<ControlFlaw> controlFlaws = ca.getControlFlaws();
          addAllWithConstraints(result, controlFlaws);
          for (ControlFlaw controlFlaw : controlFlaws) {
            result.addAll(controlFlaw.getCountermeasures());
          }
          // UCAs
          addAllWithConstraints(result, ca.getUnsafeControlActions());
        }
      }
    }
    // Loss Scenarios
    LossScenarioPackage lsPack = analysis.getLossScenarioPackage();
    if (lsPack != null) {
      List<LossScenario> scenarios = lsPack.getLossScenarios();
      addAllWithConstraints(result, scenarios);
      for (LossScenario scenario : scenarios) {
        result.addAll(scenario.getCausalFactors());
        result.addAll(scenario.getCountermeasures());
      }
    }
    return result;
  }
  
  /**
   * Return all entities in the given analysis
   * @param analysis a non-null STPA analysis
   * @return a non-null, potentially empty collection
   */
  public List<ControlEntity> allEntities(StpaAnalysis analysis) {
    List<ControlEntity> result = new LinkedList<>();
    ControlStructurePackage pack = analysis.getControlStructurePackage();
    if (pack != null) {
      getAllMulti(pack.getRootEntities(), result);
    }
    return result;
  }
  
  /**
   * Return all hazards in the given analysis
   * @param analysis a non-null STPA analysis
   * @return a non-null, potentially empty collection
   */
  public List<Hazard> allHazards(StpaAnalysis analysis) {
    List<Hazard> result = new LinkedList<>();
    HazardConstraintPackage pack = analysis.getHazardConstraintPackage();
    if (pack != null) {
      getAllMulti(pack.getRootHazards(), result);
    }
    return result;
  }
  
  /**
   * Return all system constraints in the given analysis
   * @param analysis a non-null STPA analysis
   * @return a non-null, potentially empty collection
   */
  public List<SystemConstraint> allSystemConstraints(StpaAnalysis analysis) {
    List<SystemConstraint> result = new LinkedList<>();
    HazardConstraintPackage pack = analysis.getHazardConstraintPackage();
    if (pack != null) {
      getAllMulti(pack.getRootSystemConstraints(), result);
    }
    return result;
  }
  
  /**
   * Return all elements involved as analysis sources of the given element
   * @param target a non-null STPA or Capella element
   * @return a non-null, potentially empty collection
   */
  public List<ModelElement> analysisSources(ModelElement target) {
    List<ModelElement> result = new LinkedList<>();
    if (target instanceof Stakeholder) {
      // Stakeholder: Nothing
    } else if (target instanceof Stake) {
      // Stake
      Stake casted = (Stake) target;
      result.add(casted.getStakeholder());
    } else if (target instanceof Loss) {
      // Loss
      Loss casted = (Loss) target;
      result.addAll(casted.getStakes());
    } else if (target instanceof Hazard) {
      // Hazard
      Hazard casted = (Hazard) target;
      result.addAll(casted.getLosses());
    } else if (target instanceof SystemConstraint) {
      // SystemConstraint
      SystemConstraint casted = (SystemConstraint) target;
      result.addAll(casted.getHazards());
    } else if (target instanceof Responsibility) {
      // Responsibility
      Responsibility casted = (Responsibility) target;
      result.addAll(casted.getSystemConstraints());
    } else if (target instanceof ControlEntity) {
      // ControlEntity
      ControlEntity casted = (ControlEntity) target;
      result.addAll(casted.getResponsibilities());
    } else if (target instanceof ControlAction) {
      // ControlAction
      ControlAction casted = (ControlAction) target;
      result.add(casted.getController());
    } else if (target instanceof ProcessModelVariable) {
      // ProcessModelVariable
      ProcessModelVariable casted = (ProcessModelVariable) target;
      result.addAll(casted.getControlActions());
      for (Responsibility responsibility : casted.getResponsibilities()) {
        result.addAll(responsibility.getControlActions());
      }
    } else if (target instanceof FeedbackElement || target instanceof PieceOfInformation) {
      // Feedback Element | Piece of information
      ExchangeElement casted = (ExchangeElement) target;
      result.addAll(casted.getSupportingProcessModel());
      for (Responsibility responsibility : casted.getExercisedResponsibilities()) {
        result.addAll(responsibility.getVariables());
      }
    } else if (target instanceof UnsafeControlAction) {
      // UnsafeControlAction
      UnsafeControlAction casted = (UnsafeControlAction) target;
      result.add(casted.getControlAction());
    } else if (target instanceof LossScenario) {
      // Loss Scenario
      LossScenario casted = (LossScenario) target;
      result.add(casted.getControlAction());
      result.add(casted.getUnsafeControlAction());
    } else if (target instanceof Constraint) {
      // Design constraint
      Constraint casted = (Constraint) target;
      Collection<Mitigable> mitigables = getInverseCountermeasures(casted);
      for (Mitigable mitigable : mitigables) {
        if (mitigable instanceof LossScenario || mitigable instanceof UnsafeControlAction) {
          result.add(mitigable);
        }
      }
    }
    return result;
  }
  
  /**
   * Return all elements involved as analysis targets of the given element
   * @param source a non-null STPA or Capella element
   * @return a non-null, potentially empty collection
   */
  public List<ModelElement> analysisTargets(ModelElement source) {
    List<ModelElement> result = new LinkedList<>();
    if (source instanceof Stakeholder) {
      // Stakeholder
      Stakeholder casted = (Stakeholder) source;
      result.addAll(casted.getStakes());
    } else if (source instanceof Stake) {
      // Stake
      Stake casted = (Stake) source;
      result.addAll(casted.getLosses());
    } else if (source instanceof Loss) {
      // Loss
      Loss casted = (Loss) source;
      result.addAll(casted.getHazards());
    } else if (source instanceof Hazard) {
      // Hazard
      Hazard casted = (Hazard) source;
      result.addAll(casted.getSystemConstraints());
    } else if (source instanceof SystemConstraint) {
      // SystemConstraint
      SystemConstraint casted = (SystemConstraint) source;
      result.addAll(casted.getResponsibilities());
      result.addAll(casted.getAssumptions());
    } else if (source instanceof Responsibility) {
      // Responsibility
      Responsibility casted = (Responsibility) source;
      ControlEntity controller = casted.getController();
      if (controller != null) {
        result.add(controller);
      }
    } else if (source instanceof ControlEntity) {
      // ControlEntity
      ControlEntity casted = (ControlEntity) source;
      for (Relation relation : casted.getOutgoingRelations()) {
        if (relation instanceof ControlRelation) {
          result.addAll(relation.getExchangeElements());
        }
      }
    } else if (source instanceof ControlAction) {
      // ControlAction
      ControlAction casted = (ControlAction) source;
      Collection<ModelElement> processModel = new LinkedHashSet<>();
      processModel.addAll(casted.getSupportingProcessModel());
      for (Responsibility responsibility : casted.getExercisedResponsibilities()) {
        processModel.addAll(responsibility.getVariables());
      }
      result.addAll(processModel);
      result.addAll(casted.getUnsafeControlActions());
      result.addAll(casted.getLossScenarios());
    } else if (source instanceof ProcessModelVariable) {
      // ProcessModelVariable
      ProcessModelVariable casted = (ProcessModelVariable) source;
      Collection<ModelElement> exchanges = new LinkedHashSet<>();
      exchanges.addAll(casted.getFeedback());
      exchanges.addAll(casted.getInformation());
      for (Responsibility responsibility : casted.getResponsibilities()) {
        exchanges.addAll(responsibility.getFeedback());
        exchanges.addAll(responsibility.getInformation());
      }
      result.addAll(exchanges);
    } else if (source instanceof UnsafeControlAction) {
      // UnsafeControlAction
      UnsafeControlAction casted = (UnsafeControlAction) source;
      result.addAll(casted.getHazards());
      result.addAll(casted.getViolatedConstraints());
      result.addAll(casted.getLossScenarios());
      result.addAll(casted.getCountermeasures());
    } else if (source instanceof LossScenario) {
      // Loss Scenario
      LossScenario casted = (LossScenario) source;
      result.addAll(casted.getHazards());
      result.addAll(casted.getViolatedConstraints());
      result.addAll(casted.getCountermeasures());
    } else if (source instanceof Constraint) {
      // Design constraint
      Constraint casted = (Constraint) source;
      for (ModelElement element : casted.getConstrainedElements()) {
        if (element instanceof ControlEntity) {
          result.add(element);
        }
      }
    }
    return result;
  }
  
  /**
   * Return the elements that are closely related to the given one from a
   * high-level analysis perspective
   * @param source a non-null element
   * @return a non-null, potentially empty collection
   */
  public List<ModelElement> analysisVicinity(ModelElement element) {
    List<ModelElement> result = analysisTargets(element);
    if (element instanceof Decomposable<?>) {
      Decomposable<?> casted = (Decomposable<?>) element;
      Decomposable<?> parent = casted.getComposite();
      if (parent != null) {
        result.add(parent);
      }
      result.addAll(casted.getDecomposition());
    }
    result.addAll(analysisSources(element));
    return result;
  }
  
  /**
   * Execute the "Arrange all" behavior on the current diagram if applicable
   * @return whether the behavior was executed
   */
  protected boolean arrangeAll() {
    boolean result = false;
    DiagramEditPart dep = DesignUtil.getActiveDiagramEditPart();
    if (dep != null) {
      ArrangeRequest arrangeRequest = new ArrangeRequest(ActionIds.ACTION_ARRANGE_ALL);
      arrangeRequest.setPartsToArrange(Collections.singletonList(dep));
      dep.performRequest(arrangeRequest);
    }
    return result;
  }

  /**
   * Clear the given feature of the given element and return the element
   * @param element a non-null element
   * @param feature a non-null feature
   * @return the non-null element
   */
  public EObject clearFeature(EObject element, EStructuralFeature feature) {
    element.eUnset(feature);
    return element;
  }
  
  /**
   * Return a label for the given constraint
   * @param constraint a non-null constraint
   * @return a non-null, potentially empty string
   */
  public String constraintLabel(Constraint constraint) {
    return CapellaServices.getService().getConstraintLabel(constraint);
  }
  
  /**
   * Return a label for the given control flaw kind
   * @param kind a non-null kind
   * @return a non-null string
   */
  public String controlFlawKindLabel(ControlFlawKind kind) {
    String result = null;
    switch (kind) {
    case CONTROL_INPUT:
      result = "Control input or external information wrong or missing";
      break;
    case CONTROL_ALGORITHM:
      result = "Inadequate";
      break;
    case PROCESS_MODEL:
      result = "Inconsistent, incomplete or incorrect";
      break;
    case CONTROLLER_TO_ACTUATOR:
      result = "Inappropriate, ineffective or missing control action";
      break;
    case ACTUATOR:
      result = "Inadequate operation";
      break;
    case ACTUATOR_TO_PROCESS:
      result = "Delayed operation";
      break;
    case PROCESS_FAILURE:
      result = "Component failures";
      break;
    case PROCESS_CHANGE:
      result = "Changes over time";
      break;
    case PROCESS_CONFLICT:
      result = "Conflicting control actions";
      break;
    case PROCESS_INPUT:
      result = "Process input missing or wrong";
      break;
    case PROCESS_DISTURBANCE:
      result = "Unidentified or out-of-range disturbance";
      break;
    case PROCESS_OUTPUT:
      result = "Process output contributing to system hazard";
      break;
    case PROCESS_TO_SENSOR_DELAY:
      result = "Feedback delays";
      break;
    case PROCESS_TO_SENSOR_INACCURATE:
      result = "Measurement inaccuracies";
      break;
    case PROCESS_TO_SENSOR_INCORRECT:
      result = "Incorrect or no information provided";
      break;
    case SENSOR:
      result = "Inadequate operation";
      break;
    case SENSOR_TO_CONTROLLER_DELAY:
      result = "Feedback delays";
      break;
    case SENSOR_TO_CONTROLLER_INADEQUATE:
      result = "Inadequate or missing feedback";
      break;
    }
    return result;
  }
  
  /**
   * Return a label for the given control flaw
   * @param flaw a non-null control flaw assumed fully initialized
   * @return a non-null string
   */
  public String controlFlawLabel(ControlFlaw flaw) {
    String result = flaw.getName();
    if (result == null || result.length() == 0) {
      StringBuilder builder = new StringBuilder();
      ControlFlawKind kind = flaw.getKind();
      ExchangeElement ca = flaw.getControlAction();
      ControlEntity controller = ca.getController();
      List<Responsibility> resps = ca.getExercisedResponsibilities();
      boolean hasResp = !resps.isEmpty();
      builder.append(controlFlawKindLabel(kind));
      List<NamedElement> additions = new UniqueEList<NamedElement>();
      if (kind == ControlFlawKind.CONTROL_INPUT) {
        if (hasResp) {
          for (Responsibility resp : resps) {
            additions.addAll(resp.getFeedback());
            additions.addAll(resp.getInformation());
          }
        } else {
          additions.addAll(controller.getIncomingFeedback());
          additions.addAll(controller.getIncomingInformation());
        }
        additions.addAll(controller.getIncomingControlActions());
        List<FeedbackElement> loopFeedback = getControlLoopFeedback(ca);
        additions.removeAll(loopFeedback);
      } else if (kind == ControlFlawKind.PROCESS_MODEL) {
        if (hasResp) {
          for (Responsibility resp : resps) {
            additions.addAll(resp.getVariables());
          }
        } else {
          additions.addAll(controller.getProcessModel());
        }
      } else if (kind == ControlFlawKind.PROCESS_CONFLICT) {
        ControlEntity process = ca.getProcess();
        if (process != null) {
          additions.addAll(process.getIncomingControlActions());
          additions.remove(ca);
        }
      } else if (kind == ControlFlawKind.PROCESS_INPUT) {
        ControlEntity process = ca.getProcess();
        if (process != null) {
          additions.addAll(process.getIncomingFeedback());
          additions.addAll(process.getIncomingInformation());
        }
      }
      List<String> inputNames = new LinkedList<>(
          additions.stream().map(ee -> fullLabel(ee)).collect(Collectors.toList()));
      Collections.sort(inputNames);
      for (String inputName : inputNames) {
        builder.append('\n');
        builder.append(inputName);
      }
      result = builder.toString();
    }
    return result;
  }
  
  /**
   * Return the analysis status of the given control flaw
   * @param flaw a non-null control flaw
   * @return a positive int that is one of the constants declared in this class
   */
  public int controlFlawStatus(ControlFlaw flaw) {
    int result = CONTROL_FLAW_TBD;
    if (flaw.getVerdict() == ControlFlawVerdict.OK && isJustified(flaw)) {
        result = CONTROL_FLAW_OK;
    } else if (flaw.getVerdict() == ControlFlawVerdict.KO) {
      boolean isHandled = !flaw.getLossScenarios().isEmpty();
      result = isHandled? CONTROL_FLAW_KO_HANDLED: CONTROL_FLAW_KO;
    } else if (flaw.getVerdict() == ControlFlawVerdict.NA && isJustified(flaw)) {
      result = CONTROL_FLAW_NA;
    }
    return result;
  }
  
  /**
   * Create and return a new assumption refining the given System Constraint
   * @param sc a non-null element
   * @return a non-null constraint
   */
  public Constraint createAssumption(SystemConstraint sc) {
    Constraint result = createConstraint(sc);
    sc.getAssumptions().add(result);
    return result;
  }
  
  /**
   * Create and return a new constraint in the given container
   * @param context a non-null element
   * @return a non-null constraint
   */
  public Constraint createConstraint(ModelElement context) {
    return createConstraint(context, false);
  }
  
  /**
   * Create and return a new constraint in the given container
   * @param context a non-null element
   * @param applyConstraint whether the constraint must be applied to the container
   * @return a non-null constraint
   */
  public Constraint createConstraint(ModelElement context, boolean applyConstraint) {
    Constraint result = CapellacoreFactory.eINSTANCE.createConstraint();
    context.getOwnedConstraints().add(result);
    if (applyConstraint) {
      result.getConstrainedElements().add(context);
    }
    creationService(result);
    return result;
  }
  
  /**
   * Create and return a new control action for the given relation
   * @param relation a non-null relation
   * @return a non-null new element
   */
  public ControlAction createControlAction(ControlRelation relation) {
    return createControlAction(relation, null);
  }
  
  /**
   * Create and return a new control action of the given name for the given relation
   * @param relation a non-null relation
   * @param name a potentially null string
   * @return a non-null new element
   */
  public ControlAction createControlAction(ControlRelation relation, String name) {
    ControlAction result = StpaFactory.eINSTANCE.createControlAction();
    relation.getControlActions().add(result);
    reidentify(result);
    if (name == null) {
      creationService(result);
    } else {
      result.setName(name);
    }
    return result;
  }
  
  /**
   * Create and return a new control relation between the given source and target
   * @param source a non-null entity
   * @param target a non-null entity
   * @return a non-null new relation if successful, null otherwise
   */
  public ControlRelation createControlRelation(ControlEntity source, ControlEntity target) {
    ControlRelation result = StpaFactory.eINSTANCE.createControlRelation();
    result.setSource(source);
    result.setTarget(target);
    return result;
  }
  
  /**
   * Create and return a new child decomposable of the given decomposable or category
   * @return a non-null decomposable
   */
  @SuppressWarnings("unchecked")
  public Decomposable<?> createDecomposableChild(StpaAnalysisElement decomposableOrCategory) {
    Decomposable<?> result = null;
    boolean isCategory = decomposableOrCategory instanceof DecompositionCategory<?>;
    boolean isDecomposable = decomposableOrCategory instanceof Decomposable<?>;
    if (isCategory || isDecomposable) {
      DecompositionCategory<?> category = isCategory?
          (DecompositionCategory<?>) decomposableOrCategory: null;
      Decomposable<?> container = category != null? (Decomposable<?>) category.eContainer():
        (Decomposable<?>) decomposableOrCategory; // Non-null
      if (container instanceof Hazard) {
        // Hazard
        Hazard casted = StpaFactory.eINSTANCE.createHazard();
        ((Hazard) container).getSubHazards().add(casted);
        result = casted;
      } else if (container instanceof SystemConstraint) {
        // SystemConstraint
        SystemConstraint casted = StpaFactory.eINSTANCE.createSystemConstraint();
        ((SystemConstraint) container).getSubSystemConstraints().add(casted);
        result = casted;
      } else {
        // ControlEntity
        ControlEntity casted = StpaFactory.eINSTANCE.createControlEntity();
        ((ControlEntity) container).getSubEntities().add(casted);
        result = casted;
      }
      if (category != null) {
        ((List<Object>)category.getCoverage()).add(result);
      }
      reidentify(result); 
      creationService(result);
    }
    return result;
  }
  
  /**
   * Create default control flaws for the given element
   * @param context a non-null element
   * @return the same non-null element, filled with previously missing flaws
   */
  public ControlFlawContext createDefaultFlaws(ControlFlawContext context) {
    ControlFlawSet flawSet = context.getControlFlawSet();
    if (flawSet == null) {
        flawSet = StpaFactory.eINSTANCE.createControlFlawSet();
        context.setControlFlawSet(flawSet);
    }
    boolean forUCA = context instanceof UnsafeControlAction;
    for (ControlFlawKind cfKind : ControlFlawKind.values()) {
      if (forUCA && isForUCAAnalysis(cfKind) ||
          !forUCA && isForControlActionAnalysis(cfKind)) {
        ControlFlaw flaw = getControlFlaw(context, cfKind);
        if (flaw == null) {
          flaw = StpaFactory.eINSTANCE.createControlFlaw();
          flaw.setKind(cfKind);
          flaw.setVerdict(ControlFlawVerdict.UNDEFINED);
          flawSet.getControlFlaws().add(flaw);
        }
      }
    }
    return context;
  }
  
  /**
   * Create and return a new entity in the given container
   * @param container a non-null element
   * @param process whether the entity is a process, not a controller
   * @return a non-null new entity if successful, null otherwise
   */
  public ControlEntity createEntity(EObject container, boolean process) {
    ControlEntity result = null;
    List<ControlEntity> siblings = subEntities(container);
    if (siblings != null) {
      result = StpaFactory.eINSTANCE.createControlEntity();
      result.setProcess(process);
      siblings.add(result);
      reidentify(result);
      creationService(result);
    }
    return result;
  }
  
  /**
   * Create and return a new exchange element for the given relation
   * @param relation a non-null relation
   * @return a non-null new element
   */
  public ExchangeElement createExchange(Relation relation) {
    return (relation instanceof ControlRelation)? createControlAction((ControlRelation) relation):
      (relation instanceof FeedbackRelation)? createFeedback((FeedbackRelation) relation):
        createInformation((InformationExchangeRelation) relation);
  }
  
  /**
   * Create and return a new feedback for the given relation
   * @param relation a non-null relation
   * @return a non-null new element
   */
  public FeedbackElement createFeedback(FeedbackRelation relation) {
    return createFeedback(relation, null);
  }
  
  /**
   * Create and return a new feedback of the given name for the given relation
   * @param relation a non-null relation
   * @param name a potentially null string
   * @return a non-null new element
   */
  public FeedbackElement createFeedback(FeedbackRelation relation, String name) {
    FeedbackElement result = StpaFactory.eINSTANCE.createFeedbackElement();
    relation.getFeedback().add(result);
    reidentify(result);
    if (name == null) {
      creationService(result);
    } else {
      result.setName(name);
    }
    return result;
  }
  
  /**
   * Create and return a new feedback relation between the given source and target
   * @param source a non-null entity
   * @param target a non-null entity
   * @return a non-null new relation if successful, null otherwise
   */
  public FeedbackRelation createFeedbackRelation(ControlEntity source, ControlEntity target) {
    FeedbackRelation result = StpaFactory.eINSTANCE.createFeedbackRelation();
    result.setSource(target); // Inversion wrt. graphical direction
    result.setTarget(source);
    return result;
  }
  
  /**
   * Create and return a new piece of information for the given relation
   * @param relation a non-null relation
   * @return a non-null new element
   */
  public PieceOfInformation createFeedback(InformationExchangeRelation relation) {
    return createInformation(relation, null);
  }
  
  /**
   * Create and return a new piece of information for the given relation
   * @param relation a non-null relation
   * @return a non-null new element
   */
  public PieceOfInformation createInformation(InformationExchangeRelation relation) {
    return createInformation(relation, null);
  }
  
  /**
   * Create and return a new piece of information of the given name for the given relation
   * @param relation a non-null relation
   * @param name a potentially null string
   * @return a non-null new element
   */
  public PieceOfInformation createInformation(InformationExchangeRelation relation, String name) {
    PieceOfInformation result = StpaFactory.eINSTANCE.createPieceOfInformation();
    relation.getInformation().add(result);
    reidentify(result);
    if (name == null) {
      creationService(result);
    } else {
      result.setName(name);
    }
    return result;
  }
  
  /**
   * Create and return a new information exchange relation between the given source and target
   * @param source a non-null entity
   * @param target a non-null entity
   * @return a non-null new relation if successful, null otherwise
   */
  public InformationExchangeRelation createInformationExchangeRelation(
      ControlEntity source, ControlEntity target) {
    InformationExchangeRelation result = StpaFactory.eINSTANCE.createInformationExchangeRelation();
    result.setSource(source);
    result.setTarget(target);
    return result;
  }
  
  /**
   * Create an element in the given relation through user interactions
   * @param relation a non-null relation
   * @return the non-null relation
   */
  public Relation createRelationElement(Relation relation) {
    String defaultName = null;
    String defaultType = null;
    if (relation instanceof ControlRelation) {
      defaultName = "New Control Action";
      defaultType = "control action";
    } else if (relation instanceof FeedbackRelation) {
      defaultName = "New Feedback";
      defaultType = "feedback";
    } else if (relation instanceof InformationExchangeRelation) {
      defaultName = "New Piece of Information";
      defaultType = "piece of information";
    }
    final Set<String> names = new HashSet<>(STPAQueryHelper.Naming.names(relation.getExchangeElements()));
    IInputValidator validator = new IInputValidator() {
      @Override
      public String isValid(String newText) {
        String result = null;
        String trimmedText = newText.trim();
        if (trimmedText == null || trimmedText.length() == 0) {
          result = "Name must not be empty.";
        } else if (names.contains(trimmedText)) {
          result = "Name must be unique.";
        }
        return result;
      }
    };
    InputDialog dialog = new InputDialog(getShell(), defaultName,
        String.format("Please enter a name for the new %1$s.", defaultType), defaultName, validator);
    int status = dialog.open();
    if (Window.OK == status) {
      String name = dialog.getValue().trim();
      UserIdentifiedElement newElement = null;
      if (relation instanceof ControlRelation) {
        newElement = createControlAction((ControlRelation) relation, name);
      } else if (relation instanceof FeedbackRelation) {
        newElement = createFeedback((FeedbackRelation) relation, name);
      } else if (relation instanceof InformationExchangeRelation) {
        newElement = createInformation((InformationExchangeRelation) relation, name);
      }
      reidentify(newElement);
    }
    return relation;
  }
  
  /**
   * Create and return a new UCA of the given kind for the given control action
   * @param action a non-null control action
   * @param kind a non-null UCA kind
   * @return a non-null new UCA
   */
  public UnsafeControlAction createUnsafeControlAction(
      ExchangeElement action, UnsafeControlActionKind kind) {
    UnsafeControlAction result = StpaFactory.eINSTANCE.createUnsafeControlAction();
    action.getUnsafeControlActions().add(result);
    result.setKind(kind);
    reidentify(result);
    creationService(result);
    return result;
  }
  
  /**
   * Carry out post-creation operations on the given new Capella element
   * @param context a non-null new element
   * @return the same non-null element
   */
  public EObject creationService(EObject context) {
    return CapellaServices.getService().creationService(context);
  }
  
  /**
   * Delete the given elements with the Capella delete command
   * @param toDelete a non-null, potentially empty list
   * @return whether the operation was successfully performed
   */
  public boolean delete(Collection<? extends EObject> toDelete) {
    return delete(toDelete, true);
  }
  
  /**
   * Delete the given elements with the Capella delete command
   * @param toDelete a non-null, potentially empty list
   * @param allowConfirmation whether a confirmation dialog may be used if activated in the preferences
   * @return whether the operation was successfully performed
   */
  public boolean delete(Collection<? extends EObject> toDelete, boolean allowConfirmation) {
    boolean result = false;
    ExecutionManager executionManager = TransactionHelper.getExecutionManager(toDelete);
    if (CapellaDeleteAction.canDelete(toDelete) && executionManager != null) {
      boolean confirmed = true;
      if (allowConfirmation && IDeletePreferences.INSTANCE.isConfirmationRequired()) {
        confirmed = CapellaDeleteCommand.confirmDeletion(executionManager, toDelete);
      }
      if (confirmed) {
        CapellaDeleteCommand deleteCmd = new CapellaDeleteCommand(
            executionManager, toDelete, false, false, false);
        deleteCmd.execute();
        result = true;
      }
    }
    return result;
  }
  
  /**
   * Return all elements involved as dependencies of the given element
   * @param source a non-null STPA or Capella element
   * @return a non-null, potentially empty collection
   */
  public List<EObject> dependencyTargets(NamedElement source) {
    List<EObject> result = new UniqueEList<>();
    addArchitectureElements(result, source);
    AbstractSTPADependencySwitch downSwitch = new STPADownstreamSwitch(null);
    List<? extends EObject> directDependencies = downSwitch.doSwitch(source);
    if (directDependencies != null) {
      result.addAll(directDependencies);
    }
    return result;
  }
  
  /**
   * Perform a drag'n'drop of the given entity to the given container
   * @param element a non-null entity
   * @param newContainer a non-null element
   * @return the non-null element
   */
  public EObject dnd(EObject element, EObject newContainer) {
    if (element instanceof ControlEntity && element.eContainer() != newContainer) {
      List<ControlEntity> siblings = subEntities(newContainer);
      if (siblings != null) {
        siblings.add((ControlEntity)element);
      }
    }
    return element;
  }
  
  /**
   * Return the EMF Edit label of the given element, if available
   * @param element a non-null element
   * @return a potentially null string
   */
  public String editLabel(EObject element) {
    return STPAQueryHelper.getEditLabel(element);
  }
  
  /**
   * Return a label for the given entity
   * @param entity a non-null entity
   * @return a potentially null string
   */
  public String entityLabel(ControlEntity entity) {
    return fullLabel(entity);
  }
  
  /**
   * Return all elements involved as folding dependencies of the given element
   * @param source a non-null STPA or Capella element
   * @return a non-null, potentially empty collection
   */
  public List<NamedElement> foldingDependencyTargets(NamedElement source) {
    List<NamedElement> result = new LinkedList<>();
    if (source instanceof ControlFlawContext) {
      // ControlFlaws
      ControlAction casted = (ControlAction) source;
      result.addAll(casted.getControlFlaws());
    }
    return result;
  }
  
  /**
   * Return a full label for the given element
   * @param element a non-null element
   * @param includeTypeName whether to include the name of the type in the label
   * @return a potentially null string
   */
  public String fullLabel(NamedElement element, boolean includeTypeName) {
    String result = editLabel(element);
    if (includeTypeName) {
      String typeName = typeName(element);
      if (typeName != null && typeName.length() > 0) {
        if (result == null || result.length() == 0) {
          result = typeName;
        } else {
          if (element instanceof UserIdentifiedElement && result.startsWith("(")) {
            int closingParPosition = result.indexOf(")");
            if (closingParPosition > 0 && result.length() > closingParPosition + 2) {
              result = "(" + typeName + " " + result.substring(1, closingParPosition + 1) + '\n' +
                  result.substring(closingParPosition + 2);
            } else {
              result = "(" + typeName + " " + result.substring(1);
            }
          }
        }
      }
    }
    return result;
  }
  
  /**
   * Return a full label for the given element
   * @param element a non-null element
   * @return a potentially null string
   */
  public String fullLabel(NamedElement element) {
    return fullLabel(element, false);
  }
  
  /**
   * Return a string made of the full labels of the given elements
   * @param elements a non-null potentially empty collection
   * @return a non-null string
   */
  public String fullLabels(Collection<? extends NamedElement> elements) {
    return fullLabels(elements, false, ", ");
  }
  
  /**
   * Return a string made of the full labels of the given elements
   * @param element a non-null element
   * @param includeTypeName whether to include the name of the type in the label
   * @param separator a separator for the labels
   * @return a non-null string
   */
  public String fullLabels(Collection<? extends NamedElement> elements, boolean includeTypeName,
      String separator) {
    StringBuilder builder = new StringBuilder();
    boolean first = true;
    for (NamedElement element : elements) {
      if (first) {
        first = false;
      } else {
        builder.append(separator);
      }
      builder.append(fullLabel(element, includeTypeName));
    }
    return builder.toString();
  }
  
  /**
   * Return candidate architecture elements for the given STPA element
   * @param element a non-null STPA element
   * @return a non-null, potentially empty list
   */
  public List<EObject> getArchitectureCandidates(ArchitectureMappable<?> element) {
    List<EObject> result = new LinkedList<>();
    Class<?> expectedType = NamedElement.class; //element instanceof ControlEntity? Component.class:
    SystemEngineering se = STPAQueryHelper.getSystemEngineering(element);
    if (se != null) {
      TreeIterator<EObject> it = se.eAllContents();
      while (it.hasNext()) {
        EObject current = it.next();
        if (expectedType.isInstance(current)) {
          result.add(current);
        }
      }
    }
    return result;
  }
  
  /**
   * Return the assumptions in the analysis of the given element
   * @param element a non-null element
   * @return a non-null, potentially empty list
   */
  public List<Constraint> getAssumptions(StpaAnalysisElement element) {
    List<Constraint> result = new LinkedList<>();
    Deque<SystemConstraint> remaining = new LinkedList<>();
    HazardConstraintPackage pkg = element.getAnalysis().getHazardConstraintPackage();
    if (pkg != null) {
      remaining.addAll(pkg.getRootSystemConstraints());
      while (!remaining.isEmpty()) {
        SystemConstraint head = remaining.pop();
        result.addAll(head.getAssumptions());
        remaining.addAll(head.getSubSystemConstraints());
      }
    }
    return result;
  }
  
  /**
   * Return the STPA elements that are mapped to the given architecture element
   * @param element a non-null element
   * @return a non-null, potentially empty set
   */
  public Collection<EObject> getArchitectureElementMappers(NamedElement element) {
    return getInverseArchitectureElements(element);
  }
  
  /**
   * Return the Loss Package of the given analysis, creating it if needed
   * @param analysis a non-null analysis
   * @return a non-null package
   */
  public LossPackage getCreateLossPackage(StpaAnalysis analysis) {
    return (LossPackage) STPAQueryHelper.getOrCreateAnalysisPackage(
        analysis, StpaPackage.Literals.STPA_ANALYSIS__LOSS_PACKAGE);
  }
  
  /**
   * Return the Hazard/Constraint Package of the given analysis, creating it if needed
   * @param analysis a non-null analysis
   * @return a non-null package
   */
  public HazardConstraintPackage getCreateHCPackage(StpaAnalysis analysis) {
    return (HazardConstraintPackage) STPAQueryHelper.getOrCreateAnalysisPackage(
        analysis, StpaPackage.Literals.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE);
  }
  
  /**
   * Return the Control Structure Package of the given analysis, creating it if needed
   * @param analysis a non-null analysis
   * @return a non-null package
   */
  public ControlStructurePackage getCreateCSPackage(StpaAnalysis analysis) {
    return (ControlStructurePackage) STPAQueryHelper.getOrCreateAnalysisPackage(
        analysis, StpaPackage.Literals.STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE);
  }
  
  /**
   * Return the Loss Scenario Package of the given analysis, creating it if needed
   * @param analysis a non-null analysis
   * @return a non-null package
   */
  public LossScenarioPackage getCreateLossScenarioPackage(StpaAnalysis analysis) {
    return (LossScenarioPackage) STPAQueryHelper.getOrCreateAnalysisPackage(
        analysis, StpaPackage.Literals.STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE);
  }
  
  /**
   * Return the control flaw of the given kind for the given Control Flaw Context
   * @param context a non-null Control Flaw Context
   * @param kind a non-null kind
   * @return a non-null ControlFlaw assuming the Control Flaw Context has been properly initialized
   */
  public ControlFlaw getControlFlaw(ControlFlawContext context, ControlFlawKind kind) {
    ControlFlaw result = null;
    ControlFlawSet flawSet = context.getControlFlawSet();
    if (flawSet != null) {
      for (ControlFlaw flaw : flawSet.getControlFlaws()) {
        if (flaw.getKind() == kind) {
          return flaw;
        }
      }
    }
    return result;
  }
  
  /**
   * Return the element that plays the role of source for the edge
   * representing the given control flaw, if relevant
   * @param flaw a non-null control flaw
   * @return a potentially null element
   */
  public StpaAnalysisElement getControlLoopEdgeSource(ControlFlaw flaw) {
    ControlFlawKind kind = flaw.getKind();
    ControlLoopElement clKind = getControlLoopEdgeSource(kind);
    StpaAnalysisElement result = getControlLoopElement(flaw, clKind);
    return result;
  }
  
  /**
   * Return the source control loop element for the given flaw kind
   * @param kind a non-null object
   * @return a potentially null object
   */
  protected ControlLoopElement getControlLoopEdgeSource(ControlFlawKind kind) {
    ControlLoopElement result;
    switch (kind) {
    case CONTROLLER_TO_ACTUATOR:
      result = ControlLoopElement.CONTROLLER;
      break;
    case ACTUATOR_TO_PROCESS:
      result = ControlLoopElement.ACTUATOR;
      break;
    case PROCESS_TO_SENSOR_DELAY:
    case PROCESS_TO_SENSOR_INACCURATE:
    case PROCESS_TO_SENSOR_INCORRECT:
    case PROCESS_OUTPUT:
      result = ControlLoopElement.PROCESS;
      break;
    case SENSOR_TO_CONTROLLER_DELAY:
    case SENSOR_TO_CONTROLLER_INADEQUATE:
      result = ControlLoopElement.SENSOR;
      break;
    case CONTROL_INPUT:
    case PROCESS_INPUT:
    case PROCESS_CONFLICT:
    case PROCESS_DISTURBANCE:
      result = ControlLoopElement.EXTERNAL;
      break;
    case ACTUATOR:
    case CONTROL_ALGORITHM:
    case PROCESS_CHANGE:
    case PROCESS_FAILURE:
    case PROCESS_MODEL:
    case SENSOR:
    default:
      result = null;
    }
    return result;
  }
  
  /**
   * Return the source control loop element for the given flaw kind
   * @param kind a non-null object
   * @return a potentially null object
   */
  protected ControlLoopElement getControlLoopEdgeTarget(ControlFlawKind kind) {
    ControlLoopElement result;
    switch (kind) {
    case CONTROLLER_TO_ACTUATOR:
      result = ControlLoopElement.ACTUATOR;
      break;
    case ACTUATOR_TO_PROCESS:
    case PROCESS_INPUT:
    case PROCESS_CONFLICT:
    case PROCESS_DISTURBANCE:
      result = ControlLoopElement.PROCESS;
      break;
    case PROCESS_TO_SENSOR_DELAY:
    case PROCESS_TO_SENSOR_INACCURATE:
    case PROCESS_TO_SENSOR_INCORRECT:
      result = ControlLoopElement.SENSOR;
      break;
    case SENSOR_TO_CONTROLLER_DELAY:
    case SENSOR_TO_CONTROLLER_INADEQUATE:
    case CONTROL_INPUT:
      result = ControlLoopElement.CONTROLLER;
      break;
    case PROCESS_OUTPUT:
      result = ControlLoopElement.EXTERNAL;
      break;
    case ACTUATOR:
    case CONTROL_ALGORITHM:
    case PROCESS_CHANGE:
    case PROCESS_FAILURE:
    case PROCESS_MODEL:
    case SENSOR:
    default:
      result = null;
    }
    return result;
  }
  
  /**
   * Return the element that plays the role of target for the edge
   * representing the given control flaw, if relevant
   * @param flaw a non-null control flaw
   * @return a potentially null element
   */
  public StpaAnalysisElement getControlLoopEdgeTarget(ControlFlaw flaw) {
    ControlFlawKind kind = flaw.getKind();
    ControlLoopElement clKind = getControlLoopEdgeTarget(kind);
    StpaAnalysisElement result = getControlLoopElement(flaw, clKind);
    return result;
  }
  
  /**
   * Main elements in a control loop
   */
  protected enum ControlLoopElement {
    EXTERNAL, CONTROLLER, PROCESS, ACTUATOR, SENSOR;
  }
  /**
   * Return the model element that corresponds to the given control loop element for the
   * given control action
   * @param flaw a non-null exchange element
   * @param loopElementKind a potentially null control loop element kind
   * @return a potentially null element
   */
  protected StpaAnalysisElement getControlLoopElement(ControlFlaw flaw, ControlLoopElement loopElementKind) {
    if (loopElementKind == null) {
      return null;
    }
    switch (loopElementKind) {
    case EXTERNAL:
      return flaw;
    case CONTROLLER:
      return flaw.getControlAction().getController();
    case PROCESS:
      return getControlLoopProcess(flaw.getControlAction());
    case ACTUATOR:
      return flaw.getControlAction();
    case SENSOR:
      return getControlLoopFeedbackRelation(flaw.getControlAction());
    default:
      return null;
    }
  }
  
  /**
   * Return the sensors of the control loop for the given control action
   * @param ca a non-null exchange element acting as control action
   * @return a non-null, potentially empty list
   */
  public List<FeedbackElement> getControlLoopFeedback(ExchangeElement ca) {
    List<FeedbackElement> result = new LinkedList<>();
    for (FeedbackRelation frel : getControlLoopSensors(ca)) {
      result.addAll(frel.getFeedback());
    }
    return result;
  }
  
  /**
   * Return the feedback relation of the control loop for the given control action, if any
   * @param flaw a non-null control flaw
   * @return a potentially null element
   */
  protected FeedbackRelation getControlLoopFeedbackRelation(ExchangeElement ca) {
    List<FeedbackRelation> candidates = getControlLoopSensors(ca);
    FeedbackRelation result = candidates.isEmpty()? null: candidates.get(0);
    return result;
  }
  
  /**
   * Return the process of the control loop for the given control action
   * @param flaw a non-null control flaw
   * @return an element that is non-null if the model is well-formed
   */
  protected ControlEntity getControlLoopProcess(ExchangeElement ca) {
    ControlEntity result = null;
    if (ca instanceof ControlAction) {
      result = ca.getRelation().getTarget();
    }
    return result;
  }
  
  /**
   * Return the sensors of the control loop for the given control action
   * @param ca a non-null exchange element acting as control action
   * @return a non-null, potentially empty list
   */
  public List<FeedbackRelation> getControlLoopSensors(ControlFlawContext context) {
    List<FeedbackRelation> result = new UniqueEList<FeedbackRelation>();
    ExchangeElement ca = context.getControlAction();
    ControlEntity controller = ca.getController();
    ControlEntity process = ca.getProcess();
    for (Responsibility resp : ca.getExercisedResponsibilities()) {
      for (FeedbackElement fb : resp.getFeedback()) {
        FeedbackRelation relation = fb.getRelation();
        if (relation.getSource() == controller && relation.getTarget() == process) {
          result.add(relation);
        }
      }
    }
    if (result.isEmpty()) {
      for (Relation relation : controller.getOutgoingRelations()) {
        if (relation instanceof FeedbackRelation &&
            relation.getTarget() == process) {
          result.add((FeedbackRelation) relation);
          break;
        }
      }
    }
    return result;
  }
  
  /**
   * Return a default name for the given new element
   * @param element a non-null element
   * @return a non-null string
   */
  protected String getDefaultName(EObject element) {
    String typeName;
    if (element instanceof ControlEntity) {
      if (((ControlEntity)element).isProcess()) {
        typeName = "Process";
      } else {
        typeName = "Controller";
      }
    } else {
      typeName = element.eClass().getName();
    }
	  return "New " + typeName;
  }
  
  /**
   * Return the diagram that contains the given Sirius element
   * @param diagramElement a non-null element
   * @return a potentially null diagram
   */
  public DDiagram getDiagram(EObject diagramElement) {
    DDiagram result = null;
    if (diagramElement instanceof DDiagramElement) {
      result = ((DDiagramElement) diagramElement).getParentDiagram();
    } else if (diagramElement instanceof DDiagram) {
      result = (DDiagram) diagramElement;
    }
    return result;
  }
  
  /**
   * Return the diagram elements that are related, in terms of diagram, to the given Sirius element
   * @param diagramElement a non-null element
   * @return a non-null, potentially empty list
   */
  public List<DDiagramElement> getDiagramElements(EObject diagramElement) {
    DDiagram diagram = getDiagram(diagramElement);
    List<DDiagramElement> result = new ArrayList<>();
    if (diagram != null) {
      result.addAll(diagram.getDiagramElements());
    }
    return result;
  }
  
  /**
   * Return a label for the given type, if available
   * @param element a non-null type
   * @return a potentially null string
   */
  protected String getEditTypeLabel(EClass type) {
    String result;
    if (type.getEPackage() == StpaPackage.eINSTANCE) {
      String key = "_UI_" + type.getName() + "_type";
      result = StpaEditPlugin.INSTANCE.getString(key);
    } else {
      result = type.getName();
    }
    return result;
  }
  
  /**
   * Return the current shell. Only calls from the UI thread are permitted.
   * @return a non-null shell
   */
  public Shell getShell() {
    return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
  }
  
  /**                                                                            
   * Return the UCA Category associated to the given UCA kind for the given element
   * @param analysis a non-null analysis
   * @param kind a non-null UCA kind
   * @return a non-null UCA Category if the given analysis is properly configured
   */                                                                            
  public UnsafeControlActionCategory getUCACategory(StpaAnalysisElement element, UnsafeControlActionKind kind) {
    UnsafeControlActionCategory result = null;
    StpaAnalysis analysis = element.getAnalysis();
    if (analysis != null) {
      result = getUCACategory(analysis, kind);
    }
    return result;
  }
  
  /**
   * Return a label solely based on the user ID for the given element
   * @param element a non-null element
   * @return a non-null ID
   */
  public String idLabel(UserIdentifiedElement element) {
    String id = element.getUserID();
    return "(" + (id != null? id: "?") + ")";
  }
  
  /**
   * Initialize the Causal Factor Diagram of the given element
   * @param element a non-null element
   * @return the non-null element
   */
  public EObject initCFD(ControlFlawContext element) {
    if (element.getControlFlawSet() == null) {
      createDefaultFlaws(element);
      arrangeAll();
    }
    return element;
  }
  
  /**
   * Return whether the given element as an Architecture Element w.r.t. STPA 
   * @param element a non-null element
   */
  public boolean isArchitectureElement(EObject element) {
    return !(element instanceof StpaAnalysisElement) && !(element instanceof Constraint);
  }
  
  /**
   * Return whether the given element contributes to the STPA analysis at a high level
   * of abstraction
   * @param element a non-null element
   */
  public boolean isHighLevelAnalysisElement(NamedElement element) {
    return element instanceof UserIdentifiedElement ||
        element instanceof ControlFlaw ||
        element instanceof ProcessModelValue ||
        (element instanceof Constraint && STPAQueryHelper.isInSTPAAnalysis(element));
  }
  
  /**
   * Return whether the given control flaw has a justified OK verdict
   * @param flaw a non-null element
   */
  protected boolean isJustified(ControlFlaw flaw) {
    return
        flaw.getJustification() != null &&
        flaw.getJustification().length() > 0;
  }
  
  /**
   * Return whether this flaw is related to ineffective Control Action analysis
   * @generated NOT
   */
  public boolean isForControlActionAnalysis(ControlFlawKind kind) {
    return isOnActuator(kind) || isOnProcess(kind);
  }

  /**
   * Return whether this flaw is related to Unsafe Control Action analysis
   * @generated NOT
   */
  public boolean isForUCAAnalysis(ControlFlawKind kind) {
    return isOnController(kind) || isOnProcess(kind) || isOnSensor(kind);
  }

  /**
   * Return whether this flaw is related to the actuator
   * @generated NOT
   */
  public boolean isOnActuator(ControlFlawKind kind) {
    return isOnActuatorInternals(kind) || isOnActuatorInput(kind) || isOnActuatorOutput(kind);
  }

  /**
   * Return whether this flaw is related to the internals of the actuator
   * @generated NOT
   */
  public boolean isOnActuatorInternals(ControlFlawKind kind) {
    return kind == ACTUATOR;
  }

  /**
   * Return whether this flaw is between the controller and the actuator
   * @generated NOT
   */
  public boolean isOnActuatorInput(ControlFlawKind kind) {
    return kind == CONTROLLER_TO_ACTUATOR;
  }

  /**
   * Return whether this flaw is between the actuator and the process
   * @generated NOT
   */
  public boolean isOnActuatorOutput(ControlFlawKind kind) {
    return kind == ACTUATOR_TO_PROCESS;
  }

  /**
   * Return whether this flaw is related to the controller
   * @generated NOT
   */
  public boolean isOnController(ControlFlawKind kind) {
    return Arrays.asList(
        CONTROL_INPUT,
        CONTROL_ALGORITHM,
        PROCESS_MODEL).contains(kind);
  }

  /**
   * Return whether this flaw is related to the internals of the controller
   * @generated NOT
   */
  public boolean isOnControllerInternals(ControlFlawKind kind) {
    return isOnController(kind) && !isOutsideLoop(kind);
  }

  /**
   * Return whether this flaw is related to the internals of the controller
   * @generated NOT
   */
  public boolean isOnInternals(ControlFlawKind kind) {
    return isOnControllerInternals(kind) || isOnProcessInternals(kind) ||
        isOnActuatorInternals(kind) || isOnSensorInternals(kind);
  }

  /**
   * Return whether this flaw is related to the process
   * @generated NOT
   */
  public boolean isOnProcess(ControlFlawKind kind) {
    return Arrays.asList(
        PROCESS_CHANGE,
        PROCESS_FAILURE,
        PROCESS_DISTURBANCE,
        PROCESS_CONFLICT,
        PROCESS_INPUT,
        PROCESS_OUTPUT).contains(kind);
  }

  /**
   * Return whether this flaw is related to the internals of the process
   * @generated NOT
   */
  public boolean isOnProcessInternals(ControlFlawKind kind) {
    return isOnProcess(kind) && !isOutsideLoop(kind);
  }

  /**
   * Return whether this flaw is related to the sensor
   * @generated NOT
   */
  public boolean isOnSensor(ControlFlawKind kind) {
    return isOnSensorInternals(kind) || isOnSensorInput(kind) || isOnSensorOutput(kind);
  }

  /**
   * Return whether this flaw is related to the internals of the sensor
   * @generated NOT
   */
  public boolean isOnSensorInternals(ControlFlawKind kind) {
    return kind == SENSOR;
  }

  /**
   * Return whether this flaw is between the process and the sensor
   * @generated NOT
   */
  public boolean isOnSensorInput(ControlFlawKind kind) {
    return Arrays.asList(
        PROCESS_TO_SENSOR_DELAY,
        PROCESS_TO_SENSOR_INACCURATE,
        PROCESS_TO_SENSOR_INCORRECT).contains(kind);
  }

  /**
   * Return whether this flaw is between the sensor and the controller
   * @generated NOT
   */
  public boolean isOnSensorOutput(ControlFlawKind kind) {
    return Arrays.asList(
        SENSOR_TO_CONTROLLER_DELAY,
        SENSOR_TO_CONTROLLER_INADEQUATE).contains(kind);
  }

  /**
   * Return whether this flaw is external to the components of the control loop
   * @generated NOT
   */
  public boolean isOutsideLoop(ControlFlawKind kind) {
    return Arrays.asList(
        CONTROL_INPUT,
        PROCESS_DISTURBANCE,
        PROCESS_CONFLICT,
        PROCESS_INPUT,
        PROCESS_OUTPUT).contains(kind);
  }

  /**
   * Return whether the given source semantic element represented by the given source view
   * together with the given target view are valid w.r.t. the representation of a constrained-
   * element edge
   * @param semantic a non-null element
   * @param sourceView a non-null element
   * @param targetView a non-null element
   */
  public boolean isValidConstrainedElementsEdge(EObject semantic, DSemanticDecorator sourceView,
      DSemanticDecorator targetView) {
    return CsServices.getService().isValidConstrainedElementsEdge(semantic, sourceView, targetView);
  }
  
  /**
   * Return whether the given structural feature must be visible in the Properties view
   * @param feature a non-null feature
   */
  public boolean isVisibleAsProperty(EStructuralFeature feature) {
    boolean result;
    if (feature instanceof EAttribute) {
      // EAttribute
      result = !NON_PROPERTY_ATTRIBUTES.contains(feature);
    } else {
      // EReference
      result = !((EReference) feature).isContainer() && !NON_PROPERTY_REFERENCES.contains(feature);
    }
    return result;
  }
  
  /**
   * Map the given process model variable to the given responsibility
   * @param source a non-null process model variable
   * @param target a non-null responsibility
   * @return the passed process model variable
   */
  public ProcessModelVariable mapVariableToResponsibility(ProcessModelVariable source, Responsibility target) {
    source.getResponsibilities().add(target); // No change if already mapped
    return source;
  }
  
  /**
   * Return a label for the given element in the STPA Overview Diagram
   * @param element a non-null element
   * @return a potentially null label
   */
  public String overviewDiagramLabel(EObject element) {
    String result = null;
    if (element instanceof UserIdentifiedElement) {
      result = ((UserIdentifiedElement) element).getUserID();
    } else if (element instanceof ControlFlaw) {
      result = editLabel(element);
    } else if (element instanceof Constraint) {
      result = ((Constraint) element).getName();
    } else if (element instanceof StpaAnalysisElement) {
      result = ((StpaAnalysisElement) element).getName();
    }
    if (result == null) {
      result = editLabel(element);
    }
    result = STPAQueryHelper.Naming.shorten(result, SHORT_NAME_LENGTH);
    return result;
  }
  
  /**
   * Return whether the given element owns a representation of the given name
   * @param element a non-null element
   * @param representationName a potentially null string, where null stands for any name
   */
  public boolean ownsRepresentation(EObject element, String representationName) {
    Session session = SessionManager.INSTANCE.getSession(element);
    if (session != null) {
      Collection<DRepresentationDescriptor> descriptors =
          DialectManager.INSTANCE.getRepresentationDescriptors(element, session);
      for (DRepresentationDescriptor descriptor : descriptors) {
        if (representationName == null ||
            representationName.equals(descriptor.getDescription().getName())) {
          return true;
        }
      }
    }
    return false;
  }
  
  /**
   * Assign a new locally unique user ID to the given element
   * @param element a non-null element
   * @return the given element after re-identification
   */
  public UserIdentifiedElement reidentify(UserIdentifiedElement element) {
    STPAQueryHelper.Naming.reidentify(element, false);
    STPAQueryHelper.Naming.reidentifyAllOfType(element.getAnalysis(), element.eClass());
    return element;
  }
  
  /**
   * Assign a new unique user ID to all STPA elements in a given scope
   * @param context a non-null element
   * @param global whether the scope is the whole STPA analysis or the sole contents of the given element
   * @return the passed element
   */
  public NamedElement reidentifyAll(NamedElement context, boolean global) {
    StpaAnalysisElement scope;
    if (global) {
      if (context instanceof StpaAnalysisElement) {
        scope = ((StpaAnalysisElement) context).getAnalysis();
      } else {
        scope = STPAQueryHelper.getOwningSTPAAnalysis(context);
      }
    } else {
      if (context instanceof StpaAnalysisElement) {
        scope = (StpaAnalysisElement) context;
      } else {
        scope = null;
      }
    }
    if (scope != null) {
      STPAQueryHelper.Naming.reidentifyAll(scope);
    }
    return context;
  }
  
  /**
   * Return the label for the given relation
   * @param relation a non-null relation
   * @return a potentially null string
   */
  public String relationLabel(Relation relation) {
    return relationLabel(relation, true);
  }
  
  /**
   * Return the label for the given relation
   * @param relation a non-null relation
   * @param newlines whether carriage returns must be used as separators
   * @return a potentially null string
   */
  public String relationLabel(Relation relation, boolean newlines) {
    StringBuilder builder = new StringBuilder();
    boolean first = true;
    for (ExchangeElement ex : relation.getExchangeElements()) {
      if (first) {
        first = false;
      } else {
        if (newlines) {
          builder.append('\n');
        } else {
          builder.append(',');
          builder.append(' ');
        }
      }
      String name = fullLabel(ex);
      builder.append(name != null && name.length() > 0? name: idLabel(ex));
    }
    return builder.toString();
  }
  
  /**
   * Edit the given relation according to the given 'label edit' string input
   * @param relation a non-null relation
   * @param input the potentially null 'label edit' string input
   * @return the updated non-null relation
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public Relation relationLabelEdit(Relation relation, String input) {
    final String TITLE = "Relation Edition";
    String defaultType = null;
    EList<ExchangeElement> elements;
    if (relation instanceof ControlRelation) {
      defaultType = "control action";
      elements = (EList)((ControlRelation) relation).getControlActions();
    } else if (relation instanceof FeedbackRelation) {
      defaultType = "feedback";
      elements = (EList) ((FeedbackRelation) relation).getFeedback();
    } else {
      defaultType = "piece of information";
      elements = (EList) ((InformationExchangeRelation) relation).getInformation();
    }
    // New
    List<String> newNames = new ArrayList<>();
    StringTokenizer tokenizer = new StringTokenizer(input, "\n");
    while (tokenizer.hasMoreTokens()) {
      String name = tokenizer.nextToken();
      name = name.trim();
      if (name.length() > 0) {
        newNames.add(name);
      }
    }
    Set<String> newCollisions = STPAQueryHelper.duplicates(newNames);
    boolean newHasCollisions = !newCollisions.isEmpty();
    if (newHasCollisions) {
      showError(TITLE,
          "A " + defaultType + " must have a unique name in its relation.\nDuplicates: " + newCollisions + ".");
      return relation;
    }
    // Old
    List<String> oldNames = STPAQueryHelper.Naming.names(elements);
    Set<String> oldCollisions = STPAQueryHelper.duplicates(oldNames);
    boolean oldHasCollisions = !oldCollisions.isEmpty();
    boolean oldEmptyNames = oldNames.contains("") || oldNames.contains(null);
    boolean sameNumber = oldNames.size() == newNames.size();
    if (sameNumber) {
      boolean sameNames = new HashSet<>(oldNames).equals(new HashSet<>(newNames));
      // Same number of elements
      if ((oldHasCollisions || oldEmptyNames) && sameNames) {
        // Old collisions and same names
        showError(TITLE,
            "Duplicate or empty names must be fixed first.\nDuplicates: " + oldCollisions + ".");
      } else if (!sameNames) {
        // No collisions or different names: RENAMING
        int i = 0;
        for (ExchangeElement element : elements) {
          element.setName(newNames.get(i));
          i++;
        }
      } else {
        // Same names and no collision/empty: MOVING
        STPAQueryHelper.Naming.reorder(elements, newNames);
        STPAQueryHelper.Naming.reidentifyAll(relation);
      }
    } else {
      // Different number of names
      List<String> added = new LinkedList<>(newNames);
      added.removeAll(oldNames);
      List<String> removed = new LinkedList<>(oldNames);
      removed.removeAll(newNames);
      boolean isAddition = newNames.size() > oldNames.size();
      if (isAddition) {
        // Names added
        if (!removed.isEmpty()) {
          // Names have also disappeared
          showError(TITLE, "Cannot add and rename/remove at the same time.");
        } else {
          // ADDING (& MOVING)
          for (String newName : added) {
            if (relation instanceof ControlRelation) {
              createControlAction((ControlRelation) relation, newName);
            } else if (relation instanceof FeedbackRelation) {
              createFeedback((FeedbackRelation) relation, newName);
            } else {
              createInformation((InformationExchangeRelation) relation, newName);
            }
          }
          STPAQueryHelper.Naming.reorder(elements, newNames);
          STPAQueryHelper.Naming.reidentifyAll(relation);
        }
      } else {
        // Names removed
        if (!added.isEmpty()) {
          // Names have also appeared
          showError(TITLE, "Cannot remove and rename/add at the same time.");
        } else {
          // REMOVING (& MOVING)
          List<ExchangeElement> basicRemovals = new LinkedList<>();
          List<ExchangeElement> questionableRemovals = new LinkedList<>();
          Map<String, ExchangeElement> oldByName = STPAQueryHelper.Naming.byName(elements);
          for (String oldName : removed) {
            ExchangeElement toRemove = oldByName.get(oldName);
            if (toRemove.getUnsafeControlActions().isEmpty()) {
              basicRemovals.add(toRemove);
            } else {
              questionableRemovals.add(toRemove);
            }
          }
          delete(basicRemovals, false);
          if (!questionableRemovals.isEmpty()) {
            boolean confirmed = MessageDialog.openQuestion(getShell(), TITLE,
                "Deleting Control Actions will also delete corresponding Unsafe Control Actions." +
                    "\nDo you confirm the deletion of Unsafe Control Actions for the following Control Actions?\n" +
                    fullLabels(questionableRemovals) + ".");
            if (confirmed) {
              delete(questionableRemovals, false);
            }
          }
          STPAQueryHelper.Naming.reorder(elements, newNames);
          STPAQueryHelper.Naming.reidentifyAll(relation);
        }
      }
    }
    return relation;
  }
  
  /**
   * Return the label for the given relation as input for 'label edit'
   * @param relation a non-null relation
   * @return a potentially null string
   */
  public String relationLabelEditInput(Relation relation) {
    return relationLabelEditInput(relation, true);
  }
  
  /**
   * Return the label for the given relation as input for 'label edit'
   * @param relation a non-null relation
   * @param newlines whether carriage returns must be used as separators
   * @return a potentially null string
   */
  public String relationLabelEditInput(Relation relation, boolean newlines) {
    StringBuilder builder = new StringBuilder();
    boolean first = true;
    for (ExchangeElement ex : relation.getExchangeElements()) {
      if (first) {
        first = false;
      } else {
        if (newlines) {
          builder.append('\n');
        } else {
          builder.append(',');
          builder.append(' ');
        }
      }
      String name = ex.getName();
      builder.append(name);
    }
    return builder.toString();
  }
  
  /**
   * Set the given elements as values of the many cross-reference of the given name
   * for the given element, if possible
   * @param element a non-null element
   * @param referenceName a non-null string
   * @return the non-null element
   */
  public EObject setMCRValues(EObject element, String referenceName,
      Collection<? extends EObject> values) {
    EStructuralFeature feature = element.eClass().getEStructuralFeature(referenceName);
    if (feature instanceof EReference) {
      EReference ref = (EReference) feature;
      if (ref.isMany() && ref.isChangeable() && !ref.isContainment() && !ref.isContainer()) {
        element.eSet(ref, values);
      }
    }
    return element;
  }
  
  /**
   * Show the given message in an error dialog with the given title
   * @param title a non-null string
   * @param message a non-null string
   */
  public void showError(String title, String message) {
    MessageDialog.openError(getShell(), title, message);
  }
  
  /**
   * Return the 'static' enum literal that corresponds to the given 'reflexive' one
   * @param literal a non-null literal
   * @return a non-null literal assuming generated model code is present
   */
  public Enumerator staticLiteral(EEnumLiteral literal) {
    return literal.getInstance();
  }
  
  /**
   * Return a label for the given enumeration literal
   * @param literal a non-null literal
   * @return a non-null string
   */
  public String staticLiteralLabel(EEnumLiteral literal) {
    String result = literal.getName();
    Enumerator staticLiteral = staticLiteral(literal);
    if (staticLiteral != null) {
      if (staticLiteral == ControlFlawVerdict.UNDEFINED) {
        result = "TO DO";
      } else if (staticLiteral instanceof UnsafeControlActionKind) {
        result = ucaKindLabel((UnsafeControlActionKind) staticLiteral);
      } else {
        result = staticLiteral.getName();
      }
    }
    return result;
  }
  
  /**
   * Return all entities directly contained in the given element, if any
   * @param container a potentially null element
   * @return a potentially empty collection, or null if failure
   */
  public List<ControlEntity> subEntities(EObject container) {
    List<ControlEntity> result = null;
    if (container instanceof ControlStructurePackage) {
      result = ((ControlStructurePackage)container).getRootEntities();
    } else if (container instanceof ControlEntity) {
      result = ((ControlEntity)container).getDecomposition();
    }
    return result;
  }
  
  /**
   * Return the target elements for the constrained-element links of the given constraint
   * @param context a non-null constraint
   * @return a non-null, potentially empty list
   */
  public List<EObject> targetFinderExpressionForConstraint(Constraint context) {
    return CsServices.getService().targeFinderExpressionForConstraint(context);
  }
  
  /**
   * Return a user-friendly name for the type of the given element
   * @param element a non-null element
   * @return a non-null string
   */
  public String typeName(EObject element) {
    String result;
    if (element instanceof ControlEntity) {
      ControlEntity casted = (ControlEntity) element;
      result = casted.isProcess() && casted.isLeaf()?
          "Process": "Controller";
    } else if (element instanceof ProcessModelVariable) {
      result = "Process Model";
    } else if (element instanceof FeedbackElement) {
      result = "Feedback";
    } else if (element instanceof PieceOfInformation) {
      result = "Information";
    } else {
      result = getEditTypeLabel(element.eClass());
    }
    return result;
  }
  
  /**
   * Return a label for the given UCA Category
   * @param category a non-null category assumed fully initialized
   * @return a non-null string
   */
  public String ucaCategoryLabel(UnsafeControlActionCategory category) {
    return ucaKindLabel(category.getKind());
  }
  
  /**
   * Return a label for the given UCA Kind
   * @param kind a non-null kind
   * @return a non-null string
   */
  public String ucaKindLabel(UnsafeControlActionKind kind) {
    String result = kind == NOT_PROVIDING? "Not providing causes hazard":
      kind == PROVIDING? "Providing causes hazard":
        kind == WRONG_TIMING? "Wrong timing or order causes hazard":
          "Stopped too soon, applied too long";
    return result;
  }
  
  /**
   * Return a label for the given UCA
   * @param uca a non-null UCA
   * @return a non-null string
   */
  public String ucaLabel(UnsafeControlAction uca) {
    return fullLabel(uca);
  }
  
  /**
   * Delete the given edge representing a mapping from the given process model variable
   * to a responsibility
   * @param target a non-null edge from a process model variable to a responsibility
   * @return the non-null process model variable
   */
  public ProcessModelVariable unmapVariableFromResponsibility(ProcessModelVariable variable, DEdge edge) {
    ProcessModelVariable result = variable;
    EdgeTarget sourceNode = edge.getSourceNode();
    EdgeTarget targetNode = edge.getTargetNode();
    if (sourceNode instanceof DSemanticDecorator && targetNode instanceof DSemanticDecorator) {
      EObject source = ((DSemanticDecorator) sourceNode).getTarget();
      EObject target = ((DSemanticDecorator) targetNode).getTarget();
      if (source == variable && target instanceof Responsibility) {
        Responsibility responsibility = (Responsibility) target;
        variable.getResponsibilities().remove(responsibility);
      }
    }
    return result;
  }
  
}
