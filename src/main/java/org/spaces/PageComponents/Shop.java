package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class Shop extends AbstractComponent {
   WebDriver driver;

    By myShop = By.xpath("//body/div[@id='root']/main[1]/div[2]/section[3]/div[2]/div[2]");



    public Shop(WebDriver driver, By myShop) {
        super(driver,myShop ); //when inheriting parent class, invoke parent class constructor in child class constructor

    }


    public void makeSale()
    {
        findElement(myShop).click();


    }







}
