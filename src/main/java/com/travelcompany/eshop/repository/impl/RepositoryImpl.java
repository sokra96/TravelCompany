package com.travelcompany.eshop.repository.impl;

import com.travelcompany.eshop.model.Id;
import com.travelcompany.eshop.repository.Repository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mantz
 */
public abstract class RepositoryImpl<T extends Id> implements Repository<T> {

    private final List<T> list;
    private int index;

    public RepositoryImpl() {
        list = new ArrayList<>();
    }

    @Override
    public int create(T t) {
        //t.setId(Id);
        list.add(t);
        return t.getId();
    }

    @Override
    public List<T> read() {
        return list;
    }

    @Override
    public T read(int id) {
        for (T t : list) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        T t = read(id);
        if (t != null) {
            list.remove(t);
            return true;
        }
        return false;
    }
}
