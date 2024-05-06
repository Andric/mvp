package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.Utils.ApiDataTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ApmNode
 */
public class ApmNode extends BaseNode {

  protected String apmId;

  protected Integer sort;

  protected String title;

  protected Boolean isActive;

  protected ApiDataTypes elementType = ApiDataTypes.AMPNODE;

   /**
   * Constructor with only required parameters
   */
  public ApmNode(org.neo4j.driver.types.Node node) {
    super(node);
    this.apmId = node.get("ampId").toString();
    this.sort = node.get("sort").asInt();
    this.isActive = node.get("is_active").asBoolean();
    this.title = node.get("title").toString();
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
  
  @Schema(name = "title", description = "title for the node", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * is the node deleted
   * @return isDeleted
  */
  
  @Schema(name = "isDeleted", description = "is the node deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDeleted")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }



  /**
   * Get elementType
   * @return elementType
  */
  @NotNull @Valid 
  @Schema(name = "elementType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elementType")
  public ApiDataTypes getElementType() {
    return elementType;
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
        Objects.equals(this.title, apmNode.title) &&
        Objects.equals(this.isActive, apmNode.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apmId, sort, title, isActive, elementType, dbId, nodeId, labels);
  }

  @Override
  protected String getPropertiesString(){
    StringBuilder sb = new StringBuilder();
    sb.append(super.getPropertiesString());
    sb.append("    apmId: ").append(toIndentedString(apmId)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    return sb.toString();
  }

}

