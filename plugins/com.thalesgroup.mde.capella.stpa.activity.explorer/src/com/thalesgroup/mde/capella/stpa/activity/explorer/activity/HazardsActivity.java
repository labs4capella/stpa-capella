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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellamodeller.Project;

import com.thalesgroup.mde.capella.stpa.design.ISTPAAnalysisConstants;
import com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;


public class HazardsActivity extends AbstractSTPAAnalysisNewRepresentationActivity {

  @Override
  protected StpaAnalysisElement getModelElementCore(EObject root) {
    return STPAQueryHelper.getOrCreateAnalysisPackage(
        STPAQueryHelper.getOrCreateSTPAAnalysis((Project) root),
        StpaPackage.Literals.STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE);
  }
  
  @Override
  public String getRepresentationName() {
    return ISTPAAnalysisConstants.TABLE_HAZARDS_NAME;
  }

}
