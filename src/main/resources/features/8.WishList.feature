@smoke
Feature: WishList Feature

  Scenario: User wants to add a product to his wishlist
    When : clicks on apple macbook wishlist on home page
    And  : user clicks on wishlist tap on product tab
    Then : confirmation message on a green backcolor shall be appeared

  Scenario: after user added a product to wishlist removing it
    When : clicks on apple macbook wishlist on home page
    And  : user clicks on wishlist tap on product tab
    And  : user click  on wishlist tab after adding
    And  : user click on X on wishlist tab
    Then : a message shall be appeared contain wish list is empty

