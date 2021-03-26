package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class StartUpBar extends AbstractComponent {
   WebDriver driver;

 By continueElement = By.xpath("//button[contains(text(),'Continue with phone number')]");


    public StartUpBar(WebDriver driver, By continueElement) {
        super(driver,continueElement ); //when inheriting parent class, invoke parent class constructor in child class constructor



    }


    public void selectContinue ()
    {
        findElement(continueElement).click();


    }




}
