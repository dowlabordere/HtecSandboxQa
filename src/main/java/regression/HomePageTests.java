package regression;

import framework.BrowserFactory;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;

import java.util.concurrent.TimeUnit;

public class HomePageTests {

    WebDriver driver;

    @Test
    public void goToLoginPage(){
        clickOnLoginPage();
    }

    public void clickOnLoginPage(){
        driver = BrowserFactory.startBrowser("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa-sandbox.apps.htec.rs/");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnLogin();
        Assert.assertEquals("Log In", driver.findElement(By.xpath("//h1")).getText());
    }

}
