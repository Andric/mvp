package com.boeing.apmapi.common.Utils;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Name of the node type - primary label/DTO type name. for unknown or mixed
 * list items use GenericNode
 */
public enum ApiDataTypes {
  
  /*
FunctionalArea	is_active	Boolean
FunctionalArea	nodeId	String
FunctionalArea	apmId	String
FunctionalArea	sort	Long
FunctionalArea	title	String
FunctionalGroup	is_active	Boolean
FunctionalGroup	nodeId	String
FunctionalGroup	apmId	String
FunctionalGroup	sort	Long
FunctionalGroup	title	String
Function	is_active	Boolean
Function	nodeId	String
Function	apmId	String
Function	sort	Long
Function	title	String
Function	desc	String
Consultant,User	is_active	Boolean
Consultant,User	nodeId	String
Consultant,User	createDate	String
Consultant,User	title	String
Consultant,User	firstName	String
Consultant,User	lastName	String
Task	is_active	Boolean
Task	nodeId	String
Task	sort	Long
Task	title	String
TagTool	name	String
TagSystem	name	String
TagMisc	name	String
NoteType	name	String
wsNote	is_active	Boolean
wsNote	nodeId	String
Note	is_active	Boolean
Note	nodeId	String
Comment	CreatedDate	String
Comment	is_active	Boolean
Comment	title	String
Comment	text	String
Client	name	String
Client	boeingApmVersion	String
Client	createBy	String
Client	is_active	Boolean
Client	nodeId	String
Client	createDate	String
EngagementVersion	name	String
EngagementVersion	createBy	String
EngagementVersion	is_active	Boolean
EngagementVersion	nodeId	String
EngagementVersion	createDate	String
EngagementVersion	engagementVersion	Long
wsNoteState	is_active	Boolean
wsNoteState	nodeId	String
wsNoteState	raisedBy	String
wsNoteState	editBy	String
wsNoteState	text	String
wsNoteState	assigTo	String
fncState	is_active	Boolean
fncState	nodeId	String
fncState	apmId	String
fncState	prtFlag	Long
fncState	editBy	String
fncState	sort	Long
fncState	title	String
fncState	desc	String
taskState	is_active	Boolean
taskState	nodeId	String
taskState	editBy	String
taskState	sort	Long
taskState	title	String
noteState	is_active	Boolean
noteState	nodeId	String
noteState	editBy	String
noteState	text	String
faState	is_active	Boolean
faState	nodeId	String
faState	apmId	String
faState	editBy	String
faState	sort	Long
faState	title	String
fgState	is_active	Boolean
fgState	nodeId	String
fgState	apmId	String
fgState	editBy	String
fgState	sort	Long
fgState	title	String
SaveVersion	name	String
SaveVersion	createBy	String
SaveVersion	is_active	Boolean
SaveVersion	nodeId	String
SaveVersion	createDate	String
SaveVersion	saveVersion	Long
   */
  CVV("Client"),
  EVV("EngagementVersion"),
  FNA("FunctionalArea"),
  FNG("FunctionalGroup"),
  FNC("Function"),
  TKK("Task"),
  NTT("Note"),
  COM("Comment"),
  TGT("TagTool"),
  TGS("TagSystem"),
  TGM("TagMisc"),
  USR("User"),
  CNS("Consultant"),
  GNN("GenericNode"),
  GRAPH("Graph"),
  NODELIST("NodeList"),
  EMPTY("Empty"),
  ERROR("Error"),
  RELATIONSHIP("Relationship"),
  RELATIONSHIP_LIST("RelationshipList");

  private String value;

  ApiDataTypes(String value) {
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
  public static ApiDataTypes fromValue(String value) {
    for (ApiDataTypes b : ApiDataTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
