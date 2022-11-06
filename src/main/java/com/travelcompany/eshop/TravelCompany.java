/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.travelcompany.eshop;

import com.travelcompany.eshop.enums.CustomerCategory;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.repository.CustomerRepositoryImpl;
import com.travelcompany.eshop.service.CustomerServiceImpl;
import com.travelcompany.eshop.service.ItineraryServiceImpl;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * for testing
 * @author mantz
 */
public class TravelCompany {

    public static void main(String[] args) {
      CustomerServiceImpl customerservice = new CustomerServiceImpl(); 
      customerservice.CustomersList();
      
      ItineraryServiceImpl itineraryservice = new ItineraryServiceImpl();
      itineraryservice.ItineraryList();
        
        

    }
}
