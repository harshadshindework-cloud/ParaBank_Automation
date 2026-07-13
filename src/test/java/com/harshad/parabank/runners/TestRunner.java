package com.harshad.parabank.runners;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/features", //feature file path
        glue = {"com.harshad.parabank.stepdefinitions", "com.harshad.parabank.hooks"}, //step definition and hook package paths
        tags = "@UnsuccessfulLogin", //tag name to run the specific test
        monochrome = true, //display the console output in a proper readable format

        plugin = { //to generate different types of reporting
                "pretty", //display the console output in a proper readable format
                "html:target/cucumber-reports/cucumber.html", //to generate the html report
                "json:target/cucumber-reports/cucumber.json" //to generate the json report
        }

)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}