package com.boeing.apmapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;
/**
 * ClientNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class ClientNode extends BaseNode {

  protected ApiElementEnum elementType = ApiElementEnum.CVV;

  protected String name;

  public ClientNode(org.neo4j.driver.types.Node node) {
    super(node);
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if( !super.equals(o) ){
      return false;
    }
    ClientNode clientNode = (ClientNode) o;
    return Objects.equals(this.name, clientNode.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType, name, dbId, nodeId, labels);
  }

  @Override
  protected String getPropertiesString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.getPropertiesString());
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    return sb.toString();
  }


}

