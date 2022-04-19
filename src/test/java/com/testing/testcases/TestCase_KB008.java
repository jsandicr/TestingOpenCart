package com.testing.testcases;

import com.testing.pages.AddProduct;
import com.testing.pages.CheckCost;
import com.testing.pages.CheckCupon;
import org.junit.Assert;
import org.junit.Test;

public class TestCase_KB008 extends TestBase{
    
    @Test
    public void viewCost() throws InterruptedException{
        AddProduct addProduct = new AddProduct(driver);
        addProduct.add("cart");
        CheckCost checkCost = new CheckCost(driver);
        checkCost.checkData();
        String expectedMessage="$5.00";
        String actualMessage=checkCost.verified();
        Assert.assertTrue("No se calcularon los taxes con exito", actualMessage.contains(expectedMessage));
    }
}