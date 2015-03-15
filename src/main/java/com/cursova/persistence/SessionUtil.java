package com.cursova.persistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by roma on 15.03.15.
 */
public class SessionUtil implements AutoCloseable{

    private static final Logger log = Logger.getAnonymousLogger();

    private final Session session;

    public SessionUtil() throws Exception{
        session = HibernateUtil.getSessionFactory().openSession();
        if (session == null || !session.isOpen()) {
            log.log(Level.WARNING,"Session is not opened");
            throw new Exception();
        }
    }

    public Session getSession() {
        return session;
    }

    public void begin() {
        session.beginTransaction();
    }

    public void commit() {
        session.getTransaction().commit();
    }

    public void rollback() {
        try {
            session.getTransaction().rollback();
        } catch (HibernateException e) {
            log.log(Level.WARNING, "Cannot rollback", e);
        }
        try {
            session.close();
        } catch (HibernateException e) {
            log.log(Level.WARNING, "Cannot close", e);
        }
    }

    @Override
    public void close() {
        session.close();
    }
}
