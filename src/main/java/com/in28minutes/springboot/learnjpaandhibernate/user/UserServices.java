package com.in28minutes.springboot.learnjpaandhibernate.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    UserRepository repository;

    public List<User> findAll()
    {
        return repository.findAll();
    }

    public Optional<User> findById(int id)
    {
        return repository.findById(id);
    }

    public void deleteById(int id)
    {
        repository.deleteById(id);
    }

    public User createUser(User user)
    {
        return repository.save(user);
    }

    public List<User> createMultipleUsers(List<User> users)
    {
        return repository.saveAll(users);
    }

    public User getUserById(int id)
    {
        return repository.getById(id);
    }

    public User saveUser(User user)
    {
        return repository.save(user);
    }
}

