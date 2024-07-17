package com.test.inlaze.Steps;

import com.test.inlaze.PageObjects.BienvenidoInlazePage;
import com.test.inlaze.PageObjects.InicioSesionPage;
import net.serenitybdd.core.pages.PageObject;

public class IniciarSesionSteps extends PageObject {

    InicioSesionPage inicioSesionPage = new InicioSesionPage();
    BienvenidoInlazePage bienvenidoInlazePage = new BienvenidoInlazePage();

    public void abrirpaginainlaze(){
        inicioSesionPage.abrirpaginainlaze();
    }

    public void iniciarsesion_usuario(String correo, String password){
        inicioSesionPage.iniciarsesion_usuario(correo,password);
    }

    public void validarnombre(String nombre){
        bienvenidoInlazePage.validarnombre(nombre);
    }

    public void validamensaje(){
        inicioSesionPage.validarmensaje();
    }

}
