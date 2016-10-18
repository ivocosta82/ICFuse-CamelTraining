package com.estafet.training.redhat;

import com.estafet.training.redhat.models.IbanSingleReportEntity;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by Ivo on 18/10/2016.
 */
public class SingleIbanProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        String iban = exchange.getIn().getBody(String.class);

        IbanSingleReportEntity reportEntity = new IbanSingleReportEntity();
        reportEntity.setIban(iban);

        exchange.getIn().setBody(reportEntity);
    }
}
