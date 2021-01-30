package com.amberum.tests;

import com.amberum.pages.AnalysisPage;
import com.amberum.tools.WebDriverFactory;
import com.amberum.pages.login.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AnalysisTest {
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
    public void analysisDashboardTest() throws InterruptedException {
        // Arrange
        AnalysisPage analysisPage = new AnalysisPage(driver);
        analysisPage.goToPage("dashboard");
        // Act
        analysisPage.waitForDashboardToAppear();
        // Assert
        Assertions.assertEquals("Pulpit", analysisPage.getTitle());
    }

    @Test
    public void analysisLossTest() throws InterruptedException {
        // Arrange
        AnalysisPage analysisPage = new AnalysisPage(driver);
        analysisPage.goToPage("loss");
        // Act
        analysisPage.waitForDashboardToAppear();
        // Assert
        Assertions.assertEquals("Ubytki", analysisPage.getTitle());
    }


}
