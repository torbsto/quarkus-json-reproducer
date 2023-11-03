package com.bakdata.reproducer;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.time.OffsetDateTime;

@Path("/reproducer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReproducerResource {

    @GET
    @Path("custom")
    public CustomSerializerDto customDto() {
        return new CustomSerializerDto("Custom", OffsetDateTime.now());
    }

    @GET
    @Path("default")
    public DefaultDto defaultDto() {
        return new DefaultDto("Default", OffsetDateTime.now());
    }

}
