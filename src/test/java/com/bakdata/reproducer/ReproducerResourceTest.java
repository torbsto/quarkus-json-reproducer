package com.bakdata.reproducer;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ReproducerResourceTest {

    @Test
    public void defaultDtoTest() {
        final DefaultDto defaultDto = baseRequest()
                .get("reproducer/default")
                .then()
                .statusCode(200)
                .extract()
                .as(DefaultDto.class);
        assertThat(defaultDto.getTitle()).isNotNull();
        assertThat(defaultDto.getDateTime()).isNotNull();
    }


    @Test
    public void customSerializerDtoTest() {
        baseRequest()
                .get("reproducer/custom")
                .then()
                .statusCode(500);
    }

    private static RequestSpecification baseRequest() {
        return given().when().log().everything().contentType(ContentType.JSON);
    }

}
