package com.kirich.CRM.pages;

import com.kirich.CRM.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@placeholder='Login']")
    public WebElement loginInput;

    @FindBy (xpath = "//input[@placeholder='Password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@value='Log In']")
    public WebElement loginButton;

    @FindBy (xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPassword;

    @FindBy (xpath = "//div[@class='errortext']")
    public WebElement errorMessage;

    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy (xpath = "//label[@class='login-item-checkbox-label']")
    public WebElement checkBoxLabel;


    public void loginToPage(String login, String password) {
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
