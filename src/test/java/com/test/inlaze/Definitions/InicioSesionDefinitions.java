package com.test.inlaze.Definitions;

import com.test.inlaze.Steps.IniciarSesionSteps;
import com.test.inlaze.Utilis.GenerarReporte;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class InicioSesionDefinitions extends PageObject {
    GenerarReporte generarReporte = new GenerarReporte();
    IniciarSesionSteps iniciarSesionSteps = new IniciarSesionSteps();

    @Given("Ingreso a la pagina de inlaze")
    public void ingresopagina(){
        iniciarSesionSteps.abrirpaginainlaze();
        generarReporte.TomarPantallazo();
    }

    @When("Ingreso datos de usuario {} {}")
    public void ingresardatos(String correo, String password){
        iniciarSesionSteps.iniciarsesion_usuario(correo,password);
        generarReporte.TomarPantallazo();
    }

    @Then("Validar inicio de sesion {}")
    public void validarsesion(String nombre){
        iniciarSesionSteps.validarnombre(nombre);
    }

    @Then("Validar no ingreso a la pagina")
    public void validarsesion(){
        iniciarSesionSteps.validamensaje();
    }

}
