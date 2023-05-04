package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Hover_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class Hover_StepDef {
    Hover_Locators Hover = new Hover_Locators();

    @When(": user Hovered on Computers main category tab")
    public void user_hovered_on_computers_main_category_tab() throws InterruptedException {

        Actions HoverAction = new Actions(Hooks.driver);
        HoverAction.moveToElement(Hover.MainCategory()).perform();
        Thread.sleep(1000);

    }

    @And(": user clicked on Desktops tab")
    public void user_clicked_on_desktops_tab() {
        if (Hover.DeskTopSubCategory().size() > 0) {
            Hover.DeskTopSubCategory().get(0).click();
        } else {
            Hover.MainCategory().click();

        }


    }

    @Then(": user shall be redirected to desktops searching page")
    public void user_shall_be_redirected_to_desktops_searching_page() {
        SoftAssert AssertCategory = new SoftAssert();
        AssertCategory.assertTrue(Hover.CategoryName().getText().toLowerCase(Locale.ROOT).contains("desktops"));
        AssertCategory.assertAll();
    }


}
