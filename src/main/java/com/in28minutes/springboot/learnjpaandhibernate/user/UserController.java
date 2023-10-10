package com.in28minutes.springboot.learnjpaandhibernate.user;


import com.in28minutes.springboot.learnjpaandhibernate.item.ItemDTO;
import com.in28minutes.springboot.learnjpaandhibernate.item.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    public UserServices services;

    @GetMapping("/user")
    public List<User> getAll()
    {
        return services.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getById(int id)
    {
        return services.findById(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody UserDTO userDTO)
    {
        User user = userDTO.toUser();
        return services.createUser(user);
    }

    @PostMapping("/users")
    public List<User> createMultipleUsers(@RequestBody List<UserDTO> userDTO)
    {
        List<User> users = new ArrayList<>();
        for( int i = 0; i < userDTO.size(); i++)
        {
            User user = userDTO.get(i).toUser();
            users.add(user);
        }
        return users;
    }

    @DeleteMapping("/user")
    public void deleteUserById(int id)
    {
        services.deleteById(id);
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable("id") int id, @RequestBody User updatedUser) throws ChangeSetPersister.NotFoundException {
        User existingUser = services.getUserById(id);

        if(existingUser != null)
        {
            existingUser.setName(updatedUser.getName());
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setBirthDate(updatedUser.getBirthDate());

            services.saveUser(existingUser);

            return existingUser;
        }
        else
        {
            throw new ChangeSetPersister.NotFoundException();
        }
    }

}
