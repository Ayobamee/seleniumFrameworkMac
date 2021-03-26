package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

import java.util.Random;

public class customerPhoneNumber extends AbstractComponent {

    public static String randomfourdigits()
    {  //int randomPin declared to store the otp
        //since we using Math.random() hence we have to type cast it int
        //because Math.random() returns decimal value
        int randomdig   =(int) (Math.random()*9000)+1000;
        String digit  = String.valueOf(randomdig);
        return digit; //returning value of otp
    }


    WebDriver driver;

    By customerPhoneNumber = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[6]/div[1]/div[1]/input[1]");

    public customerPhoneNumber(WebDriver driver, By customerPhoneNumber) {
        super(driver, customerPhoneNumber);
    }
    String fourdigits = randomfourdigits();

    public void enterCustomerPhoneNo ()
    {
        findElement(customerPhoneNumber).sendKeys("0809090"+fourdigits);


    }
}
