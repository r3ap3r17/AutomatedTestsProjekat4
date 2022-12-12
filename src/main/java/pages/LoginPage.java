package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePageClass {
    protected String loginPageBtn = "//a[text()='Login']";
    protected final By usernameInput = By.xpath("//input[@name='username1']");
    protected final By passwordInput = By.xpath("//input[@name='password1']");
    protected final By submitButton = By.xpath("//button[@name='logindugme']");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.goToLogin();
    }

    // Makes sure you are on login page
    protected void goToLogin() {
        WebElement btn = waitForWebElement(By.xpath(loginPageBtn));
        clickWebElement(btn);
    }

    // Types to username input
    public void typeToUsername(String username) {
        typeToWebElement(usernameInput, username);
    }

    // Types to password input
    public void typeToPassword(String pass) {
        typeToWebElement(passwordInput, pass);
    }

    // Clicks submit
    public void clickSubmit() {
        clickWebElement(submitButton);
    }


}
