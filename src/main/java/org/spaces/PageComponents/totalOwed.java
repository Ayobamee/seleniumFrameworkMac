package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class totalOwed extends AbstractComponent {
    WebDriver driver;
    By totalOwed = By.xpath("//p[contains(text(),'Total Owed')]");

    public totalOwed(WebDriver driver, By totalOwed) {
        super(driver, totalOwed);
    }

    public boolean checkTotalOwed()
    {
        findElement(totalOwed);
        return true;
    }
}
