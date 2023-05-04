package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Search_Locators {
    public WebElement SearchingBar() {
        return Hooks.driver.findElement(By.xpath("//input[@type=\"text\"]"));
    }

    public WebElement SearchingIcon() {
        return Hooks.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }
}
