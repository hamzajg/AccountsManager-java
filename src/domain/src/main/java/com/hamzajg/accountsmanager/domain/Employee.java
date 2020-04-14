package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class Employee {
    private int id;
    private int accountId;
    private String title;
    private String firstName;
    private String lastName;
    private String displayNameAs;
    private String address;
    private String notes;
    private String email;
    private String phone;
    private String mobile;
    private LocalDate DOB;

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

    public String getLastName() {
        return lastName;
    }

    public String getDisplayNameAs() {
        return displayNameAs;
    }

    public String getAddress() {
        return address;
    }

    public String getNotes() {
        return notes;
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

    public LocalDate getDOB() {
        return DOB;
    }
}
