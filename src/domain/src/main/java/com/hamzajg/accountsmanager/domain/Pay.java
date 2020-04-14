package com.hamzajg.accountsmanager.domain;

import java.time.LocalDateTime;

public class Pay {
    private int id;
    private double hourlyRate;
    private int employeeId;
    private boolean defaultRate;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    public int getId() {
        return id;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public boolean isDefaultRate() {
        return defaultRate;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }
}
