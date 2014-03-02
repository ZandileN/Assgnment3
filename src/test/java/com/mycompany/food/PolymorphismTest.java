/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.mycompany.food.Polymorphism.Food;
import com.mycompany.food.Polymorphism.Pie;

/**
 *
 * @author Sibakhulu
 */
public class PolymorphismTest {
    
    public PolymorphismTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
   public void PolyTest() {
    Food food= new Pie();
    food.eat();
    food.type();
    
    food=new Food();
    food.eat();
    food.type();
   
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