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

import java.util.function.Predicate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.thalesgroup.mde.capella.stpa.activity.explorer.Messages;
import com.thalesgroup.mde.capella.stpa.design.ISTPAAnalysisConstants;
import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysis;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;


public class ResponsibilityActivity extends AbstractNewUnlocatedRepresentationActivity {
  
  @Override
  protected Predicate<EObject> getLocationFilter() {
    return e -> (e instanceof ControlEntity && !((ControlEntity) e).isProcess());
  }
  
  @Override
  protected EObject getLocationLookupStart(StpaAnalysis analysis) {
    return analysis.getControlStructurePackage();
  }
  
  @Override
  protected EClass getLocationType() {
    return StpaPackage.eINSTANCE.getControlEntity();
  }
  
  @Override
  protected String getPromptMessage() {
    return Messages.DetailedControllerActivity_Prompt;
  }
  
  @Override
  public String getRepresentationName() {
    return ISTPAAnalysisConstants.TABLE_RESPONSIBILITY_NAME;
  }
  
}
