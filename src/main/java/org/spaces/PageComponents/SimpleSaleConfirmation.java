package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class SimpleSaleConfirmation extends AbstractComponent {

    WebDriver driver;

    By simpleSaleConfirmation = By.xpath("//div[contains(text(),'Sale successfully created')]");


    public SimpleSaleConfirmation(WebDriver driver, By simpleSaleConfirmation) {
        super(driver, simpleSaleConfirmation);
    }



    public boolean checkSimpleSaleConfirmation()
    {
        findElement(simpleSaleConfirmation);
        return true;
    }


}
