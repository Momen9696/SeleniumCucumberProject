@smoke
Feature: Currency Feature

  Scenario: user change the default currency
    Given :user wants to select Euro as a default currency
    When user Select Euro currency from the dropdown list on the top left of home page
    Then EURO shall be default currency for main products
