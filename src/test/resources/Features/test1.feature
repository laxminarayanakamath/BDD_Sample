@SmokeScenario
Feature: feature to test login functionality

@SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And Clicks on login button
    Then user is navigated to home page
    Then logout from the application
    Then close browser
   
   Scenario Outline: Check login is successful with valid credentials
   Given user is on login page
   When user enters <username> and <password>
   And clicks on login button
   Then user is navigated to home page
   Then logout from the application
   Then close browser
    
    Examples:
    |mngr551512 |tYqupYd|
 
