package com.kirich.CRM.step_defs;

import com.kirich.CRM.pages.PortalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US4_Check_Users_Menu_Options {


    @Then("Verify the users see:")
    public void verifyTheUsersSee(List<String> dataList) {

        PortalPage portalPage = new PortalPage();
        List<String> expectedListOptions = new ArrayList<>(dataList);

        List<String> actualListOptions = new ArrayList<>();

        for (WebElement eachElement : portalPage.userPopupMenu ) {
            actualListOptions.add(eachElement.getText());
        }

        Collections.sort(actualListOptions);
        Collections.sort(expectedListOptions);

//        System.out.println("actualListOptions = " + actualListOptions);
//        System.out.println("expectedListOptions = " + expectedListOptions);

        Assert.assertTrue(actualListOptions.equals(expectedListOptions));

    }
}
