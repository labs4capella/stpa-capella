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
package com.thalesgroup.mde.capella.stpa.helpers;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Constraint;


/**
 * An EMF Switch for STPA that returns dependency elements based on an optional context element. 
 */
public abstract class AbstractSTPADependencySwitch extends AbstractContextualSTPASwitch<List<? extends EObject>, EObject> {
  
  /**
   * Constructor
   * @param context the optional context element
   */
  public AbstractSTPADependencySwitch(EObject context) {
    super(context);
  }
  
  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  protected List<? extends EObject> caseConstraint(Constraint object) {
    return null;
  }
  
  @Override
  protected List<? extends EObject> doSwitch(EClass eClass, EObject eObject) {
    List<? extends EObject> result;
    if (eClass == CapellacorePackage.Literals.CONSTRAINT) {
      result = caseConstraint((Constraint) eObject);
    } else {
      result = super.doSwitch(eClass, eObject);
    }
    return result;
  }
  
  /**
   * Return the union of the applications of this switch on all elements of the given collection
   * @param elements a non-null, potentially empty collection
   * @return a non-null, potentially empty ordered set
   */
  public List<EObject> doSwitchAll(Collection<? extends EObject> elements) {
    List<EObject> result = new UniqueEList<>();
    for (EObject element : elements) {
      List<? extends EObject> current = doSwitch(element);
      if (current != null) {
        result.addAll(current);
      }
    }
    return result;
  }
  
  /**
   * Return the ordered set of scoping types
   * @return a non-null, potentially empty, constant ordered set
   */
  protected abstract List<EClass> getOrderedScopingTypes();
  
  /**
   * Return elements of the given type that restrict the scope given the context, if any
   * @return a non-null, potentially empty set
   */
  public List<EObject> getScopingElements(EClass type) {
    List<EObject> result = new UniqueEList<>();
    final List<EClass> orderedTypes = getOrderedScopingTypes();
    int typePos = orderedTypes.indexOf(type);
    if (typePos >= 0) {
      List<EClass> previousTypes = orderedTypes.subList(0, typePos);
      Deque<EObject> elements = new LinkedList<>();
      if (getContext() != null) {
        elements.add(getContext());
      }
      Set<EObject> allChecked = new HashSet<>(elements);
      while (!elements.isEmpty()) {
        EObject head = elements.pop();
        if (type.isInstance(head)) {
          result.add(head);
        } else if (previousTypes.stream().anyMatch(t -> t.isInstance(head))) {
          List<? extends EObject> allNextOfHead = doSwitch(head);
          if (allNextOfHead != null) {
            for (EObject nextOfHead : allNextOfHead) {
              if (!allChecked.contains(nextOfHead)) {
                elements.add(nextOfHead);
                allChecked.add(nextOfHead);
              }
            }
          }
        }
      }
    }
    return result;
  }
  
}
