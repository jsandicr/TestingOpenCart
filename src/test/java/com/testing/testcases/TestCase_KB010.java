package com.testing.testcases;

import com.testing.pages.Returns;
import junit.framework.Assert;
import org.junit.Test;

public class TestCase_KB010 extends TestBase{
    @Test
    public void productReturns() throws InterruptedException{
        Returns returns = new Returns(driver);
        returns.openPage();
        returns.fillInputs();
        String expectedMessage="Thank you for submitting your return request. Your request has been sent to the relevant department for processing.";
        String actualMessage=returns.verified();
        Assert.assertTrue("No se realizo la devolucion con exito", actualMessage.contains(expectedMessage));
    }
}