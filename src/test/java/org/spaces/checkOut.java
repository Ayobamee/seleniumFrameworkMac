package org.spaces;

import org.openqa.selenium.JavascriptExecutor;
import org.spaces.PageObjects.myShopPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//Add product to cart
public class checkOut extends addProductToCart {

    @Test
    public void checkOutTest() throws InterruptedException, IOException {
        //Create a shop page  object.
        myShopPage shopPage = new myShopPage(driver);

        //click check out
        shopPage.getcheckOut().clickCheckOut();

        shortScroll();

        //Place order.
        shopPage.getplaceOrder().clickOrder();

        //Confirm address.
        shopPage.getconfirmDeliveryAddress().clickAddress();

        //select address.
        shopPage.getcontactAddress().clickContactAddress();

        //shortScroll();
/*
        //Choose city
        shopPage.getcity().chooseCity();

        //Choose Lagos
        shopPage.getselectCity().chooseCity();

        //Save delivery details
        shopPage.getsaveDeliveryDetails().save();
*/


    }



    //short scroll method.
    private void shortScroll() throws InterruptedException {
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);

    }
}
