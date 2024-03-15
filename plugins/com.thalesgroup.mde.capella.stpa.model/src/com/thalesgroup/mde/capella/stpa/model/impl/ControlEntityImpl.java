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
package com.thalesgroup.mde.capella.stpa.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import com.thalesgroup.mde.capella.stpa.model.ArchitectureMappable;
import com.thalesgroup.mde.capella.stpa.model.ControlAction;
import com.thalesgroup.mde.capella.stpa.model.ControlEntity;
import com.thalesgroup.mde.capella.stpa.model.ControlRelation;
import com.thalesgroup.mde.capella.stpa.model.ExchangeElement;
import com.thalesgroup.mde.capella.stpa.model.FeedbackElement;
import com.thalesgroup.mde.capella.stpa.model.FeedbackRelation;
import com.thalesgroup.mde.capella.stpa.model.InformationExchangeRelation;
import com.thalesgroup.mde.capella.stpa.model.PieceOfInformation;
import com.thalesgroup.mde.capella.stpa.model.ProcessModelVariable;
import com.thalesgroup.mde.capella.stpa.model.Relation;
import com.thalesgroup.mde.capella.stpa.model.Responsibility;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysis;
import com.thalesgroup.mde.capella.stpa.model.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ControlEntity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlEntityImpl#isProcess <em>Process</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlEntityImpl#getSubEntities <em>Sub Entities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlEntityImpl#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlEntityImpl#getOutgoingRelations <em>Outgoing Relations</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlEntityImpl#getIncomingRelations <em>Incoming Relations</em>}</li>
 *   <li>{@link com.thalesgroup.mde.capella.stpa.model.impl.ControlEntityImpl#getProcessModel <em>Process Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlEntityImpl extends DecomposableImpl<ControlEntity> implements ControlEntity {
  /**
   * The default value of the '{@link #isProcess() <em>Process</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProcess()
   * @generated
   * @ordered
   */
  protected static final boolean PROCESS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProcess() <em>Process</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProcess()
   * @generated
   * @ordered
   */
  protected boolean process = PROCESS_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubEntities() <em>Sub Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubEntities()
   * @generated
   * @ordered
   */
  protected EList<ControlEntity> subEntities;

  /**
   * The cached value of the '{@link #getResponsibilities() <em>Responsibilities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsibilities()
   * @generated
   * @ordered
   */
  protected EList<Responsibility> responsibilities;

  /**
   * The cached value of the '{@link #getOutgoingRelations() <em>Outgoing Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingRelations()
   * @generated
   * @ordered
   */
  protected EList<Relation> outgoingRelations;

  /**
   * The cached value of the '{@link #getIncomingRelations() <em>Incoming Relations</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomingRelations()
   * @generated
   * @ordered
   */
  protected EList<Relation> incomingRelations;

  /**
   * The cached value of the '{@link #getProcessModel() <em>Process Model</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessModel()
   * @generated
   * @ordered
   */
  protected EList<ProcessModelVariable> processModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlEntityImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return StpaPackage.Literals.CONTROL_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isProcess() {
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcess(boolean newProcess) {
    boolean oldProcess = process;
    process = newProcess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.CONTROL_ENTITY__PROCESS, oldProcess, process));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ControlEntity> getSubEntities() {
    if (subEntities == null) {
      subEntities = new EObjectContainmentEList.Resolving<ControlEntity>(ControlEntity.class, this,
          StpaPackage.CONTROL_ENTITY__SUB_ENTITIES);
    }
    return subEntities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Responsibility> getResponsibilities() {
    if (responsibilities == null) {
      responsibilities = new EObjectContainmentWithInverseEList.Resolving<Responsibility>(Responsibility.class, this,
          StpaPackage.CONTROL_ENTITY__RESPONSIBILITIES, StpaPackage.RESPONSIBILITY__CONTROLLER);
    }
    return responsibilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Relation> getOutgoingRelations() {
    if (outgoingRelations == null) {
      outgoingRelations = new EObjectContainmentWithInverseEList.Resolving<Relation>(Relation.class, this,
          StpaPackage.CONTROL_ENTITY__OUTGOING_RELATIONS, StpaPackage.RELATION__SOURCE);
    }
    return outgoingRelations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Relation> getIncomingRelations() {
    if (incomingRelations == null) {
      incomingRelations = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this,
          StpaPackage.CONTROL_ENTITY__INCOMING_RELATIONS, StpaPackage.RELATION__TARGET);
    }
    return incomingRelations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ProcessModelVariable> getProcessModel() {
    if (processModel == null) {
      processModel = new EObjectContainmentWithInverseEList.Resolving<ProcessModelVariable>(ProcessModelVariable.class,
          this, StpaPackage.CONTROL_ENTITY__PROCESS_MODEL, StpaPackage.PROCESS_MODEL_VARIABLE__CONTROLLER);
    }
    return processModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public ControlEntity getComposite() {
    return getComposite(ControlEntity.class);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<ControlEntity> getDecomposition() {
    return getSubEntities();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public boolean isController() {
    for (Relation outgoing : getOutgoingRelations()) {
      if (outgoing instanceof ControlRelation) {
        return true;
      }
    }
    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public boolean isControlled() {
    for (Relation incoming : getIncomingRelations()) {
      if (incoming instanceof ControlRelation) {
        return true;
      }
    }
    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public boolean isSystem() {
    boolean result = false;
    StpaAnalysis analysis = getAnalysis();
    if (analysis != null) {
      result = analysis.getSystem() == this;
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<ControlAction> getIncomingControlActions() {
    EList<ControlAction> result = new BasicEList<ControlAction>();
    for (Relation relation : getIncomingRelations()) {
      if (relation instanceof ControlRelation) {
        result.addAll(((ControlRelation) relation).getControlActions());
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<ExchangeElement> getIncomingExchangeElements() {
    EList<ExchangeElement> result = new BasicEList<ExchangeElement>();
    result.addAll(getIncomingControlActions());
    result.addAll(getIncomingFeedback());
    result.addAll(getIncomingInformation());
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<FeedbackElement> getIncomingFeedback() {
    EList<FeedbackElement> result = new BasicEList<FeedbackElement>();
    for (Relation relation : getOutgoingRelations()) {
      if (relation instanceof FeedbackRelation) {
        result.addAll(((FeedbackRelation) relation).getFeedback());
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<PieceOfInformation> getIncomingInformation() {
    EList<PieceOfInformation> result = new BasicEList<PieceOfInformation>();
    for (Relation relation : getIncomingRelations()) {
      if (relation instanceof InformationExchangeRelation) {
        result.addAll(((InformationExchangeRelation) relation).getInformation());
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<ControlAction> getOutgoingControlActions() {
    EList<ControlAction> result = new BasicEList<ControlAction>();
    for (Relation relation : getOutgoingRelations()) {
      if (relation instanceof ControlRelation) {
        result.addAll(((ControlRelation) relation).getControlActions());
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<ExchangeElement> getOutgoingExchangeElements() {
    EList<ExchangeElement> result = new BasicEList<ExchangeElement>();
    result.addAll(getOutgoingControlActions());
    result.addAll(getOutgoingFeedback());
    result.addAll(getOutgoingInformation());
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<FeedbackElement> getOutgoingFeedback() {
    EList<FeedbackElement> result = new BasicEList<FeedbackElement>();
    for (Relation relation : getIncomingRelations()) {
      if (relation instanceof FeedbackRelation) {
        result.addAll(((FeedbackRelation) relation).getFeedback());
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public EList<PieceOfInformation> getOutgoingInformation() {
    EList<PieceOfInformation> result = new BasicEList<PieceOfInformation>();
    for (Relation relation : getOutgoingRelations()) {
      if (relation instanceof InformationExchangeRelation) {
        result.addAll(((InformationExchangeRelation) relation).getInformation());
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.CONTROL_ENTITY__RESPONSIBILITIES:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getResponsibilities()).basicAdd(otherEnd, msgs);
    case StpaPackage.CONTROL_ENTITY__OUTGOING_RELATIONS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingRelations()).basicAdd(otherEnd, msgs);
    case StpaPackage.CONTROL_ENTITY__INCOMING_RELATIONS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingRelations()).basicAdd(otherEnd, msgs);
    case StpaPackage.CONTROL_ENTITY__PROCESS_MODEL:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getProcessModel()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case StpaPackage.CONTROL_ENTITY__SUB_ENTITIES:
      return ((InternalEList<?>) getSubEntities()).basicRemove(otherEnd, msgs);
    case StpaPackage.CONTROL_ENTITY__RESPONSIBILITIES:
      return ((InternalEList<?>) getResponsibilities()).basicRemove(otherEnd, msgs);
    case StpaPackage.CONTROL_ENTITY__OUTGOING_RELATIONS:
      return ((InternalEList<?>) getOutgoingRelations()).basicRemove(otherEnd, msgs);
    case StpaPackage.CONTROL_ENTITY__INCOMING_RELATIONS:
      return ((InternalEList<?>) getIncomingRelations()).basicRemove(otherEnd, msgs);
    case StpaPackage.CONTROL_ENTITY__PROCESS_MODEL:
      return ((InternalEList<?>) getProcessModel()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case StpaPackage.CONTROL_ENTITY__PROCESS:
      return isProcess();
    case StpaPackage.CONTROL_ENTITY__SUB_ENTITIES:
      return getSubEntities();
    case StpaPackage.CONTROL_ENTITY__RESPONSIBILITIES:
      return getResponsibilities();
    case StpaPackage.CONTROL_ENTITY__OUTGOING_RELATIONS:
      return getOutgoingRelations();
    case StpaPackage.CONTROL_ENTITY__INCOMING_RELATIONS:
      return getIncomingRelations();
    case StpaPackage.CONTROL_ENTITY__PROCESS_MODEL:
      return getProcessModel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case StpaPackage.CONTROL_ENTITY__PROCESS:
      setProcess((Boolean) newValue);
      return;
    case StpaPackage.CONTROL_ENTITY__SUB_ENTITIES:
      getSubEntities().clear();
      getSubEntities().addAll((Collection<? extends ControlEntity>) newValue);
      return;
    case StpaPackage.CONTROL_ENTITY__RESPONSIBILITIES:
      getResponsibilities().clear();
      getResponsibilities().addAll((Collection<? extends Responsibility>) newValue);
      return;
    case StpaPackage.CONTROL_ENTITY__OUTGOING_RELATIONS:
      getOutgoingRelations().clear();
      getOutgoingRelations().addAll((Collection<? extends Relation>) newValue);
      return;
    case StpaPackage.CONTROL_ENTITY__INCOMING_RELATIONS:
      getIncomingRelations().clear();
      getIncomingRelations().addAll((Collection<? extends Relation>) newValue);
      return;
    case StpaPackage.CONTROL_ENTITY__PROCESS_MODEL:
      getProcessModel().clear();
      getProcessModel().addAll((Collection<? extends ProcessModelVariable>) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case StpaPackage.CONTROL_ENTITY__PROCESS:
      setProcess(PROCESS_EDEFAULT);
      return;
    case StpaPackage.CONTROL_ENTITY__SUB_ENTITIES:
      getSubEntities().clear();
      return;
    case StpaPackage.CONTROL_ENTITY__RESPONSIBILITIES:
      getResponsibilities().clear();
      return;
    case StpaPackage.CONTROL_ENTITY__OUTGOING_RELATIONS:
      getOutgoingRelations().clear();
      return;
    case StpaPackage.CONTROL_ENTITY__INCOMING_RELATIONS:
      getIncomingRelations().clear();
      return;
    case StpaPackage.CONTROL_ENTITY__PROCESS_MODEL:
      getProcessModel().clear();
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case StpaPackage.CONTROL_ENTITY__PROCESS:
      return process != PROCESS_EDEFAULT;
    case StpaPackage.CONTROL_ENTITY__SUB_ENTITIES:
      return subEntities != null && !subEntities.isEmpty();
    case StpaPackage.CONTROL_ENTITY__RESPONSIBILITIES:
      return responsibilities != null && !responsibilities.isEmpty();
    case StpaPackage.CONTROL_ENTITY__OUTGOING_RELATIONS:
      return outgoingRelations != null && !outgoingRelations.isEmpty();
    case StpaPackage.CONTROL_ENTITY__INCOMING_RELATIONS:
      return incomingRelations != null && !incomingRelations.isEmpty();
    case StpaPackage.CONTROL_ENTITY__PROCESS_MODEL:
      return processModel != null && !processModel.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy())
      return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (process: "); //$NON-NLS-1$
    result.append(process);
    result.append(')');
    return result.toString();
  }

} //ControlEntityImpl
