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
public class Delivery {
    
    private int Customer_Id ;
    private int Order_ID ;
    private double TotallBill ;
    private int Time_Date ;

    public int getCustomer_Id() {
        return Customer_Id;
    }

    public int getOrder_ID() {
        return Order_ID;
    }

    public double getTotallBill() {
        return TotallBill;
    }

    public int getTime_Date() {
        return Time_Date;
    }

    public Delivery(int Customer_Id, int Order_ID, double TotallBill, int Time_Date) {
        this.Customer_Id = Customer_Id;
        this.Order_ID = Order_ID;
        this.TotallBill = TotallBill;
        this.Time_Date = Time_Date;
    }
    
    
}
