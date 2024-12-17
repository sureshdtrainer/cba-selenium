package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Test
public class ResourceLocatorSeleniumTestNG {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        System.out.printf("Hello and welcome to Selenium!");
        //System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/chrome-win64/chrome.exe");

        //Create a WebDriver Object for EdgeDriver
        driver = new EdgeDriver();
        driver.get("file:///C:/Users/user/Downloads/html/index.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testById(){
        WebElement fname = driver.findElement(By.id("fname"));
        fname.clear();
        fname.sendKeys("Suresh By Id");
    }

    @Test
    public void testByXpath(){
        WebElement fname = driver.findElement(By.xpath("//*[@id='fname']"));
        fname.clear();
        fname.sendKeys("Suresh By Xpath");

    }


    @AfterClass
    public void tearDown(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Close and Quite
        driver.quit(); //
    }
}
