package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class specificIncompleteSaleAmount extends AbstractComponent {

    WebDriver driver;

    By specificIncompleteSaleAmount = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[3]/input[1]");


    public specificIncompleteSaleAmount(WebDriver driver, By specificIncompleteSaleAmount) {
        super(driver, specificIncompleteSaleAmount);
    }


    public void enterSpecificIncompleteSaleAmount()

    {
        findElement(specificIncompleteSaleAmount).sendKeys("3000");
    }

}
