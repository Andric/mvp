package com.boeing.apmapi.model;

import com.boeing.apmapi.common.Utils.ApiDataTypes;

import jakarta.annotation.Generated;
/**
 * ApmFngNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class FunctionalGroupNode extends ApmNode {

  protected ApiDataTypes elementType = ApiDataTypes.FNG;

  /**
   * Constructor with only required parameters
   */
  public FunctionalGroupNode(org.neo4j.driver.types.Node node) {
    super(node);
  }
}

