package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.Utils.ApiDataTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * An empty object for when there is no data
 */
@Schema(name = "Empty", description = "An empty object for when there is no data")
public class Empty implements IElement {

  private final ApiDataTypes elementType = ApiDataTypes.EMPTY;

  public Empty() {}

  
  @NotNull 
  @Schema(name = "elementType", description = "Name of the type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elementType")
  @Override
  public ApiDataTypes getApiElementType() {
    return elementType;
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
    return Objects.equals(this.elementType, empty.elementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Empty {\n");
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

