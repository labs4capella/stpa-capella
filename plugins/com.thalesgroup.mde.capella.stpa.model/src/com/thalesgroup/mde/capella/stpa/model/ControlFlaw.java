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
package com.thalesgroup.mde.capella.stpa.model;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flaw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getKind <em>Kind</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getOwningSet <em>Owning Set</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getJustification <em>Justification</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getLossScenarios <em>Loss Scenarios</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlaw()
 * @model
 * @generated
 */
public interface ControlFlaw extends StpaAnalysisElement, ArchitectureMappable<NamedElement>, Mitigable {
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link com.thalesgroup.mde.capella.stpa.model.ControlFlawKind}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawKind
   * @see #setKind(ControlFlawKind)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlaw_Kind()
   * @model required="true"
   * @generated
   */
  ControlFlawKind getKind();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawKind
   * @see #getKind()
   * @generated
   */
  void setKind(ControlFlawKind value);

  /**
   * Returns the value of the '<em><b>Verdict</b></em>' attribute.
   * The literals are from the enumeration {@link com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verdict</em>' attribute.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict
   * @see #setVerdict(ControlFlawVerdict)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlaw_Verdict()
   * @model required="true"
   * @generated
   */
  ControlFlawVerdict getVerdict();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getVerdict <em>Verdict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verdict</em>' attribute.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict
   * @see #getVerdict()
   * @generated
   */
  void setVerdict(ControlFlawVerdict value);

  /**
   * Returns the value of the '<em><b>Owning Set</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getControlFlaws <em>Control Flaws</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owning Set</em>' container reference.
   * @see #setOwningSet(ControlFlawSet)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlaw_OwningSet()
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getControlFlaws
   * @model opposite="controlFlaws" required="true" transient="false"
   * @generated
   */
  ControlFlawSet getOwningSet();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getOwningSet <em>Owning Set</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owning Set</em>' container reference.
   * @see #getOwningSet()
   * @generated
   */
  void setOwningSet(ControlFlawSet value);

  /**
   * Returns the value of the '<em><b>Justification</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Justification</em>' attribute.
   * @see #setJustification(String)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlaw_Justification()
   * @model
   * @generated
   */
  String getJustification();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getJustification <em>Justification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Justification</em>' attribute.
   * @see #getJustification()
   * @generated
   */
  void setJustification(String value);

  /**
   * Returns the value of the '<em><b>Loss Scenarios</b></em>' reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.LossScenario}.
   * It is bidirectional and its opposite is '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getCausalFactors <em>Causal Factors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loss Scenarios</em>' reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlaw_LossScenarios()
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario#getCausalFactors
   * @model opposite="causalFactors"
   * @generated
   */
  EList<LossScenario> getLossScenarios();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  ControlFlawContext getContext();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  ExchangeElement getControlAction();

} // ControlFlaw
