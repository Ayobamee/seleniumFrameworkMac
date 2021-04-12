package org.spaces;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.spaces.PageObjects.myShopPage;
import spaces.signIn;
import java.io.IOException;


public class placeOrder extends signIn {

    @Test

        public void placeOrderTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver =  signIn();

        //Create a shop page  object.
        myShopPage shopPage = new myShopPage(driver);

        //Click MerchBuy
        shopPage.getmerchBuy().clickMerchBuy();

        //Select Location
        shopPage.getstateLocation().chooseState();

        //Click Lagos
        shopPage.getselectLagos().clickLagos();

        //Click Okay
        shopPage.getacceptState().clickOkay();

        //Scroll down
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);

        //choose product
        shopPage.getmerchBuyprod().clickProd();





/*
    //Assert complete simple sale has been done successfully

        if(shopPage.getSimpleSaleConfirmation().checkSimpleSaleConfirmation()){

            System.out.println("Complete Basic sale has been made successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        driver.quit();
        */


    }

}
