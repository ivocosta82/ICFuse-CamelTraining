package com.estafet.training.redhat.api;

import com.estafet.training.redhat.models.Account;

/**
 * Created by Ivo on 24/10/2016.
 */
public interface AccountServiceApi {
    Account getAccountByIban(String iban);
}
