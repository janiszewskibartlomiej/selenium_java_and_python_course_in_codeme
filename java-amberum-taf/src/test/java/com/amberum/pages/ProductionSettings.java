package com.amberum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductionSettings {

    private WebDriver driver;

    public ProductionSettings(WebDriver driver) {
        this.driver = driver;
    }

    public int getGrinderyWorkingTimecardDelayDays() {
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h5/a")).click();
        String a =  driver.findElement(
                By.xpath("//label[.='Liczba dni, po upłynięciu których, karta pracy szlifowania uznawana jest za opóźnioną']/following-sibling::input"))
                .getAttribute("value");
        return Integer.parseInt(a);
    }

}
