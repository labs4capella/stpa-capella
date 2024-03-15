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
package com.thalesgroup.mde.capella.stpa.activity.explorer.predicate;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.sirius.ui.helper.SessionHelper;

import com.thalesgroup.mde.capella.stpa.helpers.STPAViewpointHelper;


public class PSTPAAnalysisPredicate implements IPredicate {
  
  @Override
  public boolean isOk() {
    boolean result = false;
    Session session = ActivityExplorerManager.INSTANCE.getSession();
    if (session != null) {
      Project capellaProject = SessionHelper.getCapellaProject(session);
      result = STPAViewpointHelper.isViewpointActive(capellaProject);
    }
    return result;
  }
  
}