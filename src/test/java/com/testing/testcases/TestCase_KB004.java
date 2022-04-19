package com.testing.testcases;

import com.testing.pages.CheckMoney;
import org.junit.Assert;
import org.junit.Test;

public class TestCase_KB004 extends TestBase{
    
    @Test
    public void changeMoney(){
        String money="euro";
        CheckMoney checkMoney = new CheckMoney(driver);
        checkMoney.changeMoney(money);
        String expectedMessage="";
        String actualMessage=checkMoney.verifiedChange();
        if(money.equals("euro")){
            expectedMessage="€";
        }
        if(money.equals("libra")){
            expectedMessage="£";
        }
        if(money.equals("dolar")){
            expectedMessage="$";
        }
        Assert.assertTrue("La moneda no fue cambiada con exito", actualMessage.contains(expectedMessage));
    }
}