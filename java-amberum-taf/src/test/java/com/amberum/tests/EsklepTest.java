package com.amberum.tests;

import com.amberum.pages.eSklep.*;
import com.amberum.tools.WebDriverFactory;
import com.amberum.pages.login.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class EsklepTest {

    private WebDriver driver;

    @BeforeEach
    public void prepareForTest() {
        driver = WebDriverFactory.getWebDriver();
        driver.get("https://test.amberum.com");
        new LoginPage(driver).login();
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }

    @Test
    public void dashboardTest() {
        //AAA

        //Arrange
        DashboardPage dashboardPage = new DashboardPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToDashboard();

        //Assert
        Assertions.assertEquals("Pulpit", dashboardPage.readPageHeader());

    }

    @Test
    public void pulpitTest() {
        //AAA

        //Arrange
        DashboardPage pulpit = new DashboardPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToPulpit();

        //Assert
        Assertions.assertEquals("Pulpit", pulpit.readPageHeader());

    }

    @Test
    public void configurationTest() {
        //AAA

        //Arrange
        ConfigurationPage configurationPage = new ConfigurationPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToConfig();

        //Assert
        Assertions.assertEquals("Konfiguracja", configurationPage.readPageHeader());
        Assertions.assertEquals("Podstawowa", configurationPage.readPageSpan());

    }

    @Test
    public void primaryConfigTest() {
        //AAA

        //Arrange
        ConfigurationPage primConfigPage = new ConfigurationPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToPrimaryConfig();

        //Assert
        Assertions.assertEquals("Konfiguracja", primConfigPage.readPageHeader());
        Assertions.assertEquals("Podstawowa", primConfigPage.readPageSpan());

    }

    @Test
    public void homeConfigTest() {
        //AAA

        //Arrange
        HomeConfigPage homeConfigPage = new HomeConfigPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToHomeConfigPage();

        //Assert
        Assertions.assertEquals("Konfiguracja", homeConfigPage.readPageHeader());
        Assertions.assertEquals("Strona główna", homeConfigPage.readPageSpan());

    }

    @Test
    public void menuConfigTest() {
        //AAA

        //Arrange
        MenuConfigPage menuConfigPage = new MenuConfigPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToMenuConfigPage();

        //Assert
        Assertions.assertEquals("Konfiguracja", menuConfigPage.readPageHeader());
        Assertions.assertEquals("Menu e-sklepu", menuConfigPage.readPageSpan());

    }

    @Test
    public void aboutConfigTest() {
        //AAA

        //Arrange
        AboutConfigPage aboutConfigPage = new AboutConfigPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToAboutConfigPage();

        //Assert
        Assertions.assertEquals("Konfiguracja", aboutConfigPage.readPageHeader());
        Assertions.assertEquals("O firmie", aboutConfigPage.readPageSpan());

    }

    @Test
    public void regulationsConfigTest() {
        //AAA

        //Arrange
        RegulationsConfigPage regulationsConfigPage = new RegulationsConfigPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToRegulationsConfigPage();

        //Assert
        Assertions.assertEquals("Konfiguracja", regulationsConfigPage.readPageHeader());
        Assertions.assertEquals("Regulaminy", regulationsConfigPage.readPageSpan());

    }

    @Test
    public void informationConfigTest() {
        //AAA

        //Arrange
        InformationConfigPage informationConfigPage = new InformationConfigPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToInformationConfigPage();

        //Assert
        Assertions.assertEquals("Konfiguracja", informationConfigPage.readPageHeader());
        Assertions.assertEquals("Informacje", informationConfigPage.readPageSpan());

    }

    @Test
    public void shipmentAndPaymentConfigTest() {
        //AAA

        //Arrange
        ShipmentAndPaymentConfigPage shipmentAndPaymentConfigPage = new ShipmentAndPaymentConfigPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToShipmentAndPaymentConfigPage();

        //Assert
        Assertions.assertEquals("Konfiguracja", shipmentAndPaymentConfigPage.readPageHeader());
        Assertions.assertEquals("Dostawa i płatność", shipmentAndPaymentConfigPage.readPageSpan());

    }

    @Test
    public void saleTest() {
        //AAA

        //Arrange
        SalePage salePage = new SalePage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToShopSale();

        //Assert
        Assertions.assertEquals("Sprzedaż", salePage.readPageHeader());

    }

    @Test
    public void activityTest() {
        //AAA

        //Arrange
        ActivityPage activityPage = new ActivityPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);

        //Act
        sideMenuPage.goToActivity();

        //Assert
        Assertions.assertEquals("Statystyki sklepu", activityPage.readPageHeader());

    }

}