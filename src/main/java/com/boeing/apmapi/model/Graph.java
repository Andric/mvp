package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.common.Utils.ApiDataTypes;
import com.boeing.apmapi.common.interfaces.IElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * Graph
 */

public class Graph implements IElement {

  private ApiDataTypes elementType = ApiDataTypes.GRAPH;

  private NodeList nodes;

  private RelationshipList relationships;

  public Graph() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Graph(NodeList nodes, RelationshipList relationships) {
    this.nodes = nodes;
    this.relationships = relationships;
  }

  /**
   * Name of the graph type
   * @return elementType
  */
  @NotNull 
  @Schema(name = "elementType", description = "Name of the graph type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elementType")
  public ApiDataTypes getApiDataType() {
    return elementType;
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
    return Objects.equals(this.elementType, graph.elementType) &&
        Objects.equals(this.nodes, graph.nodes) &&
        Objects.equals(this.relationships, graph.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType, nodes, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Graph {\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
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

