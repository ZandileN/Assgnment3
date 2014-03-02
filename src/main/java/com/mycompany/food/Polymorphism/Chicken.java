/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food.Polymorphism;

/**
 *
 * @author Sibakhulu
 */
public class Chicken extends Food {
     @Override
     public void eat(){
        System.out.println("chicken is aten fried, braai or cooked");
        }
     @Override
        public void type(){
        String type="Protein Food";
        //System.out.println("Meat is of type protein food");
        }
    
}
