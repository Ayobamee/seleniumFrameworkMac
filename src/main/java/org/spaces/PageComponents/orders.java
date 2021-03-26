package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class orders extends AbstractComponent {
    WebDriver driver;
    By orders = By.xpath("//p[contains(text(),'Orders')]");
    public orders(WebDriver driver, By orders) {
        super(driver, orders);
    }

    public boolean checkOrders()
    {
        findElement(orders);
        return true;
    }


}
