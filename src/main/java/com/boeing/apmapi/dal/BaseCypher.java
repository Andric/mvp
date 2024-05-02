package com.boeing.apmapi.dal;

public class BaseCypher {
    protected IDataAccess session;
    protected BaseCypher(IDataAccess graphAccess){
        this.session = graphAccess;
    }
}
