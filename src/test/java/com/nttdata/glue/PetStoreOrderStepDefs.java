package com.nttdata.glue;

import com.nttdata.steps.PetStoreOrder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PetStoreOrderStepDefs {

    @Steps
    PetStoreOrder crearOrderPetStore;

    @When("creo una orden con id {string}, petId {string}, quantity {string}, shipDate {string}, status {string}, complete {string}")
    public void creoUnaOrdenConIdPetIdQuantityShipDateStatusComplete(String id, String petId, String quantity, String shipDate, String status,String complete) {
        crearOrderPetStore.crearOrder(id, petId,quantity, shipDate, status, complete);
    }

    @Then("el código de estado de respuesta debe ser {int}")
    public void elCódigoDeEstadoDeRespuestaDebeSer(int statusCode) {
        crearOrderPetStore.validarCodigoRespuesta(statusCode);
    }



}
