package ru.netology;


import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class PostmanEchoTest {

    @Test
    void shouldReturnPostRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("ann")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("angn"))
                ;

    }


}
