package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class advancedSale extends AbstractComponent {
    WebDriver driver;
    By advancedSale = By.xpath("//h5[contains(text(),'Advanced Sale')]");

    public advancedSale(WebDriver driver, By advancedSale) {
        super(driver, advancedSale);
    }

    public void clickAdvancedSale()

    {
        findElement(advancedSale).click();
    }
}
