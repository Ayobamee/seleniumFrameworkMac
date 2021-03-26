package org.spaces;

//import org.junit.Test;

import org.spaces.PageObjects.myShopPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;

public class totalOwed extends signIn {

    @Test

    public void totalOwedTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver =  signIn();

        //Create a shop page In object
        myShopPage shopPage = new myShopPage(driver);

        //Click shop
        shopPage.getmainShop().clickShop();


    //Assert Total owed data populates.
        if(shopPage.gettotalOwed().checkTotalOwed()){

            System.out.println("Total owed record is visible");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        driver.quit();

    }

}
