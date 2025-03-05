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
        Users.add(new User("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Outdoors-man-portrait_%28cropped%29.jpg/1200px-Outdoors-man-portrait_%28cropped%29.jpg", "John Doe", 30));
        Users.add(new User("https://img.freepik.com/free-photo/young-bearded-man-with-striped-shirt_273609-5677.jpg", "Jane Smith", 28));
        Users.add(new User("https://th-thumbnailer.cdn-si-edu.com/5a79C6jJ8BrChMX5tgEKiMI_qqo=/1000x750/filters:no_upscale():focal(792x601:793x602)/https://tf-cmsv2-smithsonianmag-media.s3.amazonaws.com/filer/52/e4/52e44474-c2dc-41e0-bb77-42a904695196/this-image-shows-a-portrait-of-dragon-man-credit-chuang-zhao_web.jpg", "Alice Johnson", 25));
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
