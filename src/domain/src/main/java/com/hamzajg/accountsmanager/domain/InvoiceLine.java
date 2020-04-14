package com.hamzajg.accountsmanager.domain;

public class InvoiceLine {
    private int id;
    private int invoiceId;
    private Invoice invoice;
    private ServiceType service;
    private double quantity;
    private double rate;
    private double VAT;

    public int getId() {
        return id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public Invoice getInvoice() {
        return invoice;
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
