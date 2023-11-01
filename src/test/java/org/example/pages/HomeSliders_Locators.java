package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeSliders_Locators {

    public WebElement iphone14Pro() {

        return Hooks.driver.findElement(By.xpath("//div[@id='nivo-slider']"));

    }

    public WebElement GalaxyPhone() {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"nivoSlider\"]"));

    }


}
