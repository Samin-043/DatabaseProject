/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

/**
 *
 * @author DELL
 */
class Product {
    
    
    private int product_id;
    private double price;
    private String name,quantity,unit,description,category;
    //private int supplier_id;
    
    public Product(int produc_t_id,String nam_e,String quantit_y,String uni_t,double pric_e,String categor_y)
    {
        this.product_id=produc_t_id;
        this.name=nam_e;
        this.quantity=quantit_y;
        this.unit=uni_t;
        this.price=pric_e;
        //this.description=descriptio_n;
        this.category=categor_y;
         
    }
    
    public int getproductID()
    {
         return product_id;
    }
    public String getname()
    {
         return name;
    }
    public String getquantity()
    {
         return quantity;
    }
    public String getunit()
    {
         return unit;
    }
    public double getprice()
    {
         return price;
    }
    
    public String getcategory()
    {
         return category;
    }
    
    
}
