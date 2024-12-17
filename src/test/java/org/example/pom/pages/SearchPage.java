package org.example.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    //Constructor
    public SearchPage(WebDriver driver) {
        this.driver=driver;
    }
    //Locators
    By txtSearchBoxLocator=By.name("q");
    By btnSearchSubmitLocator=By.name("btnK");

    //Actions
    public void setSearchText(String searchText){
        driver.findElement(txtSearchBoxLocator).sendKeys(searchText);
    }

    public void clickSearchButton(){
        driver.findElement(btnSearchSubmitLocator).submit();

    }

}
