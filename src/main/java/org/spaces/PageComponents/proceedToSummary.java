package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class proceedToSummary extends AbstractComponent {
    WebDriver driver;
    By proceedToSummary = By.xpath("//button[contains(text(),'Proceed to Summary')]");
    public proceedToSummary(WebDriver driver, By proceedToSummary) {
        super(driver, proceedToSummary);
    }

    public void clickProceed()
    {
        findElement(proceedToSummary).click();


    }
}
