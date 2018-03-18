package sda.orders.entity;

import java.util.Date;
import java.util.List;

public class Order {

    private Integer id;

    private Customer customer;

    private OrderStatus status;

    private Date date;

    private List<OrderItem> items;


}
