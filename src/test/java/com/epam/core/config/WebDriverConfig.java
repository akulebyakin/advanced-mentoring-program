package com.epam.core.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Objects;

public class WebDriverConfig {

    private static WebDriver driver;
    private static final ProjectConfig projectConfig = ProjectConfig.config;
    public static final Duration WAIT_TIMEOUT = Duration.ofSeconds(5);

    public static WebDriver getWebDriver() {
        if (Objects.isNull(driver)) {
            driver = createDriver(projectConfig.browserName());
        }
        return driver;
    }

    private static WebDriver createDriver(String browserName) {
        if (Objects.isNull(browserName)) {
            throw new IllegalArgumentException("Browser name shouldn't be null");
        }

        switch (browserName) {
            case "chrome":
                return createChromeDriver();
            case "firefox":
                return createFirefoxDriver();
            case "edge":
                return createEdgeDriver();
            default:
                throw new IllegalArgumentException("Browser %s is not supported");
        }
    }

    private static WebDriver createEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    private static WebDriver createFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private static WebDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static void closeDriver() {
        if (Objects.nonNull(driver)) {
            driver.quit();
            driver = null;
        }
    }
}
