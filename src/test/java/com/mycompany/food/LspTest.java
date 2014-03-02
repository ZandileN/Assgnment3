/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food;

import com.mycompany.food.dip.dipVoilation.Fruit;
import com.mycompany.food.lsp.lspVoilation.Guava;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sibakhulu
 */
public class LspTest {
    
    public LspTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    private static Fruit getnewFruit(){
       return new Fruit();
    }
   @Test
   public void principleTest() {
   Fruit f= LspTest.getnewFruit();
   
     f.eat();
   }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}