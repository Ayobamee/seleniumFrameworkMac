package org.spaces;

import org.spaces.PageObjects.myShopPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;


public class merchBuyDashboard extends signIn {

    @Test

        public void productCategoriesTest() throws InterruptedException, IOException {

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
