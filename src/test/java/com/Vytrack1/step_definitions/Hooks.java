package com.Vytrack1.step_definitions;

import com.Vytrack1.utilities.Driver;
import com.Vytrack1.utilities.Vytrack1_data;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;



    public class Hooks {

        @Before
        public void setUp(){
            System.out.println("Before Hooks");
            Driver.get().get(Vytrack1_data.get("url"));
            Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        @After
        public void tearDown(Scenario scenario){
            System.out.println("After Hooks");
            //check if the scenario is failed
            if(scenario.isFailed()){
                //tke that sreenshot
                final byte [] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
                //attach the scenario to the report
                scenario.embed(screenshot,"image/png");
            }
            Driver.closeDriver();
        }
        @After("@database")
        public void tearDownConnection(){
            System.out.println("Closing DB connection");
        }
    }

