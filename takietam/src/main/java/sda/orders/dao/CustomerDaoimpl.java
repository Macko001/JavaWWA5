package sda.orders.dao;

import sda.orders.entity.Customer;

import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerDaoimpl implements CustomerDao {


   public static final String MYSQL_CONNECTION_STRING
           = "jdbc:mysql://localhost:3306/employees?useSSL=false&serverTimezone=UTC&user=root&password=M@rek";


    public Customer findById(Integer id) {
        try {
            DriverManager.getConnection(MYSQL_CONNECTION_STRING);
        } catch (SQLException ex) {
            System.out.println("Problem with getting connection" + ex.toString());
        }
        return null;
    }

    public Customer insert(Customer customer) {
        return null;
    }

    public void update(Customer customer) {

    }

    public void delete(Integer id) {

    }
}


