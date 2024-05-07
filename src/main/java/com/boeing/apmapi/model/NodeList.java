package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.common.Utils.ApiDataTypes;
import com.boeing.apmapi.common.interfaces.IApmNode;
import com.boeing.apmapi.common.interfaces.IElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * NodeList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class NodeList implements IElement {

  private ApiDataTypes elementType = ApiDataTypes.NODELIST;

  @Valid
  private List<IApmNode> values = new ArrayList<>();

  public NodeList() {
    super();
  }

  /**
   * type of the nodes in the list
   * @return elementType
  */
  @NotNull 
  @Schema(name = "elementType", description = "type of the nodes in the list", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elementType")
  public ApiDataTypes getApiDataType() {
    return elementType;
  }

  public void addValuesItem(IApmNode valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
  }

  /**
   * List of Node objects
   * @return values
  */
  @Valid 
  @Schema(name = "values", description = "List of Node objects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<IApmNode> getValues() {
    return values;
  }

  public void setValues(List<IApmNode> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeList nodeList = (NodeList) o;
    return Objects.equals(this.elementType, nodeList.elementType) &&
        Objects.equals(this.values, nodeList.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeList {\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

