package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class inventory  extends AbstractComponent {
    WebDriver driver;
    By inventory = By.xpath("//p[contains(text(),'Inventory')]");

    public inventory(WebDriver driver, By inventory) {
        super(driver, inventory);
    }


    public boolean checkInventory()
    {
        findElement(inventory);
        return true;
    }
}
