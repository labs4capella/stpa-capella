//Generated with EGF 1.6.2.202001031546
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
package com.thalesgroup.mde.capella.stpa.docgen.extensions;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionRegistry;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionElement.PageExtensionActivationStatus;

public class STPAContent {
  protected static String nl;

  public static synchronized STPAContent create(String lineSeparator) {
    nl = lineSeparator;
    STPAContent result = new STPAContent();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;

  public STPAContent() {
    //Here is the constructor
    StringBuffer stringBuffer = new StringBuffer();

    // add initialisation of the pattern variables (declaration has been already done).

  }

  public String generate(Object argument) throws Exception {
    final StringBuffer stringBuffer = new StringBuffer();

    InternalPatternContext ctx = (InternalPatternContext) argument;
    Map<String, String> queryCtx = null;
    IQuery.ParameterDescription paramDesc = null;
    Node.Container currentNode = ctx.getNode();

    List<Object> elementList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)
    List<Object> documentTitleList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)

    for (Object elementParameter : elementList) {
      for (Object documentTitleParameter : documentTitleList) {

        this.element = (org.eclipse.emf.ecore.EObject) elementParameter;
        this.documentTitle = (java.lang.String) documentTitleParameter;

        if (preCondition(ctx)) {
          ctx.setNode(new Node.Container(currentNode, getClass()));
          orchestration(ctx);
        }

      }
    }
    ctx.setNode(currentNode);
    if (ctx.useReporter()) {
      ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
    }

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }

  public String orchestration(PatternContext ctx) throws Exception {
    InternalPatternContext ictx = (InternalPatternContext) ctx;

    method_content(new StringBuffer(), ictx);

    if (ictx.useReporter()) {
      Map<String, Object> parameterValues = new HashMap<String, Object>();
      parameterValues.put("element", this.element);
      parameterValues.put("documentTitle", this.documentTitle);
      String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
      String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
      ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
    }
    return null;
  }

  protected org.eclipse.emf.ecore.EObject element = null;

  public void set_element(org.eclipse.emf.ecore.EObject object) {
    this.element = object;
  }

  protected java.lang.String documentTitle = null;

  public void set_documentTitle(java.lang.String object) {
    this.documentTitle = object;
  }

  public Map<String, Object> getParameters() {
    final Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("element", this.element);
    parameters.put("documentTitle", this.documentTitle);
    return parameters;
  }

  protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    stringBuffer.append(com.thalesgroup.mde.capella.stpa.docgen.STPADocGenHelper
        .generateSTPARelations((org.polarsys.capella.core.data.capellacore.CapellaElement) element));
    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
  }

  public boolean preCondition(PatternContext ctx) throws Exception {
    return PageExtensionRegistry.getInstance().getCategoryActivationStatus("Capella", "STPA Viewpoint")
        .equals(PageExtensionActivationStatus.Active);
  }
}