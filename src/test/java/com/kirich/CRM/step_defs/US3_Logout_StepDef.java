package com.kirich.CRM.step_defs;

import com.kirich.CRM.pages.LoginPage;
import com.kirich.CRM.pages.PortalPage;
import com.kirich.CRM.utulities.BrowserUtils;
import com.kirich.CRM.utulities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US3_Logout_StepDef {

    PortalPage portalPage = new PortalPage();
    @When("Users click the user profile name")
    public void users_click_the_user_profile_name() {
        portalPage.userBlock.click();
    }

    @When("Users select the {string} option")
    public void users_select_the_option(String clickableOption) {

        WebElement click = null;
        for (WebElement each : portalPage.userPopupMenu) {

//            System.out.println("each.getText() = " + each.getText());
            if (each.getText().equals(clickableOption)) {
                each.click();
                System.out.println("CLICK");
                break;
            }
        }
    }

    @Then("Verify the user back to the login page")
    public void verify_the_user_back_to_the_login_page() {

        LoginPage loginPage = new LoginPage();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(loginPage.loginInput));

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, "Authorization");


    }


}
