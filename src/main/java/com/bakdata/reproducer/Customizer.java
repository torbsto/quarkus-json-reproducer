package com.bakdata.reproducer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.quarkus.jackson.ObjectMapperCustomizer;
import jakarta.inject.Singleton;

@Singleton
public class Customizer implements ObjectMapperCustomizer {
    @Override
    public void customize(final ObjectMapper objectMapper) {
        objectMapper.registerModule(new JavaTimeModule());
        final SimpleModule reproducer = new SimpleModule("reproducer");
        reproducer.addSerializer(new CustomSerializerDtoSerializer());
        objectMapper.registerModule(reproducer);
    }


}
