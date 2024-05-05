package com.boeing.apmapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.driver.types.Node;
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
 * SaveVersionNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class SaveVersionNode extends BaseNode {
  @NotNull
  protected ApiElementEnum elementType = ApiElementEnum.EVV;

  protected int saveVersion;
  @NotNull
  @NotBlank
  protected String name;
  protected boolean isCurrent = true;

  public SaveVersionNode(Node node) {
    super(node);
    this.saveVersion = node.get("saveVersion").asInt();
    this.name = node.get("name").asString();
  }

  /**
   * Get elementType
   * @return elementType
  */
  @NotNull 
  @Schema(name = "elementType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elementType")
  @Override
  public ApiElementEnum getApiElementType() {
    return elementType;
  }

  /**
   * Get saveVersion
   * @return saveVersion
  */
  @NotNull 
  @Schema(name = "saveVersion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("saveVersion")
  public Integer getSaveVersion() {
    return saveVersion;
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

  public SaveVersionNode createDate(OffsetDateTime createDate) {
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

  public SaveVersionNode createBy(String createBy) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveVersionNode saveVersionNode = (SaveVersionNode) o;
    return Objects.equals(this.elementType, saveVersionNode.elementType) &&
        Objects.equals(this.saveVersion, saveVersionNode.saveVersion) &&
        Objects.equals(this.name, saveVersionNode.name) &&
        Objects.equals(this.createDate, saveVersionNode.createDate) &&
        Objects.equals(this.createBy, saveVersionNode.createBy) &&
        Objects.equals(this.isCurrent, saveVersionNode.isCurrent) &&
        Objects.equals(this.dbId, saveVersionNode.dbId) &&
        Objects.equals(this.nodeId, saveVersionNode.nodeId) &&
        Objects.equals(this.labels, saveVersionNode.labels) &&
    Objects.equals(this.additionalProperties, saveVersionNode.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType, saveVersion, name, createDate, createBy, isCurrent, dbId, nodeId, labels, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveVersionNode {\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    saveVersion: ").append(toIndentedString(saveVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

