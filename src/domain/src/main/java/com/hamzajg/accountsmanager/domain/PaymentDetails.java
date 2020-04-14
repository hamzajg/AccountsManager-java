package com.hamzajg.accountsmanager.domain;

public class PaymentDetails {
    private int id;
    private int accountId;
    private String accountNo;
    private String sortCode;

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getSortCode() {
        return sortCode;
    }
}
