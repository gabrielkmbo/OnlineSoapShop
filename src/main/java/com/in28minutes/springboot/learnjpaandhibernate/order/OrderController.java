package com.in28minutes.springboot.learnjpaandhibernate.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    private static final String orderUrl = "/order";
    @Autowired
    public OrderServices services;

    @GetMapping(orderUrl)
    public List<Order> getAll()
    {
        return services.findAll();
    }

    @GetMapping(orderUrl + "/{id}")
    public Optional<Order> getById(int id)
    {
        return services.findById(id);
    }

    @PostMapping(orderUrl)
    public Order createOrder (@RequestBody OrderDTO orderDTO)
    {
        return services.createOrder(orderDTO);
    }

    @DeleteMapping(orderUrl)
    public void deleteOrderById(int id)
    {
        services.deleteById(id);
    }


}
