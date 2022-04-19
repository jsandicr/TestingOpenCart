package com.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Returns {
 
    WebDriver webDriver;
    
    public Returns(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    
    public void openPage() throws InterruptedException{
        webDriver.findElement(By.cssSelector("footer .container .row .col-sm-3:nth-child(2) ul li:nth-child(2) a")).click();
        Thread.sleep(1000);
    }
    
    public void fillInputs() throws InterruptedException{
        webDriver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Jorge");
        webDriver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Sandi");
        webDriver.findElement(By.cssSelector("input[name='email']")).sendKeys("jsandicr16@gmail.com");
        webDriver.findElement(By.cssSelector("input[name='telephone']")).sendKeys("88888888");
        webDriver.findElement(By.cssSelector("input[name='order_id']")).sendKeys("2");
        webDriver.findElement(By.cssSelector("input[name='date_ordered']")).sendKeys("2022-04-17");
        webDriver.findElement(By.cssSelector("input[name='product']")).sendKeys("iPhone");
        webDriver.findElement(By.cssSelector("input[name='model']")).sendKeys("40");
        webDriver.findElement(By.cssSelector("form fieldset:nth-child(2) .form-group:nth-child(5) .col-sm-10 .radio:nth-child(3) label input")).click();
        webDriver.findElement(By.cssSelector("form .buttons .pull-right input")).click();
        Thread.sleep(3000);
    }
    
    public String verified(){
        return webDriver.findElement(By.cssSelector("#common-success .row .col-sm-9 p")).getText();
    }
}