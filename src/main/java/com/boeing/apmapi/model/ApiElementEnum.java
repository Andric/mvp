package com.boeing.apmapi.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Name of the node type - primary label/DTO type name. for unknown or mixed
 * list items use GenericNode
 */
public enum ApiElementEnum {
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
  NODELIST("NodeList"), 
  AMPNODE("AmpNode");

  private String value;

  ApiElementEnum(String value) {
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
  public static ApiElementEnum fromValue(String value) {
    for (ApiElementEnum b : ApiElementEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
