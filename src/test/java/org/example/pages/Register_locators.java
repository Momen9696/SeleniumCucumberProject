package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Locators
public class Register_locators {
    public WebElement registerlink() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement SelectGender() {
        return Hooks.driver.findElement(By.xpath("//input[@id='gender-male']"));
    }

    public WebElement FirstName() {
        return Hooks.driver.findElement(By.xpath("//input[@id='FirstName']"));
    }

    public WebElement secondName() {
        return Hooks.driver.findElement(By.xpath("//input[@id='LastName']"));
    }

    public WebElement DateOfBirthDayDropList() {
        return Hooks.driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
    }

    public WebElement DateOfBirthMonthDropList() {
        return Hooks.driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
    }

    public WebElement DateOfBirthYearDropList() {
        return Hooks.driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
    }

    public WebElement EmailAdress() {
        return Hooks.driver.findElement(By.xpath("//input[@id='Email']"));
    }

    public WebElement PasswordA() {
        return Hooks.driver.findElement(By.xpath("//input[@id='Password']"));
    }

    public WebElement PasswordB() {
        return Hooks.driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
    }

    public WebElement RegisterButton() {
        return Hooks.driver.findElement(By.xpath("//button[@id='register-button']"));
    }

    public WebElement MessageDisplayed() {
        return Hooks.driver.findElement(By.xpath("//div[@class='result']"));
    }
}