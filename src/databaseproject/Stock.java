/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

class Stock {
   
    private int inventory_id,product_price,product_quantity;
    private String product_name,product_unit;
    
    public Stock(int inv_id,String pro_name,int pro_quant,String pro_unit,int pro_price)
    {
        this.inventory_id=inv_id;
        this.product_name=pro_name;
        this.product_quantity=pro_quant;
        this.product_unit=pro_unit;
        this.product_price=pro_price;
    }
    
    public String getpro_name()
    {
         return product_name;
    }
    public int getinvent_ID()
    {
         return inventory_id;
    }
    public int getpro_quantity()
    {
         return product_quantity;
    }
    public int getpro_price()
    {
         return product_price;
    }
    public String getpro_unit()
    {
         return product_unit;
    }
}
