package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class productCategories extends AbstractComponent {
    WebDriver driver;
    By productCategories = By.xpath("//p[contains(text(),'Product categories')]");


    public productCategories(WebDriver driver, By productCategories) {
        super(driver, productCategories);
    }

    public boolean checkProductCat()
    {
        findElement(productCategories);
        return true;
    }
}
