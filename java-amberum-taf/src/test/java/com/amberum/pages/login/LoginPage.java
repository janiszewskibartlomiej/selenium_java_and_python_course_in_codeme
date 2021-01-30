package com.amberum.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.urlContains("/login"));

        driver.findElement(By.id("login")).sendKeys(System.getenv("LOGIN_USER"));
        driver.findElement(By.id("password")).sendKeys(System.getenv("LOGIN_PASSWORD"));
        driver.findElement(By.id("doLogin")).click();

        WebElement menu = driver.findElement(By.id("side-menu"));
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(menu));
    }

}
