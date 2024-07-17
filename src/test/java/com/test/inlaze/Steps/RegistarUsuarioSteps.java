package com.test.inlaze.Steps;

import com.test.inlaze.PageObjects.RegistroUsuarioPage;
import net.serenitybdd.core.pages.PageObject;

public class RegistarUsuarioSteps extends PageObject {

    RegistroUsuarioPage registroUsuarioPage = new RegistroUsuarioPage();

    public void registrardatos(){
        registroUsuarioPage.ingresardatosregistro();
    }

}
