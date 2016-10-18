package com.estafet.training.redhat;

import com.estafet.training.redhat.models.IbanSingleReportEntity;
import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivo on 18/10/2016.
 */
public class ReportAggregationStrategy implements AggregationStrategy {
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        Object newBody = newExchange.getIn().getBody();
        if (newBody instanceof IbanSingleReportEntity) {

            List<IbanSingleReportEntity> aggregationResult;
            if (oldExchange == null) {
                aggregationResult = new ArrayList<IbanSingleReportEntity>();
                aggregationResult.add(newExchange.getIn().getBody(IbanSingleReportEntity.class));
                newExchange.getIn().setBody(aggregationResult);

                return newExchange;
            } else {
                aggregationResult = (List<IbanSingleReportEntity>) oldExchange.getIn().getBody();
                aggregationResult.add(newExchange.getIn().getBody(IbanSingleReportEntity.class));

                return oldExchange;
            }
        }

        return null;
    }
}
