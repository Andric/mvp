package com.boeing.apmapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoveNodeInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class MoveNodeInfo {

  private String dbId;

  private String newParentDbId;

  public MoveNodeInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveNodeInfo(String dbId, String newParentDbId) {
    this.dbId = dbId;
    this.newParentDbId = newParentDbId;
  }

  public MoveNodeInfo dbId(String dbId) {
    this.dbId = dbId;
    return this;
  }

  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum
   * @return dbId
  */
  @Pattern(regexp = "\"^'[0-9]+\\.[A-Z]{3}\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.*[0-9]*\" ") 
  @Schema(name = "dbId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dbId")
  public String getDbId() {
    return dbId;
  }

  public void setDbId(String dbId) {
    this.dbId = dbId;
  }

  public MoveNodeInfo newParentDbId(String newParentDbId) {
    this.newParentDbId = newParentDbId;
    return this;
  }

  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum
   * @return newParentDbId
  */
  @Pattern(regexp = "\"^'[0-9]+\\.[A-Z]{3}\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.*[0-9]*\" ") 
  @Schema(name = "newParentDbId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("newParentDbId")
  public String getNewParentDbId() {
    return newParentDbId;
  }

  public void setNewParentDbId(String newParentDbId) {
    this.newParentDbId = newParentDbId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveNodeInfo moveNodeInfo = (MoveNodeInfo) o;
    return Objects.equals(this.dbId, moveNodeInfo.dbId) &&
        Objects.equals(this.newParentDbId, moveNodeInfo.newParentDbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbId, newParentDbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveNodeInfo {\n");
    sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
    sb.append("    newParentDbId: ").append(toIndentedString(newParentDbId)).append("\n");
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

