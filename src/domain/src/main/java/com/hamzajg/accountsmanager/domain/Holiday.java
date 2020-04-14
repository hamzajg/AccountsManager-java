package com.hamzajg.accountsmanager.domain;

import java.time.LocalDateTime;

public class Holiday {
    private int id;
    private int employeeId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private boolean onCall;
    private int onCallRateMultiplier;
    private boolean paid;

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public boolean isOnCall() {
        return onCall;
    }

    public int getOnCallRateMultiplier() {
        return onCallRateMultiplier;
    }

    public boolean isPaid() {
        return paid;
    }
}
