package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class SalesReceipt {
    private int id;
    private int invoiceId;
    private int bankAccountId;
    private int customerId;
    private LocalDate salesReceiptDate;
    private PaymentMethod paymentMethod;
    private String referenceNo;
    private String message;

    public int getId() {
        return id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public int getBankAccountId() {
        return bankAccountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDate getSalesReceiptDate() {
        return salesReceiptDate;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public String getMessage() {
        return message;
    }
}
