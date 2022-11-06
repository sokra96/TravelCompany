/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Itinerary;
import java.util.List;

/**
 * The interface for itinerary (CRUD)
 * @author mantz
 */
public interface ItineraryRepository {
    boolean createItinerary(Itinerary itinerary);
    String readItineraries();
    Itinerary readItinerary(int itId);
    boolean updateItinerary();
    boolean deleteItinerary();
}
