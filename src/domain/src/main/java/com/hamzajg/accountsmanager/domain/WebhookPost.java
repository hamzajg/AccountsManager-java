package com.hamzajg.accountsmanager.domain;

import java.time.LocalDateTime;

public class WebhookPost {
    private int id;
    private String URL;
    private String sender;
    private String body;
    private LocalDateTime postDateTime;

    public int getId() {
        return id;
    }

    public String getURL() {
        return URL;
    }

    public String getSender() {
        return sender;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getPostDateTime() {
        return postDateTime;
    }
}
