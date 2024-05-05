package com.boeing.apmapi.model;

import org.neo4j.driver.types.Node;

public class ApmTaskNode extends ApmNote {

  protected ApiElementEnum elementType = ApiElementEnum.TKK;

   public ApmTaskNode(Node node) {
    super(node);
  }

 
}

