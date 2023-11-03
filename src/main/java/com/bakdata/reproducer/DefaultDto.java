package com.bakdata.reproducer;

import java.time.OffsetDateTime;

public class DefaultDto {

    private final String title;
    private final OffsetDateTime dateTime;

    public DefaultDto(final String title, final OffsetDateTime dateTime) {
        this.title = title;
        this.dateTime = dateTime;
    }

    public String getTitle() {
        return this.title;
    }

    public OffsetDateTime getDateTime() {
        return this.dateTime;
    }
}
