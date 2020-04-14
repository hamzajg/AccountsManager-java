package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class Estimate {
    private int id;
    private int invoiceId;
    private int customerId;
    private LocalDate estimateDate;
    private LocalDate expirationDate;
    private String message;

    public int getId() {
        return id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDate getEstimateDate() {
        return estimateDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getMessage() {
        return message;
    }
}
