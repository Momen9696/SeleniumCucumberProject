package org.example.pages;

import org.apache.commons.compress.archivers.arj.ArjArchiveEntry;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Wishlist_Locators {
    public WebElement WishListMainTap() {
        return Hooks.driver.findElement(By.xpath("//div[@class='item-grid']//div[2]//div[1]//div[2]//div[3]//div[2]//button[3]"));
    }

    public WebElement WishListProductTap() {
        return Hooks.driver.findElement(By.xpath("//button[@id='add-to-wishlist-button-4']"));
    }

    public WebElement assertion() {
        return Hooks.driver.findElement(By.xpath("//div[@class='bar-notification success']"));
    }

    public WebElement wishListlist() {
        return Hooks.driver.findElement(By.xpath("//span[@class='wishlist-label']"));
    }

    public WebElement x() {
        return Hooks.driver.findElement(By.xpath("//button[@class=\"remove-btn\"]"));
    }

    public WebElement wishListEmpty() {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"no-data\"]"));
    }
}
