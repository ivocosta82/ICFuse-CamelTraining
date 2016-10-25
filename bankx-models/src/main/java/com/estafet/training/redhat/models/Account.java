package com.estafet.training.redhat.models;

import java.io.Serializable;

/**
 * Created by Ivo on 06/10/2016.
 */
public class Account implements Serializable {
    private String iban;
    private Double balance;
    private String currency;
    private String name;

    public Account() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return iban != null ? iban.equals(account.iban) : account.iban == null;

    }

    @Override
    public int hashCode() {
        return iban != null ? iban.hashCode() : 0;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
