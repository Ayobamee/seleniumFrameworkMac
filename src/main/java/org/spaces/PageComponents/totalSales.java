package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class totalSales extends AbstractComponent {
    WebDriver driver;
    By totalSales = By.xpath("//p[contains(text(),'Total Sales')]");

    public totalSales(WebDriver driver, By totalSales) {
        super(driver, totalSales);
    }

    public boolean checkTotalSales()
    {
        findElement(totalSales);
        return true;
    }

}
