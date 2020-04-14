package com.hamzajg.accountsmanager.domain;

public class Note {
    private int id;
    private String noteText;
    private int customerId;

    public int getId() {
        return id;
    }

    public String getNoteText() {
        return noteText;
    }

    public int getCustomerId() {
        return customerId;
    }
}
