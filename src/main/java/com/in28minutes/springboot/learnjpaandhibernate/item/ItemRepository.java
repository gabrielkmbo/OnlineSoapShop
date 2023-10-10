package com.in28minutes.springboot.learnjpaandhibernate.item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository <Item, Integer> {
}
