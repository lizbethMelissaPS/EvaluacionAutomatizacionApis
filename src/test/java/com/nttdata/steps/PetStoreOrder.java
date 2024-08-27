package com.nttdata.steps;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PetStoreOrder {

    private static String CREATE_ORDER = "https://petstore.swagger.io/v2/store/order";

    @Step("Crear order PetStore")

    public void crearOrder(String id, String petId, String quantity, String shipDate, String status, String complete) {
        SerenityRest.given()
                .contentType("application/json")
                .relaxedHTTPSValidation()
                .body("{\n" +
                        "  \"id\": \""+id+"\",\n" +
                        "  \"petId\": \""+petId+"\",\n" +
                        "  \"quantity\": \""+quantity+"\",\n" +
                        "  \"shipDate\": \""+shipDate+"\",\n" +
                        "  \"status\": \""+status+"\",\n" +
                        "  \"complete\": \""+complete+"\",\n" +
                        "}")
                .log().all()
                .post(CREATE_ORDER)
                .then()
                .log().all()
        ;
    }

    public void validarCodigoRespuesta(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }


}
