package tests;

import org.openqa.selenium.WebDriver;
import utils.WebDriverUtils;

public class BaseTestClass {
    protected WebDriver setupDriver() {
        return WebDriverUtils.setupWebDriver();
    }

    // Quits driver
    protected void quitDriver(WebDriver driver) {
        WebDriverUtils.quitWebDriver(driver);
    }
}
