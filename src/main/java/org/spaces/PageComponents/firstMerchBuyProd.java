package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class firstMerchBuyProd extends AbstractComponent {
    WebDriver driver;
    By firstMerchBuyProd = By.xpath("//div[contains(text(),'new fish')]");

    public firstMerchBuyProd(WebDriver driver, By firstMerchBuyProd) {
        super(driver, firstMerchBuyProd);
    }


    public void clickProd()
    {
        findElement(firstMerchBuyProd).click();


    }
}
