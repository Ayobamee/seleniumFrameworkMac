package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class addSpecProd  extends AbstractComponent {

    WebDriver driver;
    By addSpecProd = By.xpath("//p[contains(text(),'On call pluc II blood glucose test strips - 0g')]");

    public addSpecProd(WebDriver driver, By addSpecProd) {
        super(driver, addSpecProd);
    }

    public void clickSpecificProduct()

    {
        findElement(addSpecProd).click();
    }

}


