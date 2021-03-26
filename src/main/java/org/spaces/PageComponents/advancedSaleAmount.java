package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class advancedSaleAmount extends AbstractComponent {

    WebDriver driver;
    By advancedSaleAmount = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[2]/input[1]");
    public advancedSaleAmount(WebDriver driver, By advancedSaleAmount) {
        super(driver, advancedSaleAmount);
    }

    public void inputPaymentAmount()

    {
        findElement(advancedSaleAmount).sendKeys("1000000");
    }

}
