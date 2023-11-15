package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Login_Locators;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class Login_StepDef {
    Login_Locators Login = new Login_Locators();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to login page")
    public void userGoToLoginPage() {
        Login.LoginIcon().click();
    }

    @When("user login with {string} email {string},user login with {string} password {string}")
    public void userLoginWithEmailUserLoginWithPassword(String arg0, String arg1, String arg2, String arg3) {
        Login.LoginValidUserName().sendKeys("test@example.com");
        Login.LoginValidPassword().sendKeys("12345678AA");
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        Login.LoginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://demo.nopcommerce.com/";
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
    }

    @Given("user go to login page to login with invalid email")
    public void userGoToLoginPageToLoginWithInvalidEmail() {
        Login.LoginIcon().click();
    }


    @When("user login with invalid  email {string},user login with valid password {string}")
    public void userLoginWithInvalidEmailUserLoginWithValidPassword(String arg0, String arg1) {
        Login.LoginValidUserName().sendKeys("test@example.com");
        Login.LoginValidPassword().sendKeys("12345678AA12");
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        softAssert.assertTrue(Login.WarrningMessage().getText().contains("Login was unsuccessful"));
        softAssert.assertAll();
    }


}
