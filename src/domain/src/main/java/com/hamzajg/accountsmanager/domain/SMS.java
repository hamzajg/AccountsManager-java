package com.hamzajg.accountsmanager.domain;

import java.time.LocalDateTime;

public class SMS {
    private int id;
    private String sendTo;
    private String sender;
    private String message;
    private LocalDateTime sentDateTime;
    private LocalDateTime deliveredDateTime;

    public int getId() {
        return id;
    }

    public String getSendTo() {
        return sendTo;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getSentDateTime() {
        return sentDateTime;
    }

    public LocalDateTime getDeliveredDateTime() {
        return deliveredDateTime;
    }
}
