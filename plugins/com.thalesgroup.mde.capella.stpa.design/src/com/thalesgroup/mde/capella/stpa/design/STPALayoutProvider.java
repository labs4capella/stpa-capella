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
package com.thalesgroup.mde.capella.stpa.design;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

import org.eclipse.sirius.diagram.ui.api.layout.CustomLayoutAlgorithm;
import org.eclipse.sirius.diagram.ui.api.layout.CustomLayoutAlgorithmProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.DefaultLayoutProvider;


/**
 * A layout provider for the STPA Viewpoint.
 */
public class STPALayoutProvider implements CustomLayoutAlgorithmProvider {
  
  /**
   * @see org.eclipse.sirius.diagram.ui.api.layout.CustomLayoutAlgorithmProvider#getCustomLayoutAlgorithms()
   */
  @Override
  public List<CustomLayoutAlgorithm> getCustomLayoutAlgorithms() {
    Supplier<DefaultLayoutProvider> layoutSupplier = new Supplier<DefaultLayoutProvider>() {
      @Override
      public DefaultLayoutProvider get() {
        return ControlFlawLayoutAlgorithm.getInstance();
      }
    };
    CustomLayoutAlgorithm layoutAlgo =
        CustomLayoutAlgorithm.newCustomLayoutAlgorithm("STPA.ControlFlawLayout").
          setLabel("STPA Control Flaw Layout").
          setDescription("A layout algorithm dedicated to the STPA " +
              ISTPAAnalysisConstants.DIAGRAM_CONTROL_FLAW_NAME).
          setLayoutOptions(Collections.emptyMap()).
          setLayoutSupplier(layoutSupplier).build();
    return Arrays.asList(layoutAlgo);
  }
  
}
