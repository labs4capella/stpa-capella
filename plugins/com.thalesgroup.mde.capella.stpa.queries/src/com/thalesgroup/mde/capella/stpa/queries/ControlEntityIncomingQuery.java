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
import java.util.stream.Collectors;

import org.polarsys.capella.common.helpers.query.IQuery;

import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.FeedbackRelation;


public class ControlEntityIncomingQuery implements IQuery {
  
  public List<Object> compute(Object object) {
    List<Object> result = Collections.emptyList();
    if (object instanceof ControlEntity) {
      ControlEntity querySource = (ControlEntity) object;
      result = new LinkedList<>();
      result.addAll(
          querySource.getIncomingRelations().stream().filter(
              it -> !(it instanceof FeedbackRelation)).collect(Collectors.toList()));
      result.addAll(
          querySource.getOutgoingRelations().stream().filter(
              it -> it instanceof FeedbackRelation).collect(Collectors.toList()));
    }
    return result;
  }
  
}
