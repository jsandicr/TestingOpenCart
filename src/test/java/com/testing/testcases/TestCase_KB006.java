package com.testing.testcases;

import com.testing.pages.AddProduct;
import com.testing.pages.CheckOut;
import org.junit.Assert;
import org.junit.Test;

public class TestCase_KB006 extends TestBase{
    
    @Test
    public void checkOut() throws InterruptedException{
        AddProduct addProduct = new AddProduct(driver);
        addProduct.add("cart");
        CheckOut checkOut= new CheckOut(driver);
        checkOut.openCheckout();
        checkOut.firstFillInputs();
        checkOut.secondFillInputs();
        checkOut.thirdFillInputs();
        checkOut.fourthFillInputs();
        checkOut.fifthFillInputs();
        checkOut.sixthFillInputs();
        String expectedMessage="Your order has been placed!";
        String actualMessage=checkOut.verifiedPay();
        Assert.assertTrue("El pago no se realizo correctamente", actualMessage.contains(expectedMessage));
    }   
}