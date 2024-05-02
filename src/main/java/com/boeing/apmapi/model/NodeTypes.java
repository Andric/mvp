package com.boeing.apmapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Name of the node type - primary label/DTO type name. for unknown or mixed list items use GenericNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public enum NodeTypes {
  
  CVV("CVV"),
  
  EVV("EVV"),
  
  FNA("FNA"),
  
  FNG("FNG"),
  
  FNC("FNC"),
  
  TKK("TKK"),
  
  NTT("NTT"),
  
  COM("COM"),
  
  TGT("TGT"),
  
  TGS("TGS"),
  
  TGM("TGM"),
  
  UNK("UNK"),
  
  EMPTY("Empty"),
  
  ERROR("Error"),
  
  GRAPH("Graph"),
  
  NODELIST("NodeList");

  private String value;

  NodeTypes(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NodeTypes fromValue(String value) {
    for (NodeTypes b : NodeTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

