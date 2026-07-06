package com.harshad.parabank.ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.harshad.parabank.config.ConfigReader;

public class SmokeTest {

    @Test
    public void verifyFrameworkSetup() {

        System.out.println("Framework setup successful.");

        Assert.assertTrue(true);

    }

    @Test
    public void verifyConfigReader() {
    String browser = ConfigReader.getProperty("browser");
    String baseUrl = ConfigReader.getProperty("base.url");

    System.out.println("Browser : " + browser);
    System.out.println("Base URL : " + baseUrl);

    Assert.assertEquals(browser, "chrome");
    Assert.assertTrue(baseUrl.contains("parabank"));
}

}