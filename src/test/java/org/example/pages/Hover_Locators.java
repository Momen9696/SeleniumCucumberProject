package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Hover_Locators {
    public WebElement MainCategory() {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
    }

    public List<WebElement> DeskTopSubCategory() {
        return Hooks.driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']"));
    }

    public WebElement CategoryName() {
        return Hooks.driver.findElement(By.xpath("//h1[normalize-space()='Desktops']"));
    }

}