package org.spaces;

import org.openqa.selenium.JavascriptExecutor;
import org.spaces.PageObjects.myShopPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;


public class merchBuyDashboard extends signIn {

    @Test

        public void merchBuyDashboardTest() throws InterruptedException, IOException {

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



    //Assert merchBuy data loads
        if(shopPage.getproductCategories().checkProductCat() &&
                shopPage.getShops().checkShops() &&
                shopPage.getpopularProducts().checkPopularProducts() &&
                shopPage.getAllProducts().checkAllProducts()
        ){

            System.out.println("Merch Buy dashboard loads successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        //driver.quit();



    }

}
