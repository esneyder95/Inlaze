package com.test.inlaze.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistroUsuarioPage extends PageObject {

    public By correo = By.id("email");
    public By registro = By.xpath("//a[@class='font-bold text-primary']");
    public By nombre = By.id("full-name");
    public By correoregistro = By.id("email");
    public By contraseña = By.xpath("//input[@id='password']");
    public By contraseña_check = By.xpath("//input[@id='confirm-password']");
    public By BtnRegistro = By.xpath("//button[@class='btn btn-primary']");
    WebDriverWait tiempo = new WebDriverWait(getDriver(),30);

    public void ingresardatosregistro(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(correo));
        }catch (Exception e) {
            throw new RuntimeException("No cargo la pagina de Inlaze");
        }
        getDriver().findElement(registro).click();
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(nombre));
        }catch (Exception e) {
            throw new RuntimeException("No cargo la pagina de registro de Inlaze");
        }
        getDriver().findElement(nombre).sendKeys("Esneyder Gutierrez");
        getDriver().findElement(correoregistro).sendKeys("hola@hola.com");
        getDriver().findElement(contraseña).sendKeys("Fabiangut199*");
        getDriver().findElement(contraseña_check).sendKeys("Fabiangut199*");
        getDriver().findElement(BtnRegistro).click();
    }



}
