package com.estafet.training.redhat;

import com.estafet.training.redhat.api.AccountServiceApi;
import com.estafet.training.redhat.models.Account;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ivo on 18/10/2016.
 */
public class MockDataProcessor implements Processor {

    private AccountServiceApi accountEnricherService;

    public void process(Exchange exchange) throws Exception {

        Account account = accountEnricherService.getAccountByIban("123");

        exchange.getOut().setBody(account);
    }

    public void setAccountEnricherService(AccountServiceApi accountEnricherService) {
        this.accountEnricherService = accountEnricherService;
    }
}
