package org.example;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Main {
    public static Response response;
    public static String HttpBin() {
        response = given()
                .baseUri("http://httpbin.org")
                .when()
                .get("/get");
        return response.getBody().asString();
    }
    public static void main(String[] args) {
        String json = HttpBin();
        System.out.println(json);
    }
}