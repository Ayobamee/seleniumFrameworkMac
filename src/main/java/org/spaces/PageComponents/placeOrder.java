package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class placeOrder extends AbstractComponent {
    WebDriver driver;
    By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");

    public placeOrder(WebDriver driver, By placeOrder) {
        super(driver, placeOrder);
    }

    public void clickOrder ()
    {
        findElement(placeOrder).click();


    }
}
