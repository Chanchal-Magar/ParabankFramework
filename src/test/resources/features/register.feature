Feature: Registration Functionality

Scenario: User registration successfully

  Given user is on parabank registration page

  When user enters registration details

  And user clicks on register button

  Then user account should be created successfully