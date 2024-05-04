package com.boeing.apmapi.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * ApmNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class ApmNode extends Node {

  protected String apmId;

  protected Integer sort;

  protected String ampTitle;

  protected Boolean isDeleted;

  protected NodeTypes typeName = NodeTypes.UNK;

   /**
   * Constructor with only required parameters
   */
  public ApmNode(org.neo4j.driver.types.Node node) {
    super(node);
    this.apmId = node.get("ampId").toString();
    this.sort = node.get("sort").asInt();
    this.isDeleted = node.get("isDeleted").asBoolean();
    this.ampTitle = node.get("ampTitle").toString();
  }

  public ApmNode apmId(String apmId) {
    this.apmId = apmId;
    return this;
  }

  /**
   * apm system id for the node
   * @return apmId
  */
  @NotNull 
  @Schema(name = "apmId", description = "apm system id for the node", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("apmId")
  public String getApmId() {
    return apmId;
  }

  public void setApmId(String apmId) {
    this.apmId = apmId;
  }

  /**
   * display order of the node
   * @return sort
  */
  
  @Schema(name = "sort", accessMode = Schema.AccessMode.READ_ONLY, example = "2", description = "display order of the node", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sort")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  /**
   * title for the node
   * @return ampTitle
  */
  
  @Schema(name = "ampTitle", description = "title for the node", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ampTitle")
  public String getAmpTitle() {
    return ampTitle;
  }

  public void setAmpTitle(String ampTitle) {
    this.ampTitle = ampTitle;
  }

  /**
   * is the node deleted
   * @return isDeleted
  */
  
  @Schema(name = "isDeleted", description = "is the node deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDeleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }



  /**
   * Get typeName
   * @return typeName
  */
  @NotNull @Valid 
  @Schema(name = "typeName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeName")
  public NodeTypes getTypeName() {
    return typeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmNode apmNode = (ApmNode) o;
    if (!super.equals(o)) {
      return false;
    }
    return Objects.equals(this.apmId, apmNode.apmId) &&
        Objects.equals(this.sort, apmNode.sort) &&
        Objects.equals(this.ampTitle, apmNode.ampTitle) &&
        Objects.equals(this.isDeleted, apmNode.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apmId, sort, ampTitle, isDeleted, typeName, dbId, nodeId, labels, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmNode {\n");
    sb.append(getPropertiesString());

    sb.append("}");
    return sb.toString();
  }

  @Override
  protected String getPropertiesString(){
    StringBuilder sb = new StringBuilder();
    sb.append(super.getPropertiesString());
    sb.append("    apmId: ").append(toIndentedString(apmId)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    ampTitle: ").append(toIndentedString(ampTitle)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    return sb.toString();
  }
  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

