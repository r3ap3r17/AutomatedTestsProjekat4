package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPasswordPage extends BasePageClass{
    protected final By newPassBtn = By.xpath("//a[@class='loginlink']");
    protected final By usernameInput = By.xpath("//input[@name='username3']");
    protected final By passwordInput = By.xpath("//input[@name='password3']");
    protected final By newPasswordInput = By.xpath("//input[@name='newpass']");
    protected final By confirmNewPasswordInput = By.xpath("//input[@name='newpass1']");
    protected final By submitBtn = By.xpath("//button[@name='novalozdugme']");

    public NewPasswordPage(WebDriver driver) {
        super(driver);
        this.goToNewPassword(); // prbbly wont work
    }

    protected void goToNewPassword() {
        WebElement btn = waitForWebElement(newPassBtn);
        clickWebElement(btn);
    }

    public void typeToUsername(String username) {
        typeToWebElement(usernameInput, username);
    }

    public void typeToPassword(String pass) {
        typeToWebElement(passwordInput, pass);
    }

    public void typeToNewPassword(String pass) {
        typeToWebElement(newPasswordInput, pass);
    }

    public void typeToConfirmNewPassword(String pass) {
        typeToWebElement(confirmNewPasswordInput, pass);
    }

    public void clickSubmit() {
        clickWebElement(submitBtn);
    }

}
