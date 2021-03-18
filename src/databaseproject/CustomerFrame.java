/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

/**
 *
 * @author ameer
 */
class CustomerFrame {
    private int customer_id;
    private String name,customer_address,phone_no,email;
    
    public CustomerFrame(int customer_id,String name,String customer_address,String phone_no,String email)
    {
        this.customer_id=customer_id;
        this.name=name;
        this.customer_address=customer_address;
        this.phone_no=phone_no;
        this.email=email;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getName() {
        return name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getEmail() {
        return email;
    }
    
    
            
    
}
