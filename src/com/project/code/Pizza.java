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
public class Pizza {
   
    private String PizzaType ;
    private int PizzaID ;
    private double Price ;

    public String getPizzaType() {
        return PizzaType;
    }

    public int getPizzaID() {
        return PizzaID;
    }

    public double getPrice() {
        return Price;
    }

    public Pizza(String PizzaType, int PizzaID, double Price) {
        this.PizzaType = PizzaType;
        this.PizzaID = PizzaID;
        this.Price = Price;
    }
    
    
    
    
    
}
