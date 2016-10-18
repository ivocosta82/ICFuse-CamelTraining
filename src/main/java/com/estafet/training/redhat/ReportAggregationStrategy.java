package com.estafet.training.redhat;

import com.estafet.training.redhat.models.IbanSingleReportEntity;
import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

/**
 * Created by Ivo on 18/10/2016.
 */
public class ReportAggregationStrategy implements AggregationStrategy {
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        Object newBody = newExchange.getIn().getBody();
        if(newBody instanceof IbanSingleReportEntity) {
            Object body = oldExchange.getIn().getBody();
            if(body == null) {

            } else {

            }
         //   if (body instanceof)
        }
        return null;
    }
}
