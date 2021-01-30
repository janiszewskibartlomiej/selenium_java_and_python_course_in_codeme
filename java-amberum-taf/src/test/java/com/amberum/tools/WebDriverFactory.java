package com.amberum.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    public static WebDriver getWebDriver() {
        //WebDriver driver = getFirefoxDriver();
        WebDriver driver = getChromeDriver();
        // EdgeDriver driver = getEdgeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static FirefoxDriver getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", System.getenv("WEBDRIVER_CHROME_PATH"));
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
        return driver;
    }

    public static ChromeDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getenv("WEBDRIVER_CHROME_PATH"));
        ChromeDriver driver = new ChromeDriver();
        return driver;
    }

    public static EdgeDriver getEdgeDriver() {
        System.setProperty("webdriver.edge.driver", System.getenv("WEBDRIVER_EDGE_PATH"));
        EdgeDriver driver = new EdgeDriver();
        return driver;
    }

}
