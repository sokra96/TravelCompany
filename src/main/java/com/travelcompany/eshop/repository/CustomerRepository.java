/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Customer;
import java.util.List;

/**
 * The interface for customer (CRUD)
 * @author mantz
 */
public interface CustomerRepository {
    
    //CRUD
    
    boolean createCustomer(Customer customer);
    List<Customer> readCustomers();
    Customer readCustomer(int cId);
    boolean updateCustomer();
    boolean deleteCustomer();
    
}
