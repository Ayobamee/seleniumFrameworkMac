package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class selectCity extends AbstractComponent {
    WebDriver driver;
    By selectCity = By.xpath("//div[contains(text(),'AKUTE')]");
    public selectCity(WebDriver driver, By selectCity) {
        super(driver, selectCity);
    }

    public void chooseCity ()
    {
        findElement(selectCity).click();


    }
}
