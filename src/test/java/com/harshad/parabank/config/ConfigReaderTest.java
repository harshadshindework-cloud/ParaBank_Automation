package com.harshad.parabank.config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfigReaderTest {

    @Test
    public void shouldReturnConfiguredBrowserValue() {
        String browser = ConfigReader.getProperty("browser");

        Assert.assertTrue(
        browser.equals("chrome")
        || browser.equals("firefox")
        || browser.equals("edge")
        || browser.equals("safari"));
    }

    @Test
    public void shouldReturnConfiguredBaseUrlValue() {
        String baseUrl = ConfigReader.getProperty("base.url");

        Assert.assertTrue(baseUrl.contains("parabank"));
        Assert.assertTrue(baseUrl.startsWith("https://"));
    }

    @Test
    public void shouldThrowExceptionForMissingProperty() {
        Assert.assertThrows(RuntimeException.class, () -> ConfigReader.getProperty("missing.property"));
    }
}
