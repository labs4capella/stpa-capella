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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unsafe Control Action Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getUnsafeControlActionKind()
 * @model
 * @generated
 */
public enum UnsafeControlActionKind implements Enumerator {
  /**
   * The '<em><b>NOT PROVIDING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_PROVIDING_VALUE
   * @generated
   * @ordered
   */
  NOT_PROVIDING(0, "NOT_PROVIDING", "NOT_PROVIDING"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROVIDING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROVIDING_VALUE
   * @generated
   * @ordered
   */
  PROVIDING(1, "PROVIDING", "PROVIDING"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>WRONG TIMING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WRONG_TIMING_VALUE
   * @generated
   * @ordered
   */
  WRONG_TIMING(2, "WRONG_TIMING", "WRONG_TIMING"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>WRONG DURATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WRONG_DURATION_VALUE
   * @generated
   * @ordered
   */
  WRONG_DURATION(3, "WRONG_DURATION", "WRONG_DURATION"); //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>NOT PROVIDING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_PROVIDING
   * @model
   * @generated
   * @ordered
   */
  public static final int NOT_PROVIDING_VALUE = 0;

  /**
   * The '<em><b>PROVIDING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROVIDING
   * @model
   * @generated
   * @ordered
   */
  public static final int PROVIDING_VALUE = 1;

  /**
   * The '<em><b>WRONG TIMING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WRONG_TIMING
   * @model
   * @generated
   * @ordered
   */
  public static final int WRONG_TIMING_VALUE = 2;

  /**
   * The '<em><b>WRONG DURATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WRONG_DURATION
   * @model
   * @generated
   * @ordered
   */
  public static final int WRONG_DURATION_VALUE = 3;

  /**
   * An array of all the '<em><b>Unsafe Control Action Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UnsafeControlActionKind[] VALUES_ARRAY = new UnsafeControlActionKind[] { NOT_PROVIDING,
      PROVIDING, WRONG_TIMING, WRONG_DURATION, };

  /**
   * A public read-only list of all the '<em><b>Unsafe Control Action Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<UnsafeControlActionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Unsafe Control Action Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UnsafeControlActionKind get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UnsafeControlActionKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Unsafe Control Action Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UnsafeControlActionKind getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UnsafeControlActionKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Unsafe Control Action Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UnsafeControlActionKind get(int value) {
    switch (value) {
    case NOT_PROVIDING_VALUE:
      return NOT_PROVIDING;
    case PROVIDING_VALUE:
      return PROVIDING;
    case WRONG_TIMING_VALUE:
      return WRONG_TIMING;
    case WRONG_DURATION_VALUE:
      return WRONG_DURATION;
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
  private UnsafeControlActionKind(int value, String name, String literal) {
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

} //UnsafeControlActionKind
