package com.testing.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckOut {
    
    WebDriver webDriver;
    
    public CheckOut(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    public void openCheckout() throws InterruptedException{
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".container .row .col-sm-3 .btn-group .btn")).click();
        webDriver.findElement(By.cssSelector(".dropdown-menu li:nth-child(2) div p a:nth-child(2)")).click();
    }
    
    public void firstFillInputs(){
        webDriver.findElement(By.cssSelector(".row .col-sm-6:nth-child(2) div input")).sendKeys("jsandicr16@gmail.com");
        webDriver.findElement(By.cssSelector(".row .col-sm-6:nth-child(2) input[name='password']")).sendKeys("12345678");
        webDriver.findElement(By.cssSelector(".row .col-sm-6:nth-child(2) .btn-primary")).click();
    }
    
    public void secondFillInputs(){
        webDriver.findElement(By.cssSelector(".panel-group div:nth-child(2) .panel-collapse .panel-body form .buttons .pull-right")).click();
    }
    
    public void thirdFillInputs(){
        webDriver.findElement(By.cssSelector(".panel-group div:nth-child(3) .panel-collapse .panel-body form .buttons .pull-right")).click();
    }
    
    public void fourthFillInputs(){
        webDriver.findElement(By.cssSelector(".panel-group div:nth-child(4) .panel-collapse .panel-body .buttons .pull-right")).click();
    }
    
    public void fifthFillInputs(){
        webDriver.findElement(By.cssSelector(".panel-group div:nth-child(5) .panel-collapse .panel-body .buttons .pull-right input[name='agree']")).click();
        webDriver.findElement(By.cssSelector(".panel-group div:nth-child(5) .panel-collapse .panel-body .buttons .pull-right .btn-primary")).click();
    }
    
    public void sixthFillInputs(){
        webDriver.findElement(By.cssSelector(".panel-group div:nth-child(6) .panel-collapse .panel-body .buttons .pull-right")).click();
    }
    
    public String verifiedPay() throws InterruptedException{
        Thread.sleep(7000);
        Alert alert=webDriver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        webDriver.findElement(By.cssSelector(".panel-group div:nth-child(6) .panel-collapse .panel-body .buttons .pull-right")).click();
        Thread.sleep(1000);
        return webDriver.findElement(By.cssSelector(".row .col-sm-12 h1")).getText();
    }
    
}
