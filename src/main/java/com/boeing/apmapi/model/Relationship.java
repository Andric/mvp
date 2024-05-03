package com.boeing.apmapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * Relationship
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class Relationship {

  private String dbId;

  private String label;

  public Relationship() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Relationship(String dbId, String label) {
    this.dbId = dbId;
    this.label = label;
  }

  public Relationship dbId(String dbId) {
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

  public Relationship label(String label) {
    this.label = label;
    return this;
  }

  /**
   * label for the relationship
   * @return label
  */
  @NotNull 
  @Schema(name = "label", description = "label for the relationship", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
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
        Objects.equals(this.label, relationship.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbId, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationship {\n");
    sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

