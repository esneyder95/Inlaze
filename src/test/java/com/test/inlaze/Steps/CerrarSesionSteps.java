package com.test.inlaze.Steps;

import com.test.inlaze.PageObjects.BienvenidoInlazePage;
import net.serenitybdd.core.pages.PageObject;

public class CerrarSesionSteps extends PageObject {

    BienvenidoInlazePage bienvenidoInlazePage = new BienvenidoInlazePage();

    public void cerrarsesion(){
        bienvenidoInlazePage.cerrarsesion();
    }

}
