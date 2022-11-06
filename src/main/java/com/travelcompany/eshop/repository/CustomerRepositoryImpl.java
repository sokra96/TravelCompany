/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Customer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The CRUD implementation of Customer
 * @author mantz
 */
public class CustomerRepositoryImpl implements CustomerRepository {

    private final List<Customer> customers = new ArrayList<>();

    @Override
    public boolean createCustomer(Customer customer) {
        customers.add(customer);
        return true;
    }

    @Override
    public String readCustomers() {
        List<Customer> returnCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            returnCustomers.add(customer);
        }
     
        return returnCustomers.toString();
    }

    @Override
    public String readCustomer(int cId) {
        for(Customer customer : customers){
            if(customer.getcId() == cId){
                return customer.toString();
            }
        }
        return null; // If the customer doesnt be found
    }

    @Override
    public boolean updateCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
