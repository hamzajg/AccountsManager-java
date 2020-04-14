package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class CreditNote {
    private int id;
    private int invoiceId;
    private int customer;
    private LocalDate creditNoteDate;
    private String message;

    public int getId() {
        return id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public int getCustomer() {
        return customer;
    }

    public LocalDate getCreditNoteDate() {
        return creditNoteDate;
    }

    public String getMessage() {
        return message;
    }
}
