Feature: Login Functionality

  Scenario: Valid Login

    Given user launches parabank application
    When user enters username and password
    And clicks on login button
    Then user should navigate to home page