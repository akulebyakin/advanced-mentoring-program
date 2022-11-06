package com.epam.business.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "login")
    private WebElement loginInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        driver.get(projectConfig.baseUrl());
        return this;
    }

    public DashboardPage login(String username, String password) {
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        passwordInput.submit();
        return new DashboardPage(driver);
    }
}
