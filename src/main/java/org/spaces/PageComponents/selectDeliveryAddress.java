package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class selectDeliveryAddress extends AbstractComponent {
    WebDriver driver;
    By selectDeliveryAddress = By.xpath("//button[contains(text(),'Select')]");
    public selectDeliveryAddress(WebDriver driver, By selectDeliveryAddress) {
        super(driver, selectDeliveryAddress);
    }

    public void saveAddress()
    {
        findElement(selectDeliveryAddress).click();


    }

}
