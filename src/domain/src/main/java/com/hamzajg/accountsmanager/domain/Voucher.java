package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class Voucher {
    private int id;
    private int accountId;
    private String voucherCode;
    private LocalDate appliedDate;
    private LocalDate expireDate;
    private double creditAmount;
    private Product productVoucher;

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public Product getProductVoucher() {
        return productVoucher;
    }
}
