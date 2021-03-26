package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class confirmProd extends AbstractComponent {
    WebDriver driver;
    By confirmProd = By.xpath("//button[contains(text(),'Add 1 Product')]");

    public confirmProd(WebDriver driver, By confirmProd) {
        super(driver, confirmProd);
    }

    public void reaffirmProduct()

    {
        findElement(confirmProd).click();
    }
}
