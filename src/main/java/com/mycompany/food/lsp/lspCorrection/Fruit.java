/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food.lsp.lspCorrection;

/**
 *
 * @author Sibakhulu
 */
public class Fruit {
       public String name;
    public String type;
    public double price;
    
    
    public void setname(String nm){
     name=nm;
    }
    public void settype(String typ){
    type=typ;
    }
    public void setprice(double p){
    price= p;
    }
     public String getname(){
     return name;
    }
    public String gettype(){
     return type;
    }
    public double getprice(){
     return price;
    }
    public double determineAmount(){
        int qunt=0;
        double amount= price*qunt;
        return amount;
        
    }
    
}
