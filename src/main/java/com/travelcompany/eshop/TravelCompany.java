/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.travelcompany.eshop;

import com.travelcompany.eshop.exceptions.CustomerException;
import com.travelcompany.eshop.repository.CustomerRepository;
import com.travelcompany.eshop.repository.impl.CustomerRepositoryImpl;
import com.travelcompany.eshop.repository.impl.ItineraryRepositoryImpl;
import com.travelcompany.eshop.repository.impl.TicketRepositoryImpl;
import com.travelcompany.eshop.util.Data;

/**
 * for testing
 *

* @author mantz
 */
public class TravelCompany {

    public static void main(String[] args) throws CustomerException {
        CustomerRepositoryImpl customerepository = new CustomerRepositoryImpl();
        ItineraryRepositoryImpl itineraryrepository = new ItineraryRepositoryImpl();
        TicketRepositoryImpl ticketrepository = new TicketRepositoryImpl();
       
       Data data = new Data(customerepository,itineraryrepository,ticketrepository);
       data.insertCustomers();
       data.insertItineraries();
       
       data.GenerateTicket();
      
 
       
        
    }
}
