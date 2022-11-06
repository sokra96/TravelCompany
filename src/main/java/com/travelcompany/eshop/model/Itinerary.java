
package com.travelcompany.eshop.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Itinerary Class with its variables, constructor and setters getters methods
 * @author mantz
 */
public class Itinerary {
    private int itId;
    private String dep_code;
    private String dest_code;
    private String dep_date;
    private String airline;
    private BigDecimal price;

    public Itinerary(int itId, String dep_code, String dest_code, String dep_date, String airline, BigDecimal price) {
        this.itId = itId;
        this.dep_code = dep_code;
        this.dest_code = dest_code;
        this.dep_date = dep_date;
        this.airline = airline;
        this.price = price;
    }
    @Override
    public String toString(){
        return this.itId +" " + this.dep_code +" " + this.dest_code + " " + this.dep_date + " " + this.airline + " " + this.price;
    }
    
    public int getItId() {
        return itId;
    }

    public void setItId(int itId) {
        this.itId = itId;
    }

    public String getDep_code() {
        return dep_code;
    }

    public void setDep_code(String dep_code) {
        this.dep_code = dep_code;
    }

    public String getDest_code() {
        return dest_code;
    }

    public void setDest_code(String dest_code) {
        this.dest_code = dest_code;
    }

    public String getDep_date() {
        return dep_date;
    }

    public void setDep_date(String dep_date) {
        this.dep_date = dep_date;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    
}
