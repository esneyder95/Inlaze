package com.test.inlaze.Definitions;

import com.test.inlaze.Steps.CerrarSesionSteps;
import com.test.inlaze.Steps.IniciarSesionSteps;
import com.test.inlaze.Utilis.GenerarReporte;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class CerrarSesionDefinitions extends PageObject {

    GenerarReporte generarReporte = new GenerarReporte();
    CerrarSesionSteps cerrarSesionSteps = new CerrarSesionSteps();
    IniciarSesionSteps iniciarSesionSteps = new IniciarSesionSteps();

    @When("Inicio sesion {} {}")
    public void inciarsesion(String correo, String password){
        iniciarSesionSteps.iniciarsesion_usuario(correo,password);
        generarReporte.TomarPantallazo();
    }

    @Then("Cierro Sesion")
    public void cerrarsesion(){
        cerrarSesionSteps.cerrarsesion();
    }

}
