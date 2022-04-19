package com.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckMoney {
    WebDriver webDriver;
    
    public CheckMoney(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    
    public void changeMoney(String value){
        int position=1;
        if(value.equals("euro")){
            position=1;
        }
        if(value.equals("libra")){
            position=2;
        }
        if(value.equals("dolar")){
            position=3;
        }
        webDriver.findElement(By.cssSelector(".container .pull-left form .btn-group .btn")).click();
        webDriver.findElement(By.cssSelector(".container .pull-left form .btn-group .dropdown-menu li:nth-child("+position+")")).click();
    }
    
    public String verifiedChange(){
        return webDriver.findElement(By.cssSelector(".container .pull-left form .btn-group .btn strong")).getText();
    }
}