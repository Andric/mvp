package com.boeing.apmapi.model;

import org.neo4j.driver.types.Node;

import com.boeing.apmapi.common.Utils.ApiDataTypes;
/**
 * ApmFnaNode
 */
public class FunctionalAreaNode extends ApmNode {

  protected ApiDataTypes elementType = ApiDataTypes.FNA;

  /**
   * Constructor with db nodes
   */
  public FunctionalAreaNode(Node node) {
    super(node);
  }

}

