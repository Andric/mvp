package com.boeing.apmapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.annotation.Generated;

@JsonIgnoreProperties(
  value = "typeName", // ignore manually set typeName, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the typeName to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "typeName", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ClientNode.class, name = "CVV"),
  @JsonSubTypes.Type(value = EngagementNode.class, name = "EVV"),
  @JsonSubTypes.Type(value = Empty.class, name = "Empty"),
  @JsonSubTypes.Type(value = Error.class, name = "Error"),
  @JsonSubTypes.Type(value = ApmFnaNode.class, name = "FNA"),
  @JsonSubTypes.Type(value = ApmFncNode.class, name = "FNC"),
  @JsonSubTypes.Type(value = ApmFngNode.class, name = "FNG"),
  @JsonSubTypes.Type(value = Graph.class, name = "Graph"),
  @JsonSubTypes.Type(value = ApmNote.class, name = "NTT"),
  @JsonSubTypes.Type(value = NodeList.class, name = "NodeList"),
  @JsonSubTypes.Type(value = ApmTaskNode.class, name = "TKK"),
  @JsonSubTypes.Type(value = ApmFnaNode.class, name = "ApmFnaNode"),
  @JsonSubTypes.Type(value = ApmFncNode.class, name = "ApmFncNode"),
  @JsonSubTypes.Type(value = ApmFngNode.class, name = "ApmFngNode"),
  @JsonSubTypes.Type(value = ApmNote.class, name = "ApmNote"),
  @JsonSubTypes.Type(value = ApmTaskNode.class, name = "ApmTaskNode"),
  @JsonSubTypes.Type(value = ClientNode.class, name = "ClientNode"),
  @JsonSubTypes.Type(value = EngagementNode.class, name = "EngagementNode"),
  @JsonSubTypes.Type(value = SaveVersionNode.class, name = "SaveVersionNode")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public interface Payload {
    public String getTypeName();
}
