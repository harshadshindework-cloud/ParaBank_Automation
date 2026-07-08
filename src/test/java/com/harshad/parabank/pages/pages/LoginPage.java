package com.harshad.parabank.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.harshad.parabank.utils.WaitUtility;

public class LoginPage {
    private final WaitUtility waitUtility;

    //Locators for the login page elements
    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By loginButton = By.cssSelector("input[value='Log In']");
    private final By accountOverviewPage = By.cssSelector("h1.title");

    //constructor
    public LoginPage(WebDriver driver) {
        this.waitUtility = new WaitUtility(driver);
    }


    //Action Methods for login page elements
    public void login(String username, String password) {
        waitUtility.waitForVisibility(usernameField).clear();
        waitUtility.waitForVisibility(usernameField).sendKeys(username);
        waitUtility.waitForVisibility(passwordField).clear();
        waitUtility.waitForVisibility(passwordField).sendKeys(password);
        waitUtility.waitForClickable(loginButton).click();
    }

    public boolean isAccountsOverviewPageDisplayed() {
        return waitUtility.waitForText(accountOverviewPage, "Accounts Overview");
    }

     

}
