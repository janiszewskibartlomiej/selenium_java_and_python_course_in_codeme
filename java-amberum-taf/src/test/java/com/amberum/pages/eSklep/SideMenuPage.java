package com.amberum.pages.eSklep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SideMenuPage {

    private WebDriver driver;

    public SideMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToDashboard() {
        driver.findElement(By.id("shop")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.urlContains("dashboard"));
    }

    public void goToPulpit() {
        goToDashboard();
        driver.findElement(By.id("shop-dashboard")).click();
    }

    public void goToActivity() {
        goToDashboard();
        driver.findElement(By.cssSelector("[href*=\"stats\"]")).click();
    }

    public void goToAboutConfigPage() {
        goToConfig();
        driver.findElement(By.id("shop-settings-aboutcompany")).click();
    }

    public void goToConfig() {
        goToDashboard();
        driver.findElement(By.id("shop-settings")).click();
    }

    public void goToPrimaryConfig() {
        goToConfig();
        driver.findElement(By.id("shop-settings-general")).click();
    }

    public void goToHomeConfigPage() {
        goToConfig();
        driver.findElement(By.id("shop-settings-homepage")).click();
    }

    public void goToInformationConfigPage() {
        goToConfig();
        driver.findElement(By.id("shop-settings-information")).click();
    }

    public void goToMenuConfigPage() {
        goToConfig();
        driver.findElement(By.id("shop-custom-menu")).click();
    }

    public void goToRegulationsConfigPage() {
        goToConfig();
        driver.findElement(By.id("shop-settings-regulations")).click();
    }

    public void goToShopSale() {
        goToDashboard();
        driver.findElement(By.id("shop-sale")).click();
    }

    public void goToShipmentAndPaymentConfigPage() {
        goToConfig();
        driver.findElement(By.cssSelector("[href*=\"shipmentandpayment\"]")).click();
    }

}
