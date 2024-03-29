package com.amberum.pages.eSklep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationConfigPage {

    private WebDriver driver;

    public InformationConfigPage(WebDriver driver) {
        this.driver = driver;
    }

    public String readPageHeader() {
        return driver.findElement(By.cssSelector("#page-wrapper ol h2")).getText();
    }

    public String readPageSpan() {
        return driver.findElement(By.cssSelector("#page-wrapper ol span")).getText();
    }

}
