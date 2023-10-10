package com.in28minutes.springboot.learnjpaandhibernate.order;

import com.in28minutes.springboot.learnjpaandhibernate.orderdetail.OrderDetail;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity (name = "whole_order")
public class Order {
    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column (name = "user_id")
    private int userId;

    @Column (name = "order_date")
    private LocalDate orderDate;

    @Column (name = "order_address")
    private String orderAddress;

    @Column (name = "total_cost")
    private double totalCost;

    public Order()
    {

    }

    public Order(int orderId, int userId, LocalDate orderDate, String orderAddress, double totalCost) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.orderAddress = orderAddress;
        this.totalCost = totalCost;
    }


    public Order(int userId, LocalDate orderDate, String orderAddress) {
        this.userId = userId;
        this.orderDate = orderDate;
        this.orderAddress = orderAddress;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
