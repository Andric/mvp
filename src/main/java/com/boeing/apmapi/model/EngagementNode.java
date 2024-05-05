package com.boeing.apmapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.driver.types.Node;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

public class EngagementNode extends ClientNode {

  protected ApiElementEnum elementType = ApiElementEnum.EVV;

  protected Integer engagementVersion;

  protected String boeingApmVersion;

  protected boolean isCurrent = true;

  public EngagementNode(Node node) {  
    super(node);
  }

  /**
   * Get engagementVersion
   * @return engagementVersion
  */
  @NotNull 
  @Schema(name = "engagementVersion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("engagementVersion")
  public Integer getEngagementVersion() {
    return engagementVersion;
  }

  public void setEngagementVersion(Integer engagementVersion) {
    this.engagementVersion = engagementVersion;
  }

  /**
   * Get boeingApmVersion
   * @return boeingApmVersion
  */
  @NotNull 
  @Schema(name = "boeingApmVersion", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("boeingApmVersion")
  public String getBoeingApmVersion() {
    return boeingApmVersion;
  }

  public void setBoeingApmVersion(String boeingApmVersion) {
    this.boeingApmVersion = boeingApmVersion;
  }


  /**
   * Get isCurrent
   * @return isCurrent
  */
  @NotNull 
  @Schema(name = "isCurrent", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isCurrent")
  public Boolean getIsCurrent() {
    return isCurrent;
  }

  public void setIsCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if(!super.equals(o)) {
      return false;
    }
    EngagementNode engagementNode = (EngagementNode) o;
    return Objects.equals(this.engagementVersion, engagementNode.engagementVersion) &&
        Objects.equals(this.boeingApmVersion, engagementNode.boeingApmVersion) &&
        Objects.equals(this.isCurrent, engagementNode.isCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType, engagementVersion, boeingApmVersion, createDate, createBy, isCurrent, dbId, nodeId, labels);
  }

  @Override
  public String getPropertiesString() {
    StringBuilder sb = new StringBuilder();
    sb.append("    engagementVersion: ").append(toIndentedString(engagementVersion)).append("\n");
    sb.append("    boeingApmVersion: ").append(toIndentedString(boeingApmVersion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

}

