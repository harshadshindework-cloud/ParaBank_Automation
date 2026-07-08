Feature: Login Functionality

  @LoginTest
  Scenario: Successful Login
    Given User is on the Login page
    When User enters "john" and "demo" and clicks on the Login button
    Then User should be redirected to the Accounts Overview page

    