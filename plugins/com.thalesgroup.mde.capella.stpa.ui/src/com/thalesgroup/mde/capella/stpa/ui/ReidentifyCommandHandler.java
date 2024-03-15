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
package com.thalesgroup.mde.capella.stpa.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.thalesgroup.mde.capella.stpa.helpers.STPAQueryHelper;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;


/**
 * The handler for the Reidentify command.
 */
public class ReidentifyCommandHandler extends AbstractHandler {
  
  /**
   * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
   */
  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
    ISelection selection = HandlerUtil.getCurrentSelection(event);
    if (selection instanceof IStructuredSelection) {
      IStructuredSelection sselection = (IStructuredSelection) selection;
      Object first = sselection.getFirstElement();
      if (first instanceof StpaAnalysisElement) {
        final StpaAnalysisElement element = (StpaAnalysisElement) first;
        STPAQueryHelper.execute(
            STPAQueryHelper.getEditingDomain(element),
            "Reset Identifiers",
            new Runnable() {
              @Override
              public void run() {
                STPAQueryHelper.Naming.reidentifyAll(element);
              }
            });
      }
    }
    return null;
  }
  
}
