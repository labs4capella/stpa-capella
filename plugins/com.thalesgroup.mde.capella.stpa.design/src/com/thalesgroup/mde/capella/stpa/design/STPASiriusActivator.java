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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.table.metamodel.table.DTable;
import org.eclipse.sirius.table.metamodel.table.description.TableDescription;
import org.eclipse.sirius.ui.business.api.editor.ISiriusEditor;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 */
public class STPASiriusActivator extends AbstractUIPlugin {
  
  /** The plug-in ID */
  public static final String PLUGIN_ID = "com.thalesgroup.mde.capella.stpa.design";

  /** The initially null shared instance */
  private static STPASiriusActivator plugin;

  /** The initially null set of contributed viewpoints */
  private static Set<Viewpoint> viewpoints;
  
  /** The non-null part listener for additional functionality on Sirius tables */
  private final IPartListener siriusTableEditorListener;

  /** The non-null window listener for additional functionality on Sirius tables */
  private final IWindowListener windowListener;


  /**
   * The constructor
   */
  public STPASiriusActivator() {
    siriusTableEditorListener = new IPartListener() {
      @Override
      public void partOpened(IWorkbenchPart part) {
        STPASiriusActivator.this.partOpened(part);
      }
      @Override
      public void partDeactivated(IWorkbenchPart part) {}
      @Override
      public void partClosed(IWorkbenchPart part) {}
      @Override
      public void partBroughtToTop(IWorkbenchPart part) {}
      @Override
      public void partActivated(IWorkbenchPart part) {}
    };
    windowListener = new IWindowListener() {
      @Override
      public void windowOpened(IWorkbenchWindow window) {
        window.getPartService().addPartListener(siriusTableEditorListener);
      }
      @Override
      public void windowDeactivated(IWorkbenchWindow window) {}
      @Override
      public void windowClosed(IWorkbenchWindow window) {}
      @Override
      public void windowActivated(IWorkbenchWindow window) {}
    };
  }
  
  /**
   * Add Drag'n'Drop support to the given viewer
   * @param viewer a non-null viewer
   * @param domain a non-null editing domain
   */
  protected void addDnDSupport(TreeViewer viewer, EditingDomain domain) {
    int dndOperations = DND.DROP_COPY | DND.DROP_MOVE;
    Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), LocalSelectionTransfer.getTransfer() };
    viewer.addDropSupport(dndOperations, transfers, new SiriusTableDropAdapter(domain, viewer));
  }
  
  /**
   * Return the Sirius table the given part is an editor of, if any
   * @param part a potentially null part
   * @return a potentially null object
   */
  protected DTable getEditedSiriusTable(IWorkbenchPart part) {
    DTable result = null;
    if (part instanceof ISiriusEditor) {
      ISiriusEditor siriusEditor = (ISiriusEditor) part;
      IEditorInput input = siriusEditor.getEditorInput();
      if (input instanceof SessionEditorInput) {
        EObject mainInput = ((SessionEditorInput) input).getInput();
        if (mainInput instanceof DTable) {
          result = (DTable) mainInput;
        }
      }
    }
    return result;
  }
  
  /**
   * Return whether the given representation belongs to the STPA viewpoint
   * @param description a potentially null representation
   */
  protected boolean isSTPADescription(RepresentationDescription description) {
    boolean result = false;
    if (description != null) {
      Resource resource = description.eResource();
      URI uri = resource.getURI();
      if (uri != null) {
        result = uri.segmentsList().contains(PLUGIN_ID);
      }
    }
    return result;
  }
  
  /**
   * Return whether the given Sirius table is an STPA table
   * @param table a potentially null table
   */
  protected boolean isSTPATable(DTable table) {
    boolean result = false;
    if (table != null) {
      TableDescription desc = table.getDescription();
      result = isSTPADescription(desc);
    }
    return result;
  }
  
  /**
   * React to the opening of the given workbench part
   * @param part a non-null object
   */
  protected void partOpened(IWorkbenchPart part) {
    DTable table = getEditedSiriusTable(part);
    if (isSTPATable(table) && part instanceof IViewerProvider) {
      Viewer viewer = ((IViewerProvider) part).getViewer();
      if (viewer instanceof TreeViewer) {
        addDnDSupport((TreeViewer) viewer, ((IEditingDomainProvider) part).getEditingDomain());
      }
    }
  }
  
  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
    viewpoints = new HashSet<Viewpoint>();
    viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/STPA.odesign"));
    IWorkbench wb = PlatformUI.getWorkbench();
    if (wb != null && !wb.isClosing()) {
      wb.addWindowListener(windowListener);
    }
  }
  
  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    if (viewpoints != null) {
      for (final Viewpoint viewpoint: viewpoints) {
        ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
      }
      viewpoints.clear();
      viewpoints = null; 
    }
    IWorkbench wb = PlatformUI.getWorkbench();
    if (wb != null && !wb.isClosing()) {
      wb.removeWindowListener(windowListener);
    }
    super.stop(context);
  }
  
  /**
   * Returns the shared instance
   * @return the shared instance
   */
  public static STPASiriusActivator getDefault() {
    return plugin;
  }
  
}
