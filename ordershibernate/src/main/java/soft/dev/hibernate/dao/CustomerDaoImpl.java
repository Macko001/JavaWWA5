package soft.dev.hibernate.dao;

import org.apache.log4j.Logger;
import org.hibernate.*;
import soft.dev.hibernare.entity.Customer;
import soft.dev.hibernate.config.HibernateConfigurationLoader;
import soft.dev.hibernate.exception.DatabaseException;

public class CustomerDaoImpl implements CustomerDao {

    private Logger logger = Logger.getLogger(CustomerDaoImpl.class);


    public void insert(Customer customer) throws DatabaseException {

    }

    public Customer findById(Integer id)throws DatabaseException {

        SessionFactory sessionFactory =
                HibernateConfigurationLoader.getSessionFactory();
        Session session;
        try {
            session = sessionFactory.openSession();
            Customer customer = session.find(Customer.class,id);
            return customer;
        } catch (HibernateException e) {

            logger.error("Problem with getting customer with" + id, e);
            throw new DatabaseException("Problem with gttind customer with id=" + id, e);
        }finally {
            session.close();
        }


    }

    public void insert()throws DatabaseException {

        SessionFactory sessionFactory =
                HibernateConfigurationLoader.getSessionFactory();
        Session session = null;
        try{
             session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.persist(customer);
            transaction.commit();

        }catch (HibernateException ex){
            logger.error("Problem with insert cusomer",ex);
            throw new DatabaseException("Problem with gttind customer with id=",ex);


    }

}
}

