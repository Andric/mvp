package com.boeing.apmapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import jakarta.annotation.Generated;

/**
 * Error
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class Error implements Payload {

  private String typeName = "Error";

  private ErrorStatus status;

  private String message;

  public Error() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Error(String typeName, ErrorStatus status, String message) {
    this.typeName = typeName;
    this.status = status;
    this.message = message;
  }

  public Error typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Name of the error type
   * @return typeName
  */
  @NotNull 
  @Schema(name = "typeName", description = "Name of the error type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeName")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Error status(ErrorStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public ErrorStatus getStatus() {
    return status;
  }

  public void setStatus(ErrorStatus status) {
    this.status = status;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * error message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "error message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.typeName, error.typeName) &&
        Objects.equals(this.status, error.status) &&
        Objects.equals(this.message, error.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, status, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

