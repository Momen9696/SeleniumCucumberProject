package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Wishlist_Locators;
import org.testng.asserts.SoftAssert;

public class WishList_StepDef {
    Wishlist_Locators wishlist = new Wishlist_Locators();

    @When(": clicks on apple macbook wishlist on home page")
    public void clicks_on_apple_macbook_wishlist_on_home_page() {
        wishlist.WishListMainTap().click();
    }

    @And(": user clicks on wishlist tap on product tab")
    public void user_clicks_on_wishlist_tap_on_product_tab() {
        wishlist.WishListProductTap().click();
    }

    @Then(": confirmation message on a green backcolor shall be appeared")
    public void confirmation_message_on_a_green_backcolor_shall_be_appeared() {
        SoftAssert assertion = new SoftAssert();
        String expectedBackGroundColor = "rgba(75, 176, 122, 1)";
        String actualBackGroundColor = wishlist.assertion().getCssValue("background-color");
        assertion.assertEquals(expectedBackGroundColor, actualBackGroundColor);
        assertion.assertTrue(wishlist.assertion().getText().contains("The product has been added"));
        assertion.assertAll();
    }

    @And(": user click  on wishlist tab after adding")
    public void userClickOnWishlistTabAfterAdding() {
        wishlist.wishListlist().click();
    }

    @And(": user click on X on wishlist tab")
    public void userClickOnXOnWishlistTab() {
        wishlist.x().click();
    }

    @Then(": a message shall be appeared contain wish list is empty")
    public void aMessageShallBeAppearedContainWishListIsEmpty() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(wishlist.wishListEmpty().getText().contains("is empty"));
        softAssert.assertAll();
    }
}
