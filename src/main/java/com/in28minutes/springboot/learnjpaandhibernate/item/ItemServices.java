package com.in28minutes.springboot.learnjpaandhibernate.item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServices {

    @Autowired
    ItemRepository repository;

    public List<Item> findAll()
    {
        return repository.findAll();
    }

    public Optional<Item> findById(int id)
    {
        return repository.findById(id);
    }

    public void deleteById(int id)
    {
        repository.deleteById(id);
    }

    public Item createItem(Item item)
    {
        return repository.save(item);
    }

    public List<Item> createMultipleUsers(List<Item> item)
    {
        return repository.saveAll(item);
    }


}
