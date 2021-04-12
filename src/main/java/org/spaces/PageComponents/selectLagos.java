package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class selectLagos  extends AbstractComponent {
    WebDriver driver;
    By selectLagos = By.xpath("//div[contains(text(),'Lagos')]");
    public selectLagos(WebDriver driver, By selectLagos) {
        super(driver, selectLagos);
    }

    public void clickLagos()
    {
        findElement(selectLagos).click();


    }


}
