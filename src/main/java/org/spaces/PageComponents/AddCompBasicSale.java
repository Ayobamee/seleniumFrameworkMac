package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class AddCompBasicSale extends AbstractComponent {

    WebDriver driver;

    By addSimpleCompSale = By.xpath("//button[contains(text(),'Add Sale')]");

    public AddCompBasicSale(WebDriver driver, By addSimpleCompSale) {
        super(driver, addSimpleCompSale);
    }


    public void hitAddSale()

    {
        findElement(addSimpleCompSale).click();
    }



}
