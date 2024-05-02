package com.boeing.apmapi.dal;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.driver.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.boeing.apmapi.dal.IDataAccess;

@Service
public class GetCypher extends BaseCypher {
   
    public GetCypher(@Autowired IDataAccess graphAccess) {
        super(graphAccess);
    }
    public List<Node> getNode(String nodeId){
        List<Node> nodes = new ArrayList<Node>();
        try(Session session = this.session.getReadSession()){
            Result result = session.run("MATCH (n) WHERE n.id = $id RETURN n", Values.parameters("id", nodeId));
            while(result.hasNext()){
                Record record = result.next();
                Node node = new Node();
                node.setId(record.get("n").get("id").asString());
                node.setName(record.get("n").get("name").asString());
                nodes.add(node);
            }
        }
        return nodes;
    }
}
