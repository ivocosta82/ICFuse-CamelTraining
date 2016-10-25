package com.estafet.training.redhat.impl;

import com.estafet.training.redhat.api.AccountServiceApi;
import com.estafet.training.redhat.models.Account;

/**
 * Created by Ivo on 24/10/2016.
 */
public class AccountServiceImpl implements AccountServiceApi {
    public Account getAccountByIban(String iban) {
        Account acc = new Account();

        acc.setIban(iban);
        acc.setName("Ivan Miltenov");
        acc.setCurrency("EUR");
        acc.setBalance(100.00);

        return acc;
    }
}
