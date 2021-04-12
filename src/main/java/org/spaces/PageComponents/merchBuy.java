package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class merchBuy extends AbstractComponent {
    WebDriver driver;
    By merchBuy = By.xpath("//body/div[@id='root']/main[1]/div[2]/section[1]/div[2]/div[1]");


    public merchBuy(WebDriver driver, By merchBuy) {
        super(driver, merchBuy);
    }


    public void clickMerchBuy()
    {
        findElement(merchBuy).click();


    }
}
