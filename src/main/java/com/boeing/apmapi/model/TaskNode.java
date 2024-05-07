package com.boeing.apmapi.model;
import org.neo4j.driver.types.Node;

import com.boeing.apmapi.common.Utils.ApiDataTypes;

public class TaskNode extends NoteNode {

  protected ApiDataTypes elementType = ApiDataTypes.TKK;

   public TaskNode(Node node) {
    super(node);
  }

 
}

