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
package com.thalesgroup.mde.capella.stpa.helpers;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;


/**
 * A helper for the STPA Viewpoint.
 */
public class STPAViewpointHelper {

  /**
   * The unique ID of the viewpoint
   */
  public static final String VIEWPOINT_ID = "com.thalesgroup.mde.capella.stpa";

  /**
   * Return whether the STPA Viewpoint is active in the model of the given element
   * @param element a non-null element
   */
  public static boolean isViewpointActive(EObject element) {
    try {
      return (element != null)
          ? ViewpointManager.getInstance(element).isReferenced(VIEWPOINT_ID)
              && !ViewpointManager.getInstance(element).isInactive(VIEWPOINT_ID)
          : false;
    } catch (IllegalArgumentException ex) {
      // Element is irrelevant: silent failure
    }
    return false;
  }
  
}
