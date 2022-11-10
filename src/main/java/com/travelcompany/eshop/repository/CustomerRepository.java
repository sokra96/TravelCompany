
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Customer;

/**
 *
 * @author mantz
 */
public interface CustomerRepository extends Repository<Customer> {
    void updateAd (int customerId, String address);
    void updateEm (int customerId, String email);
    void updateAdEm (int customerId, String address, String email);
}
