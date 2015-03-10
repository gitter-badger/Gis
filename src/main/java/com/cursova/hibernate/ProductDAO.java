package com.cursova.hibernate;
import com.cursova.entity.Product;
import org.hibernate.HibernateException;
import org.hibernate.Query;


/**
 * Created by Dima on 17.02.2015.
 */
public class ProductDAO  extends DAO {

    public Product createProduct(Integer id_product, String name_product, double price_product, boolean in_stock) throws Exception {
        try {
            begin();
            Product product = new Product(id_product, name_product, price_product, in_stock);
            getSession().save(product);
            commit();
            return product;
        }catch (HibernateException e) {
            rollback();
            throw new Exception("Could not create product " + name_product, e);
        }
    }


    public Product getProd(String name_product) throws Exception {
        try {
            begin();
            Query q = getSession().createQuery("from Product where name_product = :name_product");
            q.setString("name_product", name_product);
            Product product = (Product) q.uniqueResult();
            commit();
            return product;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not get product " + name_product, e);
        }
    }

}






