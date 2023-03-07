package com.kirich.CRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PortalPage extends BasePage {

    @FindBy (xpath = "//div[@id='feed-add-post-form-tab']/span/span")
    public List<WebElement>  upMenuModules;
}
