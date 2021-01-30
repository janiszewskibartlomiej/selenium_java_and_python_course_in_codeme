package com.amberum.pages.login;

import com.amberum.tools.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

    private WebDriver driver;

    @BeforeEach
    public void prepareForTest() {
        driver = WebDriverFactory.getWebDriver();
        driver.get("https://test.amberum.com");
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }

    @Test
    public void testLogin() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.urlContains("/login"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        Assertions.assertTrue(driver.findElement(By.className("profile-element")).isDisplayed());
    }

}
