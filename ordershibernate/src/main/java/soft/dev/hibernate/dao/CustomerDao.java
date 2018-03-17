package soft.dev.hibernate.dao;

import soft.dev.hibernare.entity.Customer;
import soft.dev.hibernate.exception.DatabaseException;

public interface CustomerDao {

    public Customer findById(Integer id) throws DatabaseException;

    public void insert (Customer customer)throws DatabaseException;

}
