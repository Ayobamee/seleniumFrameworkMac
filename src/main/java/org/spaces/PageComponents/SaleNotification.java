package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class SaleNotification extends AbstractComponent {

    WebDriver driver;

    By saleNotifcation = By.xpath("//button[contains(text(),\"Okay, got it\")]");



    public SaleNotification(WebDriver driver, By saleNotifcation) {
        super(driver, saleNotifcation);
    }



    public void acceptNotifcation ()
    {
        findElement(saleNotifcation).click();


    }


}
