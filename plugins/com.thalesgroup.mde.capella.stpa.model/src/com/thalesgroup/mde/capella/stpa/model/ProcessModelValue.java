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
package com.thalesgroup.mde.capella.stpa.model;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Model Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelValue#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getProcessModelValue()
 * @model
 * @generated
 */
public interface ProcessModelValue extends ArchitectureMappable<NamedElement> {
  /**
   * Returns the value of the '<em><b>Variable</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' container reference.
   * @see #setVariable(ProcessModelVariable)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getProcessModelValue_Variable()
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getValues
   * @model opposite="values" required="true" transient="false"
   * @generated
   */
  ProcessModelVariable getVariable();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelValue#getVariable <em>Variable</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' container reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(ProcessModelVariable value);

} // ProcessModelValue
