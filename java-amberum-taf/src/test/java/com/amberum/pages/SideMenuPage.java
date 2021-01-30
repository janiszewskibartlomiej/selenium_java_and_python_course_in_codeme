package com.amberum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SideMenuPage {
    private WebDriver driver;

    public SideMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectPartnershipTab(){
        WebElement partnershipTab = driver.findElement(By.id("partnership"));
        partnershipTab.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.urlContains("/contractor"));
    }

    public void openContractorPage(){
        WebElement contractorTab = driver.findElement(By.id("contractor"));
        contractorTab.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.urlContains("/contractor"));
    }
    /* inna wersja - do przeanalizowania
        public com.amberum.pages.ContractorPage openContractorPage(){
        WebElement contractorTab = driver.findElement(By.id("contractor"));
        contractorTab.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.urlContains("/contractor"));
        return new com.amberum.pages.ContractorPage(driver);
    }*/

    public void openDiscountPage(){
        WebElement discountTab = driver.findElement(By.id("contractor-discount"));
        discountTab.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.urlContains("/discount"));
    }
    public void openPurchasePage(){
        WebElement discountTab = driver.findElement(By.id("purchase"));
        discountTab.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.urlContains("/purchase"));
    }

    public void goToProductionSettings(){
        driver.findElement(By.id("settings")).click();
        driver.findElement(By.id("settings-production")).click();
    }

}
