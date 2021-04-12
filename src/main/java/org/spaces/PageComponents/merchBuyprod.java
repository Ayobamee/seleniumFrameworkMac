package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class merchBuyprod  extends AbstractComponent {
    WebDriver driver;
    By merchBuyprod = By.xpath("//body/div[@id='root']/main[1]/div[4]/div[1]/div[2]/a[1]");
    public merchBuyprod(WebDriver driver, By merchBuyprod) {
        super(driver, merchBuyprod);
    }

    public void clickProd()
    {
        findElement(merchBuyprod).click();


    }

}
