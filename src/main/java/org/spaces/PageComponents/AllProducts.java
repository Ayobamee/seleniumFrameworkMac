package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class AllProducts  extends AbstractComponent {
    WebDriver driver;
    By AllProducts = By.xpath("//p[contains(text(),'All products')]");

    public AllProducts(WebDriver driver, By AllProducts) {
        super(driver, AllProducts);
    }

    public boolean checkAllProducts()
    {
        findElement(AllProducts);
        return true;
    }
}
