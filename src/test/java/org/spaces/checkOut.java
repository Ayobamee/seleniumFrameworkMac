package org.spaces;

import org.openqa.selenium.JavascriptExecutor;
import org.spaces.PageObjects.myShopPage;
import org.testng.annotations.Test;
import spaces.signIn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class checkOut extends addProductToCart {

    @Test
        public void checkOutTest() throws InterruptedException, IOException {

        //Create a shop page  object.
        myShopPage shopPage = new myShopPage(driver);

        //click check out
        shopPage.getcheckOut().clickCheckOut();



    }

}
