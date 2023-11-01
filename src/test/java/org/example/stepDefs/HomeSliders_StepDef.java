package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomeSliders_Locators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class HomeSliders_StepDef {
    WebDriverWait WaitElement;
    HomeSliders_Locators sliders = new HomeSliders_Locators();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

    @When(": user click on the first home slider which includes i phone 14 pro")
    public void user_click_on_the_first_home_slider_which_includes_i_phone_pro() {

        wait.until(ExpectedConditions.elementToBeClickable(sliders.iphone14Pro()));
        sliders.iphone14Pro().click();
    }

    @Then(": Url shouldn't be changed")
    public void url_shouldn_t_be_changed() throws InterruptedException {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        SoftAssert AssertURL = new SoftAssert();
        String ExpectedURL = "https://demo.nopcommerce.com/";
        String ActualURL = driver.getCurrentUrl();
        AssertURL.assertEquals(ActualURL, ExpectedURL);
        AssertURL.assertAll();

    }

    @When(": user click on the first home slider which includes GalaxyPhone")
    public void userClickOnTheFirstHomeSliderWhichIncludesGalaxyPhone() {
         WaitElement = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        WebElement galaxyPhoneElement = WaitElement.until(ExpectedConditions.elementToBeClickable(sliders.GalaxyPhone()));
        galaxyPhoneElement.click();
    }

    @Then(": assert URL didn't change")
    public void assertURLDidnTChange() throws InterruptedException {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        SoftAssert AssertURL = new SoftAssert();
        String ExpectedURL = "https://demo.nopcommerce.com/";
        String ActualURL = driver.getCurrentUrl();
        AssertURL.assertEquals(ActualURL, ExpectedURL);
        AssertURL.assertAll();
    }
}

