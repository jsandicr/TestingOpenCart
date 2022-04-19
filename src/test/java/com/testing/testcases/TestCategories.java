package com.testing.testcases;
import com.testing.pages.LoginPage;
import org.junit.Test;

public class TestCategories extends TestBase {
    
    @Test
    public void verifyCreateCategories(){
        LoginPage adminLoginPage = new LoginPage(driver);
        adminLoginPage.login("user", "12345678");
    }
    
}
