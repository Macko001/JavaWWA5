package soft.dev.hibernate.dao;

import org.junit.Assert;
import org.junit.Test;
import soft.dev.hibernare.entity.Customer;
import soft.dev.hibernate.exception.DatabaseException;

import static org.junit.Assert.*;

public class CustomerDaoImplTest {

   // @Test
   // public void shouldFindByIdWhenPresent() {
     //    CustomerDao customerDao = new CustomerDaoImpl() ;
       //     Customer customer = customerDao.findById(1);
      //  Assert.assertEquals("First name should be equal","John",customer.getFirstName());

  //  }

    @Test(expected = DatabaseException.class)
    public void shouldFindByIdWhenEpsynt()  throws DatabaseException{
        CustomerDao customerDao = new CustomerDaoImpl() ;
        Customer customer = customerDao.findById(10);
        Assert.assertNull("customer"+customer);




}

    @Test
    public void insert() {
    }
}