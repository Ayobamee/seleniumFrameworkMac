package org.spaces;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.spaces.PageObjects.myShopPage;
import spaces.signIn;
import spaces.scroll;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class addProductToCart extends signIn {

    @Test

        public void addProductToCartTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver =  signIn();

        //Create a shop page  object.
        myShopPage shopPage = new myShopPage(driver);

        //Click MerchBuy.
        shopPage.getmerchBuy().clickMerchBuy();

        //Select Location.
        shopPage.getstateLocation().chooseState();

        //Click Lagos.
        shopPage.getselectLagos().clickLagos();

        //Click Okay.
        shopPage.getacceptState().clickOkay();

        //Scroll down
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //choose product.
        shopPage.getmerchBuyprod().clickProd();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click first prod.
        shopPage.getfirstMerchBuyProd().clickProd();

        //scroll down to particular product
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);

        //Click add to cart.
        shopPage.getaddToCart().chooseCart();

        //Confirm add to cart.
        shopPage.getsecondAddToCart().chooseSecondCart();


    //Assert product can be added to cart successfully

        if(shopPage.getcartConfirmation().checkCartConfirmation()){

            System.out.println("Product has been added to cart successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        driver.quit();



    }

}
