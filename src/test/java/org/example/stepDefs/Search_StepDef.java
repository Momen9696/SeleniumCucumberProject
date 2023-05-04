package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Search_Locators;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class Search_StepDef {
    Search_Locators Search = new Search_Locators();

    @When("User enter name of {string} and click search")
    public void userEnterNameOfAndClickSearch(String arg0) {
        Search.SearchingBar().sendKeys(arg0);
        Search.SearchingIcon().click();
    }

    @Then("Searched products shall be appeared")
    public void searchedProductsShallBeAppeared() {
        SoftAssert URLAssert = new SoftAssert();
        URLAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search"));
        URLAssert.assertAll();

    }
}

