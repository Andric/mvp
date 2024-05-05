package com.boeing.apmapi.model;

import java.time.OffsetDateTime;
import java.util.List;

public interface IApmNode extends IDbElement {

    /**
     * Get elementType
     * 
     * @return elementType
     */
    ApiElementEnum getApiElementType();

    /**
     * db system id for the node
     * 
     * @return dbId
     */
    String getDbId();

    /**
     * used for identifiers of a node. Must match the pattern where the 3 letter
     * alpha code matches a node type enum
     * 
     * @return nodeId
     */
    String getNodeId();

    /**
     * list of labels for the node
     * 
     * @return labels
     */
    List<String> getLabels();

    /**
     * date the node was created
     * 
     * @return createDate
     */
    OffsetDateTime getCreateDate();

    /**
     * User nodeid. Must match the pattern
     * 
     * @return createBy
     */
    String getCreateBy();

    /**
     * if node is marked for deletion
     * 
     * @return isDeleted
     */
    Boolean getIsDeleted();

}