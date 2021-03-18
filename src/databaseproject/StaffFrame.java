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
class StaffFrame {
    private int staff_id,customer_id;
    private String name,staff_address,phone_no,email,staff_title;

    public StaffFrame(int staff_id, int customer_id, String name, String staff_address, String phone_no, String email, String staff_title) {
        this.staff_id = staff_id;
        this.customer_id = customer_id;
        this.name = name;
        this.staff_address = staff_address;
        this.phone_no = phone_no;
        this.email = email;
        this.staff_title = staff_title;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getName() {
        return name;
    }

    public String getStaff_address() {
        return staff_address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getEmail() {
        return email;
    }

    public String getStaff_title() {
        return staff_title;
    }
    
    
    
    
}
