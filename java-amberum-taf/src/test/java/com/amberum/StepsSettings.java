package com.amberum;

import com.amberum.pages.ProductionSettings;
import com.amberum.pages.SideMenuPage;
import com.amberum.pages.login.LoginPage;
import com.amberum.tools.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepsSettings {
    private WebDriver driver;

    @Before
    public void setUp()
    {
        driver = WebDriverFactory.getWebDriver();
        driver.get("https://test.amberum.com");
    }

    @After
    public void tearDown()
    {
        driver.close();
    }

    @Given("User reads current value for gridery working time card is expired")
    public void userReadsCurrentValueForGrideryWorkingTimeCardIsExpired() {
        int delay = new ProductionSettings(driver).getGrinderyWorkingTimecardDelayDays();
    }

    @Given("Stores this value for refence")
    public void storesThisValueForRefence() {
    }

    @When("User enters {int} days for gridery working time card is expired")
    public void userEntersDaysForGrideryWorkingTimeCardIsExpired(int arg0) {
    }

    @Then("After page reload the value is different from reference value")
    public void afterPageReloadTheValueIsDifferentFromReferenceValue() {
    }

    @Given("User is logged in")
    public void userIsLoggedIn() {
        new LoginPage(driver).login();
    }

    @Given("User is in Production Settings section")
    public void goToProductionSection() {
        new SideMenuPage(driver).goToProductionSettings();
    }

}
