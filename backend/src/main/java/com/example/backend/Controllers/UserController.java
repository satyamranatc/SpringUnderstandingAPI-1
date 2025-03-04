package com.example.backend.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Models.User;

@RestController
@CrossOrigin("*")
public class UserController {

    public List<User> Users = new ArrayList<>();

    // Constructor to add default users
    public UserController() {
        Users.add(new User("pic1.jpg", "John Doe", 30));
        Users.add(new User("pic2.jpg", "Jane Smith", 28));
        Users.add(new User("pic3.jpg", "Alice Johnson", 25));
    }

    // GET API:
    @GetMapping("/users")
    public List<User> getUsers() {
        return Users;
    }

    // POST API:
    @PostMapping("/users")
    public String postUsers(@RequestBody User newData) {

        // Print New Data:
        System.out.println("New Data Received: " + newData.name + " - " + newData.age);
        Users.add(newData);

        return "User created successfully";
    }
}
