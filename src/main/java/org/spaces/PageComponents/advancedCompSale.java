package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class advancedCompSale extends AbstractComponent {
    WebDriver driver;
    By advancedCompSale = By.xpath("/html[1]/body[1]/div[2]/main[1]/form[1]/button[2]");


    public advancedCompSale(WebDriver driver, By advancedCompSale) {
        super(driver, advancedCompSale);
    }


    public void clickAdvancedSale()

    {
        findElement(advancedCompSale).click();
    }
}
