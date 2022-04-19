package com.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    
    WebDriver driver;
    
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    
    public void navigateToLoginPage(){
        driver.findElement(By.cssSelector("#top-links ul li:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#top-links ul li:nth-child(2) ul li:nth-child(2)")).click();
    }    
}
