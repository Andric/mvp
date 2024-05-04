package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.Utils.ApiUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * A discrete value object from the database with base required values
 */
public class Node {

  protected NodeTypes typeName = NodeTypes.UNK;
  protected String dbId;
  protected String nodeId;

  @Valid
  protected List<String> labels = new ArrayList<>();

  public Node() {
    super();
  }

  public Node(org.neo4j.driver.types.Node neo4jNode) {
    super();
    this.dbId = neo4jNode.elementId();
    this.nodeId = neo4jNode.get("nodeId").toString();
    neo4jNode.labels().forEach(labels::add);
  }

  /**
   * Constructor with only required parameters
   */
  public Node(NodeTypes typeName, String nodeId, List<String> labels) {
    this.typeName = typeName;
    this.nodeId = nodeId;
    this.labels = labels;
  }

  /**
   * Get typeName
   * 
   * @return typeName
   */
  @NotNull
  @Valid
  @Schema(name = "typeName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeName")
  public NodeTypes getTypeName() {
    return this.typeName;
  }

  public void setTypeName(NodeTypes typeName) {
    this.typeName = typeName;
  }

  /**
   * db system id for the node
   * 
   * @return dbId
   */
  @Schema(name = "dbId", accessMode = Schema.AccessMode.READ_ONLY, description = "db system id for the node", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dbId")
  public String getDbId() {
    return dbId;
  }


  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter
   * alpha code matches a node type enum
   * 
   * @return nodeId
   */
  @Pattern(regexp = ApiUtil.NODE_ID_REGEX)
  @Schema(name = "nodeId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nodeId")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  /**
   * list of labels for the node
   * 
   * @return labels
   */
  @NotNull
  @Schema(name = "labels", description = "list of labels for the node", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("labels")
  public List<String> getLabels() {
    return this.labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.typeName, node.typeName) &&
        Objects.equals(this.dbId, node.dbId) &&
        Objects.equals(this.nodeId, node.nodeId) &&
        Objects.equals(this.labels, node.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, dbId, nodeId, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    sb.append(getPropertiesString());
    sb.append("}");
    return sb.toString();
  }

  protected String getPropertiesString(){
    StringBuilder sb = new StringBuilder();
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
