/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.repository.impl;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.repository.CustomerRepository;
import com.travelcompany.eshop.repository.ItineraryRepository;
import java.math.BigDecimal;

/**
 *
 * @author mantz
 */
public class ItineraryRepositoryImpl extends RepositoryImpl<Itinerary> implements ItineraryRepository {

    @Override
    public void update(int itineraryId, BigDecimal price) {
        Itinerary itinerary = read(itineraryId);
        if (itinerary != null) {
            itinerary.setPrice(price);

        }

    }
}
