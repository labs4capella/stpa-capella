//Generated with EGF 1.6.3.202110291409
package com.thalesgroup.mde.capella.stpa.docgen.common;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import com.thalesgroup.mde.capella.stpa.docgen.*;
import com.thalesgroup.mde.capella.stpa.model.*;

public class AbstractStpaAnalysisElementDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
  protected static String nl;

  public static synchronized AbstractStpaAnalysisElementDocGen create(String lineSeparator) {
    nl = lineSeparator;
    AbstractStpaAnalysisElementDocGen result = new AbstractStpaAnalysisElementDocGen();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;

  public AbstractStpaAnalysisElementDocGen() {
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

    if (preCondition(ctx)) {
      ctx.setNode(new Node.Container(currentNode, getClass()));
      orchestration(ctx);
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

    super.orchestration(new SuperOrchestrationContext(ictx));

    return null;
  }

  public Map<String, Object> getParameters() {
    final Map<String, Object> parameters = new HashMap<String, Object>();
    return parameters;
  }

}