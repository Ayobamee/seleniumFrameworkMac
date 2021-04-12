package spaces;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.spaces.PageObjects.spacesLandingPage;


public class signIn {
    public WebDriver driver;
    public Properties prop;


    public WebDriver  signIn () throws IOException, InterruptedException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//utilities//datadriven.properties");
        prop.load(fis);

        if (prop.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver89");
            driver = new ChromeDriver();


        }

        else if(prop.getProperty("browser").equals("firefox")) {
            driver = new FirefoxDriver();

        }

        else {

            driver = new InternetExplorerDriver();

        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Open spaces home page.
        driver.get(prop.getProperty("URL"));

        //Create an object from the spaces landing page.
        spacesLandingPage spacesLpage = new spacesLandingPage(driver);


        //Set fingerprint.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("localStorage.clear();");
        js.executeScript("localStorage.setItem('fingerPrint', '6343a9cf-1a2b-4d27-a74c-ff095522b594');");


        //Select continue
        spacesLpage.getStartUpBar().selectContinue();

        //Enter phone number
        spacesLpage.getFillPhoneNoBar().inputPhoneNo();

        //Click second button
        spacesLpage.getsecondContinueElement().secondContinueButton();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Enter first Pin
        spacesLpage.getFillPassword().inputFirstPin();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Enter Second Pin
        spacesLpage.getFillPassword().inputSecondPin();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Enter Third Pin
        spacesLpage.getFillPassword().inputThirdPin();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Enter Fourth Pin
        spacesLpage.getFillPassword().inputFourthPin();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Enter Fifth Pin
        spacesLpage.getFillPassword().inputFifthPin();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Enter Sixth Pin
        spacesLpage.getFillPassword().inputSixthPin();

        //Click login
        spacesLpage.getLogin().hitLogin();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Click Allow notification
        spacesLpage.getNotification().allowNotification();


        return driver;
    }

}
