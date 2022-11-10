package com.travelcompany.eshop.model;

import com.travelcompany.eshop.enums.PaymentCategory;
import java.math.BigDecimal;

/**
 * Tickets Class with its variables, constructor and setters getters methods
 *
 * @author mantz
 */
public class Ticket extends Id {

    private int cid;
    private int iid;
    private PaymentCategory payMethod;
    private BigDecimal prAmount;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

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

    @Override
    public String toString() {
        return " " + getId() + " " + this.cid + " " + this.iid + " " + this.payMethod + " " + this.prAmount;
    }
}
