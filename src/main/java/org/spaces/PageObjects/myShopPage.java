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

}
