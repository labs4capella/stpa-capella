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

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.capella.common.helpers.query.IQuery;


/**
 * A basic query that consists in navigating a model reference.
 */
public abstract class AbstractBasicQuery implements IQuery {
  
  /**
   * @see org.polarsys.capella.common.helpers.query.IQuery#compute(java.lang.Object)
   */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Override
  public List<Object> compute(Object object) {
    List<Object> result = Collections.emptyList();
    if (object instanceof EObject) {
      EObject querySource = (EObject) object;
      EReference reference = getReference();
      Object value = querySource.eGet(reference);
      if (reference.isMany()) {
        result = (List) value;
      } else {
        result = Collections.singletonList(value);
      }
    }
    return result;
  }
  
  /**
   * Return the reference to navigate
   * @return a non-null reference
   */
  protected abstract EReference getReference();
  
}
