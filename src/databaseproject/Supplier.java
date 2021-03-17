/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author DELL
 */
class Supplier {
    
    private int supplier_id;
    private String name,address,phone,email;
    
    public Supplier(int supplier_id,String name,String address,String phone,String email)
    {
        this.supplier_id=supplier_id;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }

     
   
    public int getsupplier_id()
    {
         return supplier_id;
    }
    public String getname()
    {
         return name;
    }
    public String getaddress()
    {
         return address;
    }
    public String getphone()
    {
         return phone;
    }
    public String getemail()
    {
         return email;
    }

    void fillSupplierTable(JTable jTable_supplier, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}