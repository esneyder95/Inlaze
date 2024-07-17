package com.test.inlaze.Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty"
        ,features="src/test/resources/features"
        ,glue="com.test.inlaze"
        ,tags = "@Pruebas_automatizadas_inlaze"
)

public class Runner {
}
