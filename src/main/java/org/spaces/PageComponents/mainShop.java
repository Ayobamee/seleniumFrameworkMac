package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class mainShop extends AbstractComponent {
    WebDriver driver;
    By mainShop = By.xpath("//body/div[@id='root']/main[1]/div[2]/section[3]/div[2]/div[1]");

    public mainShop(WebDriver driver, By mainShop) {
        super(driver, mainShop);
    }

    public void clickShop()
    {
        findElement(mainShop).click();


    }


}
