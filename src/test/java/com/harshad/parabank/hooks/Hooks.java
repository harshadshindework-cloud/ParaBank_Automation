package com.harshad.parabank.hooks;


import org.openqa.selenium.WebDriver;

import com.harshad.parabank.config.ConfigReader;
import com.harshad.parabank.driver.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.getProperty("base.url"));
    }

    @After
    public void tearDown() {
         boolean keepBrowserOpen= Boolean.parseBoolean(ConfigReader.getProperty("keep.browser.open"));
        
         if(!keepBrowserOpen){
            DriverFactory.quitDriver();
}   
        }
}
