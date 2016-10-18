package com.estafet.training.redhat;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by Ivo on 05/10/2016.
 */
public class HelloProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        exchange.getOut().setBody(exchange.getIn().getBody());
    }
}
