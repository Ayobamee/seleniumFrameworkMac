package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class stateLocation extends AbstractComponent {
    WebDriver driver;
    By stateLocation = By.xpath("//body/div[@id='root']/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]");


    public stateLocation(WebDriver driver, By stateLocation) {
        super(driver, stateLocation);
    }


    public void chooseState()
    {
        findElement(stateLocation).click();


    }
}
