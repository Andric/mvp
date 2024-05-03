package com.boeing.apmapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * EngagementNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class EngagementNode implements Payload {

  private String typeName = "EVV";

  private Integer engagementVersion;

  private String boeingApmVersion;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDate;

  private String createBy;

  private Boolean isCurrent = true;

  private String dbId;

  private String nodeId;

  @Valid
  private List<String> labels = new ArrayList<>();

  public EngagementNode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EngagementNode(String typeName, Integer engagementVersion, String boeingApmVersion, OffsetDateTime createDate, String createBy, Boolean isCurrent, String nodeId, List<String> labels) {
    this.typeName = typeName;
    this.engagementVersion = engagementVersion;
    this.boeingApmVersion = boeingApmVersion;
    this.createDate = createDate;
    this.createBy = createBy;
    this.isCurrent = isCurrent;
    this.nodeId = nodeId;
    this.labels = labels;
  }

  public EngagementNode typeName(String typeName) {
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

  public EngagementNode engagementVersion(Integer engagementVersion) {
    this.engagementVersion = engagementVersion;
    return this;
  }

  /**
   * Get engagementVersion
   * @return engagementVersion
  */
  @NotNull 
  @Schema(name = "engagementVersion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("engagementVersion")
  public Integer getEngagementVersion() {
    return engagementVersion;
  }

  public void setEngagementVersion(Integer engagementVersion) {
    this.engagementVersion = engagementVersion;
  }

  public EngagementNode boeingApmVersion(String boeingApmVersion) {
    this.boeingApmVersion = boeingApmVersion;
    return this;
  }

  /**
   * Get boeingApmVersion
   * @return boeingApmVersion
  */
  @NotNull 
  @Schema(name = "boeingApmVersion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("boeingApmVersion")
  public String getBoeingApmVersion() {
    return boeingApmVersion;
  }

  public void setBoeingApmVersion(String boeingApmVersion) {
    this.boeingApmVersion = boeingApmVersion;
  }

  public EngagementNode createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @NotNull @Valid 
  @Schema(name = "createDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public EngagementNode createBy(String createBy) {
    this.createBy = createBy;
    return this;
  }

  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum
   * @return createBy
  */
  @Pattern(regexp = "\"^'[0-9]+\\.[A-Z]{3}\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.*[0-9]*\" ") 
  @Schema(name = "createBy", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createBy")
  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public EngagementNode isCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
    return this;
  }

  /**
   * Get isCurrent
   * @return isCurrent
  */
  @NotNull 
  @Schema(name = "isCurrent", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isCurrent")
  public Boolean getIsCurrent() {
    return isCurrent;
  }

  public void setIsCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
  }

  public EngagementNode dbId(String dbId) {
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

  public EngagementNode nodeId(String nodeId) {
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

  public EngagementNode labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public EngagementNode addLabelsItem(String labelsItem) {
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
    public EngagementNode putAdditionalProperty(String key, Object value) {
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
    EngagementNode engagementNode = (EngagementNode) o;
    return Objects.equals(this.typeName, engagementNode.typeName) &&
        Objects.equals(this.engagementVersion, engagementNode.engagementVersion) &&
        Objects.equals(this.boeingApmVersion, engagementNode.boeingApmVersion) &&
        Objects.equals(this.createDate, engagementNode.createDate) &&
        Objects.equals(this.createBy, engagementNode.createBy) &&
        Objects.equals(this.isCurrent, engagementNode.isCurrent) &&
        Objects.equals(this.dbId, engagementNode.dbId) &&
        Objects.equals(this.nodeId, engagementNode.nodeId) &&
        Objects.equals(this.labels, engagementNode.labels) &&
    Objects.equals(this.additionalProperties, engagementNode.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, engagementVersion, boeingApmVersion, createDate, createBy, isCurrent, dbId, nodeId, labels, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngagementNode {\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    engagementVersion: ").append(toIndentedString(engagementVersion)).append("\n");
    sb.append("    boeingApmVersion: ").append(toIndentedString(boeingApmVersion)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
    sb.append("    isCurrent: ").append(toIndentedString(isCurrent)).append("\n");
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

