package com.estafet.training.redhat;

import com.estafet.training.redhat.models.Account;
import com.estafet.training.redhat.models.IbanSingleReportEntity;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import java.util.Map;

/**
 * Created by Ivo on 18/10/2016.
 */
public class ReportEnricher implements AggregationStrategy {
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        Message in = oldExchange.getIn();
        Message newMsg = newExchange.getIn();

        Account body = newMsg.getBody(Account.class);

        IbanSingleReportEntity reportEntity = in.getBody(IbanSingleReportEntity.class);

        reportEntity.setBalance(body.getBalance());
        reportEntity.setCurrency(body.getCurrency());
        reportEntity.setName(body.getName());

        in.setBody(reportEntity); //Not necessary but helps readeability

        return oldExchange;
    }
}
