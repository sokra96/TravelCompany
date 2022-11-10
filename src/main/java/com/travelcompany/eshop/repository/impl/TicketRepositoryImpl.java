package com.travelcompany.eshop.repository.impl;

import com.travelcompany.eshop.enums.PaymentCategory;
import com.travelcompany.eshop.model.Ticket;
import com.travelcompany.eshop.repository.TicketRepository;

/**
 *
 * @author mantz
 */
public class TicketRepositoryImpl extends RepositoryImpl<Ticket> implements TicketRepository {

    @Override
    public void update(int ticketId, PaymentCategory paymentcategory) {
        Ticket ticket = read(ticketId);
        if (ticket != null) {
            ticket.setPayMethod(paymentcategory);
        }
    }

}
