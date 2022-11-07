/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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
