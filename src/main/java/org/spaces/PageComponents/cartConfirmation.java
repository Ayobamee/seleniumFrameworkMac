package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class cartConfirmation extends AbstractComponent {
    WebDriver driver;
    By cartConfirmation = By.xpath("//body/div[@id='root']/main[1]/section[1]");

    public cartConfirmation(WebDriver driver, By cartConfirmation) {
        super(driver, cartConfirmation);
    }


    public boolean checkCartConfirmation()
    {
        findElement(cartConfirmation);
        return true;
    }
}
