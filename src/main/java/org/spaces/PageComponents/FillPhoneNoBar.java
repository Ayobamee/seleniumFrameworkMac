package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class FillPhoneNoBar extends AbstractComponent {
    WebDriver driver;

    By phoneNofield = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[2]/input[1]");




    public FillPhoneNoBar(WebDriver driver, By phoneNofield)
    {
        super(driver, phoneNofield);
    }



    public void inputPhoneNo ()
    {
        findElement(phoneNofield).sendKeys("07060406267");


    }

}
