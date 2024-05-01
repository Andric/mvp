package com.boeing.apmapi.dal;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Session;
import org.neo4j.driver.async.AsyncSession;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;

@AutoConfiguration
@Component
public class neo4jaccess {
    private static final String uri = "bolt://localhost:7687";
    private static final String user = "neo4j";
    private static final String password = "password";

    public neo4jaccess(){
        Driver driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
        try(Session session = driver.session()) {
            // Code inside the try block
        } catch (Exception e) {
            // Exception handling
        }
    }

    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
        AsyncSession session = driver.session(AsyncSession.class);
        session.runAsync("MATCH (a:FunctionalArea) RETURN a.name AS name")
                .thenCompose(cursor -> cursor.listAsync(record -> record.get("name").asString()))
                .thenAccept(System.out::println)
                .exceptionally(error -> {
                    System.err.println("Error: " + error.getMessage());
                    return null;
                });
        session.closeAsync();
        driver.closeAsync();
    }
}