package com.hamzajg.accountsmanager.domain;

public class TaxInformation {
    private int id;
    private int employeeId;
    private String taxCode;
    private boolean VAT;
    private String VATRef;

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public boolean isVAT() {
        return VAT;
    }

    public String getVATRef() {
        return VATRef;
    }
}
