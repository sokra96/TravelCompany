
package com.travelcompany.eshop.service;

import com.travelcompany.eshop.enums.Airports;
import com.travelcompany.eshop.exceptions.CustomerException;
import java.math.BigDecimal;
import java.util.Map;

/**
 *
 * @author mantz
 */
public interface CustomerService {

    Map<Integer, Integer> customersNumberOfTickets() throws CustomerException;

    Map<Integer, BigDecimal> customersAmountOfTickets() throws CustomerException;

    Map<Airports, Airports> itinenariesPerDestination() throws CustomerException;

    Map<Airports, Airports> itinenariesPerDeparture() throws CustomerException;

    Map<Integer, Integer> customersMostTickets() throws CustomerException;

    Map<Integer, BigDecimal> customerBiggerAmount() throws CustomerException;

    Map<Integer, Integer> customersWithoutTickets() throws CustomerException;

}
