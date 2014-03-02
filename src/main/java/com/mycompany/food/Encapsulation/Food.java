/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food.Encapsulation;

/**
 *
 * @author Sibakhulu
 */
public class Food {
    private String name;
    private String Foodtype;
    private boolean cook=false;
    /*public Food (String nm, String foodt, boolean ck){
    name= nm;
    Foodtype=foodt;
    cook=ck;
    }*/
    public void setname(String n){
    this.name=n;
    }
     public void setFoodtype(String type){
    this.Foodtype=type;
    }
    public boolean setTocook(boolean Cook){
    return this.cook;
    }
    public String getName(){
     return name;
    }
    public String getFoodtype(){
     return Foodtype;
    }
    public boolean Tocook(){
     return cook;
    }
    
}
