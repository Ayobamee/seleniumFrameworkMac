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

        //scroll
        shortScroll();

        //Place order.
        shopPage.getplaceOrder().clickOrder();

        //Confirm address.
        shopPage.getconfirmDeliveryAddress().clickAddress();


        //select address.
        shopPage.getcontactAddress().clickContactAddress();

        //save delivery address
        shopPage.getselectDeliveryAddress().saveAddress();


        //choose delivery method
        shopPage.getselectselectDeliveryMethod().clickProvider();

        //scroll
        shortScroll();

        //choose delivery provider
        shopPage.getdeliveryProviders().chooseProvider();

        //click select
        shopPage.getselectProvider().clickSelect();

        //scroll
        shortScroll();

        //Click continue
        shopPage.getcontinueCheckOut().clickContinue();

        //choose spaces wallet
        shopPage.getspacesWallet().clickSpacesWallet();

        //scroll
        shortScroll();

        //Proceed to summary
        shopPage.getproceedToSummary().clickProceed();

        //scroll
        shortScroll();

        //Click Pay
        shopPage.getpay().clickPay();


        //Assert order can be placed successfully

        if(shopPage.getorderNotification().orderConfirmation()){

            System.out.println("Order has been placed successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }



    }



    //short scroll method.
    private void shortScroll() throws InterruptedException {
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);

    }
}
