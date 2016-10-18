package com.estafet.training.redhat.models;

import java.util.List;

/**
 * Created by Ivo on 13/10/2016.
 */
public class AccountsWrapper {
    private List<IbanSingleReportEntity> accounts;

    public AccountsWrapper() {

    }

    public List<IbanSingleReportEntity> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<IbanSingleReportEntity> accounts) {
        this.accounts = accounts;
    }
}
