package com.boeing.apmapi.model;

import java.util.Objects;

import org.neo4j.driver.types.Node;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;


public class ApmFncNode extends ApmNode {

  private ApiElementEnum elementType = ApiElementEnum.FNC;
  private String ampDesc = "";

  @Valid
  private List<String> labels = new ArrayList<>();


  public ApmFncNode(Node node) {    
    super(node);
  }

  /**
   * Get ampDesc
   * @return ampDesc
  */
  @Schema(name = "ampDesc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ampDesc")
  public String getAmpDesc() {
    return ampDesc;
  }

  public void setAmpDesc(String ampDesc) {
    this.ampDesc = ampDesc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmFncNode apmFncNode = (ApmFncNode) o;
    if( !super.equals(o) ){
      return false;
    }
    return  Objects.equals(this.ampDesc, apmFncNode.ampDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType, ampDesc, apmId, sort, ampTitle, isDeleted, dbId, nodeId, labels);
  }

  @Override
  protected String getPropertiesString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.getPropertiesString());
    sb.append("    ampDesc: ").append(toIndentedString(ampDesc)).append("\n");
    return sb.toString();
  }

}

