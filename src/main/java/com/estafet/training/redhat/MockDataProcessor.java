package com.estafet.training.redhat;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ivo on 18/10/2016.
 */
public class MockDataProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("balance", 100.00);
        map.put("currency", "BGN");
        map.put("name", "Ivan Miltenov");

        exchange.getOut().setBody(map);
    }
}
