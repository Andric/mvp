package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.Utils.ApiDataTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.neo4j.driver.types.Node;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SaveVersionNode
 */
public class SaveVersionNode extends BaseNode {
  @NotNull
  protected ApiDataTypes elementType = ApiDataTypes.EVV;

  @NotNull
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
  public ApiDataTypes getApiElementType() {
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
    if(!super.equals(o)) {
      return false;
    }
    SaveVersionNode saveVersionNode = (SaveVersionNode) o;
    return Objects.equals(this.saveVersion, saveVersionNode.saveVersion) &&
        Objects.equals(this.name, saveVersionNode.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType, saveVersion, name, createDate, createBy, isCurrent, dbId, nodeId, labels);
  }

  @Override
  public String getPropertiesString() {
    StringBuilder sb = new StringBuilder();
    sb.append("    saveVersion: ").append(toIndentedString(saveVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }


}

