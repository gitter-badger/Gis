package com.cursova.DAO;

import com.cursova.entity.DishMenu;

/**
 * Created by roma on 15.03.15.
 */
public class FactoryDAO {


    private static FactoryDAO instance = null;

    //Entites
    private static UsersDAO usersDAO = null;
    private static DishesDAO dishesDAO = null;
    private static DishMenuDAO dishMenuDAO = null;
    private static OrdersDAO ordersDAO = null;
    private static ProductDAO productDAO = null;
    private static RecipesDAO recipesDAO = null;
    private static AddressDAO addressDAO = null;

    public static synchronized FactoryDAO getInstance(){

        if (instance == null)
            instance = new FactoryDAO();

        return instance;
    }

    private FactoryDAO() {
        usersDAO = new UsersDAO();
    }

    public UsersDAO getUsersDAO() {
        return usersDAO;
    }

    public DishesDAO getDishesDAO() {
        return dishesDAO;
    }

    public DishMenuDAO getDishMenuDAO() {
        return dishMenuDAO;
    }

    public OrdersDAO getOrdersDAO() {
        return ordersDAO;
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }

    public RecipesDAO getRecipesDAO() {
        return recipesDAO;
    }

    public AddressDAO getAddressDAO() {
        return addressDAO;
    }
}
