package com.boeing.apmapi.model;

import java.util.Objects;

import com.boeing.apmapi.common.Utils.ApiDataTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * ApmNote
 */
public class NoteNode extends BaseNode {

  protected ApiDataTypes elementType = ApiDataTypes.NTT;
  protected String text;

  public NoteNode(org.neo4j.driver.types.Node node) {
    super(node);
  }

  /**
   * note for the node
   * @return text
  */
  @Schema(name = "text", description = "note for the node", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if( !super.equals(o) ){
      return false;
    }

    NoteNode apmNote = (NoteNode) o;
    return Objects.equals(this.text, apmNote.text) &&
        Objects.equals(this.createDate, apmNote.createDate) &&
        Objects.equals(this.createBy, apmNote.createBy);
       
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, createDate, createBy);
  }

  @Override
  protected String getPropertiesString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.getPropertiesString());
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    return sb.toString();
  }
}

