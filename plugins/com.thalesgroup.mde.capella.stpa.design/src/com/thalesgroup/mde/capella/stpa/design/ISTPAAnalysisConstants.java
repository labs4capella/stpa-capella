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
package com.thalesgroup.mde.capella.stpa.design;

import org.polarsys.capella.core.sirius.analysis.IDiagramNameConstants;


/**
 * @see IDiagramNameConstants
 */
public interface ISTPAAnalysisConstants extends IDiagramNameConstants {
  // Representations
  String TABLE_STAKES_NAME = "Stake Table";
  String TABLE_LOSSES_NAME = "Loss Table";
  String TABLE_HAZARDS_NAME = "Hazard Table";
  String TABLE_SYSTEM_CONSTRAINTS_NAME = "System Constraint Table";
  String TABLE_GLOBAL_ANALYSIS_NAME = "Global Analysis Table";
  String DIAGRAM_DEP_NAME = "Global Traceability Diagram";
  String DIAGRAM_HCS_NAME = "Hierarchical Control Structure Diagram";
  String TABLE_RESPONSIBILITY_NAME = "Responsibility Table";
  String TABLE_IO_NAME = "IO Table";
  String TABLE_EXCHANGE_NAME = "Exchange Table";
  String TABLE_UCA_NAME = "Unsafe Control Action Table";
  String DIAGRAM_DETAILED_CONTROLLER_NAME = "Detailed Controller Diagram";
  String DIAGRAM_CONTROL_FLAW_NAME = "Control Flaw Diagram";
  String TABLE_LSCENARIO_NAME = "Loss Scenario Table";
  String DIAGRAM_DEP_CTX_NAME = "Contextual Traceability Diagram";
}
