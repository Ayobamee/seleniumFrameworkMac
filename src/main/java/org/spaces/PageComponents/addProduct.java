package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class addProduct extends AbstractComponent {
    WebDriver driver;
    By addProduct = By.xpath("//body/div[@id='root']/main[1]/div[2]/section[3]/div[2]/div[3]");

    public addProduct(WebDriver driver, By addProduct) {
        super(driver, addProduct);
    }

    public void clickProduct()
    {
        findElement(addProduct).click();


    }

}
