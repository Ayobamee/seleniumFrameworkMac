package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class SaleAmount extends AbstractComponent {

    WebDriver driver;

    By saleAmount = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/input[1]");

    public SaleAmount(WebDriver driver, By saleAmount) {
        super(driver, saleAmount);
    }



    public void enterSalesAmount()
    {
        findElement(saleAmount).sendKeys("2000");

    }


}
