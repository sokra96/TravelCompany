/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.enums.PaymentCategory;

import com.travelcompany.eshop.model.Ticket;


/**
 *
 * @author mantz
 */
public interface TicketRepository extends Repository<Ticket>{
    void update(int ticketId,PaymentCategory paymentcategory);
}
