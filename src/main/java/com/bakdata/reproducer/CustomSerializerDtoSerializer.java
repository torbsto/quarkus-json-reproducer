package com.bakdata.reproducer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class CustomSerializerDtoSerializer extends StdSerializer<CustomSerializerDto> {

    protected CustomSerializerDtoSerializer() {
        super(CustomSerializerDto.class);
    }

    @Override
    public void serialize(final CustomSerializerDto value, final JsonGenerator gen, final SerializerProvider provider)
            throws IOException {
        gen.writeStartObject();
        gen.writeStringField("title", value.title());
        gen.writeObjectField("datetime", value.dateTime());
        gen.writeEndObject();
    }
}
