package com.amberum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContractorPage {
    private WebDriver driver;

    public ContractorPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getContractorPageHeader(){
        WebElement header = driver.findElement(By.xpath("//h2"));
        return header.getText();
    }

}
