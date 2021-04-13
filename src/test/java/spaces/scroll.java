package spaces;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class scroll {

    WebDriver driver;

    public scroll(WebDriver driver) throws InterruptedException {

        this.driver = driver;


        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);


    }





        //return new scroll(driver);










}
