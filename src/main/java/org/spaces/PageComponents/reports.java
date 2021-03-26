package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class reports extends AbstractComponent {
    WebDriver driver;
    By reports = By.xpath("//p[contains(text(),'Reports')]");

    public reports(WebDriver driver, By reports) {
        super(driver, reports);
    }


    public boolean checkReports()
    {
        findElement(reports);
        return true;
    }
}
