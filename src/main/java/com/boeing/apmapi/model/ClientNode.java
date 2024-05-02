package com.boeing.apmapi.model;

import java.net.URI;
import java.util.Objects;
import com.boeing.apmapi.model.NodeTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * ClientNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-02T16:46:26.629395600-06:00[America/Denver]", comments = "Generator version: 7.5.0")
public class ClientNode implements Payload {

  private String typeName = "CVV";

  private String name;

  private String dbId;

  private String nodeId;

  @Valid
  private List<String> labels = new ArrayList<>();

  public ClientNode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClientNode(String typeName, String name, String nodeId, List<String> labels) {
    this.typeName = typeName;
    this.name = name;
    this.nodeId = nodeId;
    this.labels = labels;
  }

  public ClientNode typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Get typeName
   * @return typeName
  */
  @NotNull 
  @Schema(name = "typeName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeName")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public ClientNode name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientNode dbId(String dbId) {
    this.dbId = dbId;
    return this;
  }

  /**
   * db system id for the node
   * @return dbId
  */
  
  @Schema(name = "dbId", accessMode = Schema.AccessMode.READ_ONLY, description = "db system id for the node", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dbId")
  public String getDbId() {
    return dbId;
  }

  public void setDbId(String dbId) {
    this.dbId = dbId;
  }

  public ClientNode nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum
   * @return nodeId
  */
  @Pattern(regexp = "\"^'[0-9]+\\.[A-Z]{3}\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.*[0-9]*\" ") 
  @Schema(name = "nodeId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nodeId")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public ClientNode labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public ClientNode addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * list of labels for the node
   * @return labels
  */
  @NotNull 
  @Schema(name = "labels", description = "list of labels for the node", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("labels")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public ClientNode putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientNode clientNode = (ClientNode) o;
    return Objects.equals(this.typeName, clientNode.typeName) &&
        Objects.equals(this.name, clientNode.name) &&
        Objects.equals(this.dbId, clientNode.dbId) &&
        Objects.equals(this.nodeId, clientNode.nodeId) &&
        Objects.equals(this.labels, clientNode.labels) &&
    Objects.equals(this.additionalProperties, clientNode.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeName, name, dbId, nodeId, labels, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientNode {\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
