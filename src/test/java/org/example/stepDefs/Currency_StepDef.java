package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Currency_Locators;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Currency_StepDef {
    Currency_Locators currency = new Currency_Locators();

    @When("user Select Euro currency from the dropdown list on the top left of home page")
    public void userSelectEuroCurrencyFromTheDropdownListOnTheTopLeftOfHomePage() {
        Select CurrencySelect = new Select(currency.GetCurrency());
        CurrencySelect.selectByVisibleText("Euro");
    }


    @Then("EURO shall be default currency")
    public void euroShallBeDefaultCurrency() {

    }

    @Then("EURO shall be default currency for main products")
    public void euroShallBeDefaultCurrencyForMainProducts() {
        for (int i = 0;
             i < currency.CurrencyAssertion().size();
             i++) {
            Assert.assertTrue(currency.CurrencyAssertion().get(i).getText().contains("€"));
            System.out.println("i" + i);
        }

    }
}
