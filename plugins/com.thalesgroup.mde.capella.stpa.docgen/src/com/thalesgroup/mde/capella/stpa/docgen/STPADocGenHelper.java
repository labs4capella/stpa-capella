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
package com.thalesgroup.mde.capella.stpa.docgen;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.common.model.helpers.IHelper;
import org.polarsys.capella.core.data.capellacore.CapellaElement;

import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;


/**
 * A helper for STPA doc gen.
 */
public class STPADocGenHelper implements IHelper {
  
  /**
   * @see org.polarsys.capella.common.model.helpers.IHelper#getValue(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EAnnotation)
   */
  @Override
  public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
    throw new HelperNotFoundException();
  }
  
  /**
   * Return HTML documentation for STPA relations on Capella elements
   * @param capellaElement a non-null element
   * @return a non-null, potentially empty string
   */
  public static String generateSTPARelations(CapellaElement capellaElement) {
    return "";
  }
  
  /**
   * Return whether the given element has children in the HTML side bar.
   * @param element a non-null element
   */
  public static boolean hasChildren(StpaAnalysisElement element) {
    return !element.eContents().isEmpty();
  }
  
}
