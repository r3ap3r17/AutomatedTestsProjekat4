package tests.login;

import data.UserCreds;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.LoginPage;
import tests.BaseTestClass;

public class LoginAutorSuccess extends BaseTestClass {
    private WebDriver driver;

    @BeforeMethod
    public void setupTest() {
        driver = setupDriver();
    }

    @Test
    public void loginFail() {
        IndexPage index = new IndexPage(driver);
        LoginPage login = new LoginPage(driver);
        login.typeToUsername(UserCreds.AUTOR_USERNAME);
        login.typeToPassword(UserCreds.AUTOR_PASSWORD);
        login.clickSubmit();
        Assert.assertTrue(index.verifyAutorPage());
    }


    @AfterMethod
    public void quitTest() {
        quitDriver(driver);
    }
}
