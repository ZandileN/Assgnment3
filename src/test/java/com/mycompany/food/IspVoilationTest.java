/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food;

import com.mycompany.food.isp.ispVoilation.Cooldrink;
import com.mycompany.food.isp.ispVoilation.PizzaVoilation;
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
public class IspVoilationTest {
    
    public IspVoilationTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void principleTest(){
      PizzaVoilation piz= new PizzaVoilation();
      
      piz.cook();
      piz.eat();
      /*public double amount(){
      double amount=0.0,price=19.90;
      double qaunt=2;
      
      amount= price *qaunt;
      return amount;}*/
         
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