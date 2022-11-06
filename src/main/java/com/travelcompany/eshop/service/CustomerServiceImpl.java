/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.service;
import com.travelcompany.eshop.enums.CustomerCategory;
import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.repository.CustomerRepositoryImpl;

/**
 * Making the given customer list
 * @author mantz
 */
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
     
     Customer customer1 = new Customer(1,"Maria Iordanou","miordanou@mail.com","Athens","Greek",CustomerCategory.INDIVIDUAL);
     Customer customer2 = new Customer(2,"Dimitriou Dimitrios","ddimitriou@mail.com","Athens","Greek",CustomerCategory.INDIVIDUAL);
     Customer customer3 = new Customer(3,"Ioannis Ioannou","iioannou@mail.com","Athens","Greek",CustomerCategory.BUSINESS);
     Customer customer4 = new Customer(4,"Antonio Molinari","amolinari@mail.com","Milan","Italian",CustomerCategory.INDIVIDUAL);
     Customer customer5 = new Customer(5,"Frederico Rossi","frossi@mail.com","Milan","Italian",CustomerCategory.INDIVIDUAL);
     Customer customer6 = new Customer(6,"Mario Conti","mconti@mail.com","Rome","Italian",CustomerCategory.BUSINESS);
     Customer customer7 = new Customer(7,"Nathan Martin","nmartin@mail.com","Lyon","French",CustomerCategory.BUSINESS);
     Customer customer8 = new Customer(8,"Enzo Collin","ecolin@mail.com","Lyon","French",CustomerCategory.INDIVIDUAL);
     Customer customer9 = new Customer(9,"Frederic Michel","fmichel@mail.com","Athens","French",CustomerCategory.INDIVIDUAL);
             
    @Override
    public boolean CustomersList() {
       
        customerRepository.createCustomer(customer1);
        customerRepository.createCustomer(customer2);
        customerRepository.createCustomer(customer3);
        customerRepository.createCustomer(customer4);
        customerRepository.createCustomer(customer5);
        customerRepository.createCustomer(customer6);
        customerRepository.createCustomer(customer7);
        customerRepository.createCustomer(customer8);
        customerRepository.createCustomer(customer9);
        
        System.out.println(customerRepository.readCustomer(1));
        System.out.println(customerRepository.readCustomer(2));
        System.out.println(customerRepository.readCustomers());
        return true;
    }
    
    
    
}
