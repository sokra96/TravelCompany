/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.model;

import java.math.BigDecimal;

/**
 * Tickets Class with its variables, constructor and setters getters methods
 * @author mantz
 */
public class Tickets {
    private int tId;
    private int cId;
    private int iId;
    private String payMethod;
    private BigDecimal prAmount;

    public Tickets(int tId, int cId, int iId, String payMethod, BigDecimal prAmount) {
        this.tId = tId;
        this.cId = cId;
        this.iId = iId;
        this.payMethod = payMethod;
        this.prAmount = prAmount;
    }
    
    
    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public BigDecimal getPrAmount() {
        return prAmount;
    }

    public void setPrAmount(BigDecimal prAmount) {
        this.prAmount = prAmount;
    }
    
    
}
