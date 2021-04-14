package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class deliveryProviders extends AbstractComponent {
    WebDriver driver;
    By deliveryProviders = By.xpath("//p[contains(text(),'Free Shipping')]");
    public deliveryProviders(WebDriver driver, By deliveryProviders) {
        super(driver, deliveryProviders);
    }

    public void chooseProvider()
    {
        findElement(deliveryProviders).click();


    }
}
