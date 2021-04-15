package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class pay extends AbstractComponent {
    WebDriver driver;
    By pay= By.xpath("//button[contains(text(),'Pay')]");
    public pay(WebDriver driver, By pay) {
        super(driver, pay);
    }


    public void clickPay()
    {
        findElement(pay).click();


    }
}
