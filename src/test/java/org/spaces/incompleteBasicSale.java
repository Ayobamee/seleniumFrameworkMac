package org.spaces;


import org.spaces.PageObjects.myShopPage;
import org.testng.annotations.Test;
import spaces.signIn;
import java.io.IOException;


public class incompleteBasicSale extends signIn {

    @Test

    public void incompleteBasicSaleTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();

       //Create a shop page object
        myShopPage shopPage = new myShopPage(driver);

        //Click sale
        shopPage.getShop().makeSale();

        //Accept notification for sales
        //shopPage.getSaleNotification().acceptNotifcation();

       //Enter Sales Amount
        shopPage.getincompleteSaleAmount().enterIncompleteSaleAmount();

        //Select No as confirmation
        shopPage.getPaymentConfirmation().chooseNo();

        //Enter specific incomplete sale amount
        shopPage.getspecificIncompleteSaleAmount().enterSpecificIncompleteSaleAmount();

        //Enter Customer Phone Number
        shopPage.getcustomerPhoneNumber().enterCustomerPhoneNo();

        //Enter Customer Phone Name
       shopPage.getcustomerName().enterCustomerName();

       //Click Add sale
       shopPage.getaddIncompleteSales().hitIncompleteSale();



    //Assert Incomplete simple sale has been done successfully
        if(shopPage.getSimpleSaleConfirmation().checkSimpleSaleConfirmation()){

            System.out.println("Incomplete basic sale has been made successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        driver.quit();

    }

}
