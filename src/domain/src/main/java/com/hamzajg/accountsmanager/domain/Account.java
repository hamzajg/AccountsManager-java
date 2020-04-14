package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class Account {
    private int id;
    private String companyName;
    private String companyEmail;
    private String companySMSSender;
    private String newCustomerCRMWebhook;
    private int noOfUserLicences;
    private LocalDate renewalDate;

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public String getCompanySMSSender() {
        return companySMSSender;
    }

    public String getNewCustomerCRMWebhook() {
        return newCustomerCRMWebhook;
    }

    public int getNoOfUserLicences() {
        return noOfUserLicences;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }
}
