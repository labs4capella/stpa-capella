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
import java.util.LinkedList;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.sirius.table.metamodel.table.DLine;
import org.eclipse.swt.widgets.Widget;


/**
 * A specialization of EditingDomainViewerDropAdapter for Sirius tables that provides
 * EMF Drag'n'Drop support by substituting lines with their semantic elements.
 */
public class SiriusTableDropAdapter extends EditingDomainViewerDropAdapter {
  
  /**
   * Constructor
   * @param domain a non-null editing domain
   * @param viewer a non-null viewer
   */
  public SiriusTableDropAdapter(EditingDomain domain, TreeViewer viewer) {
    super(domain, viewer);
  }
  
  /**
   * @see org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter#extractDragSource(java.lang.Object)
   */
  protected Collection<?> extractDragSource(Object object) {
    Collection<?> oldResult = super.extractDragSource(object);
    Collection<Object> result = new LinkedList<>();
    for (Object element : oldResult) {
      if (element instanceof DLine) {
        element = ((DLine) element).getTarget();
      }
      result.add(element);
    }
    return result;
  }
  
  /**
   * @see org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter#extractDropTarget(org.eclipse.swt.widgets.Widget)
   */
  protected Object extractDropTarget(Widget item) {
    Object result = super.extractDropTarget(item);
    if (result instanceof DLine) {
      result = ((DLine) result).getTarget();
    }
    return result;
  }
  
}
