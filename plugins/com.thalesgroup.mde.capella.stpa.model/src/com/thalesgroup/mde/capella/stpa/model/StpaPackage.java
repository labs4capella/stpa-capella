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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.thalesgroup.mde.capella.stpa.model.StpaFactory
 * @model kind="package"
 * @generated
 */
public interface StpaPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "stpa"; //$NON-NLS-1$

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.thalesgroup.com/capella/stpa"; //$NON-NLS-1$

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "stpa"; //$NON-NLS-1$

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StpaPackage eINSTANCE = com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl.init();

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisElementImpl <em>Analysis Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisElementImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getStpaAnalysisElement()
   * @generated
   */
  int STPA_ANALYSIS_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__ID = CapellacorePackage.NAMED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__SID = CapellacorePackage.NAMED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS = CapellacorePackage.NAMED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The number of structural features of the '<em>Analysis Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_ELEMENT_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.UserIdentifiedElementImpl <em>User Identified Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.UserIdentifiedElementImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getUserIdentifiedElement()
   * @generated
   */
  int USER_IDENTIFIED_ELEMENT = 2;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.DecomposableImpl <em>Decomposable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.DecomposableImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getDecomposable()
   * @generated
   */
  int DECOMPOSABLE = 3;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.DecompositionCategoryImpl <em>Decomposition Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.DecompositionCategoryImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getDecompositionCategory()
   * @generated
   */
  int DECOMPOSITION_CATEGORY = 4;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ArchitectureMappableImpl <em>Architecture Mappable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ArchitectureMappableImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getArchitectureMappable()
   * @generated
   */
  int ARCHITECTURE_MAPPABLE = 1;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__OWNED_EXTENSIONS = STPA_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__ID = STPA_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__SID = STPA_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__CONSTRAINTS = STPA_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__OWNED_CONSTRAINTS = STPA_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__OWNED_MIGRATED_ELEMENTS = STPA_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__NAME = STPA_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__INCOMING_TRACES = STPA_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__OUTGOING_TRACES = STPA_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__VISIBLE_IN_DOC = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__VISIBLE_IN_LM = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__SUMMARY = STPA_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__DESCRIPTION = STPA_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__REVIEW = STPA_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__OWNED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__OWNED_ENUMERATION_PROPERTY_TYPES = STPA_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__APPLIED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__OWNED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__APPLIED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__STATUS = STPA_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__FEATURES = STPA_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__APPLIED_REQUIREMENTS = STPA_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Architecture Mappable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_MAPPABLE_FEATURE_COUNT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS = ARCHITECTURE_MAPPABLE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__ID = ARCHITECTURE_MAPPABLE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__SID = ARCHITECTURE_MAPPABLE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__CONSTRAINTS = ARCHITECTURE_MAPPABLE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS = ARCHITECTURE_MAPPABLE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS = ARCHITECTURE_MAPPABLE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__NAME = ARCHITECTURE_MAPPABLE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__INCOMING_TRACES = ARCHITECTURE_MAPPABLE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES = ARCHITECTURE_MAPPABLE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC = ARCHITECTURE_MAPPABLE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM = ARCHITECTURE_MAPPABLE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__SUMMARY = ARCHITECTURE_MAPPABLE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__DESCRIPTION = ARCHITECTURE_MAPPABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__REVIEW = ARCHITECTURE_MAPPABLE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES = ARCHITECTURE_MAPPABLE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = ARCHITECTURE_MAPPABLE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES = ARCHITECTURE_MAPPABLE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS = ARCHITECTURE_MAPPABLE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS = ARCHITECTURE_MAPPABLE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__STATUS = ARCHITECTURE_MAPPABLE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__FEATURES = ARCHITECTURE_MAPPABLE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS = ARCHITECTURE_MAPPABLE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS = ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT__USER_ID = ARCHITECTURE_MAPPABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User Identified Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_IDENTIFIED_ELEMENT_FEATURE_COUNT = ARCHITECTURE_MAPPABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__OWNED_EXTENSIONS = USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__ID = USER_IDENTIFIED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__SID = USER_IDENTIFIED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__CONSTRAINTS = USER_IDENTIFIED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__OWNED_CONSTRAINTS = USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__OWNED_MIGRATED_ELEMENTS = USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__NAME = USER_IDENTIFIED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__INCOMING_TRACES = USER_IDENTIFIED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__OUTGOING_TRACES = USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__VISIBLE_IN_DOC = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__VISIBLE_IN_LM = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__SUMMARY = USER_IDENTIFIED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__DESCRIPTION = USER_IDENTIFIED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__REVIEW = USER_IDENTIFIED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__OWNED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__OWNED_ENUMERATION_PROPERTY_TYPES = USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__APPLIED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__OWNED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__APPLIED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__STATUS = USER_IDENTIFIED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__FEATURES = USER_IDENTIFIED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__APPLIED_REQUIREMENTS = USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__ARCHITECTURE_ELEMENTS = USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__USER_ID = USER_IDENTIFIED_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Decomposition Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__DECOMPOSITION_CATEGORIES = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE__CATEGORY = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Decomposable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSABLE_FEATURE_COUNT = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__OWNED_EXTENSIONS = STPA_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__ID = STPA_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__SID = STPA_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__CONSTRAINTS = STPA_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__OWNED_CONSTRAINTS = STPA_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__OWNED_MIGRATED_ELEMENTS = STPA_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__NAME = STPA_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__INCOMING_TRACES = STPA_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__OUTGOING_TRACES = STPA_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__VISIBLE_IN_DOC = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__VISIBLE_IN_LM = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__SUMMARY = STPA_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__DESCRIPTION = STPA_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__REVIEW = STPA_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__OWNED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__OWNED_ENUMERATION_PROPERTY_TYPES = STPA_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__APPLIED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__OWNED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__APPLIED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__STATUS = STPA_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__FEATURES = STPA_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__APPLIED_REQUIREMENTS = STPA_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Coverage</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY__COVERAGE = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decomposition Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_CATEGORY_FEATURE_COUNT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl <em>Analysis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getStpaAnalysis()
   * @generated
   */
  int STPA_ANALYSIS = 5;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__OWNED_EXTENSIONS = STPA_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__ID = STPA_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__SID = STPA_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__CONSTRAINTS = STPA_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__OWNED_CONSTRAINTS = STPA_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__OWNED_MIGRATED_ELEMENTS = STPA_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__NAME = STPA_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__INCOMING_TRACES = STPA_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__OUTGOING_TRACES = STPA_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__VISIBLE_IN_DOC = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__VISIBLE_IN_LM = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__SUMMARY = STPA_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__DESCRIPTION = STPA_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__REVIEW = STPA_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__OWNED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__OWNED_ENUMERATION_PROPERTY_TYPES = STPA_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__APPLIED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__OWNED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__APPLIED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__STATUS = STPA_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__FEATURES = STPA_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__APPLIED_REQUIREMENTS = STPA_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Technical Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__TECHNICAL_PACKAGE = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Loss Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__LOSS_PACKAGE = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hazard Constraint Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Control Structure Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Loss Scenario Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__SYSTEM = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Sub Analyses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS__SUB_ANALYSES = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Analysis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STPA_ANALYSIS_FEATURE_COUNT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.AnalysisPackageImpl <em>Analysis Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.AnalysisPackageImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getAnalysisPackage()
   * @generated
   */
  int ANALYSIS_PACKAGE = 6;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__OWNED_EXTENSIONS = STPA_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__ID = STPA_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__SID = STPA_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__CONSTRAINTS = STPA_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__OWNED_CONSTRAINTS = STPA_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__OWNED_MIGRATED_ELEMENTS = STPA_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__NAME = STPA_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__INCOMING_TRACES = STPA_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__OUTGOING_TRACES = STPA_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__VISIBLE_IN_DOC = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__VISIBLE_IN_LM = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__SUMMARY = STPA_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__DESCRIPTION = STPA_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__REVIEW = STPA_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES = STPA_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__STATUS = STPA_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__FEATURES = STPA_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE__APPLIED_REQUIREMENTS = STPA_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The number of structural features of the '<em>Analysis Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANALYSIS_PACKAGE_FEATURE_COUNT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.TechnicalPackageImpl <em>Technical Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.TechnicalPackageImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getTechnicalPackage()
   * @generated
   */
  int TECHNICAL_PACKAGE = 7;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__OWNED_EXTENSIONS = ANALYSIS_PACKAGE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__ID = ANALYSIS_PACKAGE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__SID = ANALYSIS_PACKAGE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__CONSTRAINTS = ANALYSIS_PACKAGE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__OWNED_CONSTRAINTS = ANALYSIS_PACKAGE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__OWNED_MIGRATED_ELEMENTS = ANALYSIS_PACKAGE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__NAME = ANALYSIS_PACKAGE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__INCOMING_TRACES = ANALYSIS_PACKAGE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__OUTGOING_TRACES = ANALYSIS_PACKAGE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__VISIBLE_IN_DOC = ANALYSIS_PACKAGE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__VISIBLE_IN_LM = ANALYSIS_PACKAGE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__SUMMARY = ANALYSIS_PACKAGE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__DESCRIPTION = ANALYSIS_PACKAGE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__REVIEW = ANALYSIS_PACKAGE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__OWNED_PROPERTY_VALUES = ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES = ANALYSIS_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__APPLIED_PROPERTY_VALUES = ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS = ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS = ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__STATUS = ANALYSIS_PACKAGE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__FEATURES = ANALYSIS_PACKAGE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__APPLIED_REQUIREMENTS = ANALYSIS_PACKAGE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Unsafe Control Action Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE__UNSAFE_CONTROL_ACTION_CATEGORIES = ANALYSIS_PACKAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Technical Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNICAL_PACKAGE_FEATURE_COUNT = ANALYSIS_PACKAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.LossPackageImpl <em>Loss Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.LossPackageImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getLossPackage()
   * @generated
   */
  int LOSS_PACKAGE = 8;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__OWNED_EXTENSIONS = ANALYSIS_PACKAGE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__ID = ANALYSIS_PACKAGE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__SID = ANALYSIS_PACKAGE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__CONSTRAINTS = ANALYSIS_PACKAGE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__OWNED_CONSTRAINTS = ANALYSIS_PACKAGE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__OWNED_MIGRATED_ELEMENTS = ANALYSIS_PACKAGE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__NAME = ANALYSIS_PACKAGE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__INCOMING_TRACES = ANALYSIS_PACKAGE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__OUTGOING_TRACES = ANALYSIS_PACKAGE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__VISIBLE_IN_DOC = ANALYSIS_PACKAGE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__VISIBLE_IN_LM = ANALYSIS_PACKAGE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__SUMMARY = ANALYSIS_PACKAGE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__DESCRIPTION = ANALYSIS_PACKAGE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__REVIEW = ANALYSIS_PACKAGE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__OWNED_PROPERTY_VALUES = ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES = ANALYSIS_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__APPLIED_PROPERTY_VALUES = ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS = ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS = ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__STATUS = ANALYSIS_PACKAGE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__FEATURES = ANALYSIS_PACKAGE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__APPLIED_REQUIREMENTS = ANALYSIS_PACKAGE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Stakeholders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__STAKEHOLDERS = ANALYSIS_PACKAGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Losses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE__LOSSES = ANALYSIS_PACKAGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loss Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_PACKAGE_FEATURE_COUNT = ANALYSIS_PACKAGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardConstraintPackageImpl <em>Hazard Constraint Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.HazardConstraintPackageImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getHazardConstraintPackage()
   * @generated
   */
  int HAZARD_CONSTRAINT_PACKAGE = 9;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__OWNED_EXTENSIONS = ANALYSIS_PACKAGE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__ID = ANALYSIS_PACKAGE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__SID = ANALYSIS_PACKAGE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__CONSTRAINTS = ANALYSIS_PACKAGE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__OWNED_CONSTRAINTS = ANALYSIS_PACKAGE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__OWNED_MIGRATED_ELEMENTS = ANALYSIS_PACKAGE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__NAME = ANALYSIS_PACKAGE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__INCOMING_TRACES = ANALYSIS_PACKAGE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__OUTGOING_TRACES = ANALYSIS_PACKAGE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__VISIBLE_IN_DOC = ANALYSIS_PACKAGE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__VISIBLE_IN_LM = ANALYSIS_PACKAGE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__SUMMARY = ANALYSIS_PACKAGE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__DESCRIPTION = ANALYSIS_PACKAGE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__REVIEW = ANALYSIS_PACKAGE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__OWNED_PROPERTY_VALUES = ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES = ANALYSIS_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__APPLIED_PROPERTY_VALUES = ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS = ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS = ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__STATUS = ANALYSIS_PACKAGE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__FEATURES = ANALYSIS_PACKAGE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__APPLIED_REQUIREMENTS = ANALYSIS_PACKAGE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Root Hazards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__ROOT_HAZARDS = ANALYSIS_PACKAGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Root System Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE__ROOT_SYSTEM_CONSTRAINTS = ANALYSIS_PACKAGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Hazard Constraint Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CONSTRAINT_PACKAGE_FEATURE_COUNT = ANALYSIS_PACKAGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlStructurePackageImpl <em>Control Structure Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlStructurePackageImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlStructurePackage()
   * @generated
   */
  int CONTROL_STRUCTURE_PACKAGE = 10;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__OWNED_EXTENSIONS = ANALYSIS_PACKAGE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__ID = ANALYSIS_PACKAGE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__SID = ANALYSIS_PACKAGE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__CONSTRAINTS = ANALYSIS_PACKAGE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__OWNED_CONSTRAINTS = ANALYSIS_PACKAGE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__OWNED_MIGRATED_ELEMENTS = ANALYSIS_PACKAGE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__NAME = ANALYSIS_PACKAGE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__INCOMING_TRACES = ANALYSIS_PACKAGE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__OUTGOING_TRACES = ANALYSIS_PACKAGE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__VISIBLE_IN_DOC = ANALYSIS_PACKAGE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__VISIBLE_IN_LM = ANALYSIS_PACKAGE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__SUMMARY = ANALYSIS_PACKAGE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__DESCRIPTION = ANALYSIS_PACKAGE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__REVIEW = ANALYSIS_PACKAGE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__OWNED_PROPERTY_VALUES = ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES = ANALYSIS_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__APPLIED_PROPERTY_VALUES = ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS = ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS = ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__STATUS = ANALYSIS_PACKAGE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__FEATURES = ANALYSIS_PACKAGE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__APPLIED_REQUIREMENTS = ANALYSIS_PACKAGE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Root Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE__ROOT_ENTITIES = ANALYSIS_PACKAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Control Structure Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_STRUCTURE_PACKAGE_FEATURE_COUNT = ANALYSIS_PACKAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioPackageImpl <em>Loss Scenario Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioPackageImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getLossScenarioPackage()
   * @generated
   */
  int LOSS_SCENARIO_PACKAGE = 11;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__OWNED_EXTENSIONS = ANALYSIS_PACKAGE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__ID = ANALYSIS_PACKAGE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__SID = ANALYSIS_PACKAGE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__CONSTRAINTS = ANALYSIS_PACKAGE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__OWNED_CONSTRAINTS = ANALYSIS_PACKAGE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__OWNED_MIGRATED_ELEMENTS = ANALYSIS_PACKAGE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__NAME = ANALYSIS_PACKAGE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__INCOMING_TRACES = ANALYSIS_PACKAGE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__OUTGOING_TRACES = ANALYSIS_PACKAGE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__VISIBLE_IN_DOC = ANALYSIS_PACKAGE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__VISIBLE_IN_LM = ANALYSIS_PACKAGE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__SUMMARY = ANALYSIS_PACKAGE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__DESCRIPTION = ANALYSIS_PACKAGE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__REVIEW = ANALYSIS_PACKAGE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__OWNED_PROPERTY_VALUES = ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES = ANALYSIS_PACKAGE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__APPLIED_PROPERTY_VALUES = ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS = ANALYSIS_PACKAGE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS = ANALYSIS_PACKAGE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__STATUS = ANALYSIS_PACKAGE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__FEATURES = ANALYSIS_PACKAGE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__APPLIED_REQUIREMENTS = ANALYSIS_PACKAGE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Loss Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE__LOSS_SCENARIOS = ANALYSIS_PACKAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Loss Scenario Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_PACKAGE_FEATURE_COUNT = ANALYSIS_PACKAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.StakeholderImpl <em>Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StakeholderImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getStakeholder()
   * @generated
   */
  int STAKEHOLDER = 12;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__OWNED_EXTENSIONS = USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__ID = USER_IDENTIFIED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__SID = USER_IDENTIFIED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__CONSTRAINTS = USER_IDENTIFIED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__OWNED_CONSTRAINTS = USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__OWNED_MIGRATED_ELEMENTS = USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__NAME = USER_IDENTIFIED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__INCOMING_TRACES = USER_IDENTIFIED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__OUTGOING_TRACES = USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__VISIBLE_IN_DOC = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__VISIBLE_IN_LM = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__SUMMARY = USER_IDENTIFIED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__DESCRIPTION = USER_IDENTIFIED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__REVIEW = USER_IDENTIFIED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__OWNED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__OWNED_ENUMERATION_PROPERTY_TYPES = USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__APPLIED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__OWNED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__APPLIED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__STATUS = USER_IDENTIFIED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__FEATURES = USER_IDENTIFIED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__APPLIED_REQUIREMENTS = USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__ARCHITECTURE_ELEMENTS = USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__USER_ID = USER_IDENTIFIED_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Stakes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__STAKES = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stakeholder</em>' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_FEATURE_COUNT = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.StakeImpl <em>Stake</em>}' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StakeImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getStake()
   * @generated
   */
  int STAKE = 13;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__OWNED_EXTENSIONS = USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__ID = USER_IDENTIFIED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__SID = USER_IDENTIFIED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__CONSTRAINTS = USER_IDENTIFIED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__OWNED_CONSTRAINTS = USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__OWNED_MIGRATED_ELEMENTS = USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__NAME = USER_IDENTIFIED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__INCOMING_TRACES = USER_IDENTIFIED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__OUTGOING_TRACES = USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__VISIBLE_IN_DOC = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__VISIBLE_IN_LM = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__SUMMARY = USER_IDENTIFIED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__DESCRIPTION = USER_IDENTIFIED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__REVIEW = USER_IDENTIFIED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__OWNED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__OWNED_ENUMERATION_PROPERTY_TYPES = USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__APPLIED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__OWNED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__APPLIED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__STATUS = USER_IDENTIFIED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__FEATURES = USER_IDENTIFIED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__APPLIED_REQUIREMENTS = USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__ARCHITECTURE_ELEMENTS = USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__USER_ID = USER_IDENTIFIED_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' container reference.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__STAKEHOLDER = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Losses</b></em>' reference list.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE__LOSSES = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stake</em>' class.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKE_FEATURE_COUNT = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.LossImpl <em>Loss</em>}' class.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.LossImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getLoss()
   * @generated
   */
  int LOSS = 14;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__OWNED_EXTENSIONS = USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__ID = USER_IDENTIFIED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__SID = USER_IDENTIFIED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__CONSTRAINTS = USER_IDENTIFIED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__OWNED_CONSTRAINTS = USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__OWNED_MIGRATED_ELEMENTS = USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__NAME = USER_IDENTIFIED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__INCOMING_TRACES = USER_IDENTIFIED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__OUTGOING_TRACES = USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__VISIBLE_IN_DOC = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__VISIBLE_IN_LM = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__SUMMARY = USER_IDENTIFIED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__DESCRIPTION = USER_IDENTIFIED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__REVIEW = USER_IDENTIFIED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__OWNED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__OWNED_ENUMERATION_PROPERTY_TYPES = USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__APPLIED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__OWNED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__APPLIED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__STATUS = USER_IDENTIFIED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__FEATURES = USER_IDENTIFIED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__APPLIED_REQUIREMENTS = USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__ARCHITECTURE_ELEMENTS = USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__USER_ID = USER_IDENTIFIED_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Hazards</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__HAZARDS = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stakes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS__STAKES = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loss</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_FEATURE_COUNT = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawTargetImpl <em>Control Flaw Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawTargetImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawTarget()
   * @generated
   */
  int CONTROL_FLAW_TARGET = 15;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__OWNED_EXTENSIONS = USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__ID = USER_IDENTIFIED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__SID = USER_IDENTIFIED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__CONSTRAINTS = USER_IDENTIFIED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__OWNED_CONSTRAINTS = USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__OWNED_MIGRATED_ELEMENTS = USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__NAME = USER_IDENTIFIED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__INCOMING_TRACES = USER_IDENTIFIED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__OUTGOING_TRACES = USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__VISIBLE_IN_DOC = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__VISIBLE_IN_LM = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__SUMMARY = USER_IDENTIFIED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__DESCRIPTION = USER_IDENTIFIED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__REVIEW = USER_IDENTIFIED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__OWNED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__OWNED_ENUMERATION_PROPERTY_TYPES = USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__APPLIED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__OWNED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__APPLIED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__STATUS = USER_IDENTIFIED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__FEATURES = USER_IDENTIFIED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__APPLIED_REQUIREMENTS = USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__ARCHITECTURE_ELEMENTS = USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET__USER_ID = USER_IDENTIFIED_ELEMENT__USER_ID;

  /**
   * The number of structural features of the '<em>Control Flaw Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_TARGET_FEATURE_COUNT = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardImpl <em>Hazard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.HazardImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getHazard()
   * @generated
   */
  int HAZARD = 16;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__OWNED_EXTENSIONS = DECOMPOSABLE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__ID = DECOMPOSABLE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__SID = DECOMPOSABLE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__CONSTRAINTS = DECOMPOSABLE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__OWNED_CONSTRAINTS = DECOMPOSABLE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__OWNED_MIGRATED_ELEMENTS = DECOMPOSABLE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__NAME = DECOMPOSABLE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__INCOMING_TRACES = DECOMPOSABLE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__OUTGOING_TRACES = DECOMPOSABLE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__VISIBLE_IN_DOC = DECOMPOSABLE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__VISIBLE_IN_LM = DECOMPOSABLE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__SUMMARY = DECOMPOSABLE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__DESCRIPTION = DECOMPOSABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__REVIEW = DECOMPOSABLE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__OWNED_PROPERTY_VALUES = DECOMPOSABLE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__OWNED_ENUMERATION_PROPERTY_TYPES = DECOMPOSABLE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__APPLIED_PROPERTY_VALUES = DECOMPOSABLE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__OWNED_PROPERTY_VALUE_GROUPS = DECOMPOSABLE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__APPLIED_PROPERTY_VALUE_GROUPS = DECOMPOSABLE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__STATUS = DECOMPOSABLE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__FEATURES = DECOMPOSABLE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__APPLIED_REQUIREMENTS = DECOMPOSABLE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__ARCHITECTURE_ELEMENTS = DECOMPOSABLE__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__USER_ID = DECOMPOSABLE__USER_ID;

  /**
   * The feature id for the '<em><b>Decomposition Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__DECOMPOSITION_CATEGORIES = DECOMPOSABLE__DECOMPOSITION_CATEGORIES;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__CATEGORY = DECOMPOSABLE__CATEGORY;

  /**
   * The feature id for the '<em><b>Unsafe Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__UNSAFE_CONDITION = DECOMPOSABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Hazards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__SUB_HAZARDS = DECOMPOSABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Losses</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__LOSSES = DECOMPOSABLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>System Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__SYSTEM_CONSTRAINTS = DECOMPOSABLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unsafe Control Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__UNSAFE_CONTROL_ACTIONS = DECOMPOSABLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Loss Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__LOSS_SCENARIOS = DECOMPOSABLE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Hazard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_FEATURE_COUNT = DECOMPOSABLE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl <em>System Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getSystemConstraint()
   * @generated
   */
  int SYSTEM_CONSTRAINT = 17;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__OWNED_EXTENSIONS = DECOMPOSABLE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__ID = DECOMPOSABLE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__SID = DECOMPOSABLE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__CONSTRAINTS = DECOMPOSABLE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__OWNED_CONSTRAINTS = DECOMPOSABLE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__OWNED_MIGRATED_ELEMENTS = DECOMPOSABLE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__NAME = DECOMPOSABLE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__INCOMING_TRACES = DECOMPOSABLE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__OUTGOING_TRACES = DECOMPOSABLE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__VISIBLE_IN_DOC = DECOMPOSABLE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__VISIBLE_IN_LM = DECOMPOSABLE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__SUMMARY = DECOMPOSABLE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__DESCRIPTION = DECOMPOSABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__REVIEW = DECOMPOSABLE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__OWNED_PROPERTY_VALUES = DECOMPOSABLE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__OWNED_ENUMERATION_PROPERTY_TYPES = DECOMPOSABLE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__APPLIED_PROPERTY_VALUES = DECOMPOSABLE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__OWNED_PROPERTY_VALUE_GROUPS = DECOMPOSABLE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__APPLIED_PROPERTY_VALUE_GROUPS = DECOMPOSABLE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__STATUS = DECOMPOSABLE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__FEATURES = DECOMPOSABLE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__APPLIED_REQUIREMENTS = DECOMPOSABLE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__ARCHITECTURE_ELEMENTS = DECOMPOSABLE__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__USER_ID = DECOMPOSABLE__USER_ID;

  /**
   * The feature id for the '<em><b>Decomposition Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__DECOMPOSITION_CATEGORIES = DECOMPOSABLE__DECOMPOSITION_CATEGORIES;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__CATEGORY = DECOMPOSABLE__CATEGORY;

  /**
   * The feature id for the '<em><b>Condition To Enforce</b></em>' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__CONDITION_TO_ENFORCE = DECOMPOSABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub System Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS = DECOMPOSABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hazards</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__HAZARDS = DECOMPOSABLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Responsibilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__RESPONSIBILITIES = DECOMPOSABLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unsafe Control Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS = DECOMPOSABLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Loss Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__LOSS_SCENARIOS = DECOMPOSABLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Assumptions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT__ASSUMPTIONS = DECOMPOSABLE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>System Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTRAINT_FEATURE_COUNT = DECOMPOSABLE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlEntityImpl <em>Control Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlEntityImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlEntity()
   * @generated
   */
  int CONTROL_ENTITY = 18;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__OWNED_EXTENSIONS = DECOMPOSABLE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__ID = DECOMPOSABLE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__SID = DECOMPOSABLE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__CONSTRAINTS = DECOMPOSABLE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__OWNED_CONSTRAINTS = DECOMPOSABLE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__OWNED_MIGRATED_ELEMENTS = DECOMPOSABLE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__NAME = DECOMPOSABLE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__INCOMING_TRACES = DECOMPOSABLE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__OUTGOING_TRACES = DECOMPOSABLE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__VISIBLE_IN_DOC = DECOMPOSABLE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__VISIBLE_IN_LM = DECOMPOSABLE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__SUMMARY = DECOMPOSABLE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__DESCRIPTION = DECOMPOSABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__REVIEW = DECOMPOSABLE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__OWNED_PROPERTY_VALUES = DECOMPOSABLE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__OWNED_ENUMERATION_PROPERTY_TYPES = DECOMPOSABLE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__APPLIED_PROPERTY_VALUES = DECOMPOSABLE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__OWNED_PROPERTY_VALUE_GROUPS = DECOMPOSABLE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__APPLIED_PROPERTY_VALUE_GROUPS = DECOMPOSABLE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__STATUS = DECOMPOSABLE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__FEATURES = DECOMPOSABLE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__APPLIED_REQUIREMENTS = DECOMPOSABLE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__ARCHITECTURE_ELEMENTS = DECOMPOSABLE__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__USER_ID = DECOMPOSABLE__USER_ID;

  /**
   * The feature id for the '<em><b>Decomposition Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__DECOMPOSITION_CATEGORIES = DECOMPOSABLE__DECOMPOSITION_CATEGORIES;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__CATEGORY = DECOMPOSABLE__CATEGORY;

  /**
   * The feature id for the '<em><b>Process</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__PROCESS = DECOMPOSABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__SUB_ENTITIES = DECOMPOSABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Responsibilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__RESPONSIBILITIES = DECOMPOSABLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Outgoing Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__OUTGOING_RELATIONS = DECOMPOSABLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__INCOMING_RELATIONS = DECOMPOSABLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Process Model</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY__PROCESS_MODEL = DECOMPOSABLE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Control Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ENTITY_FEATURE_COUNT = DECOMPOSABLE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ExchangeBasedElementImpl <em>Exchange Based Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ExchangeBasedElementImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getExchangeBasedElement()
   * @generated
   */
  int EXCHANGE_BASED_ELEMENT = 19;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__OWNED_EXTENSIONS = STPA_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__ID = STPA_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__SID = STPA_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__CONSTRAINTS = STPA_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__OWNED_CONSTRAINTS = STPA_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__OWNED_MIGRATED_ELEMENTS = STPA_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__NAME = STPA_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__INCOMING_TRACES = STPA_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__OUTGOING_TRACES = STPA_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__VISIBLE_IN_DOC = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__VISIBLE_IN_LM = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__SUMMARY = STPA_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__DESCRIPTION = STPA_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__REVIEW = STPA_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__OWNED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = STPA_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__APPLIED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__STATUS = STPA_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__FEATURES = STPA_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT__APPLIED_REQUIREMENTS = STPA_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The number of structural features of the '<em>Exchange Based Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_BASED_ELEMENT_FEATURE_COUNT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getResponsibility()
   * @generated
   */
  int RESPONSIBILITY = 20;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__OWNED_EXTENSIONS = USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__ID = USER_IDENTIFIED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__SID = USER_IDENTIFIED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__CONSTRAINTS = USER_IDENTIFIED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__OWNED_CONSTRAINTS = USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__OWNED_MIGRATED_ELEMENTS = USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__NAME = USER_IDENTIFIED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__INCOMING_TRACES = USER_IDENTIFIED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__OUTGOING_TRACES = USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__VISIBLE_IN_DOC = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__VISIBLE_IN_LM = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__SUMMARY = USER_IDENTIFIED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__DESCRIPTION = USER_IDENTIFIED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__REVIEW = USER_IDENTIFIED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__OWNED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__OWNED_ENUMERATION_PROPERTY_TYPES = USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__APPLIED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__OWNED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__APPLIED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__STATUS = USER_IDENTIFIED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__FEATURES = USER_IDENTIFIED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__APPLIED_REQUIREMENTS = USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__ARCHITECTURE_ELEMENTS = USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__USER_ID = USER_IDENTIFIED_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Process Model State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__PROCESS_MODEL_STATE = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Controller</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__CONTROLLER = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>System Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__SYSTEM_CONSTRAINTS = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Control Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__CONTROL_ACTIONS = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Feedback</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__FEEDBACK = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Information</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__INFORMATION = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY__VARIABLES = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Responsibility</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_FEATURE_COUNT = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelVariableImpl <em>Process Model Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelVariableImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getProcessModelVariable()
   * @generated
   */
  int PROCESS_MODEL_VARIABLE = 21;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__OWNED_EXTENSIONS = USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__ID = USER_IDENTIFIED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__SID = USER_IDENTIFIED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__CONSTRAINTS = USER_IDENTIFIED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__OWNED_CONSTRAINTS = USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__OWNED_MIGRATED_ELEMENTS = USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__NAME = USER_IDENTIFIED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__INCOMING_TRACES = USER_IDENTIFIED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__OUTGOING_TRACES = USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__VISIBLE_IN_DOC = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__VISIBLE_IN_LM = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__SUMMARY = USER_IDENTIFIED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__DESCRIPTION = USER_IDENTIFIED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__REVIEW = USER_IDENTIFIED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__OWNED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__OWNED_ENUMERATION_PROPERTY_TYPES = USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__APPLIED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__OWNED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__APPLIED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__STATUS = USER_IDENTIFIED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__FEATURES = USER_IDENTIFIED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__APPLIED_REQUIREMENTS = USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__ARCHITECTURE_ELEMENTS = USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__USER_ID = USER_IDENTIFIED_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Controller</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__CONTROLLER = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Responsibilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__RESPONSIBILITIES = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__VALUES = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Feedback</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__FEEDBACK = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Information</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__INFORMATION = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Control Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Process Model Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VARIABLE_FEATURE_COUNT = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelValueImpl <em>Process Model Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelValueImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getProcessModelValue()
   * @generated
   */
  int PROCESS_MODEL_VALUE = 22;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__OWNED_EXTENSIONS = ARCHITECTURE_MAPPABLE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__ID = ARCHITECTURE_MAPPABLE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__SID = ARCHITECTURE_MAPPABLE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__CONSTRAINTS = ARCHITECTURE_MAPPABLE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__OWNED_CONSTRAINTS = ARCHITECTURE_MAPPABLE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__OWNED_MIGRATED_ELEMENTS = ARCHITECTURE_MAPPABLE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__NAME = ARCHITECTURE_MAPPABLE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__INCOMING_TRACES = ARCHITECTURE_MAPPABLE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__OUTGOING_TRACES = ARCHITECTURE_MAPPABLE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__VISIBLE_IN_DOC = ARCHITECTURE_MAPPABLE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__VISIBLE_IN_LM = ARCHITECTURE_MAPPABLE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__SUMMARY = ARCHITECTURE_MAPPABLE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__DESCRIPTION = ARCHITECTURE_MAPPABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__REVIEW = ARCHITECTURE_MAPPABLE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__OWNED_PROPERTY_VALUES = ARCHITECTURE_MAPPABLE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__OWNED_ENUMERATION_PROPERTY_TYPES = ARCHITECTURE_MAPPABLE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__APPLIED_PROPERTY_VALUES = ARCHITECTURE_MAPPABLE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__OWNED_PROPERTY_VALUE_GROUPS = ARCHITECTURE_MAPPABLE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__APPLIED_PROPERTY_VALUE_GROUPS = ARCHITECTURE_MAPPABLE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__STATUS = ARCHITECTURE_MAPPABLE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__FEATURES = ARCHITECTURE_MAPPABLE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__APPLIED_REQUIREMENTS = ARCHITECTURE_MAPPABLE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__ARCHITECTURE_ELEMENTS = ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE__VARIABLE = ARCHITECTURE_MAPPABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Process Model Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_VALUE_FEATURE_COUNT = ARCHITECTURE_MAPPABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.RelationImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 23;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__OWNED_EXTENSIONS = ARCHITECTURE_MAPPABLE__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__ID = ARCHITECTURE_MAPPABLE__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__SID = ARCHITECTURE_MAPPABLE__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__CONSTRAINTS = ARCHITECTURE_MAPPABLE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__OWNED_CONSTRAINTS = ARCHITECTURE_MAPPABLE__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__OWNED_MIGRATED_ELEMENTS = ARCHITECTURE_MAPPABLE__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__NAME = ARCHITECTURE_MAPPABLE__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__INCOMING_TRACES = ARCHITECTURE_MAPPABLE__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__OUTGOING_TRACES = ARCHITECTURE_MAPPABLE__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__VISIBLE_IN_DOC = ARCHITECTURE_MAPPABLE__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__VISIBLE_IN_LM = ARCHITECTURE_MAPPABLE__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__SUMMARY = ARCHITECTURE_MAPPABLE__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__DESCRIPTION = ARCHITECTURE_MAPPABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__REVIEW = ARCHITECTURE_MAPPABLE__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__OWNED_PROPERTY_VALUES = ARCHITECTURE_MAPPABLE__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__OWNED_ENUMERATION_PROPERTY_TYPES = ARCHITECTURE_MAPPABLE__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__APPLIED_PROPERTY_VALUES = ARCHITECTURE_MAPPABLE__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__OWNED_PROPERTY_VALUE_GROUPS = ARCHITECTURE_MAPPABLE__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__APPLIED_PROPERTY_VALUE_GROUPS = ARCHITECTURE_MAPPABLE__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__STATUS = ARCHITECTURE_MAPPABLE__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__FEATURES = ARCHITECTURE_MAPPABLE__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__APPLIED_REQUIREMENTS = ARCHITECTURE_MAPPABLE__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__ARCHITECTURE_ELEMENTS = ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>Source</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__SOURCE = ARCHITECTURE_MAPPABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TARGET = ARCHITECTURE_MAPPABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = ARCHITECTURE_MAPPABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawContextImpl <em>Control Flaw Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawContextImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawContext()
   * @generated
   */
  int CONTROL_FLAW_CONTEXT = 24;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__OWNED_EXTENSIONS = USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__ID = USER_IDENTIFIED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__SID = USER_IDENTIFIED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__CONSTRAINTS = USER_IDENTIFIED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__OWNED_CONSTRAINTS = USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__OWNED_MIGRATED_ELEMENTS = USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__NAME = USER_IDENTIFIED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__INCOMING_TRACES = USER_IDENTIFIED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__OUTGOING_TRACES = USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__VISIBLE_IN_DOC = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__VISIBLE_IN_LM = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__SUMMARY = USER_IDENTIFIED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__DESCRIPTION = USER_IDENTIFIED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__REVIEW = USER_IDENTIFIED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__OWNED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__OWNED_ENUMERATION_PROPERTY_TYPES = USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__APPLIED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__OWNED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__APPLIED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__STATUS = USER_IDENTIFIED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__FEATURES = USER_IDENTIFIED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__APPLIED_REQUIREMENTS = USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__ARCHITECTURE_ELEMENTS = USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__USER_ID = USER_IDENTIFIED_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Control Flaw Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Control Flaw Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_CONTEXT_FEATURE_COUNT = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ExchangeElementImpl <em>Exchange Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ExchangeElementImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getExchangeElement()
   * @generated
   */
  int EXCHANGE_ELEMENT = 25;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__OWNED_EXTENSIONS = USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__ID = USER_IDENTIFIED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__SID = USER_IDENTIFIED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__CONSTRAINTS = USER_IDENTIFIED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__OWNED_CONSTRAINTS = USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__OWNED_MIGRATED_ELEMENTS = USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__NAME = USER_IDENTIFIED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__INCOMING_TRACES = USER_IDENTIFIED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__OUTGOING_TRACES = USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__VISIBLE_IN_DOC = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__VISIBLE_IN_LM = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__SUMMARY = USER_IDENTIFIED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__DESCRIPTION = USER_IDENTIFIED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__REVIEW = USER_IDENTIFIED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__STATUS = USER_IDENTIFIED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__FEATURES = USER_IDENTIFIED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__APPLIED_REQUIREMENTS = USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__ARCHITECTURE_ELEMENTS = USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__USER_ID = USER_IDENTIFIED_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Control Flaw Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__CONTROL_FLAW_SET = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exercised Responsibilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Loss Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__LOSS_SCENARIOS = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Supporting Process Model</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unsafe Control Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Exchange Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCHANGE_ELEMENT_FEATURE_COUNT = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlRelationImpl <em>Control Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlRelationImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlRelation()
   * @generated
   */
  int CONTROL_RELATION = 26;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__OWNED_EXTENSIONS = RELATION__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__ID = RELATION__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__SID = RELATION__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__CONSTRAINTS = RELATION__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__OWNED_CONSTRAINTS = RELATION__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__OWNED_MIGRATED_ELEMENTS = RELATION__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__NAME = RELATION__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__INCOMING_TRACES = RELATION__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__OUTGOING_TRACES = RELATION__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__VISIBLE_IN_DOC = RELATION__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__VISIBLE_IN_LM = RELATION__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__SUMMARY = RELATION__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__DESCRIPTION = RELATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__REVIEW = RELATION__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__OWNED_PROPERTY_VALUES = RELATION__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__OWNED_ENUMERATION_PROPERTY_TYPES = RELATION__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__APPLIED_PROPERTY_VALUES = RELATION__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__OWNED_PROPERTY_VALUE_GROUPS = RELATION__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__APPLIED_PROPERTY_VALUE_GROUPS = RELATION__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__STATUS = RELATION__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__FEATURES = RELATION__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__APPLIED_REQUIREMENTS = RELATION__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__ARCHITECTURE_ELEMENTS = RELATION__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>Source</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__SOURCE = RELATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__TARGET = RELATION__TARGET;

  /**
   * The feature id for the '<em><b>Control Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION__CONTROL_ACTIONS = RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Control Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlActionImpl <em>Control Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlActionImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlAction()
   * @generated
   */
  int CONTROL_ACTION = 27;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__OWNED_EXTENSIONS = EXCHANGE_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__ID = EXCHANGE_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__SID = EXCHANGE_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__CONSTRAINTS = EXCHANGE_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__OWNED_CONSTRAINTS = EXCHANGE_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__OWNED_MIGRATED_ELEMENTS = EXCHANGE_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__NAME = EXCHANGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__INCOMING_TRACES = EXCHANGE_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__OUTGOING_TRACES = EXCHANGE_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__VISIBLE_IN_DOC = EXCHANGE_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__VISIBLE_IN_LM = EXCHANGE_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__SUMMARY = EXCHANGE_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__DESCRIPTION = EXCHANGE_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__REVIEW = EXCHANGE_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__OWNED_PROPERTY_VALUES = EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__OWNED_ENUMERATION_PROPERTY_TYPES = EXCHANGE_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__APPLIED_PROPERTY_VALUES = EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__OWNED_PROPERTY_VALUE_GROUPS = EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__APPLIED_PROPERTY_VALUE_GROUPS = EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__STATUS = EXCHANGE_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__FEATURES = EXCHANGE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__APPLIED_REQUIREMENTS = EXCHANGE_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__ARCHITECTURE_ELEMENTS = EXCHANGE_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__USER_ID = EXCHANGE_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Control Flaw Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__CONTROL_FLAW_SET = EXCHANGE_ELEMENT__CONTROL_FLAW_SET;

  /**
   * The feature id for the '<em><b>Exercised Responsibilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__EXERCISED_RESPONSIBILITIES = EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES;

  /**
   * The feature id for the '<em><b>Loss Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__LOSS_SCENARIOS = EXCHANGE_ELEMENT__LOSS_SCENARIOS;

  /**
   * The feature id for the '<em><b>Supporting Process Model</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__SUPPORTING_PROCESS_MODEL = EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL;

  /**
   * The feature id for the '<em><b>Unsafe Control Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__UNSAFE_CONTROL_ACTIONS = EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS;

  /**
   * The feature id for the '<em><b>Relation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION__RELATION = EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Control Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ACTION_FEATURE_COUNT = EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilitySupportExchangeElementImpl <em>Responsibility Support Exchange Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilitySupportExchangeElementImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getResponsibilitySupportExchangeElement()
   * @generated
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT = 28;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_EXTENSIONS = EXCHANGE_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__ID = EXCHANGE_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__SID = EXCHANGE_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__CONSTRAINTS = EXCHANGE_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_CONSTRAINTS = EXCHANGE_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_MIGRATED_ELEMENTS = EXCHANGE_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__NAME = EXCHANGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__INCOMING_TRACES = EXCHANGE_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OUTGOING_TRACES = EXCHANGE_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__VISIBLE_IN_DOC = EXCHANGE_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__VISIBLE_IN_LM = EXCHANGE_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__SUMMARY = EXCHANGE_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__DESCRIPTION = EXCHANGE_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__REVIEW = EXCHANGE_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUES = EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = EXCHANGE_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUES = EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS = EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS = EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__STATUS = EXCHANGE_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__FEATURES = EXCHANGE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__APPLIED_REQUIREMENTS = EXCHANGE_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__ARCHITECTURE_ELEMENTS = EXCHANGE_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__USER_ID = EXCHANGE_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Control Flaw Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__CONTROL_FLAW_SET = EXCHANGE_ELEMENT__CONTROL_FLAW_SET;

  /**
   * The feature id for the '<em><b>Exercised Responsibilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES = EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES;

  /**
   * The feature id for the '<em><b>Loss Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__LOSS_SCENARIOS = EXCHANGE_ELEMENT__LOSS_SCENARIOS;

  /**
   * The feature id for the '<em><b>Supporting Process Model</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL = EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL;

  /**
   * The feature id for the '<em><b>Unsafe Control Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS = EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS;

  /**
   * The number of structural features of the '<em>Responsibility Support Exchange Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT_FEATURE_COUNT = EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.FeedbackRelationImpl <em>Feedback Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.FeedbackRelationImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getFeedbackRelation()
   * @generated
   */
  int FEEDBACK_RELATION = 29;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__OWNED_EXTENSIONS = RELATION__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__ID = RELATION__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__SID = RELATION__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__CONSTRAINTS = RELATION__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__OWNED_CONSTRAINTS = RELATION__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__OWNED_MIGRATED_ELEMENTS = RELATION__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__NAME = RELATION__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__INCOMING_TRACES = RELATION__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__OUTGOING_TRACES = RELATION__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__VISIBLE_IN_DOC = RELATION__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__VISIBLE_IN_LM = RELATION__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__SUMMARY = RELATION__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__DESCRIPTION = RELATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__REVIEW = RELATION__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__OWNED_PROPERTY_VALUES = RELATION__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__OWNED_ENUMERATION_PROPERTY_TYPES = RELATION__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__APPLIED_PROPERTY_VALUES = RELATION__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__OWNED_PROPERTY_VALUE_GROUPS = RELATION__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__APPLIED_PROPERTY_VALUE_GROUPS = RELATION__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__STATUS = RELATION__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__FEATURES = RELATION__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__APPLIED_REQUIREMENTS = RELATION__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__ARCHITECTURE_ELEMENTS = RELATION__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>Source</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__SOURCE = RELATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__TARGET = RELATION__TARGET;

  /**
   * The feature id for the '<em><b>Feedback</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION__FEEDBACK = RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feedback Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.FeedbackElementImpl <em>Feedback Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.FeedbackElementImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getFeedbackElement()
   * @generated
   */
  int FEEDBACK_ELEMENT = 30;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__OWNED_EXTENSIONS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__ID = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__SID = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__CONSTRAINTS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__OWNED_CONSTRAINTS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__OWNED_MIGRATED_ELEMENTS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__NAME = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__INCOMING_TRACES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__OUTGOING_TRACES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__VISIBLE_IN_DOC = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__VISIBLE_IN_LM = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__SUMMARY = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__DESCRIPTION = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__REVIEW = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__OWNED_PROPERTY_VALUES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__APPLIED_PROPERTY_VALUES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__STATUS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__FEATURES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__APPLIED_REQUIREMENTS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__ARCHITECTURE_ELEMENTS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__USER_ID = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Control Flaw Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__CONTROL_FLAW_SET = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__CONTROL_FLAW_SET;

  /**
   * The feature id for the '<em><b>Exercised Responsibilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__EXERCISED_RESPONSIBILITIES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES;

  /**
   * The feature id for the '<em><b>Loss Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__LOSS_SCENARIOS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__LOSS_SCENARIOS;

  /**
   * The feature id for the '<em><b>Supporting Process Model</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__SUPPORTING_PROCESS_MODEL = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL;

  /**
   * The feature id for the '<em><b>Unsafe Control Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__UNSAFE_CONTROL_ACTIONS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS;

  /**
   * The feature id for the '<em><b>Relation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__RELATION = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Responsibilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__RESPONSIBILITIES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Process Model</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT__PROCESS_MODEL = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Feedback Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDBACK_ELEMENT_FEATURE_COUNT = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.InformationExchangeRelationImpl <em>Information Exchange Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.InformationExchangeRelationImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getInformationExchangeRelation()
   * @generated
   */
  int INFORMATION_EXCHANGE_RELATION = 31;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__OWNED_EXTENSIONS = RELATION__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__ID = RELATION__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__SID = RELATION__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__CONSTRAINTS = RELATION__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__OWNED_CONSTRAINTS = RELATION__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__OWNED_MIGRATED_ELEMENTS = RELATION__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__NAME = RELATION__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__INCOMING_TRACES = RELATION__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__OUTGOING_TRACES = RELATION__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__VISIBLE_IN_DOC = RELATION__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__VISIBLE_IN_LM = RELATION__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__SUMMARY = RELATION__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__DESCRIPTION = RELATION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__REVIEW = RELATION__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__OWNED_PROPERTY_VALUES = RELATION__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__OWNED_ENUMERATION_PROPERTY_TYPES = RELATION__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__APPLIED_PROPERTY_VALUES = RELATION__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__OWNED_PROPERTY_VALUE_GROUPS = RELATION__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__APPLIED_PROPERTY_VALUE_GROUPS = RELATION__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__STATUS = RELATION__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__FEATURES = RELATION__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__APPLIED_REQUIREMENTS = RELATION__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__ARCHITECTURE_ELEMENTS = RELATION__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>Source</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__SOURCE = RELATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__TARGET = RELATION__TARGET;

  /**
   * The feature id for the '<em><b>Information</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION__INFORMATION = RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Information Exchange Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFORMATION_EXCHANGE_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.PieceOfInformationImpl <em>Piece Of Information</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.PieceOfInformationImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getPieceOfInformation()
   * @generated
   */
  int PIECE_OF_INFORMATION = 32;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__OWNED_EXTENSIONS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__ID = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__SID = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__CONSTRAINTS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__OWNED_CONSTRAINTS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__OWNED_MIGRATED_ELEMENTS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__NAME = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__INCOMING_TRACES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__OUTGOING_TRACES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__VISIBLE_IN_DOC = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__VISIBLE_IN_LM = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__SUMMARY = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__DESCRIPTION = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__REVIEW = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__OWNED_PROPERTY_VALUES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__OWNED_ENUMERATION_PROPERTY_TYPES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__APPLIED_PROPERTY_VALUES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__OWNED_PROPERTY_VALUE_GROUPS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__APPLIED_PROPERTY_VALUE_GROUPS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__STATUS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__FEATURES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__APPLIED_REQUIREMENTS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__ARCHITECTURE_ELEMENTS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__USER_ID = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Control Flaw Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__CONTROL_FLAW_SET = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__CONTROL_FLAW_SET;

  /**
   * The feature id for the '<em><b>Exercised Responsibilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__EXERCISED_RESPONSIBILITIES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES;

  /**
   * The feature id for the '<em><b>Loss Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__LOSS_SCENARIOS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__LOSS_SCENARIOS;

  /**
   * The feature id for the '<em><b>Supporting Process Model</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__SUPPORTING_PROCESS_MODEL = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL;

  /**
   * The feature id for the '<em><b>Unsafe Control Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__UNSAFE_CONTROL_ACTIONS = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS;

  /**
   * The feature id for the '<em><b>Relation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__RELATION = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Responsibilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__RESPONSIBILITIES = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Process Model</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION__PROCESS_MODEL = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Piece Of Information</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIECE_OF_INFORMATION_FEATURE_COUNT = RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawAnalysisElementImpl <em>Control Flaw Analysis Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawAnalysisElementImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawAnalysisElement()
   * @generated
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT = 34;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.MitigableImpl <em>Mitigable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.MitigableImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getMitigable()
   * @generated
   */
  int MITIGABLE = 33;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__OWNED_EXTENSIONS = STPA_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__ID = STPA_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__SID = STPA_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__CONSTRAINTS = STPA_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__OWNED_CONSTRAINTS = STPA_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__OWNED_MIGRATED_ELEMENTS = STPA_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__NAME = STPA_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__INCOMING_TRACES = STPA_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__OUTGOING_TRACES = STPA_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__VISIBLE_IN_DOC = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__VISIBLE_IN_LM = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__SUMMARY = STPA_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__DESCRIPTION = STPA_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__REVIEW = STPA_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__OWNED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__OWNED_ENUMERATION_PROPERTY_TYPES = STPA_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__APPLIED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__OWNED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__APPLIED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__STATUS = STPA_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__FEATURES = STPA_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__APPLIED_REQUIREMENTS = STPA_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Countermeasures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE__COUNTERMEASURES = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mitigable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MITIGABLE_FEATURE_COUNT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_EXTENSIONS = USER_IDENTIFIED_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__ID = USER_IDENTIFIED_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__SID = USER_IDENTIFIED_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__CONSTRAINTS = USER_IDENTIFIED_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS = USER_IDENTIFIED_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS = USER_IDENTIFIED_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__NAME = USER_IDENTIFIED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__INCOMING_TRACES = USER_IDENTIFIED_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__OUTGOING_TRACES = USER_IDENTIFIED_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__VISIBLE_IN_DOC = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__VISIBLE_IN_LM = USER_IDENTIFIED_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__SUMMARY = USER_IDENTIFIED_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__DESCRIPTION = USER_IDENTIFIED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__REVIEW = USER_IDENTIFIED_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = USER_IDENTIFIED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS = USER_IDENTIFIED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__STATUS = USER_IDENTIFIED_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__FEATURES = USER_IDENTIFIED_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS = USER_IDENTIFIED_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__ARCHITECTURE_ELEMENTS = USER_IDENTIFIED_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__USER_ID = USER_IDENTIFIED_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Countermeasures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT__COUNTERMEASURES = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Control Flaw Analysis Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT = USER_IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl <em>Unsafe Control Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getUnsafeControlAction()
   * @generated
   */
  int UNSAFE_CONTROL_ACTION = 35;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__OWNED_EXTENSIONS = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__ID = CONTROL_FLAW_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__SID = CONTROL_FLAW_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__CONSTRAINTS = CONTROL_FLAW_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__OWNED_CONSTRAINTS = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__OWNED_MIGRATED_ELEMENTS = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__NAME = CONTROL_FLAW_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__INCOMING_TRACES = CONTROL_FLAW_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__OUTGOING_TRACES = CONTROL_FLAW_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__VISIBLE_IN_DOC = CONTROL_FLAW_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__VISIBLE_IN_LM = CONTROL_FLAW_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__SUMMARY = CONTROL_FLAW_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__DESCRIPTION = CONTROL_FLAW_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__REVIEW = CONTROL_FLAW_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__OWNED_PROPERTY_VALUES = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__OWNED_ENUMERATION_PROPERTY_TYPES = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__APPLIED_PROPERTY_VALUES = CONTROL_FLAW_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__OWNED_PROPERTY_VALUE_GROUPS = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__APPLIED_PROPERTY_VALUE_GROUPS = CONTROL_FLAW_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__STATUS = CONTROL_FLAW_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__FEATURES = CONTROL_FLAW_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__APPLIED_REQUIREMENTS = CONTROL_FLAW_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__ARCHITECTURE_ELEMENTS = CONTROL_FLAW_ANALYSIS_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__USER_ID = CONTROL_FLAW_ANALYSIS_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Countermeasures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__COUNTERMEASURES = CONTROL_FLAW_ANALYSIS_ELEMENT__COUNTERMEASURES;

  /**
   * The feature id for the '<em><b>Control Flaw Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__CONTROL_FLAW_SET = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__KIND = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__CONTEXT = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Control Action</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__CONTROL_ACTION = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Loss Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Violated Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Hazards</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION__HAZARDS = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Unsafe Control Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_FEATURE_COUNT = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioImpl <em>Loss Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getLossScenario()
   * @generated
   */
  int LOSS_SCENARIO = 36;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__OWNED_EXTENSIONS = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__ID = CONTROL_FLAW_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__SID = CONTROL_FLAW_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__CONSTRAINTS = CONTROL_FLAW_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__OWNED_CONSTRAINTS = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__OWNED_MIGRATED_ELEMENTS = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__NAME = CONTROL_FLAW_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__INCOMING_TRACES = CONTROL_FLAW_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__OUTGOING_TRACES = CONTROL_FLAW_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__VISIBLE_IN_DOC = CONTROL_FLAW_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__VISIBLE_IN_LM = CONTROL_FLAW_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__SUMMARY = CONTROL_FLAW_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__DESCRIPTION = CONTROL_FLAW_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__REVIEW = CONTROL_FLAW_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__OWNED_PROPERTY_VALUES = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__OWNED_ENUMERATION_PROPERTY_TYPES = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__APPLIED_PROPERTY_VALUES = CONTROL_FLAW_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__OWNED_PROPERTY_VALUE_GROUPS = CONTROL_FLAW_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__APPLIED_PROPERTY_VALUE_GROUPS = CONTROL_FLAW_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__STATUS = CONTROL_FLAW_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__FEATURES = CONTROL_FLAW_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__APPLIED_REQUIREMENTS = CONTROL_FLAW_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__ARCHITECTURE_ELEMENTS = CONTROL_FLAW_ANALYSIS_ELEMENT__ARCHITECTURE_ELEMENTS;

  /**
   * The feature id for the '<em><b>User ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__USER_ID = CONTROL_FLAW_ANALYSIS_ELEMENT__USER_ID;

  /**
   * The feature id for the '<em><b>Countermeasures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__COUNTERMEASURES = CONTROL_FLAW_ANALYSIS_ELEMENT__COUNTERMEASURES;

  /**
   * The feature id for the '<em><b>Control Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__CONTROL_ACTION = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unsafe Control Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__UNSAFE_CONTROL_ACTION = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Causal Factors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__CAUSAL_FACTORS = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Violated Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__VIOLATED_CONSTRAINTS = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Hazards</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO__HAZARDS = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Loss Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOSS_SCENARIO_FEATURE_COUNT = CONTROL_FLAW_ANALYSIS_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionCategoryImpl <em>Unsafe Control Action Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionCategoryImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getUnsafeControlActionCategory()
   * @generated
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY = 37;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__OWNED_EXTENSIONS = STPA_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__ID = STPA_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__SID = STPA_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__CONSTRAINTS = STPA_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__OWNED_CONSTRAINTS = STPA_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__OWNED_MIGRATED_ELEMENTS = STPA_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__NAME = STPA_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__INCOMING_TRACES = STPA_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__OUTGOING_TRACES = STPA_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__VISIBLE_IN_DOC = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__VISIBLE_IN_LM = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__SUMMARY = STPA_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__DESCRIPTION = STPA_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__REVIEW = STPA_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__OWNED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__OWNED_ENUMERATION_PROPERTY_TYPES = STPA_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__APPLIED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__OWNED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__APPLIED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__STATUS = STPA_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__FEATURES = STPA_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__APPLIED_REQUIREMENTS = STPA_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY__KIND = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unsafe Control Action Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSAFE_CONTROL_ACTION_CATEGORY_FEATURE_COUNT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl <em>Control Flaw</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlaw()
   * @generated
   */
  int CONTROL_FLAW = 39;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawSetImpl <em>Control Flaw Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawSetImpl
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawSet()
   * @generated
   */
  int CONTROL_FLAW_SET = 38;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__OWNED_EXTENSIONS = STPA_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__ID = STPA_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__SID = STPA_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__CONSTRAINTS = STPA_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__OWNED_CONSTRAINTS = STPA_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__OWNED_MIGRATED_ELEMENTS = STPA_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__NAME = STPA_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__INCOMING_TRACES = STPA_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__OUTGOING_TRACES = STPA_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__VISIBLE_IN_DOC = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__VISIBLE_IN_LM = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__SUMMARY = STPA_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__DESCRIPTION = STPA_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__REVIEW = STPA_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__OWNED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__OWNED_ENUMERATION_PROPERTY_TYPES = STPA_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__APPLIED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__OWNED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__APPLIED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__STATUS = STPA_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__FEATURES = STPA_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__APPLIED_REQUIREMENTS = STPA_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Control Flaws</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__CONTROL_FLAWS = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Context</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET__CONTEXT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Control Flaw Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_SET_FEATURE_COUNT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__OWNED_EXTENSIONS = STPA_ANALYSIS_ELEMENT__OWNED_EXTENSIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__ID = STPA_ANALYSIS_ELEMENT__ID;

  /**
   * The feature id for the '<em><b>Sid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__SID = STPA_ANALYSIS_ELEMENT__SID;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__CONSTRAINTS = STPA_ANALYSIS_ELEMENT__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__OWNED_CONSTRAINTS = STPA_ANALYSIS_ELEMENT__OWNED_CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__OWNED_MIGRATED_ELEMENTS = STPA_ANALYSIS_ELEMENT__OWNED_MIGRATED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__NAME = STPA_ANALYSIS_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__INCOMING_TRACES = STPA_ANALYSIS_ELEMENT__INCOMING_TRACES;

  /**
   * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__OUTGOING_TRACES = STPA_ANALYSIS_ELEMENT__OUTGOING_TRACES;

  /**
   * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__VISIBLE_IN_DOC = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_DOC;

  /**
   * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__VISIBLE_IN_LM = STPA_ANALYSIS_ELEMENT__VISIBLE_IN_LM;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__SUMMARY = STPA_ANALYSIS_ELEMENT__SUMMARY;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__DESCRIPTION = STPA_ANALYSIS_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Review</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__REVIEW = STPA_ANALYSIS_ELEMENT__REVIEW;

  /**
   * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__OWNED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__OWNED_ENUMERATION_PROPERTY_TYPES = STPA_ANALYSIS_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

  /**
   * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__APPLIED_PROPERTY_VALUES = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUES;

  /**
   * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__OWNED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__APPLIED_PROPERTY_VALUE_GROUPS = STPA_ANALYSIS_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

  /**
   * The feature id for the '<em><b>Status</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__STATUS = STPA_ANALYSIS_ELEMENT__STATUS;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__FEATURES = STPA_ANALYSIS_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__APPLIED_REQUIREMENTS = STPA_ANALYSIS_ELEMENT__APPLIED_REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Architecture Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__ARCHITECTURE_ELEMENTS = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Countermeasures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__COUNTERMEASURES = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__KIND = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Verdict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__VERDICT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owning Set</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__OWNING_SET = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Justification</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__JUSTIFICATION = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Loss Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW__LOSS_SCENARIOS = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Control Flaw</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FLAW_FEATURE_COUNT = STPA_ANALYSIS_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind <em>Unsafe Control Action Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getUnsafeControlActionKind()
   * @generated
   */
  int UNSAFE_CONTROL_ACTION_KIND = 40;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawKind <em>Control Flaw Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawKind
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawKind()
   * @generated
   */
  int CONTROL_FLAW_KIND = 41;

  /**
   * The meta object id for the '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict <em>Control Flaw Verdict</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict
   * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawVerdict()
   * @generated
   */
  int CONTROL_FLAW_VERDICT = 42;

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement <em>Analysis Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Analysis Element</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement
   * @generated
   */
  EClass getStpaAnalysisElement();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement <em>User Identified Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Identified Element</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement
   * @generated
   */
  EClass getUserIdentifiedElement();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement#getUserID <em>User ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User ID</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UserIdentifiedElement#getUserID()
   * @see #getUserIdentifiedElement()
   * @generated
   */
  EAttribute getUserIdentifiedElement_UserID();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.Decomposable <em>Decomposable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decomposable</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Decomposable
   * @generated
   */
  EClass getDecomposable();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.Decomposable#getDecompositionCategories <em>Decomposition Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decomposition Categories</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Decomposable#getDecompositionCategories()
   * @see #getDecomposable()
   * @generated
   */
  EReference getDecomposable_DecompositionCategories();

  /**
   * Returns the meta object for the reference '{@link com.thalesgroup.mde.capella.stpa.model.Decomposable#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Decomposable#getCategory()
   * @see #getDecomposable()
   * @generated
   */
  EReference getDecomposable_Category();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.DecompositionCategory <em>Decomposition Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decomposition Category</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.DecompositionCategory
   * @generated
   */
  EClass getDecompositionCategory();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.DecompositionCategory#getCoverage <em>Coverage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Coverage</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.DecompositionCategory#getCoverage()
   * @see #getDecompositionCategory()
   * @generated
   */
  EReference getDecompositionCategory_Coverage();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable <em>Architecture Mappable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture Mappable</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable
   * @generated
   */
  EClass getArchitectureMappable();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable#getArchitectureElements <em>Architecture Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Architecture Elements</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable#getArchitectureElements()
   * @see #getArchitectureMappable()
   * @generated
   */
  EReference getArchitectureMappable_ArchitectureElements();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis <em>Analysis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Analysis</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysis
   * @generated
   */
  EClass getStpaAnalysis();

  /**
   * Returns the meta object for the containment reference '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getTechnicalPackage <em>Technical Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Technical Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getTechnicalPackage()
   * @see #getStpaAnalysis()
   * @generated
   */
  EReference getStpaAnalysis_TechnicalPackage();

  /**
   * Returns the meta object for the reference '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>System</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getSystem()
   * @see #getStpaAnalysis()
   * @generated
   */
  EReference getStpaAnalysis_System();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getSubAnalyses <em>Sub Analyses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Analyses</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getSubAnalyses()
   * @see #getStpaAnalysis()
   * @generated
   */
  EReference getStpaAnalysis_SubAnalyses();

  /**
   * Returns the meta object for the containment reference '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getLossPackage <em>Loss Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loss Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getLossPackage()
   * @see #getStpaAnalysis()
   * @generated
   */
  EReference getStpaAnalysis_LossPackage();

  /**
   * Returns the meta object for the containment reference '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getHazardConstraintPackage <em>Hazard Constraint Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hazard Constraint Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getHazardConstraintPackage()
   * @see #getStpaAnalysis()
   * @generated
   */
  EReference getStpaAnalysis_HazardConstraintPackage();

  /**
   * Returns the meta object for the containment reference '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getControlStructurePackage <em>Control Structure Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Control Structure Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getControlStructurePackage()
   * @see #getStpaAnalysis()
   * @generated
   */
  EReference getStpaAnalysis_ControlStructurePackage();

  /**
   * Returns the meta object for the containment reference '{@link com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getLossScenarioPackage <em>Loss Scenario Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loss Scenario Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.StpaAnalysis#getLossScenarioPackage()
   * @see #getStpaAnalysis()
   * @generated
   */
  EReference getStpaAnalysis_LossScenarioPackage();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.AnalysisPackage <em>Analysis Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Analysis Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.AnalysisPackage
   * @generated
   */
  EClass getAnalysisPackage();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.TechnicalPackage <em>Technical Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Technical Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.TechnicalPackage
   * @generated
   */
  EClass getTechnicalPackage();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.TechnicalPackage#getUnsafeControlActionCategories <em>Unsafe Control Action Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unsafe Control Action Categories</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.TechnicalPackage#getUnsafeControlActionCategories()
   * @see #getTechnicalPackage()
   * @generated
   */
  EReference getTechnicalPackage_UnsafeControlActionCategories();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.LossPackage <em>Loss Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loss Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossPackage
   * @generated
   */
  EClass getLossPackage();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.LossPackage#getStakeholders <em>Stakeholders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stakeholders</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossPackage#getStakeholders()
   * @see #getLossPackage()
   * @generated
   */
  EReference getLossPackage_Stakeholders();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.LossPackage#getLosses <em>Losses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Losses</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossPackage#getLosses()
   * @see #getLossPackage()
   * @generated
   */
  EReference getLossPackage_Losses();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage <em>Hazard Constraint Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard Constraint Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage
   * @generated
   */
  EClass getHazardConstraintPackage();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage#getRootHazards <em>Root Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Root Hazards</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage#getRootHazards()
   * @see #getHazardConstraintPackage()
   * @generated
   */
  EReference getHazardConstraintPackage_RootHazards();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage#getRootSystemConstraints <em>Root System Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Root System Constraints</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.HazardConstraintPackage#getRootSystemConstraints()
   * @see #getHazardConstraintPackage()
   * @generated
   */
  EReference getHazardConstraintPackage_RootSystemConstraints();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage <em>Control Structure Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Structure Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage
   * @generated
   */
  EClass getControlStructurePackage();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage#getRootEntities <em>Root Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Root Entities</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlStructurePackage#getRootEntities()
   * @see #getControlStructurePackage()
   * @generated
   */
  EReference getControlStructurePackage_RootEntities();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage <em>Loss Scenario Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loss Scenario Package</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage
   * @generated
   */
  EClass getLossScenarioPackage();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Loss Scenarios</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenarioPackage#getLossScenarios()
   * @see #getLossScenarioPackage()
   * @generated
   */
  EReference getLossScenarioPackage_LossScenarios();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stakeholder</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Stakeholder
   * @generated
   */
  EClass getStakeholder();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.Stakeholder#getStakes <em>Stakes</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stakes</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Stakeholder#getStakes()
   * @see #getStakeholder()
   * @generated
   */
  EReference getStakeholder_Stakes();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.Stake <em>Stake</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stake</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Stake
   * @generated
   */
  EClass getStake();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.Stake#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Stakeholder</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Stake#getStakeholder()
   * @see #getStake()
   * @generated
   */
  EReference getStake_Stakeholder();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Stake#getLosses <em>Losses</em>}'.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Losses</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Stake#getLosses()
   * @see #getStake()
   * @generated
   */
  EReference getStake_Losses();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.Loss <em>Loss</em>}'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loss</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Loss
   * @generated
   */
  EClass getLoss();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Loss#getHazards <em>Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Hazards</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Loss#getHazards()
   * @see #getLoss()
   * @generated
   */
  EReference getLoss_Hazards();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Loss#getStakes <em>Stakes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stakes</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Loss#getStakes()
   * @see #getLoss()
   * @generated
   */
  EReference getLoss_Stakes();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawTarget <em>Control Flaw Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Flaw Target</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawTarget
   * @generated
   */
  EClass getControlFlawTarget();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.Hazard <em>Hazard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard
   * @generated
   */
  EClass getHazard();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getSubHazards <em>Sub Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Hazards</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard#getSubHazards()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_SubHazards();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getLosses <em>Losses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Losses</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard#getLosses()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_Losses();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getSystemConstraints <em>System Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>System Constraints</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard#getSystemConstraints()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_SystemConstraints();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getUnsafeControlActions <em>Unsafe Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Unsafe Control Actions</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard#getUnsafeControlActions()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_UnsafeControlActions();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Loss Scenarios</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard#getLossScenarios()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_LossScenarios();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.Hazard#getUnsafeCondition <em>Unsafe Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unsafe Condition</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Hazard#getUnsafeCondition()
   * @see #getHazard()
   * @generated
   */
  EAttribute getHazard_UnsafeCondition();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint <em>System Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Constraint</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint
   * @generated
   */
  EClass getSystemConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getSubSystemConstraints <em>Sub System Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub System Constraints</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getSubSystemConstraints()
   * @see #getSystemConstraint()
   * @generated
   */
  EReference getSystemConstraint_SubSystemConstraints();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getHazards <em>Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Hazards</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getHazards()
   * @see #getSystemConstraint()
   * @generated
   */
  EReference getSystemConstraint_Hazards();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Responsibilities</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getResponsibilities()
   * @see #getSystemConstraint()
   * @generated
   */
  EReference getSystemConstraint_Responsibilities();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getUnsafeControlActions <em>Unsafe Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Unsafe Control Actions</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getUnsafeControlActions()
   * @see #getSystemConstraint()
   * @generated
   */
  EReference getSystemConstraint_UnsafeControlActions();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Loss Scenarios</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getLossScenarios()
   * @see #getSystemConstraint()
   * @generated
   */
  EReference getSystemConstraint_LossScenarios();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getAssumptions <em>Assumptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assumptions</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getAssumptions()
   * @see #getSystemConstraint()
   * @generated
   */
  EReference getSystemConstraint_Assumptions();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getConditionToEnforce <em>Condition To Enforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition To Enforce</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.SystemConstraint#getConditionToEnforce()
   * @see #getSystemConstraint()
   * @generated
   */
  EAttribute getSystemConstraint_ConditionToEnforce();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity <em>Control Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Entity</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity
   * @generated
   */
  EClass getControlEntity();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#isProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity#isProcess()
   * @see #getControlEntity()
   * @generated
   */
  EAttribute getControlEntity_Process();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getSubEntities <em>Sub Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Entities</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity#getSubEntities()
   * @see #getControlEntity()
   * @generated
   */
  EReference getControlEntity_SubEntities();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Responsibilities</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity#getResponsibilities()
   * @see #getControlEntity()
   * @generated
   */
  EReference getControlEntity_Responsibilities();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getOutgoingRelations <em>Outgoing Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoing Relations</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity#getOutgoingRelations()
   * @see #getControlEntity()
   * @generated
   */
  EReference getControlEntity_OutgoingRelations();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getIncomingRelations <em>Incoming Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming Relations</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity#getIncomingRelations()
   * @see #getControlEntity()
   * @generated
   */
  EReference getControlEntity_IncomingRelations();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.ControlEntity#getProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Model</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlEntity#getProcessModel()
   * @see #getControlEntity()
   * @generated
   */
  EReference getControlEntity_ProcessModel();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeBasedElement <em>Exchange Based Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exchange Based Element</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeBasedElement
   * @generated
   */
  EClass getExchangeBasedElement();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility <em>Responsibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Responsibility</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility
   * @generated
   */
  EClass getResponsibility();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getProcessModelState <em>Process Model State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process Model State</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getProcessModelState()
   * @see #getResponsibility()
   * @generated
   */
  EAttribute getResponsibility_ProcessModelState();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getController <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Controller</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getController()
   * @see #getResponsibility()
   * @generated
   */
  EReference getResponsibility_Controller();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getSystemConstraints <em>System Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>System Constraints</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getSystemConstraints()
   * @see #getResponsibility()
   * @generated
   */
  EReference getResponsibility_SystemConstraints();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getControlActions <em>Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Control Actions</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getControlActions()
   * @see #getResponsibility()
   * @generated
   */
  EReference getResponsibility_ControlActions();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getFeedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Feedback</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getFeedback()
   * @see #getResponsibility()
   * @generated
   */
  EReference getResponsibility_Feedback();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getInformation <em>Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Information</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getInformation()
   * @see #getResponsibility()
   * @generated
   */
  EReference getResponsibility_Information();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Responsibility#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Variables</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Responsibility#getVariables()
   * @see #getResponsibility()
   * @generated
   */
  EReference getResponsibility_Variables();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable <em>Process Model Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Model Variable</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable
   * @generated
   */
  EClass getProcessModelVariable();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getController <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Controller</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getController()
   * @see #getProcessModelVariable()
   * @generated
   */
  EReference getProcessModelVariable_Controller();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Responsibilities</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getResponsibilities()
   * @see #getProcessModelVariable()
   * @generated
   */
  EReference getProcessModelVariable_Responsibilities();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getValues()
   * @see #getProcessModelVariable()
   * @generated
   */
  EReference getProcessModelVariable_Values();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getFeedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Feedback</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getFeedback()
   * @see #getProcessModelVariable()
   * @generated
   */
  EReference getProcessModelVariable_Feedback();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getInformation <em>Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Information</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getInformation()
   * @see #getProcessModelVariable()
   * @generated
   */
  EReference getProcessModelVariable_Information();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getControlActions <em>Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Control Actions</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable#getControlActions()
   * @see #getProcessModelVariable()
   * @generated
   */
  EReference getProcessModelVariable_ControlActions();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelValue <em>Process Model Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Model Value</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelValue
   * @generated
   */
  EClass getProcessModelValue();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.ProcessModelValue#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Variable</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ProcessModelValue#getVariable()
   * @see #getProcessModelValue()
   * @generated
   */
  EReference getProcessModelValue_Variable();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.Relation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Source</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Relation#getSource()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Source();

  /**
   * Returns the meta object for the reference '{@link com.thalesgroup.mde.capella.stpa.model.Relation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Relation#getTarget()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Target();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawContext <em>Control Flaw Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Flaw Context</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawContext
   * @generated
   */
  EClass getControlFlawContext();

  /**
   * Returns the meta object for the containment reference '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawContext#getControlFlawSet <em>Control Flaw Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Control Flaw Set</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawContext#getControlFlawSet()
   * @see #getControlFlawContext()
   * @generated
   */
  EReference getControlFlawContext_ControlFlawSet();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement <em>Exchange Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exchange Element</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeElement
   * @generated
   */
  EClass getExchangeElement();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getUnsafeControlActions <em>Unsafe Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unsafe Control Actions</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getUnsafeControlActions()
   * @see #getExchangeElement()
   * @generated
   */
  EReference getExchangeElement_UnsafeControlActions();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getExercisedResponsibilities <em>Exercised Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Exercised Responsibilities</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getExercisedResponsibilities()
   * @see #getExchangeElement()
   * @generated
   */
  EReference getExchangeElement_ExercisedResponsibilities();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Loss Scenarios</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getLossScenarios()
   * @see #getExchangeElement()
   * @generated
   */
  EReference getExchangeElement_LossScenarios();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getSupportingProcessModel <em>Supporting Process Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Supporting Process Model</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ExchangeElement#getSupportingProcessModel()
   * @see #getExchangeElement()
   * @generated
   */
  EReference getExchangeElement_SupportingProcessModel();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ControlRelation <em>Control Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Relation</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlRelation
   * @generated
   */
  EClass getControlRelation();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.ControlRelation#getControlActions <em>Control Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Control Actions</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlRelation#getControlActions()
   * @see #getControlRelation()
   * @generated
   */
  EReference getControlRelation_ControlActions();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ControlAction <em>Control Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Action</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlAction
   * @generated
   */
  EClass getControlAction();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.ControlAction#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Relation</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlAction#getRelation()
   * @see #getControlAction()
   * @generated
   */
  EReference getControlAction_Relation();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ResponsibilitySupportExchangeElement <em>Responsibility Support Exchange Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Responsibility Support Exchange Element</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ResponsibilitySupportExchangeElement
   * @generated
   */
  EClass getResponsibilitySupportExchangeElement();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackRelation <em>Feedback Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feedback Relation</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackRelation
   * @generated
   */
  EClass getFeedbackRelation();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackRelation#getFeedback <em>Feedback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feedback</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackRelation#getFeedback()
   * @see #getFeedbackRelation()
   * @generated
   */
  EReference getFeedbackRelation_Feedback();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement <em>Feedback Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feedback Element</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackElement
   * @generated
   */
  EClass getFeedbackElement();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Relation</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getRelation()
   * @see #getFeedbackElement()
   * @generated
   */
  EReference getFeedbackElement_Relation();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Responsibilities</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getResponsibilities()
   * @see #getFeedbackElement()
   * @generated
   */
  EReference getFeedbackElement_Responsibilities();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Process Model</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.FeedbackElement#getProcessModel()
   * @see #getFeedbackElement()
   * @generated
   */
  EReference getFeedbackElement_ProcessModel();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation <em>Information Exchange Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Information Exchange Relation</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation
   * @generated
   */
  EClass getInformationExchangeRelation();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation#getInformation <em>Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Information</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation#getInformation()
   * @see #getInformationExchangeRelation()
   * @generated
   */
  EReference getInformationExchangeRelation_Information();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation <em>Piece Of Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Piece Of Information</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.PieceOfInformation
   * @generated
   */
  EClass getPieceOfInformation();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Relation</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getRelation()
   * @see #getPieceOfInformation()
   * @generated
   */
  EReference getPieceOfInformation_Relation();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getResponsibilities <em>Responsibilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Responsibilities</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getResponsibilities()
   * @see #getPieceOfInformation()
   * @generated
   */
  EReference getPieceOfInformation_Responsibilities();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Process Model</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.PieceOfInformation#getProcessModel()
   * @see #getPieceOfInformation()
   * @generated
   */
  EReference getPieceOfInformation_ProcessModel();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawAnalysisElement <em>Control Flaw Analysis Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Flaw Analysis Element</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawAnalysisElement
   * @generated
   */
  EClass getControlFlawAnalysisElement();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.Mitigable <em>Mitigable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mitigable</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Mitigable
   * @generated
   */
  EClass getMitigable();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.Mitigable#getCountermeasures <em>Countermeasures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Countermeasures</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.Mitigable#getCountermeasures()
   * @see #getMitigable()
   * @generated
   */
  EReference getMitigable_Countermeasures();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction <em>Unsafe Control Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unsafe Control Action</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction
   * @generated
   */
  EClass getUnsafeControlAction();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getControlAction <em>Control Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Control Action</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getControlAction()
   * @see #getUnsafeControlAction()
   * @generated
   */
  EReference getUnsafeControlAction_ControlAction();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Loss Scenarios</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getLossScenarios()
   * @see #getUnsafeControlAction()
   * @generated
   */
  EReference getUnsafeControlAction_LossScenarios();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getViolatedConstraints <em>Violated Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Violated Constraints</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getViolatedConstraints()
   * @see #getUnsafeControlAction()
   * @generated
   */
  EReference getUnsafeControlAction_ViolatedConstraints();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getHazards <em>Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Hazards</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getHazards()
   * @see #getUnsafeControlAction()
   * @generated
   */
  EReference getUnsafeControlAction_Hazards();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getKind()
   * @see #getUnsafeControlAction()
   * @generated
   */
  EAttribute getUnsafeControlAction_Kind();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlAction#getContext()
   * @see #getUnsafeControlAction()
   * @generated
   */
  EAttribute getUnsafeControlAction_Context();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario <em>Loss Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loss Scenario</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario
   * @generated
   */
  EClass getLossScenario();

  /**
   * Returns the meta object for the reference '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getControlAction <em>Control Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Control Action</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario#getControlAction()
   * @see #getLossScenario()
   * @generated
   */
  EReference getLossScenario_ControlAction();

  /**
   * Returns the meta object for the reference '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getUnsafeControlAction <em>Unsafe Control Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Unsafe Control Action</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario#getUnsafeControlAction()
   * @see #getLossScenario()
   * @generated
   */
  EReference getLossScenario_UnsafeControlAction();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getCausalFactors <em>Causal Factors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Causal Factors</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario#getCausalFactors()
   * @see #getLossScenario()
   * @generated
   */
  EReference getLossScenario_CausalFactors();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getViolatedConstraints <em>Violated Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Violated Constraints</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario#getViolatedConstraints()
   * @see #getLossScenario()
   * @generated
   */
  EReference getLossScenario_ViolatedConstraints();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.LossScenario#getHazards <em>Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Hazards</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.LossScenario#getHazards()
   * @see #getLossScenario()
   * @generated
   */
  EReference getLossScenario_Hazards();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory <em>Unsafe Control Action Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unsafe Control Action Category</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory
   * @generated
   */
  EClass getUnsafeControlActionCategory();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionCategory#getKind()
   * @see #getUnsafeControlActionCategory()
   * @generated
   */
  EAttribute getUnsafeControlActionCategory_Kind();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw <em>Control Flaw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Flaw</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlaw
   * @generated
   */
  EClass getControlFlaw();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getKind()
   * @see #getControlFlaw()
   * @generated
   */
  EAttribute getControlFlaw_Kind();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getVerdict <em>Verdict</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verdict</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getVerdict()
   * @see #getControlFlaw()
   * @generated
   */
  EAttribute getControlFlaw_Verdict();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getOwningSet <em>Owning Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owning Set</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getOwningSet()
   * @see #getControlFlaw()
   * @generated
   */
  EReference getControlFlaw_OwningSet();

  /**
   * Returns the meta object for the attribute '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getJustification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Justification</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getJustification()
   * @see #getControlFlaw()
   * @generated
   */
  EAttribute getControlFlaw_Justification();

  /**
   * Returns the meta object for the reference list '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getLossScenarios <em>Loss Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Loss Scenarios</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlaw#getLossScenarios()
   * @see #getControlFlaw()
   * @generated
   */
  EReference getControlFlaw_LossScenarios();

  /**
   * Returns the meta object for class '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet <em>Control Flaw Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Flaw Set</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawSet
   * @generated
   */
  EClass getControlFlawSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getControlFlaws <em>Control Flaws</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Control Flaws</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getControlFlaws()
   * @see #getControlFlawSet()
   * @generated
   */
  EReference getControlFlawSet_ControlFlaws();

  /**
   * Returns the meta object for the container reference '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Context</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawSet#getContext()
   * @see #getControlFlawSet()
   * @generated
   */
  EReference getControlFlawSet_Context();

  /**
   * Returns the meta object for enum '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind <em>Unsafe Control Action Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unsafe Control Action Kind</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind
   * @generated
   */
  EEnum getUnsafeControlActionKind();

  /**
   * Returns the meta object for enum '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawKind <em>Control Flaw Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Control Flaw Kind</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawKind
   * @generated
   */
  EEnum getControlFlawKind();

  /**
   * Returns the meta object for enum '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict <em>Control Flaw Verdict</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Control Flaw Verdict</em>'.
   * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict
   * @generated
   */
  EEnum getControlFlawVerdict();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StpaFactory getStpaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisElementImpl <em>Analysis Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisElementImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getStpaAnalysisElement()
     * @generated
     */
    EClass STPA_ANALYSIS_ELEMENT = eINSTANCE.getStpaAnalysisElement();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.UserIdentifiedElementImpl <em>User Identified Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.UserIdentifiedElementImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getUserIdentifiedElement()
     * @generated
     */
    EClass USER_IDENTIFIED_ELEMENT = eINSTANCE.getUserIdentifiedElement();

    /**
     * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER_IDENTIFIED_ELEMENT__USER_ID = eINSTANCE.getUserIdentifiedElement_UserID();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.DecomposableImpl <em>Decomposable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.DecomposableImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getDecomposable()
     * @generated
     */
    EClass DECOMPOSABLE = eINSTANCE.getDecomposable();

    /**
     * The meta object literal for the '<em><b>Decomposition Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECOMPOSABLE__DECOMPOSITION_CATEGORIES = eINSTANCE.getDecomposable_DecompositionCategories();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECOMPOSABLE__CATEGORY = eINSTANCE.getDecomposable_Category();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.DecompositionCategoryImpl <em>Decomposition Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.DecompositionCategoryImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getDecompositionCategory()
     * @generated
     */
    EClass DECOMPOSITION_CATEGORY = eINSTANCE.getDecompositionCategory();

    /**
     * The meta object literal for the '<em><b>Coverage</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECOMPOSITION_CATEGORY__COVERAGE = eINSTANCE.getDecompositionCategory_Coverage();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ArchitectureMappableImpl <em>Architecture Mappable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ArchitectureMappableImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getArchitectureMappable()
     * @generated
     */
    EClass ARCHITECTURE_MAPPABLE = eINSTANCE.getArchitectureMappable();

    /**
     * The meta object literal for the '<em><b>Architecture Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE_MAPPABLE__ARCHITECTURE_ELEMENTS = eINSTANCE.getArchitectureMappable_ArchitectureElements();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl <em>Analysis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaAnalysisImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getStpaAnalysis()
     * @generated
     */
    EClass STPA_ANALYSIS = eINSTANCE.getStpaAnalysis();

    /**
     * The meta object literal for the '<em><b>Technical Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STPA_ANALYSIS__TECHNICAL_PACKAGE = eINSTANCE.getStpaAnalysis_TechnicalPackage();

    /**
     * The meta object literal for the '<em><b>System</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STPA_ANALYSIS__SYSTEM = eINSTANCE.getStpaAnalysis_System();

    /**
     * The meta object literal for the '<em><b>Sub Analyses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STPA_ANALYSIS__SUB_ANALYSES = eINSTANCE.getStpaAnalysis_SubAnalyses();

    /**
     * The meta object literal for the '<em><b>Loss Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STPA_ANALYSIS__LOSS_PACKAGE = eINSTANCE.getStpaAnalysis_LossPackage();

    /**
     * The meta object literal for the '<em><b>Hazard Constraint Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STPA_ANALYSIS__HAZARD_CONSTRAINT_PACKAGE = eINSTANCE.getStpaAnalysis_HazardConstraintPackage();

    /**
     * The meta object literal for the '<em><b>Control Structure Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STPA_ANALYSIS__CONTROL_STRUCTURE_PACKAGE = eINSTANCE.getStpaAnalysis_ControlStructurePackage();

    /**
     * The meta object literal for the '<em><b>Loss Scenario Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STPA_ANALYSIS__LOSS_SCENARIO_PACKAGE = eINSTANCE.getStpaAnalysis_LossScenarioPackage();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.AnalysisPackageImpl <em>Analysis Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.AnalysisPackageImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getAnalysisPackage()
     * @generated
     */
    EClass ANALYSIS_PACKAGE = eINSTANCE.getAnalysisPackage();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.TechnicalPackageImpl <em>Technical Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.TechnicalPackageImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getTechnicalPackage()
     * @generated
     */
    EClass TECHNICAL_PACKAGE = eINSTANCE.getTechnicalPackage();

    /**
     * The meta object literal for the '<em><b>Unsafe Control Action Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TECHNICAL_PACKAGE__UNSAFE_CONTROL_ACTION_CATEGORIES = eINSTANCE
        .getTechnicalPackage_UnsafeControlActionCategories();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.LossPackageImpl <em>Loss Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.LossPackageImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getLossPackage()
     * @generated
     */
    EClass LOSS_PACKAGE = eINSTANCE.getLossPackage();

    /**
     * The meta object literal for the '<em><b>Stakeholders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOSS_PACKAGE__STAKEHOLDERS = eINSTANCE.getLossPackage_Stakeholders();

    /**
     * The meta object literal for the '<em><b>Losses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOSS_PACKAGE__LOSSES = eINSTANCE.getLossPackage_Losses();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardConstraintPackageImpl <em>Hazard Constraint Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.HazardConstraintPackageImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getHazardConstraintPackage()
     * @generated
     */
    EClass HAZARD_CONSTRAINT_PACKAGE = eINSTANCE.getHazardConstraintPackage();

    /**
     * The meta object literal for the '<em><b>Root Hazards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD_CONSTRAINT_PACKAGE__ROOT_HAZARDS = eINSTANCE.getHazardConstraintPackage_RootHazards();

    /**
     * The meta object literal for the '<em><b>Root System Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD_CONSTRAINT_PACKAGE__ROOT_SYSTEM_CONSTRAINTS = eINSTANCE
        .getHazardConstraintPackage_RootSystemConstraints();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlStructurePackageImpl <em>Control Structure Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlStructurePackageImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlStructurePackage()
     * @generated
     */
    EClass CONTROL_STRUCTURE_PACKAGE = eINSTANCE.getControlStructurePackage();

    /**
     * The meta object literal for the '<em><b>Root Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_STRUCTURE_PACKAGE__ROOT_ENTITIES = eINSTANCE.getControlStructurePackage_RootEntities();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioPackageImpl <em>Loss Scenario Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioPackageImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getLossScenarioPackage()
     * @generated
     */
    EClass LOSS_SCENARIO_PACKAGE = eINSTANCE.getLossScenarioPackage();

    /**
     * The meta object literal for the '<em><b>Loss Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOSS_SCENARIO_PACKAGE__LOSS_SCENARIOS = eINSTANCE.getLossScenarioPackage_LossScenarios();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.StakeholderImpl <em>Stakeholder</em>}' class.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StakeholderImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getStakeholder()
     * @generated
     */
    EClass STAKEHOLDER = eINSTANCE.getStakeholder();

    /**
     * The meta object literal for the '<em><b>Stakes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKEHOLDER__STAKES = eINSTANCE.getStakeholder_Stakes();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.StakeImpl <em>Stake</em>}' class.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StakeImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getStake()
     * @generated
     */
    EClass STAKE = eINSTANCE.getStake();

    /**
     * The meta object literal for the '<em><b>Stakeholder</b></em>' container reference feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKE__STAKEHOLDER = eINSTANCE.getStake_Stakeholder();

    /**
     * The meta object literal for the '<em><b>Losses</b></em>' reference list feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKE__LOSSES = eINSTANCE.getStake_Losses();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.LossImpl <em>Loss</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.LossImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getLoss()
     * @generated
     */
    EClass LOSS = eINSTANCE.getLoss();

    /**
     * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOSS__HAZARDS = eINSTANCE.getLoss_Hazards();

    /**
     * The meta object literal for the '<em><b>Stakes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
    	 * <!-- end-user-doc -->
     * @generated
     */
    EReference LOSS__STAKES = eINSTANCE.getLoss_Stakes();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawTargetImpl <em>Control Flaw Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawTargetImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawTarget()
     * @generated
     */
    EClass CONTROL_FLAW_TARGET = eINSTANCE.getControlFlawTarget();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.HazardImpl <em>Hazard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.HazardImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getHazard()
     * @generated
     */
    EClass HAZARD = eINSTANCE.getHazard();

    /**
     * The meta object literal for the '<em><b>Sub Hazards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__SUB_HAZARDS = eINSTANCE.getHazard_SubHazards();

    /**
     * The meta object literal for the '<em><b>Losses</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__LOSSES = eINSTANCE.getHazard_Losses();

    /**
     * The meta object literal for the '<em><b>System Constraints</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__SYSTEM_CONSTRAINTS = eINSTANCE.getHazard_SystemConstraints();

    /**
     * The meta object literal for the '<em><b>Unsafe Control Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__UNSAFE_CONTROL_ACTIONS = eINSTANCE.getHazard_UnsafeControlActions();

    /**
     * The meta object literal for the '<em><b>Loss Scenarios</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__LOSS_SCENARIOS = eINSTANCE.getHazard_LossScenarios();

    /**
     * The meta object literal for the '<em><b>Unsafe Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD__UNSAFE_CONDITION = eINSTANCE.getHazard_UnsafeCondition();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl <em>System Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.SystemConstraintImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getSystemConstraint()
     * @generated
     */
    EClass SYSTEM_CONSTRAINT = eINSTANCE.getSystemConstraint();

    /**
     * The meta object literal for the '<em><b>Sub System Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_CONSTRAINT__SUB_SYSTEM_CONSTRAINTS = eINSTANCE.getSystemConstraint_SubSystemConstraints();

    /**
     * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_CONSTRAINT__HAZARDS = eINSTANCE.getSystemConstraint_Hazards();

    /**
     * The meta object literal for the '<em><b>Responsibilities</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_CONSTRAINT__RESPONSIBILITIES = eINSTANCE.getSystemConstraint_Responsibilities();

    /**
     * The meta object literal for the '<em><b>Unsafe Control Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_CONSTRAINT__UNSAFE_CONTROL_ACTIONS = eINSTANCE.getSystemConstraint_UnsafeControlActions();

    /**
     * The meta object literal for the '<em><b>Loss Scenarios</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_CONSTRAINT__LOSS_SCENARIOS = eINSTANCE.getSystemConstraint_LossScenarios();

    /**
     * The meta object literal for the '<em><b>Assumptions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_CONSTRAINT__ASSUMPTIONS = eINSTANCE.getSystemConstraint_Assumptions();

    /**
     * The meta object literal for the '<em><b>Condition To Enforce</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_CONSTRAINT__CONDITION_TO_ENFORCE = eINSTANCE.getSystemConstraint_ConditionToEnforce();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlEntityImpl <em>Control Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlEntityImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlEntity()
     * @generated
     */
    EClass CONTROL_ENTITY = eINSTANCE.getControlEntity();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_ENTITY__PROCESS = eINSTANCE.getControlEntity_Process();

    /**
     * The meta object literal for the '<em><b>Sub Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_ENTITY__SUB_ENTITIES = eINSTANCE.getControlEntity_SubEntities();

    /**
     * The meta object literal for the '<em><b>Responsibilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_ENTITY__RESPONSIBILITIES = eINSTANCE.getControlEntity_Responsibilities();

    /**
     * The meta object literal for the '<em><b>Outgoing Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_ENTITY__OUTGOING_RELATIONS = eINSTANCE.getControlEntity_OutgoingRelations();

    /**
     * The meta object literal for the '<em><b>Incoming Relations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_ENTITY__INCOMING_RELATIONS = eINSTANCE.getControlEntity_IncomingRelations();

    /**
     * The meta object literal for the '<em><b>Process Model</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_ENTITY__PROCESS_MODEL = eINSTANCE.getControlEntity_ProcessModel();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ExchangeBasedElementImpl <em>Exchange Based Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ExchangeBasedElementImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getExchangeBasedElement()
     * @generated
     */
    EClass EXCHANGE_BASED_ELEMENT = eINSTANCE.getExchangeBasedElement();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilityImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getResponsibility()
     * @generated
     */
    EClass RESPONSIBILITY = eINSTANCE.getResponsibility();

    /**
     * The meta object literal for the '<em><b>Process Model State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESPONSIBILITY__PROCESS_MODEL_STATE = eINSTANCE.getResponsibility_ProcessModelState();

    /**
     * The meta object literal for the '<em><b>Controller</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSIBILITY__CONTROLLER = eINSTANCE.getResponsibility_Controller();

    /**
     * The meta object literal for the '<em><b>System Constraints</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSIBILITY__SYSTEM_CONSTRAINTS = eINSTANCE.getResponsibility_SystemConstraints();

    /**
     * The meta object literal for the '<em><b>Control Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSIBILITY__CONTROL_ACTIONS = eINSTANCE.getResponsibility_ControlActions();

    /**
     * The meta object literal for the '<em><b>Feedback</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSIBILITY__FEEDBACK = eINSTANCE.getResponsibility_Feedback();

    /**
     * The meta object literal for the '<em><b>Information</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSIBILITY__INFORMATION = eINSTANCE.getResponsibility_Information();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSIBILITY__VARIABLES = eINSTANCE.getResponsibility_Variables();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelVariableImpl <em>Process Model Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelVariableImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getProcessModelVariable()
     * @generated
     */
    EClass PROCESS_MODEL_VARIABLE = eINSTANCE.getProcessModelVariable();

    /**
     * The meta object literal for the '<em><b>Controller</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_MODEL_VARIABLE__CONTROLLER = eINSTANCE.getProcessModelVariable_Controller();

    /**
     * The meta object literal for the '<em><b>Responsibilities</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_MODEL_VARIABLE__RESPONSIBILITIES = eINSTANCE.getProcessModelVariable_Responsibilities();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_MODEL_VARIABLE__VALUES = eINSTANCE.getProcessModelVariable_Values();

    /**
     * The meta object literal for the '<em><b>Feedback</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_MODEL_VARIABLE__FEEDBACK = eINSTANCE.getProcessModelVariable_Feedback();

    /**
     * The meta object literal for the '<em><b>Information</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_MODEL_VARIABLE__INFORMATION = eINSTANCE.getProcessModelVariable_Information();

    /**
     * The meta object literal for the '<em><b>Control Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_MODEL_VARIABLE__CONTROL_ACTIONS = eINSTANCE.getProcessModelVariable_ControlActions();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelValueImpl <em>Process Model Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ProcessModelValueImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getProcessModelValue()
     * @generated
     */
    EClass PROCESS_MODEL_VALUE = eINSTANCE.getProcessModelValue();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_MODEL_VALUE__VARIABLE = eINSTANCE.getProcessModelValue_Variable();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.RelationImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawContextImpl <em>Control Flaw Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawContextImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawContext()
     * @generated
     */
    EClass CONTROL_FLAW_CONTEXT = eINSTANCE.getControlFlawContext();

    /**
     * The meta object literal for the '<em><b>Control Flaw Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_FLAW_CONTEXT__CONTROL_FLAW_SET = eINSTANCE.getControlFlawContext_ControlFlawSet();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ExchangeElementImpl <em>Exchange Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ExchangeElementImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getExchangeElement()
     * @generated
     */
    EClass EXCHANGE_ELEMENT = eINSTANCE.getExchangeElement();

    /**
     * The meta object literal for the '<em><b>Unsafe Control Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCHANGE_ELEMENT__UNSAFE_CONTROL_ACTIONS = eINSTANCE.getExchangeElement_UnsafeControlActions();

    /**
     * The meta object literal for the '<em><b>Exercised Responsibilities</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCHANGE_ELEMENT__EXERCISED_RESPONSIBILITIES = eINSTANCE.getExchangeElement_ExercisedResponsibilities();

    /**
     * The meta object literal for the '<em><b>Loss Scenarios</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCHANGE_ELEMENT__LOSS_SCENARIOS = eINSTANCE.getExchangeElement_LossScenarios();

    /**
     * The meta object literal for the '<em><b>Supporting Process Model</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCHANGE_ELEMENT__SUPPORTING_PROCESS_MODEL = eINSTANCE.getExchangeElement_SupportingProcessModel();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlRelationImpl <em>Control Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlRelationImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlRelation()
     * @generated
     */
    EClass CONTROL_RELATION = eINSTANCE.getControlRelation();

    /**
     * The meta object literal for the '<em><b>Control Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_RELATION__CONTROL_ACTIONS = eINSTANCE.getControlRelation_ControlActions();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlActionImpl <em>Control Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlActionImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlAction()
     * @generated
     */
    EClass CONTROL_ACTION = eINSTANCE.getControlAction();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_ACTION__RELATION = eINSTANCE.getControlAction_Relation();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilitySupportExchangeElementImpl <em>Responsibility Support Exchange Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ResponsibilitySupportExchangeElementImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getResponsibilitySupportExchangeElement()
     * @generated
     */
    EClass RESPONSIBILITY_SUPPORT_EXCHANGE_ELEMENT = eINSTANCE.getResponsibilitySupportExchangeElement();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.FeedbackRelationImpl <em>Feedback Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.FeedbackRelationImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getFeedbackRelation()
     * @generated
     */
    EClass FEEDBACK_RELATION = eINSTANCE.getFeedbackRelation();

    /**
     * The meta object literal for the '<em><b>Feedback</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEEDBACK_RELATION__FEEDBACK = eINSTANCE.getFeedbackRelation_Feedback();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.FeedbackElementImpl <em>Feedback Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.FeedbackElementImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getFeedbackElement()
     * @generated
     */
    EClass FEEDBACK_ELEMENT = eINSTANCE.getFeedbackElement();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEEDBACK_ELEMENT__RELATION = eINSTANCE.getFeedbackElement_Relation();

    /**
     * The meta object literal for the '<em><b>Responsibilities</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEEDBACK_ELEMENT__RESPONSIBILITIES = eINSTANCE.getFeedbackElement_Responsibilities();

    /**
     * The meta object literal for the '<em><b>Process Model</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEEDBACK_ELEMENT__PROCESS_MODEL = eINSTANCE.getFeedbackElement_ProcessModel();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.InformationExchangeRelationImpl <em>Information Exchange Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.InformationExchangeRelationImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getInformationExchangeRelation()
     * @generated
     */
    EClass INFORMATION_EXCHANGE_RELATION = eINSTANCE.getInformationExchangeRelation();

    /**
     * The meta object literal for the '<em><b>Information</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFORMATION_EXCHANGE_RELATION__INFORMATION = eINSTANCE.getInformationExchangeRelation_Information();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.PieceOfInformationImpl <em>Piece Of Information</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.PieceOfInformationImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getPieceOfInformation()
     * @generated
     */
    EClass PIECE_OF_INFORMATION = eINSTANCE.getPieceOfInformation();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIECE_OF_INFORMATION__RELATION = eINSTANCE.getPieceOfInformation_Relation();

    /**
     * The meta object literal for the '<em><b>Responsibilities</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIECE_OF_INFORMATION__RESPONSIBILITIES = eINSTANCE.getPieceOfInformation_Responsibilities();

    /**
     * The meta object literal for the '<em><b>Process Model</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIECE_OF_INFORMATION__PROCESS_MODEL = eINSTANCE.getPieceOfInformation_ProcessModel();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawAnalysisElementImpl <em>Control Flaw Analysis Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawAnalysisElementImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawAnalysisElement()
     * @generated
     */
    EClass CONTROL_FLAW_ANALYSIS_ELEMENT = eINSTANCE.getControlFlawAnalysisElement();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.MitigableImpl <em>Mitigable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.MitigableImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getMitigable()
     * @generated
     */
    EClass MITIGABLE = eINSTANCE.getMitigable();

    /**
     * The meta object literal for the '<em><b>Countermeasures</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MITIGABLE__COUNTERMEASURES = eINSTANCE.getMitigable_Countermeasures();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl <em>Unsafe Control Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getUnsafeControlAction()
     * @generated
     */
    EClass UNSAFE_CONTROL_ACTION = eINSTANCE.getUnsafeControlAction();

    /**
     * The meta object literal for the '<em><b>Control Action</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNSAFE_CONTROL_ACTION__CONTROL_ACTION = eINSTANCE.getUnsafeControlAction_ControlAction();

    /**
     * The meta object literal for the '<em><b>Loss Scenarios</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNSAFE_CONTROL_ACTION__LOSS_SCENARIOS = eINSTANCE.getUnsafeControlAction_LossScenarios();

    /**
     * The meta object literal for the '<em><b>Violated Constraints</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNSAFE_CONTROL_ACTION__VIOLATED_CONSTRAINTS = eINSTANCE.getUnsafeControlAction_ViolatedConstraints();

    /**
     * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNSAFE_CONTROL_ACTION__HAZARDS = eINSTANCE.getUnsafeControlAction_Hazards();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNSAFE_CONTROL_ACTION__KIND = eINSTANCE.getUnsafeControlAction_Kind();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNSAFE_CONTROL_ACTION__CONTEXT = eINSTANCE.getUnsafeControlAction_Context();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioImpl <em>Loss Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.LossScenarioImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getLossScenario()
     * @generated
     */
    EClass LOSS_SCENARIO = eINSTANCE.getLossScenario();

    /**
     * The meta object literal for the '<em><b>Control Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOSS_SCENARIO__CONTROL_ACTION = eINSTANCE.getLossScenario_ControlAction();

    /**
     * The meta object literal for the '<em><b>Unsafe Control Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOSS_SCENARIO__UNSAFE_CONTROL_ACTION = eINSTANCE.getLossScenario_UnsafeControlAction();

    /**
     * The meta object literal for the '<em><b>Causal Factors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOSS_SCENARIO__CAUSAL_FACTORS = eINSTANCE.getLossScenario_CausalFactors();

    /**
     * The meta object literal for the '<em><b>Violated Constraints</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOSS_SCENARIO__VIOLATED_CONSTRAINTS = eINSTANCE.getLossScenario_ViolatedConstraints();

    /**
     * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOSS_SCENARIO__HAZARDS = eINSTANCE.getLossScenario_Hazards();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionCategoryImpl <em>Unsafe Control Action Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.UnsafeControlActionCategoryImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getUnsafeControlActionCategory()
     * @generated
     */
    EClass UNSAFE_CONTROL_ACTION_CATEGORY = eINSTANCE.getUnsafeControlActionCategory();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNSAFE_CONTROL_ACTION_CATEGORY__KIND = eINSTANCE.getUnsafeControlActionCategory_Kind();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl <em>Control Flaw</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlaw()
     * @generated
     */
    EClass CONTROL_FLAW = eINSTANCE.getControlFlaw();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_FLAW__KIND = eINSTANCE.getControlFlaw_Kind();

    /**
     * The meta object literal for the '<em><b>Verdict</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_FLAW__VERDICT = eINSTANCE.getControlFlaw_Verdict();

    /**
     * The meta object literal for the '<em><b>Owning Set</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_FLAW__OWNING_SET = eINSTANCE.getControlFlaw_OwningSet();

    /**
     * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_FLAW__JUSTIFICATION = eINSTANCE.getControlFlaw_Justification();

    /**
     * The meta object literal for the '<em><b>Loss Scenarios</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_FLAW__LOSS_SCENARIOS = eINSTANCE.getControlFlaw_LossScenarios();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawSetImpl <em>Control Flaw Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.impl.ControlFlawSetImpl
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawSet()
     * @generated
     */
    EClass CONTROL_FLAW_SET = eINSTANCE.getControlFlawSet();

    /**
     * The meta object literal for the '<em><b>Control Flaws</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_FLAW_SET__CONTROL_FLAWS = eINSTANCE.getControlFlawSet_ControlFlaws();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_FLAW_SET__CONTEXT = eINSTANCE.getControlFlawSet_Context();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind <em>Unsafe Control Action Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.UnsafeControlActionKind
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getUnsafeControlActionKind()
     * @generated
     */
    EEnum UNSAFE_CONTROL_ACTION_KIND = eINSTANCE.getUnsafeControlActionKind();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawKind <em>Control Flaw Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawKind
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawKind()
     * @generated
     */
    EEnum CONTROL_FLAW_KIND = eINSTANCE.getControlFlawKind();

    /**
     * The meta object literal for the '{@link com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict <em>Control Flaw Verdict</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.thalesgroup.mde.capella.stpa.model.ControlFlawVerdict
     * @see com.thalesgroup.mde.capella.stpa.model.impl.StpaPackageImpl#getControlFlawVerdict()
     * @generated
     */
    EEnum CONTROL_FLAW_VERDICT = eINSTANCE.getControlFlawVerdict();

  }

} //StpaPackage
