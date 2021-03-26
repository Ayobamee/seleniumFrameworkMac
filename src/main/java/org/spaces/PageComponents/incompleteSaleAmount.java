package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class incompleteSaleAmount extends AbstractComponent {

    WebDriver driver;

    By incompleteSaleAmount = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/input[1]");

    public incompleteSaleAmount(WebDriver driver, By incompleteSaleAmount) {
        super(driver, incompleteSaleAmount);
    }

    public void enterIncompleteSaleAmount()

    {
        findElement(incompleteSaleAmount).sendKeys("4000");
    }


}
