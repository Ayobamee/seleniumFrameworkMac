package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class selectDeliveryMethod  extends AbstractComponent {
    WebDriver driver;
    By selectDeliveryMethod = By.xpath("//button[contains(text(),'Choose delivery provider')]");
    public selectDeliveryMethod(WebDriver driver, By selectDeliveryMethod) {
        super(driver, selectDeliveryMethod);
    }


    public void clickProvider()
    {
        findElement(selectDeliveryMethod).click();


    }
}
