package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class checkOut  extends AbstractComponent {
    WebDriver driver;
    By checkOut = By.xpath("//button[contains(text(),'Checkout')]");
    public checkOut(WebDriver driver, By checkOut) {
        super(driver, checkOut);
    }

    public void clickCheckOut ()
    {
        findElement(checkOut).click();


    }

}
