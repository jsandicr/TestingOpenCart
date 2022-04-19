package com.testing.testcases;

import com.testing.pages.AddProduct;
import org.junit.Assert;
import org.junit.Test;

public class TestCase_KB002 extends TestBase{
    
    @Test
    public void IngresoProducto(){
        String nameProduct = "MacBook";
                
        AddProduct addProduct = new AddProduct(driver);
        //Preciona el boton de añadir
        addProduct.add("cart");
        
        //Verifica si el producto se añadio
        String expectedMessage = "Your shopping cart is empty!";
        
        String actualMessage = addProduct.verifiedCart();
        System.out.println(actualMessage);
        Assert.assertTrue("No se añadio el producto correctamente", !actualMessage.contains(expectedMessage));
    }
    
}
