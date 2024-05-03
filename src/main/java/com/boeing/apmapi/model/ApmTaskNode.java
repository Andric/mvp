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
 * ApmTaskNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class ApmTaskNode implements Payload {

  private String typeName = "TKK";

  private String text;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDate;

  private String createBy;

  private String isDeleted;

  private String dbId;

  private String nodeId;

  @Valid
  private List<String> labels = new ArrayList<>();

  public ApmTaskNode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApmTaskNode(String typeName, String nodeId, List<String> labels) {
    this.typeName = typeName;
    this.nodeId = nodeId;
    this.labels = labels;
  }

  public ApmTaskNode typeName(String typeName) {
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

  public ApmTaskNode text(String text) {
    this.text = text;
    return this;
  }

  /**
   * note for the node
   * @return text
  */
  
  @Schema(name = "text", description = "note for the node", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ApmTaskNode createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * date the node was created
   * @return createDate
  */
  @Valid 
  @Schema(name = "createDate", description = "date the node was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public ApmTaskNode createBy(String createBy) {
    this.createBy = createBy;
    return this;
  }

  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum
   * @return createBy
  */
  @Pattern(regexp = "\"^'[0-9]+\\.[A-Z]{3}\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.*[0-9]*\" ") 
  @Schema(name = "createBy", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createBy")
  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public ApmTaskNode isDeleted(String isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * user who created the node
   * @return isDeleted
  */
  
  @Schema(name = "isDeleted", description = "user who created the node", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDeleted")
  public String getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(String isDeleted) {
    this.isDeleted = isDeleted;
  }

  public ApmTaskNode dbId(String dbId) {
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

  public ApmTaskNode nodeId(String nodeId) {
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

  public ApmTaskNode labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public ApmTaskNode addLabelsItem(String labelsItem) {
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
    public ApmTaskNode putAdditionalProperty(String key, Object value) {
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
    ApmTaskNode apmTaskNode = (ApmTaskNode) o;
    return Objects.equals(this.typeName, apmTaskNode.typeName) &&
        Objects.equals(this.text, apmTaskNode.text) &&
        Objects.equals(this.createDate, apmTaskNode.createDate) &&
        Objects.equals(this.createBy, apmTaskNode.createBy) &&
        Objects.equals(this.isDeleted, apmTaskNode.isDeleted) &&
        Objects.equals(this.dbId, apmTaskNode.dbId) &&
        Objects.equals(this.nodeId, apmTaskNode.nodeId) &&
        Objects.equals(this.labels, apmTaskNode.labels) &&
    Objects.equals(this.additionalProperties, apmTaskNode.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, text, createDate, createBy, isDeleted, dbId, nodeId, labels, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmTaskNode {\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
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

