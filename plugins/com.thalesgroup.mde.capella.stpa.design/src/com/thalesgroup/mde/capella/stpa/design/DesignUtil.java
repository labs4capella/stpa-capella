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
package com.thalesgroup.mde.capella.stpa.design;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.common.ui.toolkit.dialogs.SelectElementsDialog;
import org.polarsys.capella.core.sirius.analysis.actions.extensions.Messages;
import org.polarsys.capella.core.ui.properties.CapellaUIPropertiesPlugin;
import org.polarsys.capella.core.ui.properties.providers.CapellaTransfertViewerLabelProvider;

/**
 * A helper for the Sirius part of the STPA Viewpoint.
 */
public class DesignUtil {
  
  /**
   * Return the active editor of the workbench, if any
   * @return a potentially null editor part
   */
  public static IEditorPart getActiveEditor() {
    return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
  }
  
  /**
   * Return the GMF diagram edit part of the active diagram, if applicable
   * @return a potentially null diagram edit part
   */
  public static DiagramEditPart getActiveDiagramEditPart() {
    DiagramEditPart result = null;
    IEditorPart activeEditor = getActiveEditor();
    if (activeEditor instanceof IDiagramWorkbenchPart) {
      result = ((IDiagramWorkbenchPart) activeEditor).getDiagramEditPart();
    }
    return result;
  }
  
  /**
   * Return the current shell. Must be called from the UI thread.
   * @return a shell that is non-null in the context of this application
   */
  public static Shell getShell() {
    return PlatformUI.getWorkbench().getDisplay().getActiveShell();
  }
  
  /**
   * Allow the user to select one or several elements among the given ones
   * @param message the non-null prompt message
   * @param scope the non-null, potentially empty set of candidates
   * @param multiple whether several elements can be selected or only one
   * @return a non-null, potentially empty collection
   */
  public static List<? extends EObject> selectElements(String message,
      Collection<? extends EObject> scope, boolean multiple) {
    boolean expandViewer = CapellaUIPropertiesPlugin.getDefault().isAllowedExpandSingleViewerContent();
    int viewerExpandLevel = expandViewer ? AbstractTreeViewer.ALL_LEVELS : 0;
    SelectElementsDialog selectionDialog = new SelectElementsDialog(getShell(),
        new CapellaTransfertViewerLabelProvider(),
            Messages.SelectElementFromListWizard_Title,
            message,
            scope,
            multiple,
            null, viewerExpandLevel);
    List<? extends EObject> result = Collections.emptyList();
    if (Window.OK == selectionDialog.open()) {
      result = selectionDialog.getResult();
    }
    return result;
  }
  
  /**
   * Allow the user to select one or several elements among elements of the given type
   * and within the containment subtree of the given element
   * @param message the non-null prompt message
   * @param scope the non-null, potentially empty set of candidates
   * @param multiple whether several elements can be selected or only one
   * @return a non-null, potentially empty collection
   */
  public static List<? extends EObject> selectElementsByType(String message, EObject start,
      EClass type, Predicate<EObject> filter, boolean multiple) {
    Collection<EObject> scope = EObjectExt.getAll(start, type);
    if (filter != null) {
      Collection<EObject> formerScope = scope;
      scope = new LinkedList<>();
      for (EObject element : formerScope) {
        if (filter.test(element)) {
          scope.add(element);
        }
      }
    }
    return selectElements(message, scope, multiple);
  }
  
}
