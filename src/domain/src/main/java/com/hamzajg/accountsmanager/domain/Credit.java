package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class Credit {
    private int id;
    private int invoiceId;
    private LocalDate creditDate;
    private double creditAmount;
    private Product productCredit;
    private String customerName;
    private String accountNo;
    private String sortCode;
    private boolean hasCreditAgreement;

    public int getId() {
        return id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public LocalDate getCreditDate() {
        return creditDate;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public Product getProductCredit() {
        return productCredit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getSortCode() {
        return sortCode;
    }

    public boolean isHasCreditAgreement() {
        return hasCreditAgreement;
    }
}
