package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome to Selenium!");
        //System.setProperty("webdriver.chrome.driver","C:/Users/user/Downloads/chrome-win64/chrome.exe");

        //Create a WebDriver Object
        WebDriver driver = new ChromeDriver();
               //Open https://google.co.in
        driver.get("https://google.co.in");

        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " +pageTitle);
        System.out.println("Current URL:" + driver.getCurrentUrl());
        System.out.println("Page Source: "+driver.getPageSource());

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        WebElement searchSubmitBtn = driver.findElement(By.name("btnK"));
        searchSubmitBtn.submit();

        Thread.sleep(5000);
        //Close and Quite
        driver.quit(); //
    }
}