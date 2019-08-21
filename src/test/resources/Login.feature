
Feature: As a driver I should be able to log in
  Scenario: login as a driver
    Given user on the login page
    When user login as a "driver"
    Then user should be able to see dashboard page

