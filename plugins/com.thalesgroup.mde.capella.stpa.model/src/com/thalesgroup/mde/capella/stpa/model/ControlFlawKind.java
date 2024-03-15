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
 * A representation of the literals of the enumeration '<em><b>Control Flaw Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.mde.capella.stpa.model.StpaPackage#getControlFlawKind()
 * @model
 * @generated
 */
public enum ControlFlawKind implements Enumerator {
  /**
   * The '<em><b>CONTROL INPUT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTROL_INPUT_VALUE
   * @generated
   * @ordered
   */
  CONTROL_INPUT(0, "CONTROL_INPUT", "CONTROL_INPUT"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>CONTROL ALGORITHM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTROL_ALGORITHM_VALUE
   * @generated
   * @ordered
   */
  CONTROL_ALGORITHM(1, "CONTROL_ALGORITHM", "CONTROL_ALGORITHM"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROCESS MODEL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_MODEL_VALUE
   * @generated
   * @ordered
   */
  PROCESS_MODEL(2, "PROCESS_MODEL", "PROCESS_MODEL"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>CONTROLLER TO ACTUATOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTROLLER_TO_ACTUATOR_VALUE
   * @generated
   * @ordered
   */
  CONTROLLER_TO_ACTUATOR(3, "CONTROLLER_TO_ACTUATOR", "CONTROLLER_TO_ACTUATOR"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>ACTUATOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACTUATOR_VALUE
   * @generated
   * @ordered
   */
  ACTUATOR(4, "ACTUATOR", "ACTUATOR"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>ACTUATOR TO PROCESS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACTUATOR_TO_PROCESS_VALUE
   * @generated
   * @ordered
   */
  ACTUATOR_TO_PROCESS(5, "ACTUATOR_TO_PROCESS", "ACTUATOR_TO_PROCESS"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROCESS FAILURE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_FAILURE_VALUE
   * @generated
   * @ordered
   */
  PROCESS_FAILURE(6, "PROCESS_FAILURE", "PROCESS_FAILURE"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROCESS CHANGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_CHANGE_VALUE
   * @generated
   * @ordered
   */
  PROCESS_CHANGE(7, "PROCESS_CHANGE", "PROCESS_CHANGE"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROCESS CONFLICT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_CONFLICT_VALUE
   * @generated
   * @ordered
   */
  PROCESS_CONFLICT(8, "PROCESS_CONFLICT", "PROCESS_CONFLICT"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROCESS INPUT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_INPUT_VALUE
   * @generated
   * @ordered
   */
  PROCESS_INPUT(9, "PROCESS_INPUT", "PROCESS_INPUT"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROCESS DISTURBANCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_DISTURBANCE_VALUE
   * @generated
   * @ordered
   */
  PROCESS_DISTURBANCE(10, "PROCESS_DISTURBANCE", "PROCESS_DISTURBANCE"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROCESS OUTPUT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_OUTPUT_VALUE
   * @generated
   * @ordered
   */
  PROCESS_OUTPUT(11, "PROCESS_OUTPUT", "PROCESS_OUTPUT"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROCESS TO SENSOR DELAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_TO_SENSOR_DELAY_VALUE
   * @generated
   * @ordered
   */
  PROCESS_TO_SENSOR_DELAY(12, "PROCESS_TO_SENSOR_DELAY", "PROCESS_TO_SENSOR_DELAY"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROCESS TO SENSOR INACCURATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_TO_SENSOR_INACCURATE_VALUE
   * @generated
   * @ordered
   */
  PROCESS_TO_SENSOR_INACCURATE(13, "PROCESS_TO_SENSOR_INACCURATE", "PROCESS_TO_SENSOR_INACCURATE"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>PROCESS TO SENSOR INCORRECT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_TO_SENSOR_INCORRECT_VALUE
   * @generated
   * @ordered
   */
  PROCESS_TO_SENSOR_INCORRECT(14, "PROCESS_TO_SENSOR_INCORRECT", "PROCESS_TO_SENSOR_INCORRECT"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>SENSOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SENSOR_VALUE
   * @generated
   * @ordered
   */
  SENSOR(15, "SENSOR", "SENSOR"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>SENSOR TO CONTROLLER DELAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SENSOR_TO_CONTROLLER_DELAY_VALUE
   * @generated
   * @ordered
   */
  SENSOR_TO_CONTROLLER_DELAY(16, "SENSOR_TO_CONTROLLER_DELAY", "SENSOR_TO_CONTROLLER_DELAY"), //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>SENSOR TO CONTROLLER INADEQUATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SENSOR_TO_CONTROLLER_INADEQUATE_VALUE
   * @generated
   * @ordered
   */
  SENSOR_TO_CONTROLLER_INADEQUATE(17, "SENSOR_TO_CONTROLLER_INADEQUATE", "SENSOR_TO_CONTROLLER_INADEQUATE"); //$NON-NLS-1$ //$NON-NLS-2$

  /**
   * The '<em><b>CONTROL INPUT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTROL_INPUT
   * @model
   * @generated
   * @ordered
   */
  public static final int CONTROL_INPUT_VALUE = 0;

  /**
   * The '<em><b>CONTROL ALGORITHM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTROL_ALGORITHM
   * @model
   * @generated
   * @ordered
   */
  public static final int CONTROL_ALGORITHM_VALUE = 1;

  /**
   * The '<em><b>PROCESS MODEL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_MODEL
   * @model
   * @generated
   * @ordered
   */
  public static final int PROCESS_MODEL_VALUE = 2;

  /**
   * The '<em><b>CONTROLLER TO ACTUATOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTROLLER_TO_ACTUATOR
   * @model
   * @generated
   * @ordered
   */
  public static final int CONTROLLER_TO_ACTUATOR_VALUE = 3;

  /**
   * The '<em><b>ACTUATOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACTUATOR
   * @model
   * @generated
   * @ordered
   */
  public static final int ACTUATOR_VALUE = 4;

  /**
   * The '<em><b>ACTUATOR TO PROCESS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACTUATOR_TO_PROCESS
   * @model
   * @generated
   * @ordered
   */
  public static final int ACTUATOR_TO_PROCESS_VALUE = 5;

  /**
   * The '<em><b>PROCESS FAILURE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_FAILURE
   * @model
   * @generated
   * @ordered
   */
  public static final int PROCESS_FAILURE_VALUE = 6;

  /**
   * The '<em><b>PROCESS CHANGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_CHANGE
   * @model
   * @generated
   * @ordered
   */
  public static final int PROCESS_CHANGE_VALUE = 7;

  /**
   * The '<em><b>PROCESS CONFLICT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_CONFLICT
   * @model
   * @generated
   * @ordered
   */
  public static final int PROCESS_CONFLICT_VALUE = 8;

  /**
   * The '<em><b>PROCESS INPUT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_INPUT
   * @model
   * @generated
   * @ordered
   */
  public static final int PROCESS_INPUT_VALUE = 9;

  /**
   * The '<em><b>PROCESS DISTURBANCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_DISTURBANCE
   * @model
   * @generated
   * @ordered
   */
  public static final int PROCESS_DISTURBANCE_VALUE = 10;

  /**
   * The '<em><b>PROCESS OUTPUT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_OUTPUT
   * @model
   * @generated
   * @ordered
   */
  public static final int PROCESS_OUTPUT_VALUE = 11;

  /**
   * The '<em><b>PROCESS TO SENSOR DELAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_TO_SENSOR_DELAY
   * @model
   * @generated
   * @ordered
   */
  public static final int PROCESS_TO_SENSOR_DELAY_VALUE = 12;

  /**
   * The '<em><b>PROCESS TO SENSOR INACCURATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_TO_SENSOR_INACCURATE
   * @model
   * @generated
   * @ordered
   */
  public static final int PROCESS_TO_SENSOR_INACCURATE_VALUE = 13;

  /**
   * The '<em><b>PROCESS TO SENSOR INCORRECT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROCESS_TO_SENSOR_INCORRECT
   * @model
   * @generated
   * @ordered
   */
  public static final int PROCESS_TO_SENSOR_INCORRECT_VALUE = 14;

  /**
   * The '<em><b>SENSOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SENSOR
   * @model
   * @generated
   * @ordered
   */
  public static final int SENSOR_VALUE = 15;

  /**
   * The '<em><b>SENSOR TO CONTROLLER DELAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SENSOR_TO_CONTROLLER_DELAY
   * @model
   * @generated
   * @ordered
   */
  public static final int SENSOR_TO_CONTROLLER_DELAY_VALUE = 16;

  /**
   * The '<em><b>SENSOR TO CONTROLLER INADEQUATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SENSOR_TO_CONTROLLER_INADEQUATE
   * @model
   * @generated
   * @ordered
   */
  public static final int SENSOR_TO_CONTROLLER_INADEQUATE_VALUE = 17;

  /**
   * An array of all the '<em><b>Control Flaw Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ControlFlawKind[] VALUES_ARRAY = new ControlFlawKind[] { CONTROL_INPUT, CONTROL_ALGORITHM,
      PROCESS_MODEL, CONTROLLER_TO_ACTUATOR, ACTUATOR, ACTUATOR_TO_PROCESS, PROCESS_FAILURE, PROCESS_CHANGE,
      PROCESS_CONFLICT, PROCESS_INPUT, PROCESS_DISTURBANCE, PROCESS_OUTPUT, PROCESS_TO_SENSOR_DELAY,
      PROCESS_TO_SENSOR_INACCURATE, PROCESS_TO_SENSOR_INCORRECT, SENSOR, SENSOR_TO_CONTROLLER_DELAY,
      SENSOR_TO_CONTROLLER_INADEQUATE, };

  /**
   * A public read-only list of all the '<em><b>Control Flaw Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ControlFlawKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Control Flaw Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ControlFlawKind get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ControlFlawKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Control Flaw Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ControlFlawKind getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ControlFlawKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Control Flaw Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ControlFlawKind get(int value) {
    switch (value) {
    case CONTROL_INPUT_VALUE:
      return CONTROL_INPUT;
    case CONTROL_ALGORITHM_VALUE:
      return CONTROL_ALGORITHM;
    case PROCESS_MODEL_VALUE:
      return PROCESS_MODEL;
    case CONTROLLER_TO_ACTUATOR_VALUE:
      return CONTROLLER_TO_ACTUATOR;
    case ACTUATOR_VALUE:
      return ACTUATOR;
    case ACTUATOR_TO_PROCESS_VALUE:
      return ACTUATOR_TO_PROCESS;
    case PROCESS_FAILURE_VALUE:
      return PROCESS_FAILURE;
    case PROCESS_CHANGE_VALUE:
      return PROCESS_CHANGE;
    case PROCESS_CONFLICT_VALUE:
      return PROCESS_CONFLICT;
    case PROCESS_INPUT_VALUE:
      return PROCESS_INPUT;
    case PROCESS_DISTURBANCE_VALUE:
      return PROCESS_DISTURBANCE;
    case PROCESS_OUTPUT_VALUE:
      return PROCESS_OUTPUT;
    case PROCESS_TO_SENSOR_DELAY_VALUE:
      return PROCESS_TO_SENSOR_DELAY;
    case PROCESS_TO_SENSOR_INACCURATE_VALUE:
      return PROCESS_TO_SENSOR_INACCURATE;
    case PROCESS_TO_SENSOR_INCORRECT_VALUE:
      return PROCESS_TO_SENSOR_INCORRECT;
    case SENSOR_VALUE:
      return SENSOR;
    case SENSOR_TO_CONTROLLER_DELAY_VALUE:
      return SENSOR_TO_CONTROLLER_DELAY;
    case SENSOR_TO_CONTROLLER_INADEQUATE_VALUE:
      return SENSOR_TO_CONTROLLER_INADEQUATE;
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
  private ControlFlawKind(int value, String name, String literal) {
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

} //ControlFlawKind
