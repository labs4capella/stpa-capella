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
package com.thalesgroup.mde.capella.stpa.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;

import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;


/**
 * @generated
 */
public class StpaAnalysisElementHelper {

	private static final StpaAnalysisElementHelper instance = new StpaAnalysisElementHelper();

	/**
	 * @generated
	 */
	public static StpaAnalysisElementHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(StpaAnalysisElement object, EStructuralFeature feature) {
		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}