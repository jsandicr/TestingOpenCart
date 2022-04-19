package com.testing.testcases;

import com.testing.pages.AddProduct;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestCase_KB003 extends TestBase{
    
    @Test
    public void agregarWishLish(){
        
        AddProduct addProduct = new AddProduct(driver);
        //Agregar a WishList
        addProduct.add("wishList");
        
        //Verificar
        String expectedMessage = "iPhone";
        String actualMessage = addProduct.verifiedWishList();
        Assert.assertTrue("El producto no fue agregado con exito a la lista de deseados", actualMessage.contains(expectedMessage));
    }
}
