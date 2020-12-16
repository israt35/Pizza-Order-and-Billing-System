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
public class Order {
    
    private int Order_ID ;
    private int Customer_ID ;
    private int Pizza_ID ;
    private boolean Additional_Cheese ;
    private boolean Additional_tomatoo;
    private boolean Additional_onion;
    private boolean Additional_corn;
    private int Quantity;
    private int Time;

    public Order(int Order_ID, int Customer_ID, int Pizza_ID, boolean Additional_Cheese, boolean Additional_tomatoo, boolean Additional_onion, boolean Additional_corn, int Quantity, int Time) {
        this.Order_ID = Order_ID;
        this.Customer_ID = Customer_ID;
        this.Pizza_ID = Pizza_ID;
        this.Additional_Cheese = Additional_Cheese;
        this.Additional_tomatoo = Additional_tomatoo;
        this.Additional_onion = Additional_onion;
        this.Additional_corn = Additional_corn;
        this.Quantity = Quantity;
        this.Time = Time;
    }

    public int getOrder_ID() {
        return Order_ID;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public int getPizza_ID() {
        return Pizza_ID;
    }

    public boolean isAdditional_Cheese() {
        return Additional_Cheese;
    }

    public boolean isAdditional_tomatoo() {
        return Additional_tomatoo;
    }

    public boolean isAdditional_onion() {
        return Additional_onion;
    }

    public boolean isAdditional_corn() {
        return Additional_corn;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getTime() {
        return Time;
    }
    
    
}
