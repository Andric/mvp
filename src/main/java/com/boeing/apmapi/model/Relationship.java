package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.common.Utils.ApiDataTypes;
import com.boeing.apmapi.common.Utils.ApiUtil;
import com.boeing.apmapi.common.interfaces.IRelationship;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * Relationship
 */
public class Relationship implements IRelationship{

  protected ApiDataTypes elementType = ApiDataTypes.RELATIONSHIP;
  protected String dbId;
  protected String fromDbId;
  protected String toDbId;
  protected String label;

  /**
   * Constructor with only required parameters
   */
  public Relationship(org.neo4j.driver.types.Relationship relationship) {
    this.dbId = relationship.elementId();
    this.fromDbId = relationship.startNodeElementId();
    this.toDbId = relationship.endNodeElementId();
    this.label = relationship.type();
  }
  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum
   * @return dbId
  */
  @Pattern(regexp = ApiUtil.NODE_ID_REGEX)
  @Schema(name = "dbId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dbId")
  @Override
  public String getDbId() {
    return dbId;
  }

  /**
   * label for the relationship
   * @return label
  */
  @NotNull 
  @Schema(name = "label", description = "label for the relationship", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("label")
  @Override
  public String getLabel() {
    return label;
  }

  
  /**
   * Get elementType
   * 
   * @return elementType
   */
  @Override
  @NotNull
  @Valid
  @Schema(name = "elementType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elementType")
  public ApiDataTypes getApiDataType() {
    return this.elementType;
  }

  @Override
  @Pattern(regexp = ApiUtil.NODE_ID_REGEX)
  @Schema(name = "fromDbId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fromDbId")
  public String getFrom() {
    return fromDbId;
  }

  @Pattern(regexp = ApiUtil.NODE_ID_REGEX)
  @Schema(name = "toDbId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("toDbId")
  @Override
  public String getTo() {
    return toDbId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relationship relationship = (Relationship) o;
    return Objects.equals(this.dbId, relationship.dbId) &&
        Objects.equals(this.label, relationship.label) &&
        Objects.equals(this.fromDbId, relationship.fromDbId) &&
        Objects.equals(this.toDbId, relationship.toDbId) &&
        Objects.equals(this.elementType, relationship.elementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbId, label, fromDbId, toDbId, elementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationship {\n");
    sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    fromDbId: ").append(toIndentedString(fromDbId)).append("\n");
    sb.append("    toDbId: ").append(toIndentedString(toDbId)).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
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

