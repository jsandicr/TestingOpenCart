package com.testing.testcases;
import com.testing.pages.HomePage;
import com.testing.pages.LoginPage;
import junit.framework.Assert;
import org.junit.Test;

public class TestCase_KB001 extends TestBase{
    
    @Test
    public void verifyLoginCorrect(){
        
        //Open login page
        HomePage homePage = new HomePage(driver);
        homePage.navigateToLoginPage();
        
        //login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("jsandicr16@gmail.com", "12345678");
        
        //Validate login
        String expectedMessage = "My Account";
        String actualMessage = loginPage.verified();
        
        System.out.println(actualMessage);
        Assert.assertTrue("No se inicio sesion correctamente", actualMessage.contains(expectedMessage));
    }
}