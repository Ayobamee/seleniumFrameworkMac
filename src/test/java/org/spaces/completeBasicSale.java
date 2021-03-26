package org.spaces;
import org.testng.annotations.Test;
import org.spaces.PageObjects.myShopPage;
import spaces.signIn;
import java.io.IOException;


public class completeBasicSale extends signIn {

    @Test

        public void completeBasicSaleTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver =  signIn();

        //Create a shop page In object.
        myShopPage shopPage = new myShopPage(driver);

        //Click sale.
        shopPage.getShop().makeSale();

        //Accept notification for sales.
        shopPage.getSaleNotification().acceptNotifcation();

       //Enter Sales Amount.
        shopPage.getSaleAmount().enterSalesAmount();

        //Click Add Sale.
        shopPage.getAddCompBasicSale().hitAddSale();

    //Assert complete simple sale has been done successfully

        if(shopPage.getSimpleSaleConfirmation().checkSimpleSaleConfirmation()){

            System.out.println("Complete Basic sale has been made successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        driver.quit();

    }

}
