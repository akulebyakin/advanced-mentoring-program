package com.epam.business.ui.pages;

import com.epam.core.config.WebDriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage {

    @FindBy(css = "span[title=\"All Dashboards\"]")
    private WebElement allDashboardsTitle;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean waitUntilTitleVisible() {
        new WebDriverWait(driver, WebDriverConfig.WAIT_TIMEOUT)
                .until(ExpectedConditions.visibilityOf(allDashboardsTitle));

        return allDashboardsTitle.isDisplayed();
    }
}
