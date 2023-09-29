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
package com.thalesgroup.mde.capella.stpa.activity.explorer.activity;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.explorer.activity.ui.hyperlinkadapter.AbstractCapellaNewDiagramHyperlinkAdapter;

import com.thalesgroup.mde.capella.stpa.activity.explorer.Messages;
import com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysis;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;


/**
 * A refined abstract class for diagram creation.
 */
public abstract class AbstractSTPAAnalysisNewRepresentationActivity extends AbstractCapellaNewDiagramHyperlinkAdapter {
  
  @Override
  protected StpaAnalysisElement getModelElement(EObject root) {
    final StpaAnalysisElement[] resultWrapper = new StpaAnalysisElement[1];
    STPAQueryHelper.execute(
        STPAQueryHelper.getEditingDomain(root),
        Messages.AbstractSTPAAnalysisNewRepresentationActivity_CreateAnalysis, new Runnable() {
          @Override
          public void run() {
            resultWrapper[0] = getModelElementCore(root);
          }
        });
    return resultWrapper[0];
  }
  
  /**
   * Define the core behavior of getModelElement ignoring read/write and transaction issues
   * @param root a non-null root element
   * @return a potentially null element
   */
  protected StpaAnalysisElement getModelElementCore(EObject root) {
    return getOrCreateSTPAAnalysis(root);
  }

  /**
   * Return the STPA Analysis in the context of the given root element, creating it if absent
   * @param root a non-null root element
   * @return a non-null element
   */
  protected StpaAnalysis getOrCreateSTPAAnalysis(EObject root) {
    return STPAQueryHelper.getOrCreateSTPAAnalysis((Project) root);
  }
  
}
