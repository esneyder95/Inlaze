package com.test.inlaze.Definitions;

import com.test.inlaze.Steps.IniciarSesionSteps;
import com.test.inlaze.Steps.RegistarUsuarioSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class RegistroUsuarioDefinitions extends PageObject {

    RegistarUsuarioSteps registarUsuarioSteps = new RegistarUsuarioSteps();
    IniciarSesionSteps iniciarSesionSteps = new IniciarSesionSteps();
    @When("Ingreso datos de registro")
    public void ingresardatosregistro(){
        registarUsuarioSteps.registrardatos();
    }

    @Then("Valido registro")
    public void validar_registro(){
        iniciarSesionSteps.validamensaje();
    }

}
