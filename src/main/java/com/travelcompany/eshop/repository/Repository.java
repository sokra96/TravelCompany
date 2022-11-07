/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
