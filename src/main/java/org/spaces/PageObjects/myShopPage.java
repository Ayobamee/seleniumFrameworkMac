package org.spaces.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.spaces.PageComponents.*;

public class myShopPage {

    By myShop = By.xpath("//body/div[@id='root']/main[1]/div[2]/section[3]/div[2]/div[2]");
    By saleNotifcation = By.xpath("//button[contains(text(),\"Okay, got it\")]");
    By saleAmount = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/input[1]");
    By incompleteSaleAmount = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[1]/input[1]");
    By addSimpleCompSale = By.xpath("//button[contains(text(),'Add Sale')]");
    By simpleSaleConfirmation = By.xpath("//div[contains(text(),'Sale successfully created')]");
    By customerNotPayInFull = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[2]/div[1]/label[1]");
    By specificIncompleteSaleAmount = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[3]/input[1]");
    By customerPhoneNumber = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[6]/div[1]/div[1]/input[1]");
    By customerName = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[6]/div[2]/input[1]");
    By addIncompleteSale = By.xpath("//button[contains(text(),'Add Sale')]");
    By advancedSale = By.xpath("//h5[contains(text(),'Advanced Sale')]");
    By addProducts = By.xpath("//button[contains(text(),'Add product(s)')]");
    By addSpecProd = By.xpath("//p[contains(text(),'On call pluc II blood glucose test strips - 0g')]");
    By confirmProd = By.xpath("//button[contains(text(),'Add 1 Product')]");
    By advancedSaleAmount = By.xpath("//body/div[@id='root']/main[1]/form[1]/div[2]/input[1]");
    By advancedCompSale = By.xpath("/html[1]/body[1]/div[2]/main[1]/form[1]/button[2]");
    By addProduct = By.xpath("//body/div[@id='root']/main[1]/div[2]/section[3]/div[2]/div[3]");
    By addSingleProduct = By.xpath("//h4[contains(text(),'Add a single product')]");
    By productName  = By.xpath("//body/div[@id='root']/main[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
    By actualProductName = By.xpath("//body/div[@id='root']/div[2]/main[1]/form[1]/div[1]/div[1]/div[1]/input[1]");
    By mainShop = By.xpath("//body/div[@id='root']/main[1]/div[2]/section[3]/div[2]/div[1]");
    By totalSales = By.xpath("//p[contains(text(),'Total Sales')]");
    By totalOwed = By.xpath("//p[contains(text(),'Total Owed')]");
    By inventory = By.xpath("//p[contains(text(),'Inventory')]");
    By orders = By.xpath("//p[contains(text(),'Orders')]");
    By reports = By.xpath("//p[contains(text(),'Reports')]");
    By merchBuy = By.xpath("//body/div[@id='root']/main[1]/div[2]/section[1]/div[2]/div[1]");
    By stateLocation = By.xpath("//body/div[@id='root']/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]");
    By selectLagos = By.xpath("//div[contains(text(),'Lagos')]");
    By acceptState = By.xpath("//button[contains(text(),'Okay')]");
    By productCategories = By.xpath("//p[contains(text(),'Product categories')]");
    By Shops = By.xpath("//p[contains(text(),'Shops')]");
    By AllProducts = By.xpath("//p[contains(text(),'All products')]");
    By popularProducts = By.xpath("//p[contains(text(),'Popular products')]");
    By merchBuyprod = By.xpath("//body/div[@id='root']/main[1]/div[4]/div[1]/div[2]/a[1]");
    By firstMerchBuyProd = By.xpath("//div[contains(text(),'new fish')]");
    By addToCart = By.xpath("//button[contains(text(),'Add To Cart')]");
    By secondAddToCart = By.xpath("//button[contains(text(),'Add to cart')]");
    By cartConfirmation = By.xpath("//body/div[@id='root']/main[1]/section[1]");
    By checkOut = By.xpath("//button[contains(text(),'Checkout')]");
    By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
    By confirmDeliveryAddress = By.xpath("//button[contains(text(),'Confirm delivery address')]");
    By contactAddress = By.xpath("//body/div[@id='root']/main[1]/div[1]/ul[2]/div[1]/div[1]");
    By city = By.xpath("//body/div[@id='root']/main[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[2]/div[1]/*[1]");
    By selectCity = By.xpath("//div[contains(text(),'AKUTE')]");
    By saveDeliveryDetails = By.xpath("//button[contains(text(),'Save')]");
    By selectDeliveryAddress = By.xpath("//button[contains(text(),'Select')]");
    By selectDeliveryMethod = By.xpath("//button[contains(text(),'Choose delivery provider')]");
    By deliveryProviders = By.xpath("//p[contains(text(),'Free Shipping')]");




    WebDriver driver;

    public myShopPage(WebDriver driver) {

        this.driver = driver;


    }


    public Shop getShop()
    {

        return new Shop(driver, myShop);
    }

    public SaleNotification getSaleNotification()


    {

        return new SaleNotification(driver, saleNotifcation);
    }


    public SaleAmount getSaleAmount()
    {
        return new SaleAmount(driver, saleAmount);
    }


    public incompleteSaleAmount getincompleteSaleAmount()
    {
        return new incompleteSaleAmount(driver, incompleteSaleAmount);
    }



    public AddCompBasicSale getAddCompBasicSale()
    {
        return new AddCompBasicSale(driver, addSimpleCompSale);
    }


    public SimpleSaleConfirmation getSimpleSaleConfirmation()
    {
        return new SimpleSaleConfirmation(driver, simpleSaleConfirmation);
    }

    public PaymentConfirmation getPaymentConfirmation()
    {
        return new PaymentConfirmation(driver, customerNotPayInFull);
    }


    public specificIncompleteSaleAmount getspecificIncompleteSaleAmount()
    {
        return new specificIncompleteSaleAmount(driver, specificIncompleteSaleAmount);
    }


    public customerPhoneNumber getcustomerPhoneNumber()
    {
        return new customerPhoneNumber(driver,customerPhoneNumber);
    }


    public customerName getcustomerName()
    {
        return new customerName(driver, customerName);
    }


    public addIncompleteSales getaddIncompleteSales()
    {
        return new addIncompleteSales(driver, addIncompleteSale);
    }

    public advancedSale getadvancedSale(){
        return new advancedSale(driver, advancedSale);
    }

    public addProducts getaddProducts()
    {
        return new addProducts(driver, addProducts);
    }

    public addSpecProd getaddSpecProd()
    {
        return new addSpecProd(driver, addSpecProd);
    }

    public confirmProd getconfirmProd()
    {
        return new confirmProd(driver, confirmProd);
    }


    public advancedSaleAmount getadvancedSaleAmount()
    {
        return new advancedSaleAmount(driver, advancedSaleAmount);
    }

    public advancedCompSale getadvancedCompSale()
    {
        return new advancedCompSale(driver, advancedCompSale);
    }

    public addProduct getaddProduct()
    {
        return new addProduct(driver, addProduct);
    }

    public addSingleProduct getaddSingleProduct()
    {
        return new addSingleProduct(driver, addSingleProduct);
    }


    public productName getproductName()
    {
        return new productName(driver, productName);
    }

    public actualProductName getactualProductName()
    {
        return new actualProductName(driver, actualProductName);
    }

    public mainShop getmainShop()
    {
        return new mainShop(driver, mainShop);
    }

    public totalSales gettotalSales()
    {
        return new totalSales(driver, totalSales);
    }

    public totalOwed gettotalOwed()
    {
        return new totalOwed(driver, totalOwed);
    }

    public inventory getinventory()
    {
        return new inventory(driver, inventory);
    }

    public orders getorders()
    {
        return new orders(driver, orders);
    }

    public reports getreports()
    {
        return new reports(driver, reports);
    }

    public merchBuy getmerchBuy()
    {
        return new merchBuy(driver, merchBuy);
    }


    public stateLocation getstateLocation()
    {
        return new stateLocation(driver, stateLocation);
    }


    public selectLagos getselectLagos()
    {
        return new selectLagos(driver, selectLagos);
    }


    public acceptState getacceptState()
    {
        return new acceptState(driver, acceptState);
    }

    public productCategories getproductCategories()
    {
        return new productCategories(driver, productCategories);
    }

    public Shops getShops()
    {
        return new Shops(driver, Shops);
    }



    public AllProducts getAllProducts()
    {
        return new AllProducts(driver, AllProducts);
    }



    public popularProducts getpopularProducts()
    {
        return new popularProducts(driver, popularProducts);
    }



    public merchBuyprod getmerchBuyprod()
    {
        return new merchBuyprod(driver, merchBuyprod);
    }


    public firstMerchBuyProd getfirstMerchBuyProd()
    {
        return new firstMerchBuyProd(driver, firstMerchBuyProd);
    }


    public addToCart getaddToCart()
    {
        return new addToCart(driver, addToCart);
    }


    public secondAddToCart getsecondAddToCart()
    {
        return new secondAddToCart(driver, secondAddToCart);
    }


    public cartConfirmation getcartConfirmation()
    {
        return new cartConfirmation(driver, cartConfirmation);
    }


    public checkOut getcheckOut()
    {
        return new checkOut(driver, checkOut);
    }

    public placeOrder getplaceOrder()
    {
        return new placeOrder(driver, placeOrder);
    }


    public confirmDeliveryAddress getconfirmDeliveryAddress()
    {
        return new confirmDeliveryAddress(driver, confirmDeliveryAddress);
    }



   public contactAddress getcontactAddress() {
       return new contactAddress(driver, contactAddress);
   }



    public city getcity() {
        return new city(driver, city);
    }

    public selectCity getselectCity() {
        return new selectCity(driver, selectCity);
    }


    public saveDeliveryDetails getsaveDeliveryDetails() {
        return new saveDeliveryDetails(driver, saveDeliveryDetails);
    }


    public selectDeliveryAddress getselectDeliveryAddress() {
        return new selectDeliveryAddress(driver, selectDeliveryAddress);
    }

    public selectDeliveryMethod getselectselectDeliveryMethod() {
        return new selectDeliveryMethod(driver, selectDeliveryMethod);
    }


    public deliveryProviders getdeliveryProviders() {
        return new deliveryProviders(driver, deliveryProviders);
    }

}






