package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class acceptState extends AbstractComponent {
    WebDriver driver;
    By acceptState = By.xpath("//button[contains(text(),'Okay')]");
    public acceptState(WebDriver driver, By acceptState) {
        super(driver, acceptState);
    }

    public void clickOkay()
    {
        findElement(acceptState).click();


    }


}
