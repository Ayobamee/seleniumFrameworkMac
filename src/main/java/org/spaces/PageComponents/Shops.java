package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class Shops extends AbstractComponent {
    WebDriver driver;
    By Shops = By.xpath("//p[contains(text(),'Shops')]");
    public Shops(WebDriver driver, By Shops) {
        super(driver, Shops);
    }

    public boolean checkShops()
    {
        findElement(Shops);
        return true;
    }
}
