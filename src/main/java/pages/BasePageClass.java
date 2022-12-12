package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePageClass {
    protected int TIMEOUT = 3;
    protected WebDriver driver;

    public BasePageClass(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    protected WebElement waitForWebElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement waitForWebElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void typeToWebElement(WebElement element, String text) {
        waitForWebElement(element);
        element.sendKeys(text);
    }

    protected void typeToWebElement(By locator, String text) {
        WebElement element = driver.findElement(locator);
        waitForWebElement(element);
        element.sendKeys(text);
    }

    protected void clickWebElement(WebElement element) {
        element.click();
    }

    protected void clickWebElement(By locator) {
        WebElement element = driver.findElement(locator);
        waitForWebElement(element);
        element.click();
    }

    protected String getTextFromWebElement(WebElement element) {
        return element.getText();
    }

    protected String getAlertText() {
        return driver.switchTo().alert().getText();
    }

}
