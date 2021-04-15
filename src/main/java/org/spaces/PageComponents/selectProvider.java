package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class selectProvider extends AbstractComponent {
    WebDriver driver;
    By selectProvider = By.xpath("//button[contains(text(),'Select')]");
    public selectProvider(WebDriver driver, By selectProvider) {
        super(driver, selectProvider);
    }

    public void clickSelect()
    {
        findElement(selectProvider).click();


    }
}
