package com.hamzajg.accountsmanager.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Equipment {
    private int id;
    private int employeeId;
    private LocalDateTime loanStartDateTime;
    private LocalDateTime loanEndDateTime;
    private String reference;
    private String name;
    private LocalDate expectedReturnDate;

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public LocalDateTime getLoanStartDateTime() {
        return loanStartDateTime;
    }

    public LocalDateTime getLoanEndDateTime() {
        return loanEndDateTime;
    }

    public String getReference() {
        return reference;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpectedReturnDate() {
        return expectedReturnDate;
    }
}

