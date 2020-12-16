/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.code;

/**
 *
 * @author User
 */
public class Customer {
    
    private String Customer_Name ;
    private int Customer_ID ;
    private String Address ;
    private String Phone ;
    private String Email ;

    public Customer(String Customer_Name, int Customer_ID, String Address, String Phone, String Email) {
        this.Customer_Name = Customer_Name;
        this.Customer_ID = Customer_ID;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }
    
    
    
}
