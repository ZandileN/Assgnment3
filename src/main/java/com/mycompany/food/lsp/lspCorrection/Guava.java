/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food.lsp.lspCorrection;

/**
 *
 * @author Sibakhulu
 */
public class Guava {
      private Fruit r;  
     public void setName (String nm){
         r.setname(nm); 
         r.settype(nm); 
     }  
     public void setType (String t) { 
         r.setname(t); 
         r.settype(t);
     }  
     public String getName () {
         return r.getname(); 
     }  
     public String getType() {
         return r.gettype(); 
     }  
     public double determineAmount () {
         return r.determineAmount(); 
     }  
}
    

