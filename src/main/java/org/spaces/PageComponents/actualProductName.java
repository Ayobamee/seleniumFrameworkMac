package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class actualProductName extends AbstractComponent {
    WebDriver driver;
    By actualProductName = By.xpath("//body/div[@id='root']/div[2]/main[1]/form[1]/div[1]/div[1]/div[1]/input[1]");

    public actualProductName(WebDriver driver, By actualProductName) {
        super(driver, actualProductName);
    }

    public void enterActualProductName()
    {
        findElement(actualProductName).sendKeys("1");


    }
}
