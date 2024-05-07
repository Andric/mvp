package com.boeing.apmapi.model;

import org.neo4j.driver.types.Node;

import com.boeing.apmapi.common.Utils.ApiDataTypes;
import com.boeing.apmapi.common.interfaces.IUserNode;

public class UserNode extends BaseNode implements IUserNode {

    protected String firstName;
    protected String lastName;
    protected String title;


    public UserNode(Node node) {
        super(node);
        this.firstName = node.get("firstName").asString();
        this.lastName = node.get("lastName").asString();
        this.title = node.get("title").asString();
        
    }

    @Override
    public String getDbId() {
        return dbId;
    }

    @Override
    public ApiDataTypes getApiDataType() {
        return elementType;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getTitle() {
        return title;
    }

}
