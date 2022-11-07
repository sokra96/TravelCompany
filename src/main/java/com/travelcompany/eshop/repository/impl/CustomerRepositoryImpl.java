/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.repository.impl;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.repository.CustomerRepository;


/**
 *
 * @author mantz
 */
public abstract class CustomerRepositoryImpl extends RepositoryImpl<Customer> implements CustomerRepository {

    @Override
    public void updateAdEm(int customerId, String address, String email) {
        Customer customer = read(customerId);
        if (customer != null) {
            customer.setAddress(address);
            customer.setEmail(email);

        }

    }

    @Override
    public void updateEm(int customerId, String email) {
        Customer customer = read(customerId);
        if (customer != null) {
            customer.setEmail(email);
        }
    }

    @Override
    public void updateAd(int customerId, String address) {
        Customer customer = read(customerId);
        if (customer != null) {
            customer.setAddress(address);
        }
    }

}
