package com.in28minutes.springboot.learnjpaandhibernate.orderdetail;

import jakarta.persistence.*;

@Entity (name = "order_detail")
public class OrderDetail {

    @Id
    @Column (name = "order_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int orderDetailId;

    @Column (name = "order_id")
    private int orderId;

    @Column (name = "item_id")
    private int itemId;

    @Column (name = "quantity")
    private int quantity;

    @Column (name = "subtotal")
    private double subtotal;

    public OrderDetail(int orderDetailId, int orderId, int itemId, int quantity, double subtotal) {
        this.orderDetailId = orderDetailId;
        this.orderId = orderId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
