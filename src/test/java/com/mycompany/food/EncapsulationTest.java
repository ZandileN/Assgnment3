/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food;

import com.mycompany.food.Encapsulation.Food;
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
public class EncapsulationTest {
    Food food= new Food();
    public EncapsulationTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void EncapsulationTest() {
     food.setname("Pork ");
     food.setFoodtype(" Protein Meat ");
     food.setTocook(true);
     
     System.out.print(food.getName() + food.getFoodtype() + food.Tocook());
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