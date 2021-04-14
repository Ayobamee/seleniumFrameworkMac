package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class confirmDeliveryAddress  extends AbstractComponent {
    WebDriver driver;
    By confirmDeliveryAddress = By.xpath("//button[contains(text(),'Confirm delivery address')]");
    public confirmDeliveryAddress(WebDriver driver, By confirmDeliveryAddress) {
        super(driver, confirmDeliveryAddress);
    }

    public void clickAddress ()
    {
        findElement(confirmDeliveryAddress).click();


    }
}
