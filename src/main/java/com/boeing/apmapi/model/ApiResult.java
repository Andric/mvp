package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.common.interfaces.IElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * ApiResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class ApiResult {

  private IElement data;

  private Boolean succeeded;

  public ApiResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiResult(IElement data, Boolean succeeded) {
    this.data = data;
    this.succeeded = succeeded;
  }

  public ApiResult data(IElement data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public IElement getData() {
    return data;
  }

  public void setData(IElement data) {
    this.data = data;
  }

  public ApiResult succeeded(Boolean succeeded) {
    this.succeeded = succeeded;
    return this;
  }

  /**
   * Get succeeded
   * @return succeeded
  */
  @NotNull 
  @Schema(name = "succeeded", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("succeeded")
  public Boolean getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResult apiResult = (ApiResult) o;
    return Objects.equals(this.data, apiResult.data) &&
        Objects.equals(this.succeeded, apiResult.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, succeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResult {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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

