package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class secondAddToCart extends AbstractComponent {
    WebDriver driver;
    By secondAddToCart = By.xpath("//button[contains(text(),'Add to cart')]");
    public secondAddToCart(WebDriver driver, By secondAddToCart) {
        super(driver, secondAddToCart);
    }

    public void chooseSecondCart()
    {
        findElement(secondAddToCart).click();


    }
}
