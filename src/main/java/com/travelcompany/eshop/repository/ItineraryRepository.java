
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Itinerary;
import java.math.BigDecimal;

/**
 *
 * @author mantz
 */
public interface ItineraryRepository extends Repository<Itinerary>{
    void update(int itineraryId,BigDecimal price);
}
