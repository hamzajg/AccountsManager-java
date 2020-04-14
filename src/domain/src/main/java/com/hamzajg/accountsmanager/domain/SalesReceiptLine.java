package com.hamzajg.accountsmanager.domain;

public class SalesReceiptLine {
    private int id;
    private int salesReceiptId;
    private SalesReceipt salesReceipt;
    private ServiceType service;
    private double quantity;
    private double rate;
    private double VAT;

    public int getId() {
        return id;
    }

    public int getSalesReceiptId() {
        return salesReceiptId;
    }

    public SalesReceipt getSalesReceipt() {
        return salesReceipt;
    }

    public ServiceType getService() {
        return service;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getRate() {
        return rate;
    }

    public double getVAT() {
        return VAT;
    }
}
