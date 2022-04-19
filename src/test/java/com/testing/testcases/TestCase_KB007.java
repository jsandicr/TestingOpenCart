package com.testing.testcases;

import com.testing.pages.AddProduct;
import com.testing.pages.CheckCupon;
import junit.framework.Assert;
import org.junit.Test;

public class TestCase_KB007 extends TestBase{
    
    @Test
    public void useCupon() throws InterruptedException{
        AddProduct addProduct=new AddProduct(driver);
        addProduct.add("cart");
        CheckCupon checkCupon=new CheckCupon(driver);
        checkCupon.openCart();
        String expectedMessage="Success: Your coupon discount has been applied!";
        String actualMessage=checkCupon.verfied();
        Assert.assertTrue("El cupon no fue aplicado correctamente", actualMessage.contains(expectedMessage));
    }
}