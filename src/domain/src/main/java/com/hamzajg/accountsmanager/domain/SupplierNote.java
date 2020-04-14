package com.hamzajg.accountsmanager.domain;

public class SupplierNote {
    private int id;
    private String noteText;
    private int supplierId;

    public int getId() {
        return id;
    }

    public String getNoteText() {
        return noteText;
    }

    public int getSupplierId() {
        return supplierId;
    }
}
