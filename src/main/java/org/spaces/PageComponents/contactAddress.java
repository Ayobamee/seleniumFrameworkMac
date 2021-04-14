package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class contactAddress extends AbstractComponent {
    WebDriver driver;
    By contactAddress = By.xpath("//body/div[@id='root']/main[1]/div[1]/ul[2]/div[1]/div[1]");

    public contactAddress(WebDriver driver, By contactAddress) {
        super(driver, contactAddress);
    }

    public void clickContactAddress ()
    {
        findElement(contactAddress).click();


    }

}
