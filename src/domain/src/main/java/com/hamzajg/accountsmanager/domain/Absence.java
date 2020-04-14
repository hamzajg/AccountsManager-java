package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;

public class Absence {
    private int id;
    private int employeeId;
    private LocalDate startDateTime;
    private LocalDate endDateTime;
    private String description;
    private String notes;
    private boolean paid;

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public LocalDate getStartDateTime() {
        return startDateTime;
    }

    public LocalDate getEndDateTime() {
        return endDateTime;
    }

    public String getDescription() {
        return description;
    }

    public String getNotes() {
        return notes;
    }

    public boolean isPaid() {
        return paid;
    }
}

