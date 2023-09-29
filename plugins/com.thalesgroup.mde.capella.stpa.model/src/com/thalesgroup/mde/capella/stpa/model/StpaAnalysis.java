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

import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getTechnicalPackage <em>Technical Package</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getLossPackage <em>Loss Package</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getHazardConstraintPackage <em>Hazard Constraint Package</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getControlStructurePackage <em>Control Structure Package</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getLossScenarioPackage <em>Loss Scenario Package</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getSystem <em>System</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getSubAnalyses <em>Sub Analyses</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStpaAnalysis()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/modeller/1.4.0#//ModelRoot'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaModeller.ecore#//ModelRoot'"
 * @generated
 */
public interface StpaAnalysis extends StpaAnalysisElement, ElementExtension {
  /**
   * Returns the value of the '<em><b>Technical Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Technical Package</em>' containment reference.
   * @see #setTechnicalPackage(TechnicalPackage)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStpaAnalysis_TechnicalPackage()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  TechnicalPackage getTechnicalPackage();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getTechnicalPackage <em>Technical Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Technical Package</em>' containment reference.
   * @see #getTechnicalPackage()
   * @generated
   */
  void setTechnicalPackage(TechnicalPackage value);

  /**
   * Returns the value of the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' reference.
   * @see #setSystem(ControlEntity)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStpaAnalysis_System()
   * @model
   * @generated
   */
  ControlEntity getSystem();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getSystem <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(ControlEntity value);

  /**
   * Returns the value of the '<em><b>Sub Analyses</b></em>' containment reference list.
   * The list contents are of type {@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Analyses</em>' containment reference list.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStpaAnalysis_SubAnalyses()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<StpaAnalysis> getSubAnalyses();

  /**
   * Returns the value of the '<em><b>Loss Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loss Package</em>' containment reference.
   * @see #setLossPackage(LossPackage)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStpaAnalysis_LossPackage()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  LossPackage getLossPackage();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getLossPackage <em>Loss Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loss Package</em>' containment reference.
   * @see #getLossPackage()
   * @generated
   */
  void setLossPackage(LossPackage value);

  /**
   * Returns the value of the '<em><b>Hazard Constraint Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hazard Constraint Package</em>' containment reference.
   * @see #setHazardConstraintPackage(HazardConstraintPackage)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStpaAnalysis_HazardConstraintPackage()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  HazardConstraintPackage getHazardConstraintPackage();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getHazardConstraintPackage <em>Hazard Constraint Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hazard Constraint Package</em>' containment reference.
   * @see #getHazardConstraintPackage()
   * @generated
   */
  void setHazardConstraintPackage(HazardConstraintPackage value);

  /**
   * Returns the value of the '<em><b>Control Structure Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Structure Package</em>' containment reference.
   * @see #setControlStructurePackage(ControlStructurePackage)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStpaAnalysis_ControlStructurePackage()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  ControlStructurePackage getControlStructurePackage();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getControlStructurePackage <em>Control Structure Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Control Structure Package</em>' containment reference.
   * @see #getControlStructurePackage()
   * @generated
   */
  void setControlStructurePackage(ControlStructurePackage value);

  /**
   * Returns the value of the '<em><b>Loss Scenario Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loss Scenario Package</em>' containment reference.
   * @see #setLossScenarioPackage(LossScenarioPackage)
   * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getStpaAnalysis_LossScenarioPackage()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  LossScenarioPackage getLossScenarioPackage();

  /**
   * Sets the value of the '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getLossScenarioPackage <em>Loss Scenario Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loss Scenario Package</em>' containment reference.
   * @see #getLossScenarioPackage()
   * @generated
   */
  void setLossScenarioPackage(LossScenarioPackage value);

} // StpaAnalysis
