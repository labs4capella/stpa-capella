//Generated with EGF 1.6.3.202110291409
package com.thalesgroup.mde.capella.stpa.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import com.thalesgroup.mde.capella.stpa.docgen.*;
import com.thalesgroup.mde.capella.stpa.model.*;
import com.thalesgroup.mde.capella.stpa.docgen.util.*;

public class StpaAnalysisElementDocGen
    extends com.thalesgroup.mde.capella.stpa.docgen.common.AbstractStpaAnalysisElementDocGen {
  protected static String nl;

  public static synchronized StpaAnalysisElementDocGen create(String lineSeparator) {
    nl = lineSeparator;
    StpaAnalysisElementDocGen result = new StpaAnalysisElementDocGen();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;

  public StpaAnalysisElementDocGen() {
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

    List<Object> parameterList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)

    for (Object parameterParameter : parameterList) {

      this.parameter = (com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement) parameterParameter;

      if (preCondition(ctx)) {
        ctx.setNode(new Node.Container(currentNode, getClass()));
        orchestration(ctx);
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

    method_createPNG(new StringBuffer(), ictx);
    super.orchestration(new SuperOrchestrationContext(ictx));

    if (ictx.useReporter()) {
      Map<String, Object> parameterValues = new HashMap<String, Object>();
      parameterValues.put("parameter", this.parameter);
      String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
      String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
      ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
    }
    return null;
  }

  protected com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement parameter = null;

  public void set_parameter(com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement object) {
    this.parameter = object;
  }

  public Map<String, Object> getParameters() {
    final Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    return parameters;
  }

  protected void method_setCapellaContext(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    element = parameter;

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext", stringBuffer.toString());
  }

  protected void method_createPNG(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    String outputFolder = ctx.getValue("outputFolder").toString();
    String projectName = ctx.getValue("projectName").toString();
    ImageHelper.createPNG(parameter, projectName, outputFolder);

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "createPNG", stringBuffer.toString());
  }

  public boolean preCondition(PatternContext ctx) throws Exception {
    return parameter instanceof StpaAnalysisElement;
  }
}