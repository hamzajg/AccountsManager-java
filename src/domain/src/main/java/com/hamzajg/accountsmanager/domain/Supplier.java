package com.hamzajg.accountsmanager.domain;

public class Supplier {
    private int id;
    private int accountId;
    private String contactName;
    private String company;
    private String email;
    private String phone;
    private String mobile;
    private String fax;
    private String webSite;

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getContactName() {
        return contactName;
    }

    public String getCompany() {
        return company;
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
}
