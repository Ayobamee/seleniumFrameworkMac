package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class addIncompleteSales extends AbstractComponent {

    WebDriver driver;

    By addIncompleteSale = By.xpath("//button[contains(text(),'Add Sale')]");

    public addIncompleteSales(WebDriver driver, By addIncompleteSale) {
        super(driver, addIncompleteSale);
    }


    public void hitIncompleteSale ()
    {
        findElement(addIncompleteSale).click();


    }

}
