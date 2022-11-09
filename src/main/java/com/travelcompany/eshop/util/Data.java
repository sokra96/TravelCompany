/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.util;

import com.travelcompany.eshop.enums.Airports;
import com.travelcompany.eshop.enums.CustomerCategory;
import com.travelcompany.eshop.enums.PaymentCategory;
import com.travelcompany.eshop.exceptions.CustomerException;
import com.travelcompany.eshop.exceptions.CustomerExceptionsCodes;
import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.repository.CustomerRepository;
import com.travelcompany.eshop.repository.ItineraryRepository;
import com.travelcompany.eshop.repository.TicketRepository;
import java.math.BigDecimal;

/**
 *
 * @author mantz
 */
public class Data {

    private final CustomerRepository customerRepository;
    private final ItineraryRepository itineraryRepository;
    private final TicketRepository ticketRepository;

    public Data(CustomerRepository customerRepository, ItineraryRepository itineraryRepository, TicketRepository ticketRepository) {
        this.customerRepository = customerRepository;
        this.itineraryRepository = itineraryRepository;
        this.ticketRepository = ticketRepository;

    }
    private final static String[] CUSTOMERS = {
        "1, Maria Iordanou, miordanou@travelcompanymail.com, Athens, Greek, INDIVIDUAL",
        "2, Dimitriou Dimitrios, ddimitriou@mail.com, Athens, Greek, INDIVIDUAL",
        "3, Ioannis Ioannou, iiouannou@mail.com, Athens, Greek, BUSINESS",
        "4, Antonio Molinari, amolinari@travelcompany.com, Milan, Italian, INDIVIDUAL",
        "5, Frederico Rossi, frossi@mail.com, Milan, Italian, INDIVIDUAL",
        "6, Mario Conti, mconti@mail.com, Rome, Italian, BUSINESS",
        "7, Nathan Martin, nmartin@mail.com, Lyon, French, BUSINESS",
        "8, Enzo Collin, ecollin@mail.com, Lyon, French, INDIVIDUAL",
        "9, Frederic Michel, fmichel@mail.com, Athens, French, INDIVIDUAL"
    };

    private final static String[] ITINERARIES = {
        "1, ATH, MIL, 22/02/2022 13:35, Skylines, 300",
        "2, ATH, LOsgsN, 22/02/2022 13:40, Skylines, 420",
        "3, SDA, AMS, 22/02/2022 13:45, Skylines, 280",
        "4, ATH, PAR, 22/02/2022 14:20, Skylines, 310",
        "5, ATH, DUB, 22/02/2022 14:35, Skylines, 880",
        "6, ATH, FRA, 22/02/2022 14:55, Skylines, 380",
        "7, ATH, FRA, 22/02/2022 15:35, Skylines, 350",
        "8, ATH, MEX, 22/02/2022 16:00, Skylines, 1020",
        "9, ATH, DUB, 22/02/2022 16:35, Skylines, 770"
    };

    public void insertCustomers() throws CustomerException {

        
            for (String customerString : CUSTOMERS) {
                String[] words = customerString.split(",");
                Customer customer = new Customer();
                customer.setId(Integer.parseInt(words[0]));
                customer.setName(words[1].trim());
                customer.setEmail(words[2].trim());
                customer.setAddress(words[3].trim());
                customer.setNationality(words[4].trim());
                customer.setCategory(CustomerCategory.valueOf(words[5].trim()));
                try {
                customerRepository.create(customer);
                if (customer.getEmail().contains("@travelcompany")) {

                    customerRepository.delete(customer.getId());
                    throw new CustomerException(CustomerExceptionsCodes.EMAIL_ERROR);

                }

            }
         catch (Exception e) {
            System.out.println("Dear, " + customer.getName()+e.getMessage() );
               //throw new CustomerException(CustomerExceptionsCodes.EMAIL_ERROR);
        }
            }
        //else{
        //customerRepository.create(customer);
        //}

        // customerRepository.create(customer);
        //  customerRepository.delete(customer.getId());
        System.out.println(customerRepository.read());
    }

    public void insertItineraries() {
        for (String itinerariesString : ITINERARIES) {
            try {
                String[] words = itinerariesString.split(",");
                Itinerary itinerary = new Itinerary();
                itinerary.setId(Integer.parseInt(words[0]));
                itinerary.setDep_code(Airports.valueOf(words[1].trim()));
                itinerary.setDest_code(Airports.valueOf(words[2].trim()));
                itinerary.setDep_date(words[3].trim());
                itinerary.setAirline(words[4].trim());
                itinerary.setPrice(BigDecimal.valueOf(Integer.parseInt(words[5].trim())));

                itineraryRepository.create(itinerary);
                if (itinerary.getDest_code().equals(Airports.AMS) || itinerary.getDest_code().equals(Airports.PAR) || itinerary.getDest_code().equals(Airports.ATH) || itinerary.getDest_code().equals(Airports.DUB) || itinerary.getDest_code().equals(Airports.FRA) || itinerary.getDest_code().equals(Airports.LON) || itinerary.getDest_code().equals(Airports.MEX)
                        || itinerary.getDep_code().equals(Airports.AMS) || itinerary.getDep_code().equals(Airports.PAR) || itinerary.getDep_code().equals(Airports.ATH) || itinerary.getDep_code().equals(Airports.DUB) || itinerary.getDep_code().equals(Airports.FRA) || itinerary.getDep_code().equals(Airports.LON) || itinerary.getDep_code().equals(Airports.MEX)) {
                    // System.out.println("Eveything is ok");
                } else {
                    itineraryRepository.delete(itinerary.getId());
                    //throw new CustomerException(CustomerExceptionsCodes.AIRPORT_ERROR);
                }
            } catch (Exception e) {
                String message = e.toString();
         
                System.out.println(CustomerExceptionsCodes.AIRPORT_ERROR +message.substring(92) );
            }

        }
        System.out.println(itineraryRepository.read());
    }

    public BigDecimal calculatePrice(CustomerCategory customercategory, PaymentCategory paymentcategory, BigDecimal itineraryprice) {
        BigDecimal discount = new BigDecimal(0);
        if (paymentcategory.equals(PaymentCategory.CREDIT) && customercategory.equals(CustomerCategory.BUSINESS)) {
            BigDecimal discount1 = new BigDecimal(-0.2);
            discount = discount.add(discount1);

        }
        if (paymentcategory.equals(PaymentCategory.CASH) && customercategory.equals(CustomerCategory.BUSINESS)) {
            BigDecimal discount2 = new BigDecimal(-0.1);
            discount = discount.add(discount2);

        }
        if (paymentcategory.equals(PaymentCategory.CREDIT) && customercategory.equals(CustomerCategory.INDIVIDUAL)) {
            BigDecimal discount3 = new BigDecimal(0.1);
            discount = discount.add(discount3);

        }
        if (paymentcategory.equals(PaymentCategory.CASH) && customercategory.equals(CustomerCategory.INDIVIDUAL)) {
            BigDecimal discount4 = new BigDecimal(0.2);
            discount = discount.add(discount4);

        }
        BigDecimal price1 = itineraryprice.multiply(discount);

        BigDecimal price = price1.add(itineraryprice);
        price = price.setScale(2, BigDecimal.ROUND_CEILING);
        // System.out.println();
        return price;
    }

    public void GenerateTicket() {

        {
            try {
                Ticket ticket1 = new Ticket();
                ticket1.setId(1);
                ticket1.setCid(10);
                ticket1.setIid(2);
                ticket1.setPayMethod(PaymentCategory.CASH);
                ticket1.setPrAmount(calculatePrice(CustomerCategory.INDIVIDUAL, PaymentCategory.CASH, BigDecimal.valueOf(420)));

                if (ticket1.getCid() > 9){
                    throw new CustomerException("Customer ID: "+ ticket1.getCid()+CustomerExceptionsCodes.CUSTOMER_ERROR);
                }
                if ( ticket1.getIid() > 9){
                throw new CustomerException("Itinerary ID: "+ ticket1.getIid()+CustomerExceptionsCodes.ITINERARY);
                        } 
                    
                    //ticketRepository.delete(ticket1.getId());
                
                ticketRepository.create(ticket1);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        {
            try {
                Ticket ticket2 = new Ticket();
                ticket2.setId(2);
                ticket2.setCid(2);
                ticket2.setIid(10);
                ticket2.setPayMethod(PaymentCategory.CASH);
                ticket2.setPrAmount(calculatePrice(CustomerCategory.INDIVIDUAL, PaymentCategory.CASH, BigDecimal.valueOf(280)));
               if (ticket2.getCid() > 9){
                    throw new CustomerException("Customer ID: "+ ticket2.getCid()+CustomerExceptionsCodes.CUSTOMER_ERROR);
                }
                if ( ticket2.getIid() > 9){
                throw new CustomerException("Itinerary ID: "+ ticket2.getIid()+CustomerExceptionsCodes.ITINERARY);
                        } 
                    
                    //ticketRepository.delete(ticket1.getId());
                
                ticketRepository.create(ticket2);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

        }
        {
            try {
                Ticket ticket3 = new Ticket();
                ticket3.setId(3);
                ticket3.setCid(3);
                ticket3.setIid(3);
                ticket3.setPayMethod(PaymentCategory.CREDIT);
                ticket3.setPrAmount(calculatePrice(CustomerCategory.BUSINESS, PaymentCategory.CREDIT, BigDecimal.valueOf(280)));
                if (ticket3.getCid() > 9){
                    throw new CustomerException("Customer ID: "+ ticket3.getCid()+CustomerExceptionsCodes.CUSTOMER_ERROR);
                }
                if ( ticket3.getIid() > 9){
                throw new CustomerException("Itinerary ID: "+ ticket3.getIid()+CustomerExceptionsCodes.ITINERARY);
                        } 
                    
                    //ticketRepository.delete(ticket1.getId());
                
                ticketRepository.create(ticket3);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        {
            try {
                Ticket ticket4 = new Ticket();
                ticket4.setId(4);
                ticket4.setCid(12);
                ticket4.setIid(4);
                ticket4.setPayMethod(PaymentCategory.CREDIT);
                ticket4.setPrAmount(calculatePrice(CustomerCategory.INDIVIDUAL, PaymentCategory.CREDIT, BigDecimal.valueOf(310)));
                if (ticket4.getCid() > 9){
                    throw new CustomerException("Customer ID: "+ ticket4.getCid()+CustomerExceptionsCodes.CUSTOMER_ERROR);
                }
                if ( ticket4.getIid() > 9){
                throw new CustomerException("Itinerary ID: "+ ticket4.getIid()+CustomerExceptionsCodes.ITINERARY);
                        } 
                    
                    //ticketRepository.delete(ticket1.getId());
                
                ticketRepository.create(ticket4);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }

        {
            try {
                Ticket ticket5 = new Ticket();
                ticket5.setId(5);
                ticket5.setCid(3);
                ticket5.setIid(4);
                ticket5.setPayMethod(PaymentCategory.CASH);
                ticket5.setPrAmount(calculatePrice(CustomerCategory.BUSINESS, PaymentCategory.CASH, BigDecimal.valueOf(310)));
                if (ticket5.getCid() > 9){
                    throw new CustomerException("Customer ID: "+ ticket5.getCid()+CustomerExceptionsCodes.CUSTOMER_ERROR);
                }
                if ( ticket5.getIid() > 9){
                throw new CustomerException("Itinerary ID: "+ ticket5.getIid()+CustomerExceptionsCodes.ITINERARY);
                        } 
                    
                    //ticketRepository.delete(ticket1.getId());
                
                ticketRepository.create(ticket5);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        {
            try {
                Ticket ticket6 = new Ticket();
                ticket6.setId(6);
                ticket6.setCid(4);
                ticket6.setIid(7);
                ticket6.setPayMethod(PaymentCategory.CREDIT);
                ticket6.setPrAmount(calculatePrice(CustomerCategory.INDIVIDUAL, PaymentCategory.CREDIT, BigDecimal.valueOf(350)));
               if (ticket6.getCid() > 9){
                    throw new CustomerException("Customer ID: "+ ticket6.getCid()+CustomerExceptionsCodes.CUSTOMER_ERROR);
                }
                if ( ticket6.getIid() > 9){
                throw new CustomerException("Itinerary ID: "+ ticket6.getIid()+CustomerExceptionsCodes.ITINERARY);
                        } 
                    
                    //ticketRepository.delete(ticket1.getId());
                
                ticketRepository.create(ticket6);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        {
            try {
                Ticket ticket7 = new Ticket();
                ticket7.setId(7);
                ticket7.setCid(5);
                ticket7.setIid(7);
                ticket7.setPayMethod(PaymentCategory.CREDIT);
                ticket7.setPrAmount(calculatePrice(CustomerCategory.INDIVIDUAL, PaymentCategory.CREDIT, BigDecimal.valueOf(350)));
               if (ticket7.getCid() > 9){
                    throw new CustomerException("Customer ID: "+ ticket7.getCid()+CustomerExceptionsCodes.CUSTOMER_ERROR);
                }
                if ( ticket7.getIid() > 9){
                throw new CustomerException("Itinerary ID: "+ ticket7.getIid()+CustomerExceptionsCodes.ITINERARY);
                        } 
                    
                    //ticketRepository.delete(ticket1.getId());
                
                ticketRepository.create(ticket7);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        {
            try {
                Ticket ticket8 = new Ticket();
                ticket8.setId(8);
                ticket8.setCid(2);
                ticket8.setIid(10);
                ticket8.setPayMethod(PaymentCategory.CASH);
                ticket8.setPrAmount(calculatePrice(CustomerCategory.INDIVIDUAL, PaymentCategory.CASH, BigDecimal.valueOf(0)));
                if (ticket8.getCid() > 9){
                    throw new CustomerException("Customer ID: "+ ticket8.getCid()+CustomerExceptionsCodes.CUSTOMER_ERROR);
                }
                if ( ticket8.getIid() > 9){
                throw new CustomerException("Itinerary ID: "+ ticket8.getIid()+CustomerExceptionsCodes.ITINERARY);
                        } 
                    
                    //ticketRepository.delete(ticket1.getId());
                
                ticketRepository.create(ticket8);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        {
            try {
                Ticket ticket9 = new Ticket();
                ticket9.setId(9);
                ticket9.setCid(1);
                ticket9.setIid(3);
                ticket9.setPayMethod(PaymentCategory.CASH);
                ticket9.setPrAmount(calculatePrice(CustomerCategory.INDIVIDUAL, PaymentCategory.CASH, BigDecimal.valueOf(280)));
               if (ticket9.getCid() > 9){
                    throw new CustomerException("Customer ID: "+ ticket9.getCid()+CustomerExceptionsCodes.CUSTOMER_ERROR);
                }
                if ( ticket9.getIid() > 9){
                throw new CustomerException("Itinerary ID: "+ ticket9.getIid()+CustomerExceptionsCodes.ITINERARY);
                        } 
                    
                    //ticketRepository.delete(ticket1.getId());
                
                ticketRepository.create(ticket9);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }

        System.out.println(ticketRepository.read());
    }
}
