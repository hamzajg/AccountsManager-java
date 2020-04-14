package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class Subscription {
    private int id;
    private int accountId;
    private LocalDate startDate;
    private LocalDate endDate;
    private Product productSubscription;

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Product getProductSubscription() {
        return productSubscription;
    }
}
