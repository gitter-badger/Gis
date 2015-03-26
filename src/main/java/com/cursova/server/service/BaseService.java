package com.cursova.server.service;

import com.cursova.DAO.FactoryDAO;

/**
 * Created by roma on 26.03.15.
 */
public abstract class BaseService {

    protected FactoryDAO factoryDAO = FactoryDAO.getInstance();

}
