package com.boeing.apmapi.model;

import java.util.Objects;
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
public class NodeList implements Payload {

  private String typeName = "GenericNodeList";

  @Valid
  private List<Node> values = new ArrayList<>();

  public NodeList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NodeList(String typeName) {
    this.typeName = typeName;
  }

  public NodeList typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * type of the nodes in the list
   * @return typeName
  */
  @NotNull 
  @Schema(name = "typeName", description = "type of the nodes in the list", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeName")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public NodeList values(List<Node> values) {
    this.values = values;
    return this;
  }

  public NodeList addValuesItem(Node valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * List of Node objects
   * @return values
  */
  @Valid 
  @Schema(name = "values", description = "List of Node objects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<Node> getValues() {
    return values;
  }

  public void setValues(List<Node> values) {
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
    return Objects.equals(this.typeName, nodeList.typeName) &&
        Objects.equals(this.values, nodeList.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeList {\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

