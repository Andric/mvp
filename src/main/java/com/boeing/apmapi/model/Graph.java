package com.boeing.apmapi.model;

import java.net.URI;
import java.util.Objects;
import com.boeing.apmapi.model.NodeList;
import com.boeing.apmapi.model.RelationshipList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Graph
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class Graph implements Payload {

  private String typeName = "Graph";

  private NodeList nodes;

  private RelationshipList relationships;

  public Graph() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Graph(String typeName, NodeList nodes, RelationshipList relationships) {
    this.typeName = typeName;
    this.nodes = nodes;
    this.relationships = relationships;
  }

  public Graph typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Name of the graph type
   * @return typeName
  */
  @NotNull 
  @Schema(name = "typeName", description = "Name of the graph type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeName")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Graph nodes(NodeList nodes) {
    this.nodes = nodes;
    return this;
  }

  /**
   * Get nodes
   * @return nodes
  */
  @NotNull @Valid 
  @Schema(name = "nodes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nodes")
  public NodeList getNodes() {
    return nodes;
  }

  public void setNodes(NodeList nodes) {
    this.nodes = nodes;
  }

  public Graph relationships(RelationshipList relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  */
  @NotNull @Valid 
  @Schema(name = "relationships", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relationships")
  public RelationshipList getRelationships() {
    return relationships;
  }

  public void setRelationships(RelationshipList relationships) {
    this.relationships = relationships;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Graph graph = (Graph) o;
    return Objects.equals(this.typeName, graph.typeName) &&
        Objects.equals(this.nodes, graph.nodes) &&
        Objects.equals(this.relationships, graph.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, nodes, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Graph {\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

