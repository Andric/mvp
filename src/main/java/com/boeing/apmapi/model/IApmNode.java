package com.boeing.apmapi.model;

import java.time.OffsetDateTime;
import java.util.List;

public interface IApmNode extends IDbElement {
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