package com.travelcompany.eshop.service.impl;

import com.travelcompany.eshop.enums.Airports;
import com.travelcompany.eshop.exceptions.CustomerException;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.repository.impl.CustomerRepositoryImpl;
import com.travelcompany.eshop.repository.impl.ItineraryRepositoryImpl;
import com.travelcompany.eshop.repository.impl.TicketRepositoryImpl;
import com.travelcompany.eshop.service.CustomerService;
import com.travelcompany.eshop.util.Data;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Creating the reports in a every method the datas are added to lists and then they are using through collections to print the results
 * @author mantz
 */
public class CustomerServiceImpl implements CustomerService {
    /**
     * Adding to a Map the id of the  customers with a number of how many tickets they bought
     * using the ticketrepository
     * @return
     * @throws CustomerException 
     */
    public Map<Integer, Integer> customersNumberOfTickets() throws CustomerException {
        TicketRepositoryImpl ticketrepository = new TicketRepositoryImpl();
        CustomerRepositoryImpl customerepository = new CustomerRepositoryImpl();
        ItineraryRepositoryImpl itineraryrepository = new ItineraryRepositoryImpl();
        Data data = new Data(customerepository, itineraryrepository, ticketrepository);
        data.GenerateTicket();
        List<Ticket> numbers = ticketrepository.read();
        Map<Integer, Integer> list1 = new HashMap<>();
        int count = 0;

        for (int i = 1; i <= numbers.size() + 1; i++) {
            for (Ticket ticket : numbers) {
                if (i == ticket.getCid()) {
                    count++;
                }
            }
            list1.put(i, count);
            count = 0;
        }

        for (Map.Entry<Integer, Integer> e : list1.entrySet()) {
            System.out.println("Customer with id: " + e.getKey() + " bought " + e.getValue() + " tickets");
        }
        return list1;
    }
    /**
     * Calculates the result of the ticket amount that every customer bought
     * @return
     * @throws CustomerException 
     */
    public Map<Integer, BigDecimal> customersAmountOfTickets() throws CustomerException {
        TicketRepositoryImpl ticketrepository = new TicketRepositoryImpl();
        CustomerRepositoryImpl customerepository = new CustomerRepositoryImpl();
        ItineraryRepositoryImpl itineraryrepository = new ItineraryRepositoryImpl();
        Data data = new Data(customerepository, itineraryrepository, ticketrepository);
        data.GenerateTicket();
        List<Ticket> numbers = ticketrepository.read();
        Map<Integer, BigDecimal> list2 = new HashMap<>();

        for (int i = 1; i <= numbers.size() + 1; i++) {
            BigDecimal amount = new BigDecimal(0);
            for (Ticket ticket : numbers) {
                if (i == ticket.getCid()) {
                    BigDecimal cost = (ticket.getPrAmount());
                    amount = amount.add(cost);
                }
            }
            list2.put(i, amount);
        }

        for (Map.Entry<Integer, BigDecimal> e : list2.entrySet()) {
            System.out.println("Customer with id: " + e.getKey() + " paid " + e.getValue() + " $ in total");
        }
        return list2;
    }
    /**
     * Printing using the Map collection, the uniques itineraries per destination
     * @return
     * @throws CustomerException 
     */
    public Map<Airports, Airports> itinenariesPerDestination() throws CustomerException {
        TicketRepositoryImpl ticketrepository = new TicketRepositoryImpl();
        CustomerRepositoryImpl customerepository = new CustomerRepositoryImpl();
        ItineraryRepositoryImpl itineraryrepository = new ItineraryRepositoryImpl();
        Data data = new Data(customerepository, itineraryrepository, ticketrepository);
        data.GenerateTicket();
        data.insertItineraries();
        List<Itinerary> numbers = itineraryrepository.read();
        Map<Airports, Airports> list3 = new HashMap<>();
        int i = 1;

        for (Itinerary itinerary : numbers) {
            Airports dep = itinerary.getDep_code();
            Airports dest = itinerary.getDest_code();
            list3.put(dest, dep);
        }

        for (Map.Entry<Airports, Airports> e : list3.entrySet()) {
            System.out.println("Destination Airport: " + e.getKey() + " Departure Airport " + e.getValue());
        }
        return list3;
    }
    /**
     * Printing using the Map collection, the uniques itineraries per departure
     * @return
     * @throws CustomerException 
     */
    public Map<Airports, Airports> itinenariesPerDeparture() throws CustomerException {
        TicketRepositoryImpl ticketrepository = new TicketRepositoryImpl();
        CustomerRepositoryImpl customerepository = new CustomerRepositoryImpl();
        ItineraryRepositoryImpl itineraryrepository = new ItineraryRepositoryImpl();
        Data data = new Data(customerepository, itineraryrepository, ticketrepository);
        data.GenerateTicket();
        data.insertItineraries();
        List<Itinerary> numbers = itineraryrepository.read();
        Map<Airports, Airports> list4 = new HashMap<>();
        int i = 1;

        for (Itinerary itinerary : numbers) {
            Airports dep = itinerary.getDep_code();
            Airports dest = itinerary.getDest_code();
            list4.put(dest, dep);
        }

        for (Map.Entry<Airports, Airports> e : list4.entrySet()) {
            System.out.println("Departure Airport: " + e.getValue() + " Departure Airport " + e.getKey());
        }
        return list4;
    }
    /**
     * Printing the id of the customers who bought the most tickets
     * @return
     * @throws CustomerException 
     */
    public Map<Integer, Integer> customersMostTickets() throws CustomerException {
        TicketRepositoryImpl ticketrepository = new TicketRepositoryImpl();
        CustomerRepositoryImpl customerepository = new CustomerRepositoryImpl();
        ItineraryRepositoryImpl itineraryrepository = new ItineraryRepositoryImpl();
        Data data = new Data(customerepository, itineraryrepository, ticketrepository);
        data.GenerateTicket();
        List<Ticket> numbers = ticketrepository.read();
        Map<Integer, Integer> list5 = new HashMap<>();
        int count = 0;

        for (int i = 1; i <= numbers.size() + 1; i++) {
            for (Ticket ticket : numbers) {
                if (i == ticket.getCid()) {
                    count++;
                }
            }
            list5.put(i, count);
            count = 0;
        }

        int max = Collections.max(list5.values());
        Map<Integer, Integer> keys = new HashMap<>();
        for (Entry<Integer, Integer> entry : list5.entrySet()) {
            if (entry.getValue() == max) {
                keys.put(entry.getKey(), max);
            }
        }

        for (Map.Entry<Integer, Integer> e : keys.entrySet()) {
            System.out.println("Customer with id: " + e.getKey() + " bought " + e.getValue() + " tickets.");
        }
        return list5;
    }
    /**
     * Printing the customer who spent the most for tickets
     * @return
     * @throws CustomerException 
     */
    public Map<Integer, BigDecimal> customerBiggerAmount() throws CustomerException {
        TicketRepositoryImpl ticketrepository = new TicketRepositoryImpl();
        CustomerRepositoryImpl customerepository = new CustomerRepositoryImpl();
        ItineraryRepositoryImpl itineraryrepository = new ItineraryRepositoryImpl();
        Data data = new Data(customerepository, itineraryrepository, ticketrepository);
        data.GenerateTicket();
        List<Ticket> numbers = ticketrepository.read();
        Map<Integer, BigDecimal> list6 = new HashMap<>();

        for (int i = 1; i <= numbers.size() + 1; i++) {
            BigDecimal amount = new BigDecimal(0);
            for (Ticket ticket : numbers) {
                if (i == ticket.getCid()) {
                    BigDecimal cost = (ticket.getPrAmount());
                    amount = amount.add(cost);
                }
            }
            list6.put(i, amount);
        }

        BigDecimal max = Collections.max(list6.values());
        Map<Integer, BigDecimal> keys = new HashMap<>();
        for (Entry<Integer, BigDecimal> entry : list6.entrySet()) {
            if (entry.getValue() == max) {
                keys.put(entry.getKey(), max);
            }
        }

        for (Map.Entry<Integer, BigDecimal> e : keys.entrySet()) {
            System.out.println("Customer with id: " + e.getKey() + " paid the largest cost, more specifically " + e.getValue() + " $ in total");
        }
        return list6;
    }
    /**
     * Printing the id of the customers who didnt buy any ticket
     * @return
     * @throws CustomerException 
     */
    public Map<Integer, Integer> customersWithoutTickets() throws CustomerException {
        TicketRepositoryImpl ticketrepository = new TicketRepositoryImpl();
        CustomerRepositoryImpl customerepository = new CustomerRepositoryImpl();
        ItineraryRepositoryImpl itineraryrepository = new ItineraryRepositoryImpl();
        Data data = new Data(customerepository, itineraryrepository, ticketrepository);
        data.GenerateTicket();
        List<Ticket> numbers = ticketrepository.read();
        Map<Integer, Integer> list7 = new HashMap<>();
        int count = 0;

        for (int i = 1; i <= numbers.size() + 1; i++) {
            for (Ticket ticket : numbers) {
                if (i == ticket.getCid()) {
                    count++;
                }
            }
            list7.put(i, count);
            count = 0;
        }

        Map<Integer, Integer> keys = new HashMap<>();
        for (Entry<Integer, Integer> entry : list7.entrySet()) {
            if (entry.getValue() == 0) {
                keys.put(entry.getKey(), 0);
            }
        }

        for (Map.Entry<Integer, Integer> e : keys.entrySet()) {
            System.out.println("Customer with id: " + e.getKey() + " bought no tickets (" + e.getValue() + ")"
                    + "");
        }
        return list7;
    }
}
