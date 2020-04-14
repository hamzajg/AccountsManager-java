package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class Expense {
    private int id;
    private String payeeName;
    private int customerId;
    private int supplierId;
    private int employeeId;
    private LocalDate paymentDate;
    private PaymentMethod paymentMethod;
    private int bankAccountId;
    private String reference;
    private String notes;

    public int getId() {
        return id;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public int getBankAccountId() {
        return bankAccountId;
    }

    public String getReference() {
        return reference;
    }

    public String getNotes() {
        return notes;
    }
}
