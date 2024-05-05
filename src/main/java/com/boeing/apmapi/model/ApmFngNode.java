package com.boeing.apmapi.model;

import jakarta.annotation.Generated;
/**
 * ApmFngNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class ApmFngNode extends ApmNode {

  protected ApiElementEnum elementType = ApiElementEnum.FNG;

  /**
   * Constructor with only required parameters
   */
  public ApmFngNode(org.neo4j.driver.types.Node node) {
    super(node);
  }
}

