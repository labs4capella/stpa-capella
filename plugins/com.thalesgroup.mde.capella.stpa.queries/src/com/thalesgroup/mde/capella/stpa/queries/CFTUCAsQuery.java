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

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.polarsys.capella.common.helpers.query.IQuery;

import com.thalesgroup.mde.capella.stpa.model.ControlFlawTarget;


public class CFTUCAsQuery implements IQuery {
  
  public List<Object> compute(Object object) {
    List<Object> result = Collections.emptyList();
    if (object instanceof ControlFlawTarget) {
      ControlFlawTarget querySource = (ControlFlawTarget) object;
      result = new LinkedList<>(querySource.getUnsafeControlActions());
    }
    return result;
  }
  
}
