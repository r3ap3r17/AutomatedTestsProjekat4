package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class IndexPage extends BasePageClass{
    protected final By homeMessage = By.xpath("//h1[text()='Dobro došli na sajt!']");
    protected final By sluzbenikMenu = By.xpath("//a[text()='Popuni listice']");
    protected final By autorMenu = By.xpath("//a[text()='Moje ankete']");
    protected final By adminMenu = By.xpath("//a[text()='Registracije']");

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyIspitanikPage() {
        WebElement element = driver.findElement(homeMessage);
        return element.isDisplayed();
    }

    public boolean verifySluzbenikPage() {
        WebElement element = driver.findElement(sluzbenikMenu);
        return element.isDisplayed();
    }

    public boolean verifyAutorPage() {
        WebElement element = driver.findElement(autorMenu);
        return element.isDisplayed();
    }

    public boolean verifyAdminPage() {
        WebElement element = driver.findElement(adminMenu);
        return element.isDisplayed();
    }
}
