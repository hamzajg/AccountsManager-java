package com.hamzajg.accountsmanager.domain;

public class CreditNoteLine {
    private int id;
    private int creditNoteId;
    private ServiceType service;
    private double quantity;
    private double rate;
    private double VAT;

    public int getId() {
        return id;
    }

    public int getCreditNoteId() {
        return creditNoteId;
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
