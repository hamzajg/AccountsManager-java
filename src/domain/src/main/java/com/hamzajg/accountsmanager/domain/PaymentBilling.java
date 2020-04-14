package com.hamzajg.accountsmanager.domain;

public class PaymentBilling {
    private int id;
    private int customerId;
    private Customer customer;
    private PaymentMethod preferredMethod;
    private String terms;
    private double openingBalance;

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public PaymentMethod getPreferredMethod() {
        return preferredMethod;
    }

    public String getTerms() {
        return terms;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }
}
