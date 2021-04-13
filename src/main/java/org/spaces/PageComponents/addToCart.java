package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class addToCart  extends AbstractComponent {
    WebDriver driver;
    By addToCart = By.xpath("//button[contains(text(),'Add To Cart')]");

    public addToCart(WebDriver driver, By addToCart) {
        super(driver, addToCart);
    }

    public void chooseCart()
    {
        findElement(addToCart).click();


    }

}
