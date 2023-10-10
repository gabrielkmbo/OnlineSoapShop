package com.in28minutes.springboot.learnjpaandhibernate.order;

import com.in28minutes.springboot.learnjpaandhibernate.item.Item;
import com.in28minutes.springboot.learnjpaandhibernate.item.ItemRepository;
import com.in28minutes.springboot.learnjpaandhibernate.orderdetail.OrderDetail;
import com.in28minutes.springboot.learnjpaandhibernate.orderdetail.OrderDetailDTO;
import com.in28minutes.springboot.learnjpaandhibernate.orderdetail.OrderDetailRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServices
{
    @Autowired
    OrderRepository repository;

    @Autowired
    OrderDetailRepository detailRepository;

    @Autowired
    ItemRepository itemRepository;

    public List<Order> findAll()
    {
        return repository.findAll();
    }

    public Optional<Order> findById(int id)
    {
        return repository.findById(id);
    }

    public void deleteById(int id)
    {
        repository.deleteById(id);
    }

    public Order createOrder(OrderDTO orderDTO)
    {
        //save order
        Order order = orderDTO.toOrder();
        Order savedOrder = repository.save(order);

        //declare total price
        double totalPrice = 0;

        //create foreign key to match with order detail
        Integer orderID = savedOrder.getOrderId();

        //get all the order details from orderDTO to store in order detail
        List<OrderDetailDTO> orderDetails = orderDTO.getOrderDetailDTOs();


        // separate each orderDetail in list
        for(int i = 0; i < orderDetails.size(); i++)
        {
            //store detail in a variable
            OrderDetailDTO orderDetailDTO = orderDetails.get(i);

            //get item price
            int itemId = orderDetailDTO.getItemId();
            Optional<Item> itemObject = itemRepository.findById(itemId);
            Item item = null;
            double itemPrice = 0;
            if (itemObject.isPresent())
            {
                item = itemObject.get();
                itemPrice = item.getPrice();
            }

            //get subtotal
            double subtotal = itemPrice*orderDetailDTO.getQuantity();

            //convert into orderDetail, not DTO
            OrderDetail orderDetail =  new OrderDetail(0,
                    savedOrder.getOrderId(),
                    orderDetailDTO.getItemId(),
                    orderDetailDTO.getQuantity(),
                    subtotal);

            detailRepository.save(orderDetail);
            totalPrice += subtotal;
        }

        savedOrder.setTotalCost(totalPrice);
        repository.save(savedOrder);
        return savedOrder;
    }

    public List<Order> createMultipleUsers(List<Order> order)
    {
        return repository.saveAll(order);
    }
}
