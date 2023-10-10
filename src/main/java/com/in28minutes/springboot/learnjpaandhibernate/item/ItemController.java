package com.in28minutes.springboot.learnjpaandhibernate.item;

import com.in28minutes.springboot.learnjpaandhibernate.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {

    @Autowired
    public ItemServices services;

    @GetMapping("/item")
    public List<Item> getAll()
    {
        return services.findAll();
    }

    @GetMapping("/item/{id}")
    public Optional<Item> getById(int id)
    {
        return services.findById(id);
    }

    @PostMapping("/item")
    public Item createUser(@RequestBody ItemDTO itemDTO)
    {
        Item item = itemDTO.toItem();
        return services.createItem(item);
    }

}
