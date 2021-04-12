package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class popularProducts extends AbstractComponent {
    WebDriver driver;
    By popularProducts = By.xpath("//p[contains(text(),'Popular products')]");
    public popularProducts(WebDriver driver, By popularProducts) {
        super(driver, popularProducts);
    }


    public boolean checkPopularProducts()
    {
        findElement(popularProducts);
        return true;
    }
}
