/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.model;

import com.travelcompany.eshop.enums.PaymentCategory;
import java.math.BigDecimal;

/**
 * Tickets Class with its variables, constructor and setters getters methods
 * @author mantz
 */
public class Ticket extends Id{
   
    private PaymentCategory payMethod;
    private BigDecimal prAmount;

    
    
   

    public PaymentCategory getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(PaymentCategory payMethod) {
        this.payMethod = payMethod;
    }

    public BigDecimal getPrAmount() {
        return prAmount;
    }

    public void setPrAmount(BigDecimal prAmount) {
        this.prAmount = prAmount;
    }
    
    
}
