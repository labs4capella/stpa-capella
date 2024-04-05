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

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.common.model.helpers.IHelper;
import org.polarsys.capella.common.ui.toolkit.browser.category.CategoryRegistry;
import org.polarsys.capella.common.ui.toolkit.browser.category.ICategory;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.Constraint;

import com.thalesgroup.mde.capella.stpa.docgen.util.HTMLHelper;
import com.thalesgroup.mde.capella.stpa.docgen.util.StpaDocGenConstants;
import com.thalesgroup.mde.capella.stpa.model.ControlFlaw;
import com.thalesgroup.mde.capella.stpa.model.ControlFlawSet;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;
import com.thalesgroup.mde.capella.stpa.model.TechnicalPackage;
import com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory;


/**
 * A helper for STPA doc gen.
 */
public class StpaDocGenHelper implements IHelper {
  
  /**
   * @see org.polarsys.capella.common.model.helpers.IHelper#getValue(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EAnnotation)
   */
  @Override
  public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
    throw new HelperNotFoundException();
  }
  
  /**
   * Return HTML documentation for attributes of STPA elements
   * @param element a non-null element
   * @param htmlFolderName a non-null string
   * @return a non-null, potentially empty string
   */
  public static String getAttributes(CapellaElement element, String htmlFolderName) {
    return ""; //TODO
  }
  
  /**
   * Return HTML documentation for contents of STPA elements
   * @param element a non-null element
   * @param htmlFolderName a non-null string
   * @return a non-null, potentially empty string
   */
  public static String getContents(CapellaElement element, String htmlFolderName) {
    return getHtmlData(
        element.eContents().stream().filter(e -> isVisibleStpaElement(element)).collect(Collectors.toList()),
        htmlFolderName, StpaDocGenConstants.CONTENT);
  }
  
  /**
   * Forked from org.polarsys.capella.cybersecurity.docgen.helper.CybersecurityHelper#getHtmlDataToAppend(Collection, String, String)
   */
  public static String getHtmlData(Collection<? extends EObject> elements,
      String htmlFolderName, String category) {
    StringBuilder builder = new StringBuilder();
    if (!elements.isEmpty()) {
      builder.append(HTMLHelper.getSubtitle(category));
      builder.append(HTMLHelper.getUlList(
          elements.stream().map(e -> HTMLHelper.getLinkElementList(e, htmlFolderName)).toArray(String[]::new)));
    }
    return builder.toString();
  }
  
  /**
   * Return HTML documentation for STPA relations
   * @param element a non-null element
   * @param htmlFolderName a non-null string
   * @return a non-null, potentially empty string
   */
  @SuppressWarnings("unchecked")
  public static String getRelations(CapellaElement element, String htmlFolderName) {
    StringBuilder builder = new StringBuilder();
    CategoryRegistry registry = CategoryRegistry.getInstance();
    Collection<ICategory> categories = registry.gatherCategories(element);
    for (ICategory category : categories) {
      String id = category.getCategoryId();
      if (id != null && id.startsWith(StpaDocGenConstants.SB_CATEGORY_PREFIX)) {
        Collection<Object> qResult = category.compute(element);
        Collection<EObject> returnedElements = (Collection<EObject>)(Collection<?>) qResult;
        if (!qResult.isEmpty()) {
          builder.append(getHtmlData(returnedElements, htmlFolderName, category.getName()));
        }
      }
    }
    return builder.toString();
  }
  
  /**
   * Return whether the given element qualifies as a visible STPA element
   * @param element a potentially null element (false for null) 
   */
  public static boolean isVisibleStpaElement(EObject element) {
    return element instanceof StpaAnalysisElement &&
        !(element instanceof TechnicalPackage
            || element instanceof UnsafeControlActionCategory
            || element instanceof ControlFlawSet
            || element instanceof ControlFlaw)
        || element instanceof Constraint;
  }
  
}
