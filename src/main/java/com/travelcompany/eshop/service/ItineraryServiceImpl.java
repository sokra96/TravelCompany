/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelcompany.eshop.service;

import com.travelcompany.eshop.model.Itinerary;
import com.travelcompany.eshop.repository.ItineraryRepositoryImpl;
import java.math.BigDecimal;

/**
 * Making the given itinerary list
 * @author mantz
 */
public class ItineraryServiceImpl implements ItineraryService {

    private ItineraryRepositoryImpl itineraryRepository = new ItineraryRepositoryImpl();

    Itinerary itinerary1 = new Itinerary(1, "ATH", "PAR", "22/02/2022 13:35", "Skyline", BigDecimal.valueOf(300));
    Itinerary itinerary2 = new Itinerary(2, "ATH", "LON", "22/02/2022 13:40", "Skyline", BigDecimal.valueOf(420));
    Itinerary itinerary3 = new Itinerary(3, "ATH", "AMS", "22/02/2022 13:45", "Skyline", BigDecimal.valueOf(280));
    Itinerary itinerary4 = new Itinerary(4, "ATH", "PAR", "22/02/2022 14:20", "Skyline", BigDecimal.valueOf(310));
    Itinerary itinerary5 = new Itinerary(5, "ATH", "DUB", "22/02/2022 14:35", "Skyline", BigDecimal.valueOf(880));
    Itinerary itinerary6 = new Itinerary(6, "ATH", "FRA", "22/02/2022 14:55", "Skyline", BigDecimal.valueOf(380));
    Itinerary itinerary7 = new Itinerary(7, "ATH", "FRA", "22/02/2022 15:35", "Skyline", BigDecimal.valueOf(350));
    Itinerary itinerary8 = new Itinerary(8, "ATH", "MEX", "22/02/2022 16:00", "Skyline", BigDecimal.valueOf(1020));
    Itinerary itinerary9 = new Itinerary(9, "ATH", "DUB", "22/02/2022 16:35", "Skyline", BigDecimal.valueOf(770));

    @Override
    public boolean ItineraryList() {
        itineraryRepository.createItinerary(itinerary1);
        itineraryRepository.createItinerary(itinerary2);
        itineraryRepository.createItinerary(itinerary3);
        itineraryRepository.createItinerary(itinerary4);
        itineraryRepository.createItinerary(itinerary5);
        itineraryRepository.createItinerary(itinerary6);
        itineraryRepository.createItinerary(itinerary7);
        itineraryRepository.createItinerary(itinerary8);
        itineraryRepository.createItinerary(itinerary9);
        
        System.out.println(itineraryRepository.readItinerary(1));
        System.out.println(itineraryRepository.readItinerary(2));
        System.out.println(itineraryRepository.readItineraries());
        System.out.println("Itineraries added in the  list");
        return true;
    }

}
