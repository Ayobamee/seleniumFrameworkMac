package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;


public class Notification extends AbstractComponent {
    WebDriver driver;


    By notificationButton = By.xpath("//button[contains(text(),\"I'll do this later\")]");




    public Notification(WebDriver driver, By notificationButton) {
        super(driver, notificationButton);
    }





    public void allowNotification ()

    {
        findElement(notificationButton).click();
    }





}
