package com.boeing.apmapi.common.interfaces;
import java.util.List;

public interface INode extends IDbElement{
    /**
     * get the database assigned Id for the node 
     * @return string id
     */
    public String getNodeId();
    
    /**
     * list of labels for the node
     * 
     * @return labels
     */
    List<String> getLabels();

}