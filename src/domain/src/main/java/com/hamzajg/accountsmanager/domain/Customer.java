package com.hamzajg.accountsmanager.domain;

public class Customer {
    private int id;
    private int accountId;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String company;
    private String displayNameAs;
    private String email;
    private String phone;
    private String mobile;
    private String fax;
    private String webSite;
    private boolean creditAgreement;

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getCompany() {
        return company;
    }

    public String getDisplayNameAs() {
        return displayNameAs;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getFax() {
        return fax;
    }

    public String getWebSite() {
        return webSite;
    }

    public boolean isCreditAgreement() {
        return creditAgreement;
    }
}

