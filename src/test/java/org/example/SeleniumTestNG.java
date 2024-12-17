package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class SeleniumTestNG {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.out.printf("Hello and welcome to Selenium!");
        //System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/chrome-win64/chrome.exe");

        //Create a WebDriver Object
        driver = new ChromeDriver();
        driver.get("https://google.co.in");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testFunctionalitySearchofSelenium(){
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        WebElement searchSubmitBtn = driver.findElement(By.name("btnK"));
        searchSubmitBtn.submit();
    }

    @Test
    public void testFunctionalitySearchofGithub(){

        //Assert if Page Title is as Expected
        Assert.assertEquals(driver.getTitle(),"Google");
        //Locators and Web Elements
        WebElement searchBox = driver.findElement(By.name("q"));
        //Actions
        searchBox.sendKeys("sureshdtrainer github");
        //Locators and Web Elements
        WebElement searchSubmitBtn = driver.findElement(By.name("btnK"));
        //Actions
        searchSubmitBtn.submit();
        System.out.println(driver.getTitle());
        //Validations: Assert if Title has changed and not null
        Assert.assertNotEquals(driver.getTitle(), "Google");
        Assert.assertNotNull(driver.getTitle());
    }

    @AfterMethod
    public void afterMethod(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Close and Quite
        driver.quit(); //
    }
}
