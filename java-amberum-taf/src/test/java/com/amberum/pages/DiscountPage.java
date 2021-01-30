package com.amberum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiscountPage {
    private WebDriver driver;

    public DiscountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getDiscountPageHeader(){
        WebElement header = driver.findElement(By.xpath("//h2"));
        return header.getText();
    }
}
