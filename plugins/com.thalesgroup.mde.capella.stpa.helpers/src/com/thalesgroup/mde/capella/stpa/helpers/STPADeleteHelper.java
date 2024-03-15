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

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.core.model.handler.command.IDeleteHelper;


/**
 * The delete helper contribution.
 */
public class STPADeleteHelper implements IDeleteHelper {
  
  /**
   * @see org.polarsys.capella.core.model.handler.command.IDeleteHelper#getExpandedSelection(java.util.Collection)
   */
  @Override
  public Collection<?> getExpandedSelection(Collection<?> selection) {
    return Collections.emptyList();
  }
  
  /**
   * @see org.polarsys.capella.core.model.handler.command.IDeleteHelper#isDeleteSemanticStructure(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  public boolean isDeleteSemanticStructure(EObject sourceObject, EObject linkObject, EStructuralFeature feature) {
    return false;
  }
  
  /**
   * @see org.polarsys.capella.core.model.handler.command.IDeleteHelper#isDeleteElement(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  public boolean isDeleteElement(EObject sourceObject, EObject linkObject, EStructuralFeature feature) {
    return false;
  }
  
  /**
   * @see org.polarsys.capella.core.model.handler.command.IDeleteHelper#getAdditionalElements(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  public Collection<EObject> getAdditionalElements(EObject sourceObject, EObject linkObject,
      EStructuralFeature feature) {
    return Collections.emptyList();
  }
  
  /**
   * @see org.polarsys.capella.core.model.handler.command.IDeleteHelper#getAdditionalCommands(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
   */
  @Override
  public Collection<Command> getAdditionalCommands(EObject sourceObject, EObject linkObject,
      EStructuralFeature feature) {
    return Collections.emptyList();
  }
  
}
