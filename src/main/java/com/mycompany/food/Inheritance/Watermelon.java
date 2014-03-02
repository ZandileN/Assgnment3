/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food.Inheritance;

/**
 *
 * @author Sibakhulu
 */
public class Watermelon extends Food{
     public Watermelon(String nm, String ty, String ser, String c) {
        super(nm, ty, ser, c); 
    }
      public void name(){
      System.out.println("fruit name,watermelon");
       }
}
