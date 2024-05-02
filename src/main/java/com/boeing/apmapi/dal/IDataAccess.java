package com.boeing.apmapi.dal;

import org.neo4j.driver.Session;

public interface IDataAccess {
    public Session getReadSession();
    public Session getReadAsyncSession();
    public Session getWriteSession();
    public Session getWriteAsyncSession();
}
