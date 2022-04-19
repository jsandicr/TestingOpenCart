package com.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    
    public void login(String user, String password){
        driver.findElement(By.cssSelector("#input-email")).sendKeys(user);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("form .btn-primary")).click();
    }
    
    public String verified(){
        driver.findElement(By.cssSelector("#top-links ul li:nth-child(2)")).click();
        return driver.findElement(By.cssSelector("#top-links ul li:nth-child(2) ul li:nth-child(1)")).getText();
    }
}
