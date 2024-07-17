package com.test.inlaze.PageObjects;

import com.test.inlaze.Utilis.IteractorTime;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class InicioSesionPage extends PageObject {

    public By correo = By.id("email");
    public  By contraseña = By.xpath("//input[@id='password']");
    public By BtnIngresar = By.xpath("//button[@class='btn btn-primary']");
    public By mensaje = By.xpath("//div[@class='fixed z-50 top-4 right-4 flex flex-col items-end']");

    IteractorTime iteractorTime = new IteractorTime();
    WebDriverWait tiempo = new WebDriverWait(getDriver(),30);

    public static String Url;

    public void abrirpaginainlaze(){
        try {
            EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
            Url = variables.getProperty("webdriver.Url");
            getDriver().get(Url);
        }catch (Exception e){
            throw new RuntimeException("La pagina web no carga" + e);
        }
    }

    public void iniciarsesion_usuario(String correoIn, String password){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(correo));
        }catch (Exception e){
            throw new RuntimeException("No cargo la pagina de Inlaze");
        }
        getDriver().findElement(correo).sendKeys(correoIn);
        getDriver().findElement(contraseña).sendKeys(password);
        getDriver().findElement(BtnIngresar).click();
    }

    public void validarmensaje(){
        iteractorTime.esperaMilis(1000);
        String[] respuesta = getDriver().findElement(mensaje).getText().split("\n");
        if (respuesta[1].equals("User not found") || respuesta[1].equals("Password doesn't match") || respuesta[1].equals("Successful registration!")){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
    }

}
