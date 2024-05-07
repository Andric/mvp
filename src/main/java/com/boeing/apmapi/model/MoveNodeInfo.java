package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.common.Utils.ApiUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * MoveNodeInfo
 */
public class MoveNodeInfo {
  /**
   * dbId of the node to move
   */
  private String dbId;
  /**
   * dbId of the new parent for the node
   */
  private String newParentDbId;

  public MoveNodeInfo() {
  }

  /**
   * Constructor with only required parameters
   */
  public MoveNodeInfo(String dbId, String newParentDbId) {
    this.dbId = dbId;
    this.newParentDbId = newParentDbId;
  }

  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum
   * @return dbId
  */
  @Pattern(regexp = ApiUtil.NODE_ID_REGEX) 
  @Schema(name = "dbId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dbId")
  public String getDbId() {
    return dbId;
  }

  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum
   * @return newParentDbId
  */
  @Pattern(regexp = ApiUtil.NODE_ID_REGEX) 
  @Schema(name = "newParentDbId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("newParentDbId")
  public String getNewParentDbId() {
    return newParentDbId;
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

