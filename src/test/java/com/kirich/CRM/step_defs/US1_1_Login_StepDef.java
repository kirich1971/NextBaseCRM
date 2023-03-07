package com.kirich.CRM.step_defs;

import com.kirich.CRM.pages.LoginPage;
import com.kirich.CRM.utulities.BrowserUtils;
import com.kirich.CRM.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_1_Login_StepDef {

    LoginPage loginPage = new LoginPage();

    @Given("Users go to the login page")
    public void users_go_to_the_login_page() {
    }

    @When("Enter valid {string} and {string}")
    public void enterValidAnd(String login, String password) {

        loginPage.loginInput.sendKeys(login);
        loginPage.passwordInput.sendKeys(password);
    }

    @When("Click the LoginIn button")
    public void click_the_loginIn_button() {
        loginPage.loginButton.click();
    }


    @Then("Verify users log in successfully and launch the homepage and see {string}")
    public void verify_Users_LogIn_Successfully_AndLaunch_The_Homepage_And_See(String expectedTitle) {

        BrowserUtils.waitFor(3);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}
