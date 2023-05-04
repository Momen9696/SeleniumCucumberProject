@smoke
Feature: Login feature

  Scenario: user could login with valid email and password
    Given user go to login page
    When  user login with "valid" email "test@example.com",user login with "valid" password "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

  Scenario: user could validate login with invalid email or password
    Given user go to login page to login with invalid email
    When  user login with invalid  email "test@example.com",user login with valid password "P@ssw0rd"
    And user press on login button
    Then  user could not login to the system