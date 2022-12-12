package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {

    // Setting up WebDriver, returns driver
    public static WebDriver setupWebDriver() {
        WebDriver driver = WebDriverManager.firefoxdriver().create();
        return driver;
    }

    // Quits driver
    public static void quitWebDriver(WebDriver driver) {
        driver.quit();
    }

}
