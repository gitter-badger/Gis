package com.cursova.DAO.impl;

import com.cursova.DAO.DAO;
import com.cursova.persistence.SessionUtil;

import java.util.List;

/**
 * Created by roma on 15.03.15.
 */
public abstract class DAOImpl<T> implements DAO<T> {

    abstract protected Class returnClass();

    @Override
    public void add(T entity) {
        try (
                SessionUtil sessionUtil = new SessionUtil()
        ){

            sessionUtil.begin();
            sessionUtil.getSession().save(entity);
            sessionUtil.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(T entity) {
        try(
                SessionUtil sessionUtil = new SessionUtil()
        ){
            sessionUtil.begin();
            sessionUtil.getSession().update(entity);
            sessionUtil.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(T entity) {
        try(
                SessionUtil sessionUtil = new SessionUtil()
        ){
            sessionUtil.begin();
            sessionUtil.getSession().delete(entity);
            sessionUtil.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public T getById(int id) {

        T entity = null;

        try{
            SessionUtil sessionUtil = new SessionUtil();
            entity = (T) sessionUtil.getSession().load(returnClass(),id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return entity;
    }

    @Override
    public List<T> getAll() {

        List<T> entityList = null;

        try{
            SessionUtil sessionUtil = new SessionUtil();
            entityList = sessionUtil.getSession().createCriteria(returnClass()).list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return entityList;
    }


}
