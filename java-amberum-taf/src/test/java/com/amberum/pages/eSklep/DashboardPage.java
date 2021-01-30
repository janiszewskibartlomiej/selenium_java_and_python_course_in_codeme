package com.amberum.pages.eSklep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String readPageHeader() {
        return driver.findElement(By.cssSelector("#page-wrapper ol h2")).getText();
    }

}

