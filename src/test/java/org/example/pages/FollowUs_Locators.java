package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FollowUs_Locators {
    public WebElement FaceBookFollowUp() {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement TwitterFollowUs() {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement RssFollowUs() {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
    }

    public WebElement YoutubeFollowUs() {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }


}





