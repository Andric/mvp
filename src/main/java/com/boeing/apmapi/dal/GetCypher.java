package com.boeing.apmapi.dal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Record;
import org.neo4j.driver.Values;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.boeing.apmapi.dal.IDataAccess;

import com.boeing.apmapi.model.Node;

@Service
public class GetCypher extends BaseCypher {
   
    public GetCypher(@Autowired IDataAccess graphAccess) {
        super(graphAccess);
    }
    @SuppressWarnings("unchecked")
    public List<Node> getNodes(String label){
        List<Node> nodes = new ArrayList<Node>();
        try(Session session = this.session.getReadSession()){
            Result result = session.run("MATCH (n:$label) WHERE RETURN n", Values.parameters("label", label));
            while(result.hasNext()){
                Record record = result.next();
                Node node = new Node();
                Map<String, Object> extraProperties = new HashMap<String, Object>();
                record.asMap().forEach((k, v) -> {
                    switch (k) {
                        case "dbId":
                            break;
                        case "nodeId":
                            break;
                        case "labels":
                            List<String> labels = new ArrayList<String>();
                            ((List<String>) v).forEach(l -> labels.add(l));
                            node.labels(labels);
                            break;
                        default:
                            extraProperties.put(k, v);
                            break;
                    }
                    node.putAdditionalProperty(k, v);
                });
                nodes.add(node);
            }
        }
        return nodes;
    }
}
