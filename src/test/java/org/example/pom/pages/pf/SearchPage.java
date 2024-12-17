package org.example.pom.pages.pf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver driver;

    //Constructor
    public SearchPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Locators
    //By txtSearchBoxLocator=By.name("q");
    //By btnSearchSubmitLocator=By.name("btnK");
    @FindBy(name="q")
    WebElement txtSearchBox;
    @FindBy(name="btnK")
    WebElement btnSearchSubmit;

    //Actions
    public void setSearchText(String searchText){

        txtSearchBox.sendKeys(searchText);
    }

    public void clickSearchButton(){
        btnSearchSubmit.submit();
    }

}
