package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class saveDeliveryDetails extends AbstractComponent {
    WebDriver driver;
    By saveDeliveryDetails = By.xpath("//button[contains(text(),'Save')]");
    public saveDeliveryDetails(WebDriver driver, By saveDeliveryDetails) {
        super(driver, saveDeliveryDetails);
    }

    public void save()
    {
        findElement(saveDeliveryDetails).click();


    }
}
