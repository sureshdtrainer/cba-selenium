package org.example.testcases;

import org.example.pom.pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://google.co.in");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearchWithSearchText(){
        //pom
        SearchPage sp=new SearchPage(driver);
        //test logic
        sp.setSearchText("Selenium");
        sp.clickSearchButton();
        //Validations
        Assert.assertNotEquals(driver.getTitle(), "Google");
        Assert.assertNotNull(driver.getTitle());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }
}
