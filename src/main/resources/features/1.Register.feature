@smoke
Feature: Register Feature

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select his gender
    And user enter original first name  "automation"
    And user enter original last name "tester"
    And user select date of birth
    And user enter email which didn't use before "test@example.com" field
    And user enter Password in password first field as "P@ssw0rd"
    And user enter the same Password in password second field as "P@ssw0rd"
    And user click on register button
    Then message shall be displayed "Your registration completed"

