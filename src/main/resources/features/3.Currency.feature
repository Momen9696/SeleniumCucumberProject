@smoke
Feature: Currency Feature

  Scenario: user wants to choose EURO as a currency
    When user Select Euro currency from the dropdown list on the top left of home page
    Then EURO shall be default currency for main products
