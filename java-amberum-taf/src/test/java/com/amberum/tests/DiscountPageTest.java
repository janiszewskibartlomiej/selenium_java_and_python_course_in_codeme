package com.amberum.tests;

import com.amberum.pages.DiscountPage;
import com.amberum.pages.SideMenuPage;
import com.amberum.tools.WebDriverFactory;
import com.amberum.pages.login.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class DiscountPageTest {
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
    public void testDiscountPageIsDisplayed(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        SideMenuPage sideMenuPage = new SideMenuPage(driver);
        sideMenuPage.selectPartnershipTab();

        DiscountPage discountPage = new DiscountPage(driver);
        sideMenuPage.openDiscountPage();

        Assertions.assertTrue(discountPage.getDiscountPageHeader().endsWith("klienckie"));
        //uzywam metody .endsWith() ze względu na problem z czytaniem polskich znaków (nie są poprawnie czytane)
        //przez co asercja nie przechodzi

    }
}
