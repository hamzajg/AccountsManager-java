package com.hamzajg.accountsmanager.domain;

import java.time.LocalDateTime;

public class Training {
    private int id;
    private int employeeId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String description;
    private String name;
    private boolean certification;
    private String certificationName;

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

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean isCertification() {
        return certification;
    }

    public String getCertificationName() {
        return certificationName;
    }
}
