package org.example.pages;

import org.example.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchYoutubeMusic {
    private final WebDriver driver;

    public SearchYoutubeMusic() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "searchbox")
    WebElement telusuri;

    @FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div[1]/div/div/div/button")
    WebElement textBox;

    @FindBy(xpath = "//*[@id=\"zeus-root\"]/div/div[2]/div/div[2]/div[2]/span/div/span")
    WebElement search;


    //Page Object

    public void klikTelusuri() {
        telusuri.click();
        System.out.println("Berhasil klik");
    }


    public void klikTextBox() {
        telusuri.click();
        System.out.println("Berhasil input ");
    }

    public void klikButtonSearch(){
        search.click();
        System.out.println("berhaisl klik button klik");
    }

}




