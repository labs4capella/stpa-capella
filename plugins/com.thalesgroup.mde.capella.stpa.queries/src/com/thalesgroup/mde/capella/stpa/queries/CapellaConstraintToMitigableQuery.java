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
package com.thalesgroup.mde.capella.stpa.queries;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.polarsys.capella.common.helpers.query.IQuery;
import org.polarsys.capella.core.data.capellacore.Constraint;

import com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper;
import com.thalesgroup.mde.capella.stpa.model.Mitigable;


/**
 * Return the STPA elements that are mapped to the given Capella element.
 */
public class CapellaConstraintToMitigableQuery implements IQuery {
  
  @Override
  public List<Object> compute(Object object) {
    List<Object> result = Collections.emptyList();
    if (object instanceof Constraint) {
      Constraint querySource = (Constraint) object;
      Collection<Mitigable> mappers =
          STPAQueryHelper.getInverseCountermeasures(querySource);
      result = new LinkedList<>(mappers);
    }
    return result;
  }
  
}
