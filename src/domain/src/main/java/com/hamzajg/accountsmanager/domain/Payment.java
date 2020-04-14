package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class Payment {
    private int id;
    private int invoiceId;
    private int customerId;
    private LocalDate paymentDate;
    private PaymentMethod paymentMethod;
    private String memo;
    private double amountReceived;

    public int getId() {
        return id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public String getMemo() {
        return memo;
    }

    public double getAmountReceived() {
        return amountReceived;
    }
}
