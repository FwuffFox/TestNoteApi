package com.fwufffox.testnoteapi;

import java.util.Date;

public record Note(Number id, String username, String text, Date date) {
    public Note(Number id, String username, String text) {
        this(id, username, text, new Date());
    }
}
