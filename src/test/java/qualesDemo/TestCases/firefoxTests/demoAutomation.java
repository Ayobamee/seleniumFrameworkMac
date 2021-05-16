package qualesDemo.TestCases.firefoxTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import qualesDemo.DriverFactory.firefox;


public class demoAutomation  {
    public WebDriver driver;
    public String baseURL = "";


    @Test
    public void login() {
        //Open Browser
        System.out.println("Opening firefox browser");

        //Choose Chrome
        driver = firefox.open();

        driver.manage().window().maximize();





    }


    }


