package com.hamzajg.accountsmanager.domain;

public class ExpenseLine {
    private int id;
    private int expenseId;
    private ServiceType service;
    private String description;
    private double amount;
    private double VAT;

    public int getId() {
        return id;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public ServiceType getService() {
        return service;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public double getVAT() {
        return VAT;
    }
}
