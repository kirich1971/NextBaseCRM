package com.kirich.CRM.step_defs;

import com.kirich.CRM.pages.PortalPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class US5_Send_Message {

    PortalPage portalPage = new PortalPage();

    @When("Users click the {string} tab")
    public void users_click_the_tab(String clickableModule) {
        for (WebElement  each : portalPage.upMenuModules) {
            if (each.getText().equals(clickableModule))
                each.click();
                break;
        }

    }

    @When("Users write test message")
    public void users_write_test_message() {


    }

    @When("Users click the SEND button")
    public void users_click_the_send_button() {
    }

    @When("Verify the message is displayed on the feed")
    public void verify_the_message_is_displayed_on_the_feed() {
    }


}
