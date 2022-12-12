package tests.login;

import data.UserCreds;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTestClass;

public class LoginFailWrongPassword extends BaseTestClass {
    private WebDriver driver;

    @BeforeMethod
    public void setupTest() {
        driver = setupDriver();
    }

    @Test
    public void loginFail() {
        LoginPage login = new LoginPage(driver);
        login.typeToUsername(UserCreds.ISPITANIK_USERNAME);
        login.typeToPassword(UserCreds.ISPITANIK_PASSWORD + "abc");
        login.clickSubmit();
        Assert.assertTrue(login.checkAlertText());
    }


    @AfterMethod
    public void quitTest() {
        quitDriver(driver);
    }
}
