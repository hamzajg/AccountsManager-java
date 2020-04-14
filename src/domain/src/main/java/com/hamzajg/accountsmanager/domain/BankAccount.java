package com.hamzajg.accountsmanager.domain;

public class BankAccount {
    private int id;
    private int customerId;
    private String accountNo;
    private String sortCode;

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getSortCode() {
        return sortCode;
    }
}
