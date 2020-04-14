package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;
import java.util.Collection;

public class Invoice {
    private int id;
    private int customerId;
    private Customer customer;
    private LocalDate invoiceDate;
    private LocalDate dueDate;
    private String message;
    private Collection<InvoiceLine> invoiceLines;

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getMessage() {
        return message;
    }

    public Collection<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }
}
