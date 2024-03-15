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
package com.thalesgroup.mde.capella.stpa.activity.explorer.activity;

import java.util.List;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.thalesgroup.mde.capella.stpa.design.DesignUtil;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysis;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;


/**
 * A base class for diagram creation where the diagram location (its holder) has to be selected.
 */
public abstract class AbstractNewUnlocatedRepresentationActivity
extends AbstractSTPAAnalysisNewRepresentationActivity {
  
  /**
   * Return an optional predicate that further constraints eligible elements of the
   * location type
   * @return a potentially null predicate
   */
  protected Predicate<EObject> getLocationFilter() {
    return null;
  }
  
  /**
   * Return the root of the location lookup tree
   * @param analysis a non-null analysis
   * @return a potentially null element
   */
  protected abstract EObject getLocationLookupStart(StpaAnalysis analysis);
  
  /**
   * Return the type of the expected location
   * @return a non-null type
   */
  protected abstract EClass getLocationType();
  
  /**
   * Return the prompt message for the element selection dialog
   * @return a non-null string
   */
  protected abstract String getPromptMessage();
  
  @Override
  protected StpaAnalysisElement getModelElementCore(EObject root) {
    StpaAnalysisElement result = null;
    StpaAnalysis analysis = getOrCreateSTPAAnalysis(root);
    EObject startElement = getLocationLookupStart(analysis);
    if (startElement != null) {
      List<? extends EObject> selected = DesignUtil.selectElementsByType(
          getPromptMessage(), startElement, getLocationType(), getLocationFilter(), false);
      if (selected.size() == 1) {
        EObject first = selected.get(0);
        if (first instanceof StpaAnalysisElement) {
          result = (StpaAnalysisElement) first;
        }
      }
    }
    return result;
  }
  
}
