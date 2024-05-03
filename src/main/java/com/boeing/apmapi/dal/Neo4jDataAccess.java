package com.boeing.apmapi.dal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Session;


@Component
public class Neo4jDataAccess implements IDataAccess{

    private Driver driver;
   
    protected Neo4jDataAccess( @Autowired Environment env){
       String uri = env.getProperty("spring.neo4j.uri");
       String username = env.getProperty("spring.neo4j.authentication.username");
         String password = env.getProperty("spring.neo4j.authentication.password");
        try{
            this.driver = GraphDatabase.driver(uri, AuthTokens.basic(username, password));
            this.driver.verifyConnectivity();
        } catch (Exception e) {
            // Exception handling
            this.driver = null;
        }
    }

    public Session getReadSession(){
        return this.driver.session();
    }
    public Session getReadAsyncSession(){
        return this.driver.session();
    }
    public Session getWriteSession(){
        return this.driver.session();
    }
    public Session getWriteAsyncSession(){
        return this.driver.session();
    }
}