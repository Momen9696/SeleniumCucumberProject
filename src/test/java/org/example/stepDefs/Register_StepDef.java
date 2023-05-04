package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Register_locators;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

//Actions
public class Register_StepDef {


    Register_locators register = new Register_locators();

    @Given("user go to register page")
    public void goRegisterPage() {
        register.registerlink().click();
    }

    @When("user select his gender")
    public void SelectGender() {
        register.SelectGender().click();
    }

    @And("user enter original first name  \"automation\"")
    public void FirstName() {
        register.FirstName().sendKeys("automation");
    }

    @And("user enter original last name \"tester\"")
    public void SecondName() {
        register.secondName().sendKeys("tester");
    }

    @And("user select date of birth")
    public void userSelectDateOfBirth() {
        Select selectDay = new Select(register.DateOfBirthDayDropList());
        Select selectMonth = new Select(register.DateOfBirthMonthDropList());
        Select selectYear = new Select(register.DateOfBirthYearDropList());

        selectDay.selectByValue("3");
        selectMonth.selectByValue("3");
        selectYear.selectByValue("1996");
    }

    @And("user enter email which didn't use before \"test@example.com\" field")
    public void Email() {
        register.EmailAdress().sendKeys("test@example.com");
    }

    @And("user enter Password in password first field as \"P@ssw0rd\"")
    public void Password1() {
        register.PasswordA().sendKeys("12345678AA");
    }

    @And("user enter the same Password in password second field as \"P@ssw0rd\"")
    public void Password2() {
        register.PasswordB().sendKeys("12345678AA");
    }

    @And("user click on register button")
    public void RegisterButton2() {
        register.RegisterButton().click();
    }

    @Then("message shall be displayed \"Your registration completed\"")

    public void assertA() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.MessageDisplayed().getText().contains("Your registration completed"));
        soft.assertAll();
    }


}