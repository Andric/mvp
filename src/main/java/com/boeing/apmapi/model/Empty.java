package com.boeing.apmapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * An empty object for when there is no data
 */

@Schema(name = "Empty", description = "An empty object for when there is no data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class Empty implements Payload {

  private String typeName = "Empty";

  public Empty() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Empty(String typeName) {
    this.typeName = typeName;
  }

  public Empty typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Name of the type
   * @return typeName
  */
  @NotNull 
  @Schema(name = "typeName", description = "Name of the type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeName")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Empty empty = (Empty) o;
    return Objects.equals(this.typeName, empty.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Empty {\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

