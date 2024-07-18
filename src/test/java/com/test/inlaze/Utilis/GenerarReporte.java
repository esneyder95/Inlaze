package com.test.inlaze.Utilis;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class GenerarReporte extends PageObject {
    static String imagen = "";
    static int contadorImagenes;
    private static ExtentReports extent = new ExtentReports();
    private static ExtentSparkReporter reporter = new ExtentSparkReporter("Reporte.html");

    public void CasoExitoso(String scenario){

        String tagprueba = CucumberWithSerenity.currentRuntimeOptions().getTagExpressions().toString();
        tagprueba = tagprueba.replace("[","").replace("]","").replace("@","");
        scenario = scenario.replaceAll("_"," ");
        reporter.viewConfigurer().viewOrder().as(new ViewName[]{ViewName.DASHBOARD,ViewName.TEST}).apply();
        extent.attachReporter(reporter);
        int imagenWhen=contadorImagenes-1;
        int imagenGiven=contadorImagenes-2;
        extent.createTest(scenario)
                .log(Status.PASS,"Caso exitoso " + scenario,
                        MediaEntityBuilder.createScreenCaptureFromPath("src/screenshot/" + imagenGiven +".png").build())
                .info(MediaEntityBuilder.createScreenCaptureFromPath("src/screenshot/" + imagenWhen + ".png").build())
                .info(MediaEntityBuilder.createScreenCaptureFromPath("src/screenshot/" + imagen + ".png").build())
                .addScreenCaptureFromPath("src/screenshot/" + imagen + ".png")
                .assignCategory(tagprueba);
        extent.flush();

    }

    public void TomarPantallazo(){
        contadorImagenes++;
        imagen = String.valueOf(contadorImagenes);
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("src/screenshot/" + imagen + ".png"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
