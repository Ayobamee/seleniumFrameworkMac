package org.spaces;

//import org.junit.Test;

import org.spaces.PageObjects.myShopPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;

public class inventory extends signIn {

    @Test

    public void inventoryTest() throws InterruptedException, IOException {
        //Sign into the app.
        driver =  signIn();

        //Create a shop page In object
        myShopPage shopPage = new myShopPage(driver);

        //Click shop
        shopPage.getmainShop().clickShop();


    //Assert Inventory data populates.
        if(shopPage.getinventory().checkInventory()){

            System.out.println("Inventory data is visible");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        driver.quit();

    }

}
