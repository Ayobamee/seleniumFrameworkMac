package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class spacesWallet extends AbstractComponent {
    WebDriver driver;
    By spacesWallet = By.xpath("//p[contains(text(),'Spaces Wallet')]");
    public spacesWallet(WebDriver driver, By spacesWallet) {
        super(driver, spacesWallet);
    }


    public void clickSpacesWallet()
    {
        findElement(spacesWallet).click();


    }
}
