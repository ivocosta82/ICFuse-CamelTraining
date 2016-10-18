package com.estafet.training.redhat;

import com.estafet.training.redhat.models.IbanSingleReportEntity;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.processor.aggregate.AggregationStrategy;

/**
 * Created by Ivo on 18/10/2016.
 */
public class ReportEnricher implements AggregationStrategy {
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        Message in = oldExchange.getIn();

        IbanSingleReportEntity reportEntity = in.getBody(IbanSingleReportEntity.class);

        reportEntity.setBalance(100.00);
        reportEntity.setCurrency("EUR");
        reportEntity.setName("Ivan Miltenov");

        in.setBody(reportEntity); //Not necessary but helps readeability

        return oldExchange;
    }
}
