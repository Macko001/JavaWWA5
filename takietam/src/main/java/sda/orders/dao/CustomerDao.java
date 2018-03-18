package sda.orders.dao;

import sda.orders.entity.Customer;

public interface CustomerDao {

    public Customer findById(Integer id);

   public  Customer insert(Customer customer);


    public void update(Customer customer);

    public void delete(Integer id);






}
