package com.in28minutes.springboot.learnjpaandhibernate.orderdetail;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository <OrderDetail, Integer> {
}
