package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;


public class Login extends AbstractComponent {

    WebDriver driver;

    By loginButton = By.xpath("//button[contains(text(),'Login')]");






    public Login(WebDriver driver, By loginButton) {
        super(driver, loginButton);
    }


    public void hitLogin ()
    {
        findElement(loginButton).click();


    }



}
