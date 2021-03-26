package org.spaces.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.PageComponents.*;

public class spacesLandingPage {

    By continueElement = By.xpath("//button[contains(text(),'Continue with phone number')]");
    By phoneNofield = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/div[2]/input[1]");
    By secondContinueElement = By.xpath("//button[contains(text(),'Continue')]");
    By fillFirstPin = By.xpath("//input[@id='1']");
    By loginButton = By.xpath("//button[contains(text(),'Login')]");
    By notificationButton = By.xpath("//button[contains(text(),\"I'll do this later\")]");





    WebDriver driver;

    public spacesLandingPage(WebDriver driver) {

        this.driver = driver;


    }

    public void goTo()
    {
        driver.get("https://staging.spaceso2o.com/launch");
    }



    public StartUpBar getStartUpBar()
    {

        return new StartUpBar(driver, continueElement);
    }



    public FillPhoneNoBar getFillPhoneNoBar()
    {

        return new FillPhoneNoBar(driver,phoneNofield);
    }



    public secondContinue getsecondContinueElement()
    {

        return new secondContinue(driver,secondContinueElement);
    }


  public FillPassword getFillPassword()

  {
      return new FillPassword(driver, fillFirstPin);
  }


    public Login getLogin()

    {
        return new Login(driver, loginButton);
    }

    public Notification getNotification()

    {
        return new Notification(driver, notificationButton);
    }


}
