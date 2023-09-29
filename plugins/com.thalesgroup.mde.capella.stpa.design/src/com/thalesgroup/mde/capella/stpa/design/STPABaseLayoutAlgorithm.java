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

import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.DefaultLayoutProvider;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;


/**
 * The layout algorithm for the Control Flaw Diagram.
 */
public class STPABaseLayoutAlgorithm extends DefaultLayoutProvider {
  
  /**
   * Constructor
   */
  protected STPABaseLayoutAlgorithm() {
    // Prevents arbitrary instantiation
  }
  
  /**
   * Return the absolute coordinates that correspond to a position offset specified by the given
   * vector with respect to the expected position of the edit part the given edit part is
   * connected to, if applicable
   * @param editPart a non-null edit part
   * @param xOffset the X component of the offset
   * @param yOffset the Y component of the offset
   * @return a Point of absolute coordinates, or null if connections are not as expected
   */
  protected Point connectedRelativeToAbsolute(IGraphicalEditPart editPart,
      int xOffset, int yOffset) {
    Point result = null;
    IGraphicalEditPart connectionTarget = getConnectionTarget(editPart);
    if (connectionTarget != null) {
      Rectangle bounds = connectionTarget.getFigure().getBounds();
      int resultX = bounds.x + xOffset;
      int resultY = bounds.y + yOffset;
      result = new Point(resultX, resultY);
    }
    return result;
  }
  
  /**
   * Create and return a command that moves the given edit part to the given location, if needed
   * @param editPart a non-null edit part
   * @param position a non-null point
   * @return a potentially null command
   */
  protected Command createMoveCommand(IGraphicalEditPart editPart, Point position) {
    Command result = null;
    // Define zoom level
    double zoom = 1.0;
    RootEditPart root = editPart.getRoot();
    if (root instanceof DiagramRootEditPart) {
      final ZoomManager zoomManager = ((DiagramRootEditPart) root).getZoomManager(); // Non-null
      zoom = zoomManager.getZoom();
    }
    // Define GEF request
    ChangeBoundsRequest request = new ChangeBoundsRequest();
    request.setEditParts(editPart);
    Rectangle figureBounds = editPart.getFigure().getBounds();
    Dimension delta = position.getDifference(figureBounds.getLocation());
    delta.width *= zoom;
    delta.height *= zoom;
    if ((delta.width != 0 || delta.height != 0) && request != null) {
      request.setMoveDelta(new Point(delta.width, delta.height));
      request.setLocation(position);
      request.setType(org.eclipse.gef.RequestConstants.REQ_MOVE);
      result = buildCommandWrapper(request, editPart);
    }
    return result;
  }
  
  /**
   * Return the first element in the given list that is a graphical edit part with
   * a semantic target of the given type, if any
   * @param objects a non-null list
   * @param semanticType a non-null type
   * @return a potentially null graphical edit part
   */
  protected IGraphicalEditPart getFirstBySemanticTargetType(List<?> objects,
      Class<?> semanticType) {
    for (Object object : objects) {
      if (object instanceof IGraphicalEditPart) {
        IGraphicalEditPart editPart = (IGraphicalEditPart) object;
        EObject target = getSemanticElement(editPart);
        if (semanticType.isInstance(target)) {
          return editPart;
        }
      }
    }
    return null;
  }
  
  /**
   * Return the semantic element represented via Sirius by the given edit part, if any
   * @param editPart a non-null edit part
   * @return a potentially null element
   */
  @SuppressWarnings("unchecked")
  protected <T extends EObject> T getDiagramSemanticTarget(IAdaptable layoutHint) {
    T result = null;
    IGraphicalEditPart editPart = layoutHint.getAdapter(IGraphicalEditPart.class);
    if (editPart != null) {
      result = (T) getSemanticElement(editPart);
    }
    return result;
  }
  
  /**
   * Return the edit part connected to the given one through an edge, if any and unique
   * @param editPart a non-null edit part
   * @return a potentially null edit part
   */
  protected IGraphicalEditPart getConnectionTarget(IGraphicalEditPart editPart) {
    IGraphicalEditPart result = null;
    boolean sourceToTarget = true;
    List<?> connections = editPart.getSourceConnections();
    if (connections == null || connections.size() != 1) {
      connections = editPart.getTargetConnections();
      sourceToTarget = false;
    }
    if (connections != null && connections.size() == 1) {
      Object first = connections.get(0);
      if (first instanceof ConnectionEditPart) {
        ConnectionEditPart connection = (ConnectionEditPart) first;
        EditPart counterpart = sourceToTarget? connection.getTarget(): connection.getSource();
        if (counterpart instanceof IGraphicalEditPart) {
          result = (IGraphicalEditPart) counterpart;
        }
      }
    }
    return result;
  }
  
  /**
   * Return the GMF element represented by the given edit part, if any
   * @param editPart a non-null edit part
   * @return a potentially null element
   */
  protected View getGMFElement(IGraphicalEditPart editPart) {
    View result = null;
    Object model = editPart.getModel();
    if (model instanceof View) {
      result = (View) model;
    }
    return result;
  }
  
  /**
   * Return the semantic element represented via Sirius by the given edit part, if any
   * @param editPart a non-null edit part
   * @return a potentially null element
   */
  protected EObject getSemanticElement(IGraphicalEditPart editPart) {
    EObject result = null;
    View view = getGMFElement(editPart);
    if (view != null) {
      EObject element = view.getElement();
      if (element instanceof DSemanticDecorator) {
        result = ((DSemanticDecorator) element).getTarget();
      }
    }
    return result;
  }
  
}
