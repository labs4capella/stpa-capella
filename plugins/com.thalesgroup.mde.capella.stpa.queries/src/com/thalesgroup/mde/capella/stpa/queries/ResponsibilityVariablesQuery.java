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
package com.thalesgroup.mde.capella.stpa.queries;

import org.eclipse.emf.ecore.EReference;

import com.thalesgroup.mde.capella.stpa.model.StpaPackage;


public class ResponsibilityVariablesQuery extends AbstractBasicQuery {
  
  @Override
  protected EReference getReference() {
    return StpaPackage.Literals.RESPONSIBILITY__VARIABLES;
  }
  
}
