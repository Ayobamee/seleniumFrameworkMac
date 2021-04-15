package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class orderNotification extends AbstractComponent {
    WebDriver driver;
    By orderNotification = By.xpath("//h5[contains(text(),'Your order has been created successfully')]");

    public orderNotification(WebDriver driver, By orderNotification) {
        super(driver, orderNotification);
    }


    public boolean orderConfirmation()
    {
        findElement(orderNotification);
        return true;
    }
}
