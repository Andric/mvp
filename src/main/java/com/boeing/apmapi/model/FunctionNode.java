package com.boeing.apmapi.model;

import java.util.Objects;

import org.neo4j.driver.types.Node;

import com.boeing.apmapi.Utils.ApiDataTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


public class FunctionNode extends ApmNode {

  private ApiDataTypes elementType = ApiDataTypes.FNC;
  private String desc = "";

  public FunctionNode(Node node) {    
    super(node);
  }

  /**
   * Get ampDesc
   * @return ampDesc
  */
  @Schema(name = "ampDesc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ampDesc")
  public String getDesc() {
    return desc;
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType, desc, apmId, sort, title, isActive, dbId, nodeId, labels);
  }

  @Override
  protected String getPropertiesString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.getPropertiesString());
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    return sb.toString();
  }

}

