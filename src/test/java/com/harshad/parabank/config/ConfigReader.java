package com.harshad.parabank.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {

        try (InputStream input = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream("environments/config.properties")) {

            if (input == null) {
                throw new RuntimeException("config.properties not found");
            }

            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }

    }

    public static String getProperty(String key) {
        return Objects.requireNonNull(properties.getProperty(key), "Missing config property: " + key);
    }

}