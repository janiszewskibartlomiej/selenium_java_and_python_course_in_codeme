package com.amberum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchasePage {
    private WebDriver driver;

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPurchasePageHeader(){
        WebElement header = driver.findElement(By.xpath("//h2"));
        return header.getText();
    }
}
