package com.in28minutes.springboot.learnjpaandhibernate.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.in28minutes.springboot.learnjpaandhibernate.orderdetail.OrderDetail;
import com.in28minutes.springboot.learnjpaandhibernate.orderdetail.OrderDetailDTO;

import java.time.LocalDate;
import java.util.List;

public class OrderDTO {

    @JsonProperty ("user_id")
    private int userId;

    @JsonProperty ("order_date")
    private LocalDate orderDate;

    @JsonProperty ("order_address")
    private String orderAddress;

    //@JsonProperty ("order_detail")
    private List<OrderDetailDTO> orderDetailDTO;

    public OrderDTO(int userId, LocalDate orderDate, String orderAddress) {
        this.userId = userId;
        this.orderDate = orderDate;
        this.orderAddress = orderAddress;
    }


    public List<OrderDetailDTO> getOrderDetailDTOs() {
        return orderDetailDTO;
    }

    public void setOrderDetailDTOs(List<OrderDetailDTO> orderDetailDTO) {
        this.orderDetailDTO = orderDetailDTO;
    }

    public Order toOrder()
    {
        return new Order (this.userId, this.orderDate, this.orderAddress);
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

}
