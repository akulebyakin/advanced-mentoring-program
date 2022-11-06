package com.epam.tests.ui;

import com.epam.business.ui.pages.LoginPage;
import com.epam.core.config.WebDriverConfig;
import com.epam.core.logger.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(value = {TestListener.class})
public class BaseUiTest {
    protected WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverConfig.getWebDriver();
        loginPage = new LoginPage(driver).open();
    }

    @AfterClass
    public void tearDown() {
        WebDriverConfig.closeDriver();
    }
}
