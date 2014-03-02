/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food.Inheritance;

/**
 *
 * @author Sibakhulu
 */
public class Food {
    public String name;
    public String type;
    public String cook;
    public int count=0;
    
    public Food (String nm, String ty, String ser, String c){
    name=nm;
    type= ty;
    cook= c;
    }
    public void Setname(String nm){
    name=nm;
    }
    public void Settype(String ty){
    type=ty;
    }
    public void setcook(String ck){
    cook=ck;
    }
    
}
