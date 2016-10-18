package com.estafet.training.redhat.models;

import java.io.Serializable;

/**
 * Created by Ivo on 13/10/2016.
 */
public class IbanSingleReportEntity implements Serializable {
    private String iban;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IbanSingleReportEntity that = (IbanSingleReportEntity) o;

        return iban != null ? iban.equals(that.iban) : that.iban == null;

    }

    @Override
    public int hashCode() {
        return iban != null ? iban.hashCode() : 0;
    }

    private Double balance;
    private String currency;

    public IbanSingleReportEntity () {

    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
