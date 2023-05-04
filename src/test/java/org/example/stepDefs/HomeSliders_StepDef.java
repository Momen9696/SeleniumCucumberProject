package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.example.pages.HomeSliders_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class HomeSliders_StepDef {

    HomeSliders_Locators sliders = new HomeSliders_Locators();

    @When(": user click on the first home slider which includes i phone 14 pro")
    public void user_click_on_the_first_home_slider_which_includes_i_phone_pro() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sliders.iphone14Pro()));
        sliders.iphone14Pro().click();
    }

    @Then(": Url shouldn't be changed")
    public void url_shouldn_t_be_changed() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert AssertURL = new SoftAssert();
        String ExpectedURL = "https://demo.nopcommerce.com/";
        String ActualURL = driver.getCurrentUrl();
        AssertURL.assertEquals(ActualURL, ExpectedURL);
        AssertURL.assertAll();

    }

    @When(": user click on the first home slider which includes GalaxyPhone")
    public void userClickOnTheFirstHomeSliderWhichIncludesGalaxyPhone() {
        WebDriverWait WaitElment = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        WebElement GalaxyWait = WaitElment.until(ExpectedConditions.elementToBeClickable(sliders.GalaxyPhone()));
        GalaxyWait.click();
    }

    @Then(": assert URL didn't change")
    public void assertURLDidnTChange() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert AssertURL = new SoftAssert();
        String ExpectedURL = "https://demo.nopcommerce.com/";
        String ActualURL = driver.getCurrentUrl();
        AssertURL.assertEquals(ActualURL, ExpectedURL);
        AssertURL.assertAll();
    }
}

