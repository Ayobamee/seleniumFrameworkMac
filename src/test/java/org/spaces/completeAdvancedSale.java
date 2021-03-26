package org.spaces;


import org.openqa.selenium.JavascriptExecutor;
import org.spaces.PageObjects.myShopPage;
import org.testng.annotations.Test;
import spaces.signIn;
import java.io.IOException;

public class completeAdvancedSale extends signIn {

    @Test
    public void completeAdvancedSaleTest() throws InterruptedException, IOException {

        //Sign into the app.
        driver = signIn();

        //Create a shop page In object
        myShopPage shopPage = new myShopPage(driver);


        //Click sale
        shopPage.getShop().makeSale();

        //driver.findElement(By.tagName("input")).sendKeys("2000");

        //Accept notification for sales
        shopPage.getSaleNotification().acceptNotifcation();

        //Click Advanced Sale
       shopPage.getadvancedSale().clickAdvancedSale();

        //Accept notification for sales
        shopPage.getSaleNotification().acceptNotifcation();

        //click add products
        shopPage.getaddProducts().clickAddProduct();

        //Add a particular product
        shopPage.getaddSpecProd().clickSpecificProduct();

        //Confirm specific product
        shopPage.getconfirmProd().reaffirmProduct();

        //Input Payment Amount
        shopPage.getadvancedSaleAmount().inputPaymentAmount();

        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);

        //Click Advanced sale.
        shopPage.getAddCompBasicSale().hitAddSale();

    //Assert complete simple sale has been done successfully
        if(shopPage.getSimpleSaleConfirmation().checkSimpleSaleConfirmation()){

            System.out.println("Complete advanced complete sale has been made successfully");
        }
        else{
            System.out.println("Oops, something went wrong");
        }

        driver.quit();

    }

}
