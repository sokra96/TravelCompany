/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Tickets;

/**
 * The interface for ticket (CRUD)
 * @author mantz
 */
public interface TicketRepository {
    boolean createTicket(Tickets ticket);
    <ArrayList>Tickets readTicket();
    Tickets readTicket(int tId);
    boolean updateTicket();
    boolean deleteTicket();
}
