package com.bakdata.reproducer;

import java.time.OffsetDateTime;

public record CustomSerializerDto(String title, OffsetDateTime dateTime) {
}
