package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.FollowUs_Locators;
import org.testng.Assert;

import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class FollowUs_StepDef {
    FollowUs_Locators Follow = new FollowUs_Locators();


    @When(": user click on facebook tab")
    public void user_click_on_facebook_tab() throws InterruptedException {
        Follow.FaceBookFollowUp().click();
    }

    @Then(": user a second tap shall be opened on Nopcommerce facebook page")
    public void user_a_second_tap_shall_be_opened_on_nopcommerce_facebook_page() {
        ArrayList<String> TabController = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(TabController.get(1));
        String CurrentURL = driver.getCurrentUrl();
        String ExpectedURL = "https://www.facebook.com/nopCommerce";
        Assert.assertEquals(CurrentURL, ExpectedURL);
        driver.close();
    }

    @When(": user click on twitter tab")
    public void user_click_on_twitter_tab() throws InterruptedException {
        Follow.TwitterFollowUs().click();
    }

    @Then(": user a second tap shall be opened on Nopcommerce twitter page")
    public void user_redirected_to_twitter() {
        ArrayList<String> TabController = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(TabController.get(1));
        String CurrentURL = driver.getCurrentUrl();
        String ExpectedURL = "https://twitter.com/nopCommerce";
        Assert.assertEquals(CurrentURL, ExpectedURL);
        driver.close();
    }

    @When(": user click on rss tab")
    public void user_click_on_rss_tab() throws InterruptedException {
        Follow.RssFollowUs().click();
    }

    @Then(": user shall be redirected to demo.nopcommerce.com")
    public void userShallBeRedirectedToDemoNopcommerceCom() {
        String ActualURL = driver.getCurrentUrl();
        String ExpectedURL = "https://demo.nopcommerce.com/news/rss/1";
        Assert.assertEquals(ActualURL, ExpectedURL);
    }

    @When(": user click on youtube tab")
    public void user_click_on_youtube_tab() throws InterruptedException {
        Follow.YoutubeFollowUs().click();

    }

    @Then(": user a second tap shall be opened on Nopcommerce youtube page")
    public void user_a_second_tap_shall_be_opened_on_nopcommerce_youtube_page() {
        ArrayList<String> TabController = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(TabController.get(1));
        String ActualURL = driver.getCurrentUrl();
        String ExpectedURL = "https://www.youtube.com/user/nopCommerce";
        Assert.assertEquals(ActualURL, ExpectedURL);
        driver.close();
    }
}
