package org.spaces;

//import org.junit.Test;

import org.spaces.PageObjects.myShopPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;

public class orders extends signIn {

    @Test

    public void ordersTest() throws InterruptedException, IOException {
        //Sign into the app.
        driver =  signIn();

        //Create a shop page In object
        myShopPage shopPage = new myShopPage(driver);

        //Click shop
        shopPage.getmainShop().clickShop();


    //Assert Orders data populates.
        if(shopPage.getorders().checkOrders()){

            System.out.println("Orders data is visible");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        driver.quit();

    }

}
