package com.kirich.CRM.step_defs;

import com.kirich.CRM.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_2_Login_Failed_StepDef {

    LoginPage loginPage = new LoginPage();
    @When("Enter invalid {string} and {string}")
    public void enter_invalid_and(String login, String password) {

        loginPage.loginInput.sendKeys(login);
        loginPage.passwordInput.sendKeys(password);
    }


    @Then("Verify users see {string} on the page")
    public void verifyUsersSeeOnThePage(String expectedText) {

        String actualText = loginPage.errorMessage.getText();
        Assert.assertEquals(actualText, expectedText);
    }
}
