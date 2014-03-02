/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food.srp.srpVoilation;

/**
 *
 * @author Sibakhulu
 */
public class FoodMarket implements SupplierInt{
     public String name;
    //public String productType;
    //public FoodMarket(String nam, String ord, String prod){name=nam;}
    public void setName(String supName)
    { name= supName;}
  //public void setProductType(String prodtype){productType= prodtype;}
    public String getName(){
    
    return name;}
   // public String getProductType(){return productType; }
    
     public void orderDeli(){
     String order1, order2, order3;
     order1="milk";
     order2="cheese";
    }
     public void orderBakery(){
     String order1, order2, order3;
     order1="Muffins";
     order2="Ciabata";
     }
     public void Amount(){
         int quant=0;
         double price=0.0, amont;
         amont=quant *price;
     }

    
}
