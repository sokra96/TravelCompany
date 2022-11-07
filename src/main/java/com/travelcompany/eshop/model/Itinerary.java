
package com.travelcompany.eshop.model;

import com.travelcompany.eshop.enums.Airports;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Itinerary Class with its variables and setters geters
 * @author mantz
 */
public class Itinerary extends Id{
   
    private Airports dep_code;
    private Airports dest_code;
    private String dep_date;
    private String airline;
    private BigDecimal price;

    
    

    public Airports getDep_code() {
        return dep_code;
    }

    public void setDep_code(Airports dep_code) {
        this.dep_code = dep_code;
    }

    public Airports getDest_code() {
        return dest_code;
    }

    public void setDest_code(Airports dest_code) {
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
