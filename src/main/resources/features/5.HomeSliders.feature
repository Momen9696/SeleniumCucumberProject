@smoke
Feature: HomeSlider Feature

  Scenario: user click i phone 14 pro homeslider to be redirected to the product
    When : user click on the first home slider which includes i phone 14 pro
    Then : Url shouldn't be changed


  Scenario: user click GalaxyPhone homeslider to be redirected to the product
    When : user click on the first home slider which includes GalaxyPhone
    Then : assert URL didn't change