/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food;

import com.mycompany.food.srp.srpVoilation.FoodMarket;
import com.mycompany.food.srp.srpVoilation.SupplierInt;
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
public class SrpVoilationTest {
    
    public SrpVoilationTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void principleVoilation() {
    
    FoodMarket fm=new FoodMarket();
    fm.setName("Green Market Square");
    fm.orderDeli();
    fm.orderBakery();
    
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