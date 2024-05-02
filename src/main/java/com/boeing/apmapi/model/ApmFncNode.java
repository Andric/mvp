package com.boeing.apmapi.model;

import java.net.URI;
import java.util.Objects;
import com.boeing.apmapi.model.NodeTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * ApmFncNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class ApmFncNode implements Payload {

  private String typeName = "FNC";

  private String ampDesc = "";

  private String apmId;

  private Integer sort;

  private String ampTitle;

  private Boolean isDeleted;

  private String dbId;

  private String nodeId;

  @Valid
  private List<String> labels = new ArrayList<>();

  public ApmFncNode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApmFncNode(String typeName, String apmId, Integer sort, String nodeId, List<String> labels) {
    this.typeName = typeName;
    this.apmId = apmId;
    this.sort = sort;
    this.nodeId = nodeId;
    this.labels = labels;
  }

  public ApmFncNode typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Get typeName
   * @return typeName
  */
  @NotNull 
  @Schema(name = "typeName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeName")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public ApmFncNode ampDesc(String ampDesc) {
    this.ampDesc = ampDesc;
    return this;
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

  public ApmFncNode apmId(String apmId) {
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

  public ApmFncNode sort(Integer sort) {
    this.sort = sort;
    return this;
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

  public ApmFncNode ampTitle(String ampTitle) {
    this.ampTitle = ampTitle;
    return this;
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

  public ApmFncNode isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
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

  public ApmFncNode dbId(String dbId) {
    this.dbId = dbId;
    return this;
  }

  /**
   * db system id for the node
   * @return dbId
  */
  
  @Schema(name = "dbId", accessMode = Schema.AccessMode.READ_ONLY, description = "db system id for the node", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dbId")
  public String getDbId() {
    return dbId;
  }

  public void setDbId(String dbId) {
    this.dbId = dbId;
  }

  public ApmFncNode nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum
   * @return nodeId
  */
  @Pattern(regexp = "\"^'[0-9]+\\.[A-Z]{3}\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.*[0-9]*\" ") 
  @Schema(name = "nodeId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nodeId")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public ApmFncNode labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public ApmFncNode addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * list of labels for the node
   * @return labels
  */
  @NotNull 
  @Schema(name = "labels", description = "list of labels for the node", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("labels")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public ApmFncNode putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
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
    return Objects.equals(this.typeName, apmFncNode.typeName) &&
        Objects.equals(this.ampDesc, apmFncNode.ampDesc) &&
        Objects.equals(this.apmId, apmFncNode.apmId) &&
        Objects.equals(this.sort, apmFncNode.sort) &&
        Objects.equals(this.ampTitle, apmFncNode.ampTitle) &&
        Objects.equals(this.isDeleted, apmFncNode.isDeleted) &&
        Objects.equals(this.dbId, apmFncNode.dbId) &&
        Objects.equals(this.nodeId, apmFncNode.nodeId) &&
        Objects.equals(this.labels, apmFncNode.labels) &&
    Objects.equals(this.additionalProperties, apmFncNode.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, ampDesc, apmId, sort, ampTitle, isDeleted, dbId, nodeId, labels, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmFncNode {\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    ampDesc: ").append(toIndentedString(ampDesc)).append("\n");
    sb.append("    apmId: ").append(toIndentedString(apmId)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    ampTitle: ").append(toIndentedString(ampTitle)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
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

