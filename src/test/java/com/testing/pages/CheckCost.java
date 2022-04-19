package com.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckCost {
 
    WebDriver webDriver;
    
    public CheckCost(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    
    public void checkData() throws InterruptedException{
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".container .row .col-sm-3 .btn-group .btn")).click();
        webDriver.findElement(By.cssSelector(".dropdown-menu li:nth-child(2) div p a")).click();
        webDriver.findElement(By.cssSelector(".row .col-sm-12 .panel-group .panel:nth-child(2) .panel-heading .panel-title a")).click();
        webDriver.findElement(By.cssSelector(".row .col-sm-12 .panel-group .panel:nth-child(2) .panel-collapse .panel-body .form-horizontal .form-group select")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".row .col-sm-12 .panel-group .panel:nth-child(2) .panel-collapse .panel-body .form-horizontal .form-group select option:nth-child(56)")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".row .col-sm-12 .panel-group .panel:nth-child(2) .panel-collapse .panel-body .form-horizontal .form-group select")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".row .col-sm-12 .panel-group .panel:nth-child(2) .panel-collapse .panel-body .form-horizontal .form-group:nth-child(2) .col-sm-10 select")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".row .col-sm-12 .panel-group .panel:nth-child(2) .panel-collapse .panel-body .form-horizontal .form-group:nth-child(2) .col-sm-10 select option:nth-child(8)")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".row .col-sm-12 .panel-group .panel:nth-child(2) .panel-collapse .panel-body .form-horizontal .btn")).click();
        Thread.sleep(500);
        webDriver.findElement(By.cssSelector(".modal .modal-dialog .modal-content .modal-body .radio label input")).click();
        Thread.sleep(500);
        webDriver.findElement(By.cssSelector(".modal .modal-dialog .modal-content .modal-footer #button-shipping")).click();
        Thread.sleep(3000);
    }
    
    public String verified(){
        return webDriver.findElement(By.cssSelector("#content .row .col-sm-4 table tbody tr:nth-child(2) td:nth-child(2)")).getText();
    }
    
}