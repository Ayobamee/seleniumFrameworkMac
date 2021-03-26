package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class secondContinue extends AbstractComponent {

    WebDriver driver;
    By secondContinueElement = By.xpath("//button[contains(text(),'Continue')]");



    public secondContinue(WebDriver driver, By secondContinueElement) {

        super(driver,secondContinueElement);

    }



    public void secondContinueButton()
    {
        findElement(secondContinueElement).click();


    }






}
