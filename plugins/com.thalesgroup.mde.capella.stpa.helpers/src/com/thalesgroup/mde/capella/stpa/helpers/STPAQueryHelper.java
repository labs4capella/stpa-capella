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
package com.thalesgroup.mde.capella.stpa.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.polarsys.capella.common.data.modellingcore.AbstractConstraint;
import org.polarsys.capella.common.helpers.TransactionHelper;
import org.polarsys.capella.common.platform.sirius.ted.SemanticEditingDomainFactory.SemanticEditingDomain;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.model.helpers.ModelQueryHelper;
import org.polarsys.kitalpha.emde.model.ElementExtension;

import com.thalesgroup.mde.capella.stpa.model.AnalysisPackage;
import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawAnalysisElement;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawContext;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawSet;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict;
import com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage;
import com.thalesgroup.mde.capella.stpa.model.Decomposable;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.FeedbackElement;
import com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage;
import com.thalesgroup.mde.capella.stpa.model.LossPackage;
import com.thalesgroup.mde.capella.stpa.model.LossScenario;
import com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage;
import com.thalesgroup.mde.capella.stpa.model.Mitigable;
import com.thalesgroup.mde.capella.stpa.model.PieceOfInformation;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable;
import com.thalesgroup.mde.capella.stpa.model.Relation;
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
 * A query helper for Capella/STPA models.
 */
public class STPAQueryHelper {
  
  /**
   * Create and return the STPA Analysis Package within the given analysis, creating it if needed.
   * Write access is assumed granted.
   * @param analysis a non-null analysis
   * @param containment a non-null reference
   * @return a non-null object if the reference is a package containment reference in StpaAnalysis
   */
  protected static AnalysisPackage createAnalysisPackage(StpaAnalysis analysis,
      EReference containment) {
    AnalysisPackage result = null;
    if (containment.isContainment() && !containment.isMany() &&
        containment.getEContainingClass() == StpaPackage.Literals.STPA_ANALYSIS &&
        ((EClass) containment.getEType()).getEAllSuperTypes().contains(
            StpaPackage.Literals.ANALYSIS_PACKAGE)) {
      EClass type = (EClass) containment.getEType();
      result = (AnalysisPackage) StpaFactory.eINSTANCE.create(type);
      analysis.eSet(containment, result);
    }
    return result;
  }
  
  /**
   * Create and return a new STPA Analysis within the given Capella project.
   * Write access is assumed granted.
   * @param project a non-null project that owns a SystemEngineering
   * @return a non-null object
   */
  protected static StpaAnalysis createStpaAnalysis(Project project) {
    StpaAnalysis result;
    SystemEngineering se = ModelQueryHelper.getSystemEngineering(project);
    assert se != null;
    StpaFactory factory = StpaFactory.eINSTANCE;
    result = factory.createStpaAnalysis();
    result.setName("STPA Analysis");
    se.getOwnedExtensions().add(result);
    // Technical Package
    TechnicalPackage tPack = factory.createTechnicalPackage();
    tPack.setName("Technical Package");
    for (UnsafeControlActionKind kind : UnsafeControlActionKind.values()) {
      UnsafeControlActionCategory cat = factory.createUnsafeControlActionCategory();
      cat.setKind(kind);
      tPack.getUnsafeControlActionCategories().add(cat);
    }
    result.setTechnicalPackage(tPack);
    // Loss Package
    LossPackage lp = factory.createLossPackage();
    lp.setName("Losses");
    result.setLossPackage(lp);
    // Hazards & Constraints Package
    HazardConstraintPackage hcp = factory.createHazardConstraintPackage();
    hcp.setName("Hazards & Constraints");
    result.setHazardConstraintPackage(hcp);
    // HCS Package
    ControlStructurePackage csp = factory.createControlStructurePackage();
    csp.setName("Control Structure");
    result.setControlStructurePackage(csp);
    // LS Package
    LossScenarioPackage lsp = factory.createLossScenarioPackage();
    result.setLossScenarioPackage(lsp);
    lsp.setName("Loss Scenarios");
    return result;
  }
  
  /**
   * Return the (ordered) set of duplicates in the given list
   * @param elements a non-null, potentially empty list
   * @return a non-null, potentially empty set
   */
  public static <T> Set<T> duplicates(List<T> elements) {
    Set<T> result = new LinkedHashSet<>();
    int position = 0;
    for (T element : elements) {
      if (!result.contains(element)) {
        int lastOccurrence = elements.lastIndexOf(element);
        if (lastOccurrence > position) {
          result.add(element);
        }
      }
      position++;
    }
    return result;
  }
  
  /**
   * Transactionally execute the given runnable affecting models in the given editing domain
   * @param domain a non-null editing domain
   * @param label an optional user-friendly label to appear in the undo/redo menu items
   * @param runnable a non-null runnable
   */
  public static void execute(TransactionalEditingDomain domain, String label,
      final Runnable runnable) {
    if (isRunningInActiveTransaction(domain)) {
      // Already in the active transaction
      runnable.run();
    } else {
      final String commandLabel = label != null? label: "";
      RecordingCommand cmd = new RecordingCommand(domain, commandLabel) {
        /**
         * @see org.eclipse.emf.edit.command.ChangeCommand#doExecute()
         */
        @Override
        protected void doExecute() {
          runnable.run();
        }
      };
      domain.getCommandStack().execute(cmd);
    }
  }
  
  /**
   * Return the concatenation of all upper case characters in the given string
   * @param string a non-null, potentially empty string
   * @return a non-null, potentially empty string
   */
  public static String extractUpperCase(String string) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < string.length(); i++) {
      char currentChar = string.charAt(i);
      if (Character.isUpperCase(currentChar)){    
        builder.append(currentChar);
      }
    }
    return builder.toString();
  }
  
  /**
   * Fill the given list with all decomposables within the given one, including it
   * @param element a non-null decomposable
   * @param result a non-null collection
   */
  public static <T extends Decomposable<T>> void getAll(T element, List<T> result) {
    result.add(element);
    getAllMulti(element.getDecomposition(), result);
  }
  
  /**
   * Fill the given list with all decomposables within the given ones, including themselves
   * @param elements a non-null, potentially empty collection of decomposable
   * @param result a non-null collection
   */
  public static <T extends Decomposable<T>> void getAllMulti(Collection<T> elements, List<T> result) {
    for (T element : elements) {
      getAll(element, result);
    }
  }
  
  /**
   * Return the editing domain the given element belongs to, if any
   * @param element a non-null element
   * @return a potentially null object
   */
  public static TransactionalEditingDomain getEditingDomain(EObject element) {
    return TransactionHelper.getEditingDomain(element);
  }
  
  /**
   * Return the EMF Edit label of the given element, if available
   * @param element a non-null element
   * @return a potentially null string
   */
  public static String getEditLabel(EObject element) {
    String result = null;
    EditingDomain domain = getEditingDomain(element);
    if (domain instanceof AdapterFactoryEditingDomain) {
      AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain)domain;
      IItemLabelProvider provider = (IItemLabelProvider)editingDomain.getAdapterFactory().adapt(
          element, IItemLabelProvider.class);
      if (provider != null) {
        result = provider.getText(element);
      }
    }
    return result;
  }
  
  /**
   * Return the elements that reference the given constraint through the assumptions
   * reference
   * @param element a non-null element
   * @return a non-null, potentially empty list
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static Collection<SystemConstraint> getInverseAssumptions(Constraint element) {
    return (Collection) getReferencers(element, StpaPackage.Literals.SYSTEM_CONSTRAINT__ASSUMPTIONS);
  }
  
  /**
   * Return the elements that reference the given constraint through the countermeasures
   * reference
   * @param element a non-null element
   * @return a non-null, potentially empty list
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static Collection<Mitigable> getInverseCountermeasures(Constraint element) {
    return (Collection) getReferencers(element, StpaPackage.Literals.MITIGABLE__COUNTERMEASURES);
  }
  
  /**
   * Return the elements that reference the given constraint through the architecture
   * elements reference
   * @param element a non-null element
   * @return a non-null, potentially empty list
   */
  public static Collection<EObject> getInverseArchitectureElements(NamedElement element) {
    return getReferencers(element, StpaPackage.Literals.ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS);
  }
  
  /**
   * Return the STPA Analysis within the given Capella project, creating it if needed.
   * Write access is assumed granted.
   * @param project a non-null project that owns a SystemEngineering
   * @return a non-null element
   */
  public static StpaAnalysis getOrCreateSTPAAnalysis(Project project) {
    StpaAnalysis result = getSTPAAnalysis(project);
    if (result == null) {
      result = createStpaAnalysis(project);
    }
    return result;
  }
  
  /**
   * Return the STPA Analysis Package within the given analysis, creating it if needed.
   * Write access is assumed granted.
   * @param analysis a non-null analysis
   * @param containment a non-null reference
   * @return a non-null object if the reference is a package containment reference in StpaAnalysis
   */
  public static AnalysisPackage getOrCreateAnalysisPackage(StpaAnalysis analysis,
      EReference containment) {
    AnalysisPackage result = null;
    if (containment.getEContainingClass() == StpaPackage.Literals.STPA_ANALYSIS) {
      Object value = analysis.eGet(containment);
      if (value instanceof AnalysisPackage) {
        result = (AnalysisPackage) value;
      } else {
        result = createAnalysisPackage(analysis, containment);
      }
    }
    return result;
  }
  
  /**
   * Return the elements that reference the given one through the given EReference
   * @param element a non-null element
   * @param incoming a non-null reference
   * @return a non-null, potentially empty list
   */
  public static Collection<EObject> getReferencers(EObject element, EReference incoming) {
    Collection<EObject> result = Collections.emptySet();
    TransactionalEditingDomain domain = getEditingDomain(element);
    if (domain instanceof SemanticEditingDomain) {
      ECrossReferenceAdapter crossReferencer = ((SemanticEditingDomain) domain).getCrossReferencer();
      if (crossReferencer != null) {
        Collection<Setting> inverseReferences = crossReferencer.getInverseReferences(element, incoming, true);
        result = new HashSet<>();
        for (Setting setting : inverseReferences) {
          result.add(setting.getEObject());
        }
      }
    }
    return result;
  }
  
  /**
   * Return the siblings of the given element, where siblings are defined by the
   * containment feature
   * @param element a non-null element
   * @return a non-null, potentially empty collection
   */
  public static Collection<EObject> getSiblings(EObject element) {
    Collection<EObject> result = new HashSet<>();
    EReference containment = element.eContainmentFeature();
    if (containment != null) {
      Object containmentValue = element.eContainer().eGet(containment);
      if (containmentValue instanceof Collection<?>) {
        @SuppressWarnings("unchecked") // We know we have EObjects
        Collection<EObject> siblings = (Collection<EObject>) containmentValue;
        result.addAll(siblings);
        result.remove(element);
      }
    }
    return result;
  }
  
  /**
   * Return the STPA Analysis within the given Capella project, if any
   * @param project a non-null project
   * @return a potentially null object
   */
  public static StpaAnalysis getSTPAAnalysis(Project project) {
    StpaAnalysis result = null;
    SystemEngineering se = ModelQueryHelper.getSystemEngineering(project);
    if (se != null) {
      for (ElementExtension ext : se.getOwnedExtensions()) {
        if (ext instanceof StpaAnalysis) {
          result = (StpaAnalysis)ext;
          break;
        }
      }
    }
    // If sub-analyses are present, consider the first one as the main one
    if (result != null && !result.getSubAnalyses().isEmpty()) {
      result = result.getSubAnalyses().get(0);
    }
    return result;
  }
  
  /**
   * Return the STPA Analysis that owns the given element, if any
   * @param element a potentially null element (null gives null)
   * @return a potentially null STPA Analysis
   */
  public static StpaAnalysis getOwningSTPAAnalysis(EObject element) {
    EObject container = element;
    while (container != null) {
      if (container instanceof StpaAnalysis) {
        return (StpaAnalysis) container;
      }
      container = container.eContainer();
    }
    return null;
  }
  
  /**
   * Return the SystemEngineering for the given STPA element, if any
   * @param element a non-null STPA element
   * @return a potentially null, non-null if model is well-formed, element
   */
  public static SystemEngineering getSystemEngineering(StpaAnalysisElement element) {
    SystemEngineering result = null;
    StpaAnalysis analysis = element.getAnalysis();
    if (analysis != null) {
      EObject container = analysis.eContainer();
      if (container instanceof SystemEngineering) {
        result = (SystemEngineering) container;
      }
    }
    return result;
  }
  
  /**
   * Return the UCA Category associated to the given UCA kind in the given analysis
   * @param analysis a non-null analysis
   * @param kind a non-null UCA kind
   * @return a non-null UCA Category if the given analysis is properly configured
   */
  public static UnsafeControlActionCategory getUCACategory(
      StpaAnalysis analysis, UnsafeControlActionKind kind) {
    TechnicalPackage tPack = analysis.getTechnicalPackage();
    if (tPack != null) {
      for (UnsafeControlActionCategory category : tPack.getUnsafeControlActionCategories()) {
        if (category.getKind() == kind) {
          return category;
        }
      }
    }
    return null;
  }
  
  /**
   * Return the set of control flaws that are visible as possible causal factors for
   * the given analysis element element
   * @param analysisElement a non-null element
   * @return a non-null, potentially empty list
   */
  public static List<ControlFlaw> getVisibleCausalFactors(ControlFlawAnalysisElement analysisElement) {
    List<ControlFlaw> result = Collections.emptyList();
    final Collection<ControlFlawVerdict> excludingVerdicts = Arrays.asList(
        ControlFlawVerdict.OK, ControlFlawVerdict.NA);
    ControlFlawContext cfContext = null;
    if (analysisElement instanceof UnsafeControlAction) {
      cfContext = (UnsafeControlAction) analysisElement;
    } else if (analysisElement instanceof LossScenario) {
      LossScenario ls = (LossScenario) analysisElement;
      if (ls.getUnsafeControlAction() != null) {
        cfContext = ls.getUnsafeControlAction();
      } else {
        cfContext = ls.getControlAction();
      }
    }
    if (cfContext != null) {
      ControlFlawSet cfSet = cfContext.getControlFlawSet();
      if (cfSet != null) {
        result = cfSet.getControlFlaws().stream().filter(cf ->
            !excludingVerdicts.contains(cf.getVerdict())).collect(Collectors.toList());
      }
    }
    return result;
  }
  
  /**
   * Return the set of constraints that are visible as possible countermeasures for
   * the given mitigable element
   * @param mitigable a non-null element
   * @return a non-null, potentially empty list
   */
  public static List<Constraint> getVisibleCountermeasures(Mitigable mitigable) {
    EList<Constraint> result = new UniqueEList<>();
    ExchangeElement ca = mitigable.getControlAction();
    if (ca != null) {
      ControlEntity controller = ca.getController();
      while (controller != null) {
        for (AbstractConstraint constraint : controller.getConstraints()) {
          if (constraint instanceof Constraint) {
            result.add((Constraint) constraint);
          }
        }
        Collection<Relation> relations = new UniqueEList<Relation>(
            controller.getOutgoingRelations());
        relations.addAll(controller.getIncomingRelations());
        for (Relation relation : relations) {
          for (AbstractConstraint constraint : relation.getConstraints()) {
            if (constraint instanceof Constraint) {
              result.add((Constraint) constraint);
            }
          }
        }
        controller = controller.getComposite();
      }
    }
    return result;
  }
  
  /**
   * Return whether the given element belongs to an STPA analysis
   * @param element a potentially null element (null gives false)
   */
  public static boolean isInSTPAAnalysis(EObject element) {
    return getOwningSTPAAnalysis(element) != null;
  }
  
  /**
   * Return whether the current code executes in the context of the currently
   * active transaction on the given transactional editing domain
   * @param domain a potentially null object
   */
  public static boolean isRunningInActiveTransaction(TransactionalEditingDomain domain) {
    boolean result = false;
    if (domain instanceof InternalTransactionalEditingDomain) {
      Transaction activeTransaction =
          ((InternalTransactionalEditingDomain)domain).getActiveTransaction();
      if (activeTransaction != null) {
        result = Thread.currentThread() == activeTransaction.getOwner();
      }
    }
    return result;
  }
  
  
  /**
   * Utility methods for name and user ID management.
   */
  public static class Naming {
    /**
     * A name-based comparator for named elements
     */
    public static final Comparator<NamedElement> COMPARATOR = new Comparator<NamedElement>() {
      @Override
      public int compare(NamedElement o1, NamedElement o2) {
        String n1 = o1.getName();
        String n2 = o2.getName();
        if (n1 == null) {
          return (n2 == null)? 0: -1;
        } else if (n2 == null) {
          return 1;
        }
        return n1.compareToIgnoreCase(n2);
      }
    };
    /**
     * Return a map of <Name, NamedElement> corresponding to the given collection of named elements
     * where order is preserved
     * @param <T> the type of the named elements
     * @param elements a non-null, potentially empty collection
     * @return a non-null, potentially empty order-preserving map
     */
    public static <T extends NamedElement> Map<String, T> byName(Collection<T> elements) {
      Map<String, T> result = new LinkedHashMap<>(elements.size());
      for (T element : elements) {
        result.put(element.getName(), element);
      }
      return result;
    }
    /**
     * Return the user IDs of the siblings of the given element, where siblings are defined by
     * the containment feature
     * @param element a non-null element
     * @return a non-null, potentially empty collection
     */
    protected static Collection<String> getSiblingUserIDs(UserIdentifiedElement element) {
      Collection<String> result = new HashSet<>();
      Collection<EObject> siblings = getSiblings(element);
      for (EObject sibling : siblings) {
        if (sibling instanceof UserIdentifiedElement) {
          UserIdentifiedElement identifiedSibling = (UserIdentifiedElement) sibling;
          String siblingID = identifiedSibling.getUserID();
          if (siblingID != null) {
            result.add(siblingID);
          }
        }
      }
      return result;
    }
   /**
     * Return a prefix for typical user IDs for the given element
     * @param element a non-null element
     * @return a non-null string
     */
    protected static String getUserIDPrefix(UserIdentifiedElement element) {
      final String typePrefix;
      if (element instanceof Stakeholder) {
        typePrefix = "SH";
      } else if (element instanceof Stake) {
        typePrefix = "ST";
      } else if (element instanceof ControlEntity) {
        typePrefix = "C";
      } else if (element instanceof FeedbackElement) {
        typePrefix = "FB";
      } else if (element instanceof PieceOfInformation) {
        typePrefix = "INF";
      } else if (element instanceof ProcessModelVariable) {
        typePrefix = "PM";
      } else {
        typePrefix = extractUpperCase(element.eClass().getName());
      }
      return typePrefix;
    }
    /**
     * Return a tree iterator similar to eAllContents() except that it takes into account
     * decomposition categories for the order of elements
     * @param element a non-null element
     * @return a non-null iterator
     */
    public static TreeIterator<EObject> eAllContentsNaming(EObject element) {
      return new AbstractTreeIterator<EObject>(element, false) {
        private static final long serialVersionUID = 1L;
        @Override
        @SuppressWarnings("unchecked")
        public Iterator<EObject> getChildren(Object object) {
          List<EObject> list = ((EObject)object).eContents();
          if (object instanceof Decomposable<?>) {
            list = new LinkedList<>(list);
            List<EObject> decomposition = (List<EObject>) ((Decomposable<?>) object).getOrderedDecomposition();
            list.removeAll(decomposition);
            list.addAll(decomposition); // Restore order
          }
          return list.iterator();
        }
      };
    }
    /**
     * Return a new user ID for the given element
     * @param element a non-null element
     * @param avoidLocalCollision whether the ID should be locally unique
     * @return a non-null string
     */
    public static String newUserID(UserIdentifiedElement element,
        boolean avoidLocalCollision) {
      Collection<String> siblingIDs = getSiblingUserIDs(element);
      final String prefix = getUserIDPrefix(element);
      int index = 0;
      String candidateID;
      do {
        index++;
        candidateID = makeUserID(prefix, index);
      } while (siblingIDs.contains(candidateID));
      return candidateID;
    }
    /**
     * Create a new user ID based on the given prefix and index
     * @param prefix a non-null string
     * @param index a positive int
     * @return a non-null string
     */
    protected static String makeUserID(String prefix, int index) {
      return prefix + '-' + (index < 10? "0": "") + index;
    }
    /**
     * Return the list of names of the given named elements
     * @param namedElements a non-null, potentially empty collection
     * @return a non-null, potentially empty list
     */
    public static List<String> names(Collection<? extends NamedElement> namedElements) {
      List<String> result = new ArrayList<>(namedElements.size());
      for (NamedElement element : namedElements) {
        result.add(element.getName());
      }
      return result;
    }
    /**
     * Assign a new locally unique user ID to the given element
     * @param element a non-null element
     * @param avoidLocalCollision whether the ID should be locally unique
     */
    public static void reidentify(UserIdentifiedElement element,
        boolean avoidLocalCollision) {
      String newID = newUserID(element, avoidLocalCollision);
      element.setUserID(newID);
    }
    /**
     * Assign a new user ID to all concerned STPA elements within the given element that
     * is also unique within this scope
     * @param root a non-null element
     */
    public static void reidentifyAll(StpaAnalysisElement root) {
      Map<String, Integer> prefixToIndex = new TreeMap<>();
      TreeIterator<EObject> it = eAllContentsNaming(root);
      while (it.hasNext()) {
        EObject current = it.next();
        if (current instanceof UserIdentifiedElement) {
          UserIdentifiedElement element = (UserIdentifiedElement) current;
          String prefix = getUserIDPrefix(element);
          Integer previousIndex = prefixToIndex.get(prefix);
          int newIndex = (previousIndex == null)? 1: previousIndex.intValue()+1;
          prefixToIndex.put(prefix, Integer.valueOf(newIndex));
          String newUserID = makeUserID(prefix, newIndex);
          element.setUserID(newUserID);
        }
      }
    }
    /**
     * Assign a new user ID to all STPA elements of the given type, within the given
     * element, that is also unique within this scope
     * @param root a non-null element
     */
    public static void reidentifyAllOfType(StpaAnalysisElement root, EClass eClass) {
      if (!StpaPackage.Literals.USER_IDENTIFIED_ELEMENT.isSuperTypeOf(eClass)) {
        return;
      }
      int index = 0;
      TreeIterator<EObject> it = eAllContentsNaming(root);
      while (it.hasNext()) {
        EObject current = it.next();
        if (eClass.isInstance(current)) {
          UserIdentifiedElement element = (UserIdentifiedElement) current;
          String prefix = getUserIDPrefix(element);
          index++;
          String newUserID = makeUserID(prefix, index);
          element.setUserID(newUserID);
        }
      }
    }
    /**
     * Reorder the given list of named elements according to the given list of names
     * @param elements a non-null, potentially empty list
     * @param names a non-null, potentially empty list
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void reorder(EList<? extends NamedElement> elements, List<String> names) {
      Map<String, ? extends NamedElement> byName = byName(elements);
      for (int i = 0; i < elements.size(); i++) {
        String newName = names.get(i);
        NamedElement element = byName.get(newName);
        if (element != null) {
          ((EList)elements).move(i, (ExchangeElement)element);
        }
      }
    }
    /**
     * Shorten the given string according to the given max length, appending using "..." if shortened
     * @param input a potentially null string
     * @param maxLength an int such that maxLength >= 3
     * @return a string that is null if and only if input is null, whose size if non-null is <= maxLength
     */
    public static String shorten(String input, int maxLength) {
      String result = input;
      if (maxLength >= 3 && result != null) {
        int l = result.length();
        if (l > maxLength) {
          result = result.substring(0, maxLength - 3);
          result = result + "...";
        }
      }
      return result;
    }
  }
  
}
