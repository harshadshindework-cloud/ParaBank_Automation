package com.harshad.parabank.stepdefinitions;

import com.harshad.parabank.driver.DriverFactory;
import com.harshad.parabank.pages.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("User is on the Login page")
    public void user_is_on_the_login_page() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
    }

    @When("User enters {string} and {string} and clicks on the Login button")
    public void user_enters_valid_username_and_valid_password_and_clicks_on_the_login_button(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("User should be redirected to the Accounts Overview page")
    public void user_should_be_redirected_to_the_accounts_overview_page() {
        Assert.assertTrue(loginPage.isAccountsOverviewPageDisplayed());
    }

}

