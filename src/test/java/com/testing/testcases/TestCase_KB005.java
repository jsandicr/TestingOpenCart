package com.testing.testcases;

import com.testing.pages.Gift;
import org.junit.Assert;
import org.junit.Test;

public class TestCase_KB005 extends TestBase{
    
    @Test
    public void GiftCerficate(){
        Gift gift=new Gift(driver);
        gift.openPage();
        gift.fillInputs();
        String expectedMessage="Purchase a Gift Certificate";
        String actualMessage=gift.checkPage();
        Assert.assertTrue("El gift no fue enviado con exito", actualMessage.contains(expectedMessage));
    }
}