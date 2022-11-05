/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Customer;
import com.travelcompany.eshop.model.Itinerary;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mantz
 */
public class ItineraryRepositoryImpl implements ItineraryRepository {
  
    private final List <Itinerary> itineraries = new ArrayList();
    
    @Override
    public boolean createItinerary(Itinerary itinerary) {
        itineraries.add(itinerary);
        return true;
    }

    @Override
    public List<Itinerary> readItineraries() {
        List<Itinerary> returnItineraries = new ArrayList<>();
        for (Itinerary itinerary : itineraries) {
            returnItineraries.add(itinerary);
        }
        return returnItineraries;
    }

    @Override
    public Itinerary readItinerary(int itId) {
        for(Itinerary itinerary : itineraries){
            if(itinerary.getItId() == itId){
                return itinerary;
            }
        }
        return null; 
    }

    @Override
    public boolean updateItinerary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteItinerary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
