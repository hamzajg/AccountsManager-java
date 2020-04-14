package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class DelayedCharge {
    private int id;
    private int invoiceId;
    private int customerId;
    private LocalDate delayedChargeDate;
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

    public LocalDate getDelayedChargeDate() {
        return delayedChargeDate;
    }

    public String getMessage() {
        return message;
    }
}
