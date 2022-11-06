package com.epam.business.ui.pages;

import com.epam.core.config.ProjectConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;
    protected final ProjectConfig projectConfig = ProjectConfig.config;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
