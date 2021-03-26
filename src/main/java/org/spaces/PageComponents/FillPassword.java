package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;



public class FillPassword extends AbstractComponent {
    WebDriver driver;

    By fillFirstPin = By.xpath("//input[@id='1']");
    By fillSecondPin = By.xpath("//input[@id='2']");
    By fillThirdPin = By.xpath("//input[@id='3']");
    By fillFourthPin = By.xpath("//input[@id='4']");
    By fillFifthPin = By.xpath("//input[@id='5']");
    By fillSixthPin = By.xpath("//input[@id='6']");




    public FillPassword(WebDriver driver, By fillFirstPin) {
        super(driver, fillFirstPin);
    }



    public void inputFirstPin ()
    {
        findElement(fillFirstPin).sendKeys("2");


    }

    public void inputSecondPin ()
    {
        findElement(fillSecondPin).sendKeys("3");


    }

    public void inputThirdPin ()
    {
        findElement(fillThirdPin).sendKeys("4");


    }

    public void inputFourthPin ()
    {
        findElement(fillFourthPin).sendKeys("5");


    }

    public void inputFifthPin ()
    {
        findElement(fillFifthPin).sendKeys("6");


    }


    public void inputSixthPin ()
    {
        findElement(fillSixthPin).sendKeys("7");


    }






}
