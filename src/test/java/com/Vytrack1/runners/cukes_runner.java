package com.Vytrack1.runners;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = "html:target/default-cucumber-reports",
        features = "src/test/resources/Login.feature",
        glue = "src/test/java/com/Vytrack1/step_definitions/",
        //tags = "@login",
        dryRun = false
)
public class cukes_runner {

}
