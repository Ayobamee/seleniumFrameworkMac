package org.spaces.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.AbstractComponents.AbstractComponent;

import java.util.Random;

public class customerName extends AbstractComponent {

    public String randomAlphabet(int length) {
        Random random = new Random();
        final int alphabetLength = 'Z' - 'A' + 1;
        StringBuilder result = new StringBuilder(length);
        while (result.length() < length) {
            final char charCaseBit = (char) (random.nextInt(2) << 5);
            result.append((char) (charCaseBit | ('A' + random.nextInt(alphabetLength))));
        }
        return result.toString();
    }

    WebDriver driver;

    By customerName = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[6]/div[2]/input[1]");

    public customerName(WebDriver driver, By customerName) {
        super(driver, customerName);
    }

    String alpha = randomAlphabet(6);
    public void enterCustomerName ()
    {
        findElement(customerName).sendKeys("AutoCust"+alpha);


    }

}
