/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.util;

import com.travelcompany.eshop.enums.Airports;
import com.travelcompany.eshop.enums.CustomerCategory;
import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.repository.CustomerRepository;
import com.travelcompany.eshop.repository.ItineraryRepository;
import com.travelcompany.eshop.repository.Repository;
import java.math.BigDecimal;

/**
 *
 * @author mantz
 */
public class Data {
    
     private final CustomerRepository customerRepository;
    private final ItineraryRepository itineraryRepository;

    public Data(CustomerRepository customerRepository, ItineraryRepository itineraryRepository) {
        this.customerRepository = customerRepository;
        this.itineraryRepository = itineraryRepository;

    }

    public void insertCustomers() {
        {
            Customer customer = new Customer();
            customer.setName("Maria Iordanou");
            customer.setEmail("miordanou@mail.com");
            customer.setAddress("Athens");
            customer.setNationality("Greek");
            customer.setCategory(CustomerCategory.INDIVIDUAL);
        }
        {
            Customer customer = new Customer();
            customer.setName("Dimitriou Dimitrios");
            customer.setEmail("ddimitriou@mail.com");
            customer.setAddress("Athens");
            customer.setNationality("Greek");
            customer.setCategory(CustomerCategory.INDIVIDUAL);
        }
        {
            Customer customer = new Customer();
            customer.setName("Ioannis Ioannou");
            customer.setEmail("iioannou@mail.com");
            customer.setAddress("Athens");
            customer.setNationality("Greek");
            customer.setCategory(CustomerCategory.BUSINESS);
        }
        {
            Customer customer = new Customer();
            customer.setName("Antonio Molinari");
            customer.setEmail("amolinari@mail.com");
            customer.setAddress("Milan");
            customer.setNationality("Italian");
            customer.setCategory(CustomerCategory.INDIVIDUAL);
        }
        {
            Customer customer = new Customer();
            customer.setName("Frederico Rossi");
            customer.setEmail("frossi@mail.com");
            customer.setAddress("Milan");
            customer.setNationality("Italian");
            customer.setCategory(CustomerCategory.INDIVIDUAL);
        }
        {
            Customer customer = new Customer();
            customer.setName("Mario Conti");
            customer.setEmail("mconti@mail.com");
            customer.setAddress("Rome");
            customer.setNationality("Italian");
            customer.setCategory(CustomerCategory.BUSINESS);
        }
        {
            Customer customer = new Customer();
            customer.setName("Nathan Martin");
            customer.setEmail("nmartin@mail.com");
            customer.setAddress("Lyon");
            customer.setNationality("French");
            customer.setCategory(CustomerCategory.BUSINESS);
        }
        {
            Customer customer = new Customer();
            customer.setName("Enzo Collin");
            customer.setEmail("ecollin@mail.com");
            customer.setAddress("Lyon");
            customer.setNationality("French");
            customer.setCategory(CustomerCategory.INDIVIDUAL);
        }
        {
            Customer customer = new Customer();
            customer.setName("Frederic Michel");
            customer.setEmail("fmichel@mail.com");
            customer.setAddress("Athens");
            customer.setNationality("French");
            customer.setCategory(CustomerCategory.INDIVIDUAL);
        }
    }

    public void insertItineraries() {
        {
            Itinerary itinerary = new Itinerary();
            itinerary.setDep_code(Airports.ATH);
            itinerary.setDest_code(Airports.PAR);
            itinerary.setDep_date("22/02/2022 13:35");
            itinerary.setAirline("Skylines");
            itinerary.setPrice(BigDecimal.valueOf(300));
        }
        {
            Itinerary itinerary = new Itinerary();
            itinerary.setDep_code(Airports.ATH);
            itinerary.setDest_code(Airports.LON);
            itinerary.setDep_date("22/02/2022 13:40");
            itinerary.setAirline("Skylines");
            itinerary.setPrice(BigDecimal.valueOf(420));
        }
        {
            Itinerary itinerary = new Itinerary();
            itinerary.setDep_code(Airports.ATH);
            itinerary.setDest_code(Airports.AMS);
            itinerary.setDep_date("22/02/2022 13:45");
            itinerary.setAirline("Skylines");
            itinerary.setPrice(BigDecimal.valueOf(280));
        }
        {
            Itinerary itinerary = new Itinerary();
            itinerary.setDep_code(Airports.ATH);
            itinerary.setDest_code(Airports.PAR);
            itinerary.setDep_date("22/02/2022 14:20");
            itinerary.setAirline("Skylines");
            itinerary.setPrice(BigDecimal.valueOf(310));
        }
        {
            Itinerary itinerary = new Itinerary();
            itinerary.setDep_code(Airports.ATH);
            itinerary.setDest_code(Airports.DUB);
            itinerary.setDep_date("22/02/2022 14:35");
            itinerary.setAirline("Skylines");
            itinerary.setPrice(BigDecimal.valueOf(880));
        }
        {
            Itinerary itinerary = new Itinerary();
            itinerary.setDep_code(Airports.ATH);
            itinerary.setDest_code(Airports.FRA);
            itinerary.setDep_date("22/02/2022 14:55");
            itinerary.setAirline("Skylines");
            itinerary.setPrice(BigDecimal.valueOf(380));
        }
        {
            Itinerary itinerary = new Itinerary();
            itinerary.setDep_code(Airports.ATH);
            itinerary.setDest_code(Airports.FRA);
            itinerary.setDep_date("22/02/2022 15:35");
            itinerary.setAirline("Skylines");
            itinerary.setPrice(BigDecimal.valueOf(350));
        }
        {
            Itinerary itinerary = new Itinerary();
            itinerary.setDep_code(Airports.ATH);
            itinerary.setDest_code(Airports.MEX);
            itinerary.setDep_date("22/02/2022 16:00");
            itinerary.setAirline("Skylines");
            itinerary.setPrice(BigDecimal.valueOf(1020));
        }
        {
            Itinerary itinerary = new Itinerary();
            itinerary.setDep_code(Airports.ATH);
            itinerary.setDest_code(Airports.DUB);
            itinerary.setDep_date("22/02/2022 16:35");
            itinerary.setAirline("Skylines");
            itinerary.setPrice(BigDecimal.valueOf(770));
        }
    }

}

    

