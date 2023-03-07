package com.kirich.CRM.step_defs;

import com.kirich.CRM.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_CheckBox_StepDef {

    LoginPage loginPage = new LoginPage();

    @When("Verify there is a {string} message displayed")
    public void verify_there_is_a_message_displayed(String expectedMessage) {
        String actualMessage = loginPage.checkBoxLabel.getText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }


    @Then("check the checkbox clickable")
    public void check_the_checkbox_clickable() {
        loginPage.checkBox.click();
        Assert.assertTrue(loginPage.checkBox.isSelected());

    }
}
