package com.amberum.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnalysisPage {
    private WebDriver driver;

    public AnalysisPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage(String page) throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='analysis']/span")).click();
        driver.findElement(By.id("analysis-" + page)).click();
    }

    public String getTitle() throws InterruptedException {
        return driver.findElement(By.cssSelector("[data-cy='breadcrumb-bold-0']")).getText();
    }

    public void waitForDashboardToAppear() {
        WebElement dashboardLink = this.driver.findElement(By.id("analysis-dashboard"));
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(dashboardLink));
    }
}
