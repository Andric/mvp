package com.boeing.apmapi.dal;

import java.util.HashMap;
import java.util.Map;

import com.boeing.apmapi.model.NodeList;
import org.neo4j.driver.*;
import org.neo4j.driver.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.boeing.apmapi.model.BaseNode;

@Service
public class GetCypher extends BaseCypher {

    public GetCypher(@Autowired IDataAccess graphAccess) {
        super(graphAccess);
    }

    public NodeList getNodes(String label) {
        NodeList nodes = new NodeList();

        try (Session session = this.session.getReadSession()) {
            Map<String, Object> params = new HashMap<>();
            params.put("p1", label);
            try (var tx = session.beginTransaction()) {
                Result result = tx.run("MATCH (n) WHERE $p1 in labels(n) RETURN n", params);
                while (result.hasNext()) {
                    Record record = result.next();
                    var props = record.values();
                    for (Value v : props) {
                        nodes.addValuesItem(BaseNode.instantiateApmNode(v.asNode()));
                    }
                }
            }
        }
        return nodes;
    }
}
