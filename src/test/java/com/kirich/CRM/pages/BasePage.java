package com.kirich.CRM.pages;

import com.kirich.CRM.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    BasePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@id='user-block']")
    public WebElement userBlock;

    @FindBy (xpath = "//div[@class='menu-popup-items']/*/span[2]")
    public List<WebElement> userPopupMenu;
}
