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
package com.thalesgroup.mde.capella.stpa.activity.explorer;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
  private static final String BUNDLE_NAME = "com.thalesgroup.mde.capella.stpa.activity.explorer.messages"; //$NON-NLS-1$
  public static String AbstractSTPAAnalysisNewRepresentationActivity_CreateAnalysis;
  public static String CAActivity_Prompt;
  public static String DetailedControllerActivity_Prompt;
  public static String FeedbackActivity_Prompt;
  public static String InformationActivity_Prompt;
  public static String IOActivity_Prompt;
  public static String STPAAnalysisPage_Header;
  public static String UCAActivity_Prompt;
  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
  }
}
