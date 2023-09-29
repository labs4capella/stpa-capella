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
package com.thalesgroup.mde.capella.stpa.activity.explorer.page;

import org.polarsys.kitalpha.ad.integration.amalgam.pages.ADActivityExplorerPage;

import com.thalesgroup.mde.capella.stpa.activity.explorer.Messages;
import com.thalesgroup.mde.capella.stpa.helpers.STPAViewpointHelper;

public class STPAAnalysisPage extends ADActivityExplorerPage {

  @Override
  protected String getHeaderTitle() {
    return Messages.STPAAnalysisPage_Header;
  }
  
  protected String getViewpointID() {
    return STPAViewpointHelper.VIEWPOINT_ID;
  }

}
