/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.model;

import com.travelcompany.eshop.enums.CustomerCategory;

/**
 * Customer Class with its variables, constructor and setters getters methods
 * @author mantz
 */
public class  Customer extends Id {

    
    private String name;
    private String email;
    private String address;
    private String nationality;
    private CustomerCategory category;

    
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public CustomerCategory getCategory() {
        return category;
    }

    public void setCategory(CustomerCategory category) {
        this.category = category;
    }
    @Override
    public String toString(){
    return " "+getId()+" "+this.name+" "+ this.email+" " +this.address+" " + this.nationality+" " + this.category;
}
}
