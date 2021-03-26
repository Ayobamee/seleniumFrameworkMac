package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

public class PaymentConfirmation extends AbstractComponent {

    WebDriver driver;

    By customerNotPayInFull = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[2]/div[1]/label[1]");

    public PaymentConfirmation(WebDriver driver, By customerNotPayInFull) {
        super(driver, customerNotPayInFull);
    }


    public void chooseNo()

    {
        findElement(customerNotPayInFull).click();
    }
}
