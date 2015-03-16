package com.cursova.DAO;

import java.util.List;

/**
 * Created by roma on 15.03.15.
 */
public interface DAO<T> {

    public void add(T entity);
    public void update(T entity);
    public T getById(int id);
    public List<T> getAll();
    public void delete(T entity);

}
