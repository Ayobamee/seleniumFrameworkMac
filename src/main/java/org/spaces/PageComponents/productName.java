package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class productName extends AbstractComponent {
    WebDriver driver;
    By productName  = By.xpath("//body/div[@id='root']/main[1]/div[1]/form[1]/div[1]/div[1]/input[1]");

    public productName(WebDriver driver, By productName) {
        super(driver, productName);
    }

    public void enterProductName()
    {
        findElement(productName).sendKeys("1");


    }

}
