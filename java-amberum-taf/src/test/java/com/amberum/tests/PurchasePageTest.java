package com.amberum.tests;

import com.amberum.pages.PurchasePage;
import com.amberum.pages.SideMenuPage;
import com.amberum.tools.WebDriverFactory;
import com.amberum.pages.login.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class PurchasePageTest {
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
    public void testPurchasePageIsDisplayed(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        SideMenuPage sideMenuPage = new SideMenuPage(driver);
        sideMenuPage.selectPartnershipTab();

        PurchasePage purchasePage = new PurchasePage(driver);
        sideMenuPage.openPurchasePage();

        Assertions.assertEquals("Zakupy",purchasePage.getPurchasePageHeader());
    }
}
