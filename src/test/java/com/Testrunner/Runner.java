package com.Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// @RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\pavan\\OneDrive\\Documents\\Flipkart_END_toEND\\src\\test\\resources\\features\\sarchfuncationality.feature",
    glue = {"com.stefdefination","com.hooks"},
   	tags="@tc002",
    		
    plugin = {
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        
    },
    monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {

}
