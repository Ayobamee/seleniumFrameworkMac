package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class addProducts extends AbstractComponent {

    WebDriver driver;

    By addProducts = By.xpath("//button[contains(text(),'Add product(s)')]");

    public addProducts(WebDriver driver, By addProducts) {
        super(driver, addProducts);
    }

    public void clickAddProduct()

    {
        findElement(addProducts).click();
    }
}
