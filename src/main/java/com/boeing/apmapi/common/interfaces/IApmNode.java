package com.boeing.apmapi.common.interfaces;

import java.time.OffsetDateTime;

public interface IApmNode extends INode {
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
    Boolean getIsActive();

}