package com.hamzajg.accountsmanager.domain;

public class Address {
    private int id;
    private int customerId;
    private String street;
    private String cityTown;
    private String county;
    private String postCode;
    private String country;

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getStreet() {
        return street;
    }

    public String getCityTown() {
        return cityTown;
    }

    public String getCounty() {
        return county;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }
}
