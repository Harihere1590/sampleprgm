Feature: feature to test the login functionality

  Scenario: check login functionality
    Given user is on login page
    When user enters username and password
    And user click login button
    Then user getting incorrect password text
