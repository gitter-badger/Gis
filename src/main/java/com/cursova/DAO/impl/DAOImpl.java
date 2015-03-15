package com.cursova.DAO.impl;

import com.cursova.DAO.DAO;
import com.cursova.persistence.SessionUtil;

/**
 * Created by roma on 15.03.15.
 */
public abstract class DAOImpl<T> implements DAO<T> {

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

}
