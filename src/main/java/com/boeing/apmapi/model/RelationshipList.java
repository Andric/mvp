package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.common.Utils.ApiDataTypes;
import com.boeing.apmapi.common.interfaces.IElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * result with multiple Relationship objects
 */

@Schema(name = "RelationshipList", description = "result with multiple Relationship objects")
public class RelationshipList implements IElement{

  protected ApiDataTypes elementType = ApiDataTypes.RELATIONSHIP_LIST;

  @Valid
  private List<@Valid Relationship> values = new ArrayList<>();

  public RelationshipList values(List<@Valid Relationship> values) {
    this.values = values;
    return this;
  }

  public RelationshipList addValuesItem(Relationship valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  @Override
  public ApiDataTypes getApiDataType() {
    return elementType;
  }
  /**
   * Get values
   * @return values
  */
  @Valid 
  @Schema(name = "values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<@Valid Relationship> getValues() {
    return values;
  }

  public void setValues(List<@Valid Relationship> values) {
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
    RelationshipList relationshipList = (RelationshipList) o;
    return Objects.equals(this.values, relationshipList.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipList {\n");
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

