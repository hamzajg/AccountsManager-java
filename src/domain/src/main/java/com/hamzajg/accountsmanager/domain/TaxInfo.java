package com.hamzajg.accountsmanager.domain;

public class TaxInfo {
    private int id;
    private String taxRegNo;
    private String UTRNo;
    private int customerId;
    private Customer customer;

    public int getId() {
        return id;
    }

    public String getTaxRegNo() {
        return taxRegNo;
    }

    public String getUTRNo() {
        return UTRNo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Customer getCustomer() {
        return customer;
    }
}

