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
package com.thalesgroup.mde.capella.stpa.queries;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.helpers.query.IQuery;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper;


/**
 * Return the STPA elements that are mapped to the given Capella element.
 */
public class CapellaNEToSTPAQuery implements IQuery {
  
  @Override
  public List<Object> compute(Object object) {
    List<Object> result = Collections.emptyList();
    if (object instanceof NamedElement) {
      NamedElement querySource = (NamedElement) object;
      Collection<EObject> mappers =
          STPAQueryHelper.getInverseArchitectureElements(querySource);
      result = new LinkedList<>(mappers);
    }
    return result;
  }
  
}
