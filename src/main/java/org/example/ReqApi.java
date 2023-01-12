package org.example;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ReqApi {
    public static Response response;
    @Given("uma req para {word} em httpBin")
    public static void umaReqParaGetEmHttpBin(String path) {
        String json = HttpBin(path);
        System.out.println(json);
    }
    public static String HttpBin(String path) {
        response = given()
                .baseUri("http://httpbin.org/")
                .when()
                .get(path);
        return response.getBody().asString();
    }
}
