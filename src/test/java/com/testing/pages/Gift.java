package com.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gift {

    WebDriver webDriver;
    
    public Gift(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    
    public void openPage(){
        webDriver.findElement(By.cssSelector("footer .container .row .col-sm-3:nth-child(3) ul li:nth-child(2) a")).click();
    }
    
    public void fillInputs(){
        webDriver.findElement(By.cssSelector(".row .col-sm-9 form .form-group .col-sm-10 input")).sendKeys("Alonso");
        webDriver.findElement(By.cssSelector(".row .col-sm-9 form .form-group:nth-child(2) .col-sm-10 input")).sendKeys("alonso@prueba.com");
        webDriver.findElement(By.cssSelector(".row .col-sm-9 form .form-group:nth-child(3) .col-sm-10 input")).sendKeys("Jorge");
        webDriver.findElement(By.cssSelector(".row .col-sm-9 form .form-group:nth-child(4) .col-sm-10 input")).sendKeys("jsandicr16@gmail.com");
        webDriver.findElement(By.cssSelector(".row .col-sm-9 form .form-group:nth-child(5) .col-sm-10 .radio label input")).click();
        webDriver.findElement(By.cssSelector(".row .col-sm-9 form .form-group:nth-child(6) .col-sm-10 textarea")).sendKeys("Congratulations!!!");
        webDriver.findElement(By.cssSelector(".row .col-sm-9 form .clearfix .pull-right input")).click();
        webDriver.findElement(By.cssSelector(".row .col-sm-9 form .clearfix .pull-right .btn-primary")).click();
    }
    
    public String checkPage(){
        return webDriver.findElement(By.cssSelector("#common-success .row .col-sm-9 h1")).getText();
    }
    
}