package com.example.users.controllers;

import com.example.users.models.User;
import com.example.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/test2")
public class UsersController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    @PreAuthorize("hasRole('USER') or hasRole('DECIDEUR') or hasRole('ADMIN')")
    public List<User> getAllUsers() {
        System.out.println("Get all Users...");

        List<User> users = new ArrayList<>();
        userRepository.FindAllUsers().forEach(users::add);

        return users;
    }

    @PostMapping(value = "/users/create")
    @PreAuthorize("hasRole('ADMIN')")
    public User postUser(@RequestBody User user) {

        User _user = userRepository.save(new User(user.getUsername(),user.getEmail(), user.getPassword()));
        return _user;
    }


    @PutMapping("/users/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User user) {
        System.out.println("Update Product with ID = " + id + "...");

        Optional<User> userData = userRepository.findById(id);

        if (userData.isPresent()) {
            User _user = userData.get();
            _user.setUsername(user.getUsername());
            _user.setEmail(user.getEmail());

            return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
