package com.travelcompany.eshop.repository.impl;

import com.travelcompany.eshop.model.Itinerary;
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
