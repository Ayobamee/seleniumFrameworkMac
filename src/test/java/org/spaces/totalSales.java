package org.spaces;

//import org.junit.Test;

import org.spaces.PageObjects.myShopPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;

public class totalSales extends signIn {

    @Test

    public void totalSalesTest() throws InterruptedException, IOException {
        //Sign into the app.
        driver =  signIn();

        //Create a shop page In object
        myShopPage shopPage = new myShopPage(driver);

        //Click shop
        shopPage.getmainShop().clickShop();


    //Assert Total sales data populates.
        if(shopPage.gettotalSales().checkTotalSales()){

            System.out.println("Total sales record is visible");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        driver.quit();

    }

}
