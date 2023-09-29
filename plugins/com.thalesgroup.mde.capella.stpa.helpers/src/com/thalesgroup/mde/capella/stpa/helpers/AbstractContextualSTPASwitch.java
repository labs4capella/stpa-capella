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
package com.thalesgroup.mde.capella.stpa.helpers;

import com.thalesgroup.mde.capella.stpa.model.util.StpaSwitch;


/**
 * An EMF Switch for STPA based on an optional context object. 
 */
public abstract class AbstractContextualSTPASwitch<T, U> extends StpaSwitch<T> {
  
  /** The optional context object */
  protected final U _context;
  
  
  /**
   * Constructor
   * @param context the optional context object
   */
  public AbstractContextualSTPASwitch(U context) {
    _context = context;
  }
  
  /**
   * Return the context element
   * @return a potentially null element
   */
  public U getContext() {
    return _context;
  }
  
}
