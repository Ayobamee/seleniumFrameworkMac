package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class continueCheckOut extends AbstractComponent {
    WebDriver driver;
    By continueCheckOut = By.xpath("//button[contains(text(),'Continue')]");

    public continueCheckOut(WebDriver driver, By continueCheckOut) {
        super(driver, continueCheckOut);
    }

    public void clickContinue()
    {
        findElement(continueCheckOut).click();


    }

}
