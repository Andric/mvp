package com.boeing.apmapi.model;

import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

import com.boeing.apmapi.Utils.ApiUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A discrete value object from the database with base required values
 */
public abstract class BaseNode implements IApmNode{
  /**
   * db system id for the node. If null then node is not in the database
   */
  protected String dbId;
  @NotNull
  protected ApiElementEnum elementType;

  /**
   * used for identifiers of a node. Must match the pattern
   */
  @Pattern(regexp = ApiUtil.NODE_ID_REGEX)
  protected String nodeId;

  /**
   * list of labels for the node
   */
  // TODO - add validation for labels
  @NotEmpty
  protected List<String> labels;
  
  /**
   * date the node was created
   */
  @NotNull
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  protected OffsetDateTime createDate;

  /**
   * user who created the node - the nodeId of the user
   */
  @Pattern(regexp = ApiUtil.NODE_ID_REGEX)
  @NotNull
  protected String createBy;

  /**
   * if node is soft deleted
   */
  protected boolean isDeleted = false;

  /**
   * Constructor that instantiates from the database item
   *
   * @param neo4jNode the node from the database
   */
  public BaseNode(org.neo4j.driver.types.Node neo4jNode) {
    this.dbId = neo4jNode.elementId();
    this.nodeId = neo4jNode.get("nodeId").toString();
    List<String> tmpLabels = new ArrayList<String>();
    // get all labels for the node and assign - error if empty list
    neo4jNode.labels().forEach(tmpLabels::add);
    this.labels = tmpLabels;
    this.createDate = OffsetDateTime.parse(neo4jNode.get("createDate").asString());
    this.createBy = neo4jNode.get("createBy").asString();
    this.isDeleted = neo4jNode.get("isDeleted").asBoolean();
  }

  /**
   * Get elementType
   * 
   * @return elementType
   */
  @Override
  @NotNull
  @Valid
  @Schema(name = "elementType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elementType")
  public ApiElementEnum getApiElementType() {
    return this.elementType;
  }

  @NotNull
  public void setApiElementType(ApiElementEnum elementType) {
    this.elementType = elementType;
  }

  /**
   * db system id for the node
   * 
   * @return dbId
   */
  @Override
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
  @Override
  @Pattern(regexp = ApiUtil.NODE_ID_REGEX)
  @Schema(name = "nodeId", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nodeId")
  public String getNodeId() {
    return nodeId;
  }

  /**
   * list of labels for the node
   * 
   * @return labels
   */
  @Override
  @NotNull
  @Schema(name = "labels", description = "list of labels for the node", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("labels")
  public List<String> getLabels() {
    return this.labels;
  }

  /**
   * date the node was created
   * 
   * @return createDate
   */
  @Override
  @Valid
  @Schema(name = "createDate", description = "date the node was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  /**
   * used for identifiers of a node. Must match the pattern where the 3 letter
   * alpha code matches a node type enum
   * 
   * @return createBy
   */
  @Override
  @Pattern(regexp = ApiUtil.NODE_ID_REGEX)
  @Schema(name = "createBy", accessMode = Schema.AccessMode.READ_ONLY, example = "1.UNK.1.2.33.44444", description = "used for identifiers of a node. Must match the pattern where the 3 letter alpha code matches a node type enum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createBy")
  public String getCreateBy() {
    return createBy;
  }

  /**
   * if node is marked for deletion
   * 
   * @return isDeleted
   */

  @Override
  @Schema(name = "isDeleted", description = "if node is marked for deletion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDeleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseNode node = (BaseNode) o;
    return Objects.equals(this.elementType, node.elementType) &&
        Objects.equals(this.dbId, node.dbId) &&
        Objects.equals(this.nodeId, node.nodeId) &&
        Objects.equals(this.labels, node.labels);
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(elementType, dbId, nodeId, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ");
    sb.append(this.getClass().getName());
    sb.append(" {\n");
    sb.append(getPropertiesString());
    sb.append("}");
    return sb.toString();
  }

  protected String getPropertiesString(){
    StringBuilder sb = new StringBuilder();
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  protected String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
