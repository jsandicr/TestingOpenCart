package com.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProduct {
    WebDriver driver;
    
    public AddProduct(WebDriver driver){
        this.driver=driver;
    }
    
    public void add(String accion){
        String position="";
        if(accion.equals("cart")){
            position="1";
        }
        if(accion.equals("wishList")){
            position="2";
        }
        driver.findElement(By.cssSelector(".product-layout:nth-child(2) .product-thumb .button-group button:nth-child("+position+")")).click();     
    }
    
    public String verifiedCart(){
        driver.findElement(By.cssSelector("#cart button")).click();
        String message=driver.findElement(By.cssSelector(".dropdown-menu li p")).getText();
        return message.trim();
    }
    
    public String verifiedWishList(){
        driver.findElement(By.cssSelector(".pull-right ul li:nth-child(3)")).click();
        LoginPage loginPage =  new LoginPage(driver);
        loginPage.login("jsandicr16@gmail.com", "12345678");
        String message=driver.findElement(By.cssSelector(".table-responsive .table tbody tr td:nth-child(2) a")).getText();
        return message.trim();
    }
}
