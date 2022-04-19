package com.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckCupon {
    
    WebDriver webDriver;
    
    public CheckCupon(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    
    public void openCart() throws InterruptedException{
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".container .row .col-sm-3 .btn-group .btn")).click();
        webDriver.findElement(By.cssSelector(".dropdown-menu li:nth-child(2) div p a")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".row .col-sm-12 .panel-group .panel .panel-heading .panel-title a")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".row .col-sm-12 .panel-group .panel .panel-collapse .panel-body .input-group input[name='coupon']")).sendKeys("2222");
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".row .col-sm-12 .panel-group .panel .panel-collapse .panel-body .input-group .input-group-btn")).click();
        Thread.sleep(1000);
    }
    
    public String verfied(){
        return webDriver.findElement(By.cssSelector("#checkout-cart .alert")).getText();
    }
    
}