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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Flaw Verdict</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlawVerdict()
 * @model
 * @generated
 */
public enum ControlFlawVerdict implements Enumerator {
  /**
   * The '<em><b>UNDEFINED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDEFINED_VALUE
   * @generated
   * @ordered
   */
  UNDEFINED(0, "UNDEFINED", "UNDEFINED"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>OK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OK_VALUE
   * @generated
   * @ordered
   */
  OK(1, "OK", "OK"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>KO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #KO_VALUE
   * @generated
   * @ordered
   */
  KO(2, "KO", "KO"),
  /**
   * The '<em><b>NA</b></em>' literal object.
   * <!-- begin-user-doc -->
  * <!-- end-user-doc -->
   * @see #NA_VALUE
   * @generated
   * @ordered
   */
  NA(3, "NA", "NA"); //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>UNDEFINED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDEFINED
   * @model
   * @generated
   * @ordered
   */
  public static final int UNDEFINED_VALUE = 0;

  /**
   * The '<em><b>OK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OK
   * @model
   * @generated
   * @ordered
   */
  public static final int OK_VALUE = 1;

  /**
   * The '<em><b>KO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #KO
   * @model
   * @generated
   * @ordered
   */
  public static final int KO_VALUE = 2;

  /**
   * The '<em><b>NA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NA
   * @model
   * @generated
   * @ordered
   */
  public static final int NA_VALUE = 3;

  /**
   * An array of all the '<em><b>Control Flaw Verdict</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ControlFlawVerdict[] VALUES_ARRAY = new ControlFlawVerdict[] { UNDEFINED, OK, KO, NA, };

  /**
   * A public read-only list of all the '<em><b>Control Flaw Verdict</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ControlFlawVerdict> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Control Flaw Verdict</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ControlFlawVerdict get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ControlFlawVerdict result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Control Flaw Verdict</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ControlFlawVerdict getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ControlFlawVerdict result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Control Flaw Verdict</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ControlFlawVerdict get(int value) {
    switch (value) {
    case UNDEFINED_VALUE:
      return UNDEFINED;
    case OK_VALUE:
      return OK;
    case KO_VALUE:
      return KO;
    case NA_VALUE:
      return NA;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ControlFlawVerdict(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }

} //ControlFlawVerdict
