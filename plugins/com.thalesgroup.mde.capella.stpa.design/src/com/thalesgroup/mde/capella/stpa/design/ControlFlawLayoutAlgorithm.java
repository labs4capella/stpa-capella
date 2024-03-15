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
package com.thalesgroup.mde.capella.stpa.design;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import com.thalesgroup.mde.capella.stpa.model.ControlAction;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawKind;


/**
 * The layout algorithm for the Control Flaw Diagram.
 */
public class ControlFlawLayoutAlgorithm extends STPABaseLayoutAlgorithm {
  
  /** The stateless singleton instance */
  protected static ControlFlawLayoutAlgorithm INSTANCE = null;
  
  /**
   * Return the singleton instance
   * @return a non-null object
   */
  public static ControlFlawLayoutAlgorithm getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new ControlFlawLayoutAlgorithm();
    }
    return INSTANCE;
  }
  
  
  /**
   * Constructor
   */
  protected ControlFlawLayoutAlgorithm() {
    // Prevents arbitrary instantiation
  }
  
  /**
   * Return the expected coordinate for the given edit part so that it is centered
   * on the given 'middle' coordinate
   * @param editPart a non-null edit part
   * @param middle an arbitraty int
   * @param horizontal whether the horizontal or vertical coordinate is concerned
   * @return an arbitrary int
   */
  protected int centerOn(IGraphicalEditPart editPart, int middle, boolean horizontal) {
    Dimension sizeDim = editPart.getFigure().getSize();
    int size = horizontal? sizeDim.width: sizeDim.height;
    return middle - (size / 2);
  }
  
  /**
   * Return the depth of the hierarchy of edit parts that needs be covered by the algorithm,
   * where 0 corresponds to the roots
   * @return a positive int
   */
  protected int getAnalysisDepth() {
    return 4;
  }
  
  /**
   * Return the bottommost Y coordinate of the main area
   * @return an arbitrary int
   */
  protected int getAreaBottom() {
    return getAreaTop() + getAreaHeight();
  }
  
  /**
   * Return the height of the main area
   * @return an arbitrary int
   */
  protected int getAreaHeight() {
    return 300;
  }
  
  /**
   * Return the leftmost X coordinate of the main area
   * @return an arbitrary int
   */
  protected int getAreaLeft() {
    return 200;
  }
  
  /**
   * Return the middle X coordinate of the main area
   * @return an arbitrary int
   */
  protected int getAreaMiddleX() {
    return getAreaLeft() + (getAreaWidth() / 2);
  }
  
  /**
   * Return the middle Y coordinate of the main area
   * @return an arbitrary int
   */
  protected int getAreaMiddleY() {
    return getAreaTop() + (getAreaHeight() / 2);
  }
  
  /**
   * Return the rightmost X coordinate of the main area
   * @return an arbitrary int
   */
  protected int getAreaRight() {
    return getAreaLeft() + getAreaWidth();
  }
  
  /**
   * Return the topmost Y coordinate of the main area
   * @return an arbitrary int
   */
  protected int getAreaTop() {
    return 120;
  }
  
  /**
   * Return the width of the main area
   * @return an arbitrary int
   */
  protected int getAreaWidth() {
    return 700;
  }
  
  /**
   * Return a map from control flaw kinds to corresponding edit parts from the given list
   * @param objects a non-null, potentially empty list
   * @return a non-null map
   */
  protected Map<ControlFlawKind, IGraphicalEditPart> getByKind(
      List<?> objects) {
    Map<ControlFlawKind, IGraphicalEditPart> result = new HashMap<>();
    getByKindRec(objects, result, getAnalysisDepth());
    return result;
  }
  
  /**
   * Fill the given map from control flaw kinds to corresponding edit parts from the given list
   * and children of elements of the list down to the given depth
   * @param objects a non-null, potentially empty list
   * @param result a non-null, potentially empty, modifiable map
   * @param remainingDepth a positive int
   * @return a non-null map
   */
  protected void getByKindRec(
      List<?> objects, Map<ControlFlawKind, IGraphicalEditPart> result, int remainingDepth) {
    for (Object object : objects) {
      if (object instanceof IGraphicalEditPart) {
        IGraphicalEditPart editPart = (IGraphicalEditPart) object;
        EObject element = getSemanticElement(editPart);
        if (element instanceof ControlFlaw) {
          ControlFlaw controlFlaw = (ControlFlaw) element;
          result.put(controlFlaw.getKind(), editPart);
        }
        if (remainingDepth > 0) {
          getByKindRec(editPart.getChildren(), result, remainingDepth - 1);
        }
      }
    }
  }
  
  /**
   * Return the expected position for the given moveable edit part that represents the control flaw
   * of the given kind, if applicable
   * @param kind a non-null kind
   * @return a potentially null point
   */
  protected Point getExpectedPosition(IGraphicalEditPart editPart,
      ControlFlawKind kind) {
    Point result;
    switch (kind) {
    // Root containers
    case CONTROL_ALGORITHM:
      result = new Point(
          centerOn(editPart, getAreaMiddleX(), true),
          centerOn(editPart, getAreaTop() - 50, false));
      break;
    case PROCESS_FAILURE:
      result = new Point(
          centerOn(editPart, getAreaMiddleX(), true),
          centerOn(editPart, getAreaBottom(), false));
      break;
    case SENSOR:
      result = new Point(
          centerOn(editPart, getAreaRight(), true),
          centerOn(editPart, getAreaMiddleY(), false));
      break;
    case ACTUATOR:
      result = new Point(
          centerOn(editPart, getAreaLeft(), true),
          centerOn(editPart, getAreaMiddleY(), false));
      break;
    // External nodes
    case CONTROL_INPUT:
      result = connectedRelativeToAbsolute(editPart, 190, -120);
      break;
    case PROCESS_CONFLICT:
      result = connectedRelativeToAbsolute(editPart, -320, 0);
      break;
    case PROCESS_INPUT:
      result = connectedRelativeToAbsolute(editPart, -120, 70);
      break;
    case PROCESS_DISTURBANCE:
      result = connectedRelativeToAbsolute(editPart, 130, 120);
      break;
    case PROCESS_OUTPUT:
      result = connectedRelativeToAbsolute(editPart, 280, 30);
      break;
    // Nodes near edges
    case CONTROLLER_TO_ACTUATOR:
      result = new Point(getAreaLeft() - 110, getAreaTop() + 35);
      break;
    case ACTUATOR_TO_PROCESS:
      result = new Point(getAreaLeft() - 10, getAreaTop() + 220);
      break;
    case PROCESS_TO_SENSOR_DELAY:
      result = new Point(getAreaLeft() + 500, getAreaTop() + 255);
      break;
    case PROCESS_TO_SENSOR_INACCURATE:
      result = new Point(getAreaLeft() + 550, getAreaTop() + 230);
      break;
    case PROCESS_TO_SENSOR_INCORRECT:
      result = new Point(getAreaLeft() + 600, getAreaTop() + 205);
      break;
    case SENSOR_TO_CONTROLLER_DELAY:
      result = new Point(getAreaLeft() + 620, getAreaTop() + 80);
      break;
    case SENSOR_TO_CONTROLLER_INADEQUATE:
      result = new Point(getAreaLeft() + 570, getAreaTop() + 50);
      break;
    case PROCESS_CHANGE:
    case PROCESS_MODEL:
    default:
      result = null;
    }
    return result;
  }
  
  /**
   * Return the smaller enclosing edit part that can be moved based on the given edit part
   * that represents a control flaw of the given kind
   * @param editPart a non-null edit part representing a control flaw
   * @param kind the non-null kind of the represented control flaw
   * @return a non-null edit part that can be the given one
   */
  protected IGraphicalEditPart getMoveableEditPart(IGraphicalEditPart editPart, ControlFlawKind kind) {
    IGraphicalEditPart result;
    switch (kind) {
    case CONTROL_ALGORITHM:
      result = (IGraphicalEditPart) editPart.getParent().getParent().getParent().getParent();
      break;
    case SENSOR: case ACTUATOR: case PROCESS_FAILURE: 
      result = (IGraphicalEditPart) editPart.getParent().getParent();
      break;
    case CONTROL_INPUT: case PROCESS_CONFLICT: case PROCESS_DISTURBANCE: case PROCESS_INPUT:
    case PROCESS_OUTPUT: case CONTROLLER_TO_ACTUATOR: case ACTUATOR_TO_PROCESS:
    case PROCESS_TO_SENSOR_DELAY: case PROCESS_TO_SENSOR_INACCURATE:
    case PROCESS_TO_SENSOR_INCORRECT: case SENSOR_TO_CONTROLLER_DELAY:
    case SENSOR_TO_CONTROLLER_INADEQUATE:
      result = (IGraphicalEditPart) editPart.getParent();
      break;
    default:
      result = editPart;
    }
    return result;
  }
  
  @Override
  @SuppressWarnings("rawtypes")
  public Command layoutEditParts(List selectedObjects, IAdaptable layoutHint) {
    CompoundCommand result = new CompoundCommand();
    // ControlAction
    IGraphicalEditPart actuatorEditPart = getFirstBySemanticTargetType(
        selectedObjects, ControlAction.class);
    if (actuatorEditPart != null && !isPinned(actuatorEditPart)) {
      Command localCommand = layoutActuatorEditPart(actuatorEditPart);
      if (localCommand != null) {
        result.add(localCommand);
      }
    }
    // Control Flaws
    Map<ControlFlawKind, IGraphicalEditPart> kindToEP = getByKind(selectedObjects);
    for (Map.Entry<ControlFlawKind, IGraphicalEditPart> entry : kindToEP.entrySet()) {
      if (!isPinned(getMoveableEditPart(entry.getValue(), entry.getKey()))) {
        Command localCommand = layoutControlFlawEditPart(entry.getValue(), entry.getKey());
        if (localCommand != null) {
          result.add(localCommand);
        }
      }
    }
    return result;
  }
  
  /**
   * Create and return a command that sets the position of the given edit part that represents
   * a control flaw of the given kind
   * @param editPart a non-null edit part representing a control flaw
   * @param kind the non-null kind of the control flaw
   * @return a potentially null command
   */
  protected Command layoutControlFlawEditPart(IGraphicalEditPart editPart, ControlFlawKind kind) {
    Command result = null;
    IGraphicalEditPart moveable = getMoveableEditPart(editPart, kind);
    Point expectedPosition = getExpectedPosition(moveable, kind);
    if (expectedPosition != null) {
      result = createMoveCommand(moveable, expectedPosition);
    }
    return result;
  }
  
  /**
   * Create and return a command that sets the position of the given edit part that represents
   * the UCA of the diagram
   * @param editPart a non-null edit part
   * @return a potentially null command
   */
  protected Command layoutActuatorEditPart(IGraphicalEditPart editPart) {
    Command result = createMoveCommand(editPart, new Point(5, 5));
    return result;
  }
  
}
