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

import com.thalesgroup.mde.capella.stpa.design.ISTPAAnalysisConstants;


public class GlobalTableActivity extends AbstractSTPAAnalysisNewRepresentationActivity {

  @Override
  public String getRepresentationName() {
    return ISTPAAnalysisConstants.TABLE_GLOBAL_ANALYSIS_NAME;
  }

}
