package com.boeing.apmapi.common.interfaces;

public interface IRelationship extends IDbElement{
    /**
     * list of labels for the relationship (only 1 for relationships)
     * 
     * @return labels
     */
    String getLabel();
    /**
     * get the node id of the node the relationship is coming from
     * @return dbId
     */
    String getFrom();
    /**
     * get the node id of the node the relationship is going to
     * @return dbId
     */
    String getTo();

}
