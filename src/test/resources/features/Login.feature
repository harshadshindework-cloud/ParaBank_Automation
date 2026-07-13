Feature: Login Functionality

  Background:
    Given User is on the Login page

  @LoginTest
  Scenario: Successful Login
    When User enters "john" and "demo" and clicks on the Login button
    Then User should be redirected to the Accounts Overview page

  @UnsuccessfulLogin
  Scenario Outline: Unsuccessful Login
    When User enters "<username>" and "<password>" and clicks on the Login button
    Then User should see the login error message "<errorMessage>"
  
    
     Examples:
    | username     | password     | errorMessage                                      |
    | invalidUser  | demo         | An internal error has occurred and has been logged. |
    | john         | Invalid123   | An internal error has occurred and has been logged. |
    | invalidUser  | Invalid123   | An internal error has occurred and has been logged. |
    |              | demo         | Please enter a username and password.            |
    | john         |              | Please enter a username and password.            |
    |              |              | Please enter a username and password.            | 