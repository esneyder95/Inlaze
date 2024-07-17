package com.test.inlaze.PageObjects;

import com.test.inlaze.Utilis.IteractorTime;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class BienvenidoInlazePage extends PageObject {

    public By nombre = By.xpath("//h2[@class='font-bold']");
    public By icono = By.xpath("//label[@class='btn btn-ghost btn-circle avatar']");
    public By cerrarsesion = By.xpath("//ul[@class='menu menu-sm dropdown-content mt-3 z-[1] p-2 shadow bg-base-100 rounded-box w-52']/li[3]");
    public By correo = By.id("email");

    WebDriverWait tiempo = new WebDriverWait(getDriver(),30);

    IteractorTime iteractorTime = new IteractorTime();

    public void validarnombre(String nombreId){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(nombre));
        }catch (Exception e) {
            throw new RuntimeException("No cargo la pagina de Inlaze");
        }
        if (getDriver().findElement(nombre).getText().equals(nombreId)){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
    }

    public void cerrarsesion(){
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(nombre));
        }catch (Exception e) {
            throw new RuntimeException("No cargo la pagina de Inlaze");
        }
        getDriver().findElement(icono).click();
        iteractorTime.esperaMilis(1000);
        getDriver().findElement(cerrarsesion).click();
        try {
            tiempo.until(ExpectedConditions.elementToBeClickable(correo));
        }catch (Exception e){
            throw new RuntimeException("No se cerro sesion");
        }
    }

}
