package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Locators {
    public WebElement LoginIcon() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }

    public WebElement LoginValidUserName() {
        return Hooks.driver.findElement(By.className("email"));
    }

    public WebElement LoginValidPassword() {
        return Hooks.driver.findElement(By.className("password"));
    }

    public WebElement LoginButton() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public WebElement WarrningMessage() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }


}
