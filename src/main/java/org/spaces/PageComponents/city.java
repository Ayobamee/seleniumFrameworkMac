package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class city extends AbstractComponent {
    WebDriver driver;
    By city = By.xpath("//body/div[@id='root']/main[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[2]/div[1]/*[1]");;
    public city(WebDriver driver, By city) {
        super(driver, city);
    }

    public void chooseCity ()
    {
        findElement(city).click();


    }
}
