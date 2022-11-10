
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.model.Id;
import java.util.List;

/**
 *
 * @author mantz
 */
public interface Repository <T extends Id> {
    
    int create (T t); 
    T read (int id);
    List<T> read();
    boolean delete(int id);
    
}
