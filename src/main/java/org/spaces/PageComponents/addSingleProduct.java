package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class addSingleProduct  extends AbstractComponent {
    WebDriver driver;
    By addSingleProduct = By.xpath("//h4[contains(text(),'Add a single product')]");

    public addSingleProduct(WebDriver driver, By addSingleProduct) {
        super(driver, addSingleProduct);
    }

    public void clickSingleProduct()
    {
        findElement(addSingleProduct).click();


    }
}
